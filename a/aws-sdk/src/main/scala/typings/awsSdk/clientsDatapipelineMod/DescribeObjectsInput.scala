package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObjectsInput extends StObject {
  
  /**
    * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
    */
  var evaluateExpressions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call DescribeObjects with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25 identifiers in a single call to DescribeObjects.
    */
  var objectIds: idList
  
  /**
    * The ID of the pipeline that contains the object definitions.
    */
  var pipelineId: id
}
object DescribeObjectsInput {
  
  inline def apply(objectIds: idList, pipelineId: id): DescribeObjectsInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsInput]
  }
  
  extension [Self <: DescribeObjectsInput](x: Self) {
    
    inline def setEvaluateExpressions(value: Boolean): Self = StObject.set(x, "evaluateExpressions", value.asInstanceOf[js.Any])
    
    inline def setEvaluateExpressionsUndefined: Self = StObject.set(x, "evaluateExpressions", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setObjectIds(value: idList): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsVarargs(value: id*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
