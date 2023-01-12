package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectedResourceOutput extends StObject {
  
  /**
    * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastBackupTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or an Amazon RDS database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceType] = js.undefined
}
object DescribeProtectedResourceOutput {
  
  inline def apply(): DescribeProtectedResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectedResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProtectedResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setLastBackupTime(value: js.Date): Self = StObject.set(x, "LastBackupTime", value.asInstanceOf[js.Any])
    
    inline def setLastBackupTimeUndefined: Self = StObject.set(x, "LastBackupTime", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
