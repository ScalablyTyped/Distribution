package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelResourceRequestInput extends StObject {
  
  /**
    * The RequestToken of the ProgressEvent object returned by the resource operation request.
    */
  var RequestToken: typings.awsSdk.clientsCloudcontrolMod.RequestToken
}
object CancelResourceRequestInput {
  
  inline def apply(RequestToken: RequestToken): CancelResourceRequestInput = {
    val __obj = js.Dynamic.literal(RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelResourceRequestInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelResourceRequestInput] (val x: Self) extends AnyVal {
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
  }
}
