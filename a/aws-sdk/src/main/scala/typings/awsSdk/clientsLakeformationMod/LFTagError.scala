package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTagError extends StObject {
  
  /**
    * An error that occurred with the attachment or detachment of the LF-tag.
    */
  var Error: js.UndefOr[ErrorDetail] = js.undefined
  
  /**
    * The key-name of the LF-tag.
    */
  var LFTag: js.UndefOr[LFTagPair] = js.undefined
}
object LFTagError {
  
  inline def apply(): LFTagError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LFTagError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LFTagError] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setLFTag(value: LFTagPair): Self = StObject.set(x, "LFTag", value.asInstanceOf[js.Any])
    
    inline def setLFTagUndefined: Self = StObject.set(x, "LFTag", js.undefined)
  }
}
