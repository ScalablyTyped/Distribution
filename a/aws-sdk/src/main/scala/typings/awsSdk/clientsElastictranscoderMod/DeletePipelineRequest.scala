package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineRequest extends StObject {
  
  /**
    * The identifier of the pipeline that you want to delete.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
}
object DeletePipelineRequest {
  
  inline def apply(Id: Id): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  
  extension [Self <: DeletePipelineRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
