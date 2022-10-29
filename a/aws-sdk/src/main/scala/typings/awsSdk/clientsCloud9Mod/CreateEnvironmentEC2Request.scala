package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentEC2Request extends StObject {
  
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined
  
  /**
    * A unique, case-sensitive string that helps Cloud9 to ensure this operation completes no more than one time. For more information, see Client Tokens in the Amazon EC2 API Reference.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The connection type used for connecting to an Amazon EC2 environment. Valid values are CONNECT_SSH (default) and CONNECT_SSM (connected through Amazon EC2 Systems Manager). For more information, see Accessing no-ingress EC2 instances with Amazon EC2 Systems Manager in the Cloud9 User Guide.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.undefined
  
  /**
    * The description of the environment to create.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var dryRun: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance. To choose an AMI for the instance, you must specify a valid AMI alias or a valid Amazon EC2 Systems Manager (SSM) path. The default Amazon Linux AMI is currently used if the parameter isn't explicitly assigned a value in the request.  In the future the parameter for Amazon Linux will no longer be available when you specify an AMI for your instance. Amazon Linux 2 will then become the default AMI, which is used to launch your instance if no parameter is explicitly defined.  AMI aliases      Amazon Linux (default): amazonlinux-1-x86_64     Amazon Linux 2: amazonlinux-2-x86_64    Ubuntu 18.04: ubuntu-18.04-x86_64     SSM paths     Amazon Linux (default): resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64     Amazon Linux 2: resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64    Ubuntu 18.04: resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64   
    */
  var imageId: js.UndefOr[ImageId] = js.undefined
  
  /**
    * The type of instance to connect to the environment (for example, t2.micro).
    */
  var instanceType: InstanceType
  
  /**
    * The name of the environment to create. This name is visible to other IAM users in the same Amazon Web Services account.
    */
  var name: EnvironmentName
  
  /**
    * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any IAM principal. If this value is not specified, the ARN defaults to this environment's creator.
    */
  var ownerArn: js.UndefOr[UserArn] = js.undefined
  
  /**
    * The ID of the subnet in Amazon VPC that Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  var subnetId: js.UndefOr[SubnetId] = js.undefined
  
  /**
    * An array of key-value pairs that will be associated with the new Cloud9 development environment.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateEnvironmentEC2Request {
  
  inline def apply(instanceType: InstanceType, name: EnvironmentName): CreateEnvironmentEC2Request = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentEC2Request]
  }
  
  extension [Self <: CreateEnvironmentEC2Request](x: Self) {
    
    inline def setAutomaticStopTimeMinutes(value: AutomaticStopTimeMinutes): Self = StObject.set(x, "automaticStopTimeMinutes", value.asInstanceOf[js.Any])
    
    inline def setAutomaticStopTimeMinutesUndefined: Self = StObject.set(x, "automaticStopTimeMinutes", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setDescription(value: EnvironmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDryRun(value: NullableBoolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerArn(value: UserArn): Self = StObject.set(x, "ownerArn", value.asInstanceOf[js.Any])
    
    inline def setOwnerArnUndefined: Self = StObject.set(x, "ownerArn", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
