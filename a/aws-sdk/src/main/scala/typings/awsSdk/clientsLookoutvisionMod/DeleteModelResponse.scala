package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model that was deleted.
    */
  var ModelArn: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ModelArn] = js.undefined
}
object DeleteModelResponse {
  
  inline def apply(): DeleteModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteModelResponse] (val x: Self) extends AnyVal {
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
  }
}
