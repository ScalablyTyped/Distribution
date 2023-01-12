package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateChannelCredentialsRequest extends StObject {
  
  /**
    * The ID of the channel to update.
    */
  var Id: string
}
object RotateChannelCredentialsRequest {
  
  inline def apply(Id: string): RotateChannelCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateChannelCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateChannelCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
