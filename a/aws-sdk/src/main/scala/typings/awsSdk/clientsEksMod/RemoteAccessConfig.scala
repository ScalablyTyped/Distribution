package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteAccessConfig extends StObject {
  
  /**
    * The Amazon EC2 SSH key name that provides access for SSH communication with the nodes in the managed node group. For more information, see Amazon EC2 key pairs and Linux instances in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For Windows, an Amazon EC2 SSH key is used to obtain the RDP password. For more information, see Amazon EC2 key pairs and Windows instances in the Amazon Elastic Compute Cloud User Guide for Windows Instances.
    */
  var ec2SshKey: js.UndefOr[String] = js.undefined
  
  /**
    * The security group IDs that are allowed SSH access (port 22) to the nodes. For Windows, the port is 3389. If you specify an Amazon EC2 SSH key but don't specify a source security group when you create a managed node group, then the port on the nodes is opened to the internet (0.0.0.0/0). For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var sourceSecurityGroups: js.UndefOr[StringList] = js.undefined
}
object RemoteAccessConfig {
  
  inline def apply(): RemoteAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccessConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteAccessConfig] (val x: Self) extends AnyVal {
    
    inline def setEc2SshKey(value: String): Self = StObject.set(x, "ec2SshKey", value.asInstanceOf[js.Any])
    
    inline def setEc2SshKeyUndefined: Self = StObject.set(x, "ec2SshKey", js.undefined)
    
    inline def setSourceSecurityGroups(value: StringList): Self = StObject.set(x, "sourceSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSourceSecurityGroupsUndefined: Self = StObject.set(x, "sourceSecurityGroups", js.undefined)
    
    inline def setSourceSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "sourceSecurityGroups", js.Array(value*))
  }
}
