package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricAttributionOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that has permissions to add data to your output Amazon S3 bucket and add metrics to Amazon CloudWatch. For more information, see Measuring impact of recommendations.
    */
  var roleArn: RoleArn
  
  var s3DataDestination: js.UndefOr[S3DataConfig] = js.undefined
}
object MetricAttributionOutput {
  
  inline def apply(roleArn: RoleArn): MetricAttributionOutput = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAttributionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricAttributionOutput] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setS3DataDestination(value: S3DataConfig): Self = StObject.set(x, "s3DataDestination", value.asInstanceOf[js.Any])
    
    inline def setS3DataDestinationUndefined: Self = StObject.set(x, "s3DataDestination", js.undefined)
  }
}
