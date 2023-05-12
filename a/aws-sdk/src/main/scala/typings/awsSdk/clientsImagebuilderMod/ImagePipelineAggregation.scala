package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePipelineAggregation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined
  
  /**
    * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for the specified image pipeline.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object ImagePipelineAggregation {
  
  inline def apply(): ImagePipelineAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePipelineAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePipelineAggregation] (val x: Self) extends AnyVal {
    
    inline def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
    
    inline def setImagePipelineArnUndefined: Self = StObject.set(x, "imagePipelineArn", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
