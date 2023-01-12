package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHyperParameterTuningJobRequest extends StObject {
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobName
}
object DescribeHyperParameterTuningJobRequest {
  
  inline def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
  }
}
