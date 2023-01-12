package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
trait SingleProofreadingError extends StObject {
  
  var aFullComment: String
  
  var aProperties: SafeArray[PropertyValue]
  
  var aRuleIdentifier: String
  
  var aShortComment: String
  
  var aSuggestions: SafeArray[String]
  
  var nErrorLength: Double
  
  var nErrorStart: Double
  
  var nErrorType: Double
}
object SingleProofreadingError {
  
  inline def apply(
    aFullComment: String,
    aProperties: SafeArray[PropertyValue],
    aRuleIdentifier: String,
    aShortComment: String,
    aSuggestions: SafeArray[String],
    nErrorLength: Double,
    nErrorStart: Double,
    nErrorType: Double
  ): SingleProofreadingError = {
    val __obj = js.Dynamic.literal(aFullComment = aFullComment.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aRuleIdentifier = aRuleIdentifier.asInstanceOf[js.Any], aShortComment = aShortComment.asInstanceOf[js.Any], aSuggestions = aSuggestions.asInstanceOf[js.Any], nErrorLength = nErrorLength.asInstanceOf[js.Any], nErrorStart = nErrorStart.asInstanceOf[js.Any], nErrorType = nErrorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleProofreadingError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleProofreadingError] (val x: Self) extends AnyVal {
    
    inline def setAFullComment(value: String): Self = StObject.set(x, "aFullComment", value.asInstanceOf[js.Any])
    
    inline def setAProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "aProperties", value.asInstanceOf[js.Any])
    
    inline def setARuleIdentifier(value: String): Self = StObject.set(x, "aRuleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAShortComment(value: String): Self = StObject.set(x, "aShortComment", value.asInstanceOf[js.Any])
    
    inline def setASuggestions(value: SafeArray[String]): Self = StObject.set(x, "aSuggestions", value.asInstanceOf[js.Any])
    
    inline def setNErrorLength(value: Double): Self = StObject.set(x, "nErrorLength", value.asInstanceOf[js.Any])
    
    inline def setNErrorStart(value: Double): Self = StObject.set(x, "nErrorStart", value.asInstanceOf[js.Any])
    
    inline def setNErrorType(value: Double): Self = StObject.set(x, "nErrorType", value.asInstanceOf[js.Any])
  }
}
