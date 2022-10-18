package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelinesInput extends StObject {
  
  /**
    * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline IDs, call ListPipelines.
    */
  var pipelineIds: idList
}
object DescribePipelinesInput {
  
  inline def apply(pipelineIds: idList): DescribePipelinesInput = {
    val __obj = js.Dynamic.literal(pipelineIds = pipelineIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesInput]
  }
  
  extension [Self <: DescribePipelinesInput](x: Self) {
    
    inline def setPipelineIds(value: idList): Self = StObject.set(x, "pipelineIds", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdsVarargs(value: id*): Self = StObject.set(x, "pipelineIds", js.Array(value*))
  }
}
