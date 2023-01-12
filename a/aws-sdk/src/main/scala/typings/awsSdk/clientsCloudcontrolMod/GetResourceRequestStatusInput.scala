package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceRequestStatusInput extends StObject {
  
  /**
    * A unique token used to track the progress of the resource operation request. Request tokens are included in the ProgressEvent type returned by a resource operation request.
    */
  var RequestToken: typings.awsSdk.clientsCloudcontrolMod.RequestToken
}
object GetResourceRequestStatusInput {
  
  inline def apply(RequestToken: RequestToken): GetResourceRequestStatusInput = {
    val __obj = js.Dynamic.literal(RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceRequestStatusInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceRequestStatusInput] (val x: Self) extends AnyVal {
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
  }
}
