package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
@js.native
trait SingleProofreadingError extends js.Object {
  
  var aFullComment: String = js.native
  
  var aProperties: SafeArray[PropertyValue] = js.native
  
  var aRuleIdentifier: String = js.native
  
  var aShortComment: String = js.native
  
  var aSuggestions: SafeArray[String] = js.native
  
  var nErrorLength: Double = js.native
  
  var nErrorStart: Double = js.native
  
  var nErrorType: Double = js.native
}
object SingleProofreadingError {
  
  @scala.inline
  def apply(
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
  implicit class SingleProofreadingErrorOps[Self <: SingleProofreadingError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAFullComment(value: String): Self = this.set("aFullComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAProperties(value: SafeArray[PropertyValue]): Self = this.set("aProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARuleIdentifier(value: String): Self = this.set("aRuleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAShortComment(value: String): Self = this.set("aShortComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASuggestions(value: SafeArray[String]): Self = this.set("aSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorLength(value: Double): Self = this.set("nErrorLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorStart(value: Double): Self = this.set("nErrorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNErrorType(value: Double): Self = this.set("nErrorType", value.asInstanceOf[js.Any])
  }
}
