package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelCardRequest extends StObject {
  
  /**
    * The name of the model card to delete.
    */
  var ModelCardName: EntityName
}
object DeleteModelCardRequest {
  
  inline def apply(ModelCardName: EntityName): DeleteModelCardRequest = {
    val __obj = js.Dynamic.literal(ModelCardName = ModelCardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelCardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteModelCardRequest] (val x: Self) extends AnyVal {
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
  }
}
