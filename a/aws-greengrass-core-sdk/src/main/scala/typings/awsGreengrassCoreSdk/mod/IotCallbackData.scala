package typings.awsGreengrassCoreSdk.mod

import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotCallbackData extends StObject {
  
  var payload: Buffer | Blob | String | ArrayLike[Any]
}
object IotCallbackData {
  
  inline def apply(payload: Buffer | Blob | String | ArrayLike[Any]): IotCallbackData = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotCallbackData]
  }
  
  extension [Self <: IotCallbackData](x: Self) {
    
    inline def setPayload(value: Buffer | Blob | String | ArrayLike[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
