package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheFailureDetails extends StObject {
  
  /**
    * A message describing any failures that occurred.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object FileCacheFailureDetails {
  
  inline def apply(): FileCacheFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileCacheFailureDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCacheFailureDetails] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
