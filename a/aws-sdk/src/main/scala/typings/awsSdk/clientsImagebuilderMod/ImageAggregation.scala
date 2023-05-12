package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAggregation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the image for this aggregation.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for the specified image.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object ImageAggregation {
  
  inline def apply(): ImageAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAggregation] (val x: Self) extends AnyVal {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
