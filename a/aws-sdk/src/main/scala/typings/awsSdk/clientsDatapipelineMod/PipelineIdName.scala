package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineIdName extends StObject {
  
  /**
    * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var id: js.UndefOr[typings.awsSdk.clientsDatapipelineMod.id] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[id] = js.undefined
}
object PipelineIdName {
  
  inline def apply(): PipelineIdName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineIdName]
  }
  
  extension [Self <: PipelineIdName](x: Self) {
    
    inline def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
