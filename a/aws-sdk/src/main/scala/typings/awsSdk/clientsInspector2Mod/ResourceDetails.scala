package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * An object that contains details about the Amazon EC2 instance involved in the finding.
    */
  var awsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
  
  /**
    * An object that contains details about the Amazon ECR container image involved in the finding.
    */
  var awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined
  
  /**
    * A summary of the information about an AWS Lambda function affected by a finding.
    */
  var awsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setAwsEc2Instance(value: AwsEc2InstanceDetails): Self = StObject.set(x, "awsEc2Instance", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2InstanceUndefined: Self = StObject.set(x, "awsEc2Instance", js.undefined)
    
    inline def setAwsEcrContainerImage(value: AwsEcrContainerImageDetails): Self = StObject.set(x, "awsEcrContainerImage", value.asInstanceOf[js.Any])
    
    inline def setAwsEcrContainerImageUndefined: Self = StObject.set(x, "awsEcrContainerImage", js.undefined)
    
    inline def setAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = StObject.set(x, "awsLambdaFunction", value.asInstanceOf[js.Any])
    
    inline def setAwsLambdaFunctionUndefined: Self = StObject.set(x, "awsLambdaFunction", js.undefined)
  }
}
