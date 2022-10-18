package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoEnable extends StObject {
  
  /**
    * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector organization.
    */
  var ec2: Boolean
  
  /**
    * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector organization.
    */
  var ecr: Boolean
}
object AutoEnable {
  
  inline def apply(ec2: Boolean, ecr: Boolean): AutoEnable = {
    val __obj = js.Dynamic.literal(ec2 = ec2.asInstanceOf[js.Any], ecr = ecr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoEnable]
  }
  
  extension [Self <: AutoEnable](x: Self) {
    
    inline def setEc2(value: Boolean): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEcr(value: Boolean): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
  }
}
