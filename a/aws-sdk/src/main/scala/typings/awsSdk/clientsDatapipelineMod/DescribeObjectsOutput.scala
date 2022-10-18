package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObjectsOutput extends StObject {
  
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.undefined
  
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList
}
object DescribeObjectsOutput {
  
  inline def apply(pipelineObjects: PipelineObjectList): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
  
  extension [Self <: DescribeObjectsOutput](x: Self) {
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPipelineObjects(value: PipelineObjectList): Self = StObject.set(x, "pipelineObjects", value.asInstanceOf[js.Any])
    
    inline def setPipelineObjectsVarargs(value: PipelineObject*): Self = StObject.set(x, "pipelineObjects", js.Array(value*))
  }
}
