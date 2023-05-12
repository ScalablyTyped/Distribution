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
  
  /**
    * Represents whether AWS Lambda standard scans are automatically enabled for new members of your Amazon Inspector organization. 
    */
  var lambda: js.UndefOr[Boolean] = js.undefined
}
object AutoEnable {
  
  inline def apply(ec2: Boolean, ecr: Boolean): AutoEnable = {
    val __obj = js.Dynamic.literal(ec2 = ec2.asInstanceOf[js.Any], ecr = ecr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoEnable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoEnable] (val x: Self) extends AnyVal {
    
    inline def setEc2(value: Boolean): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEcr(value: Boolean): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    inline def setLambda(value: Boolean): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
