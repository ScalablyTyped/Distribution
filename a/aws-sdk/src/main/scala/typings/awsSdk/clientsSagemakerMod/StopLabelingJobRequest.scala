package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLabelingJobRequest extends StObject {
  
  /**
    * The name of the labeling job to stop.
    */
  var LabelingJobName: typings.awsSdk.clientsSagemakerMod.LabelingJobName
}
object StopLabelingJobRequest {
  
  inline def apply(LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLabelingJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopLabelingJobRequest] (val x: Self) extends AnyVal {
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
  }
}
