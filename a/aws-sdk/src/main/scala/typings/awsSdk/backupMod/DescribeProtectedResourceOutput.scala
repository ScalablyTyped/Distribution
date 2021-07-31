package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectedResourceOutput extends StObject {
  
  /**
    * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastBackupTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
}
object DescribeProtectedResourceOutput {
  
  @scala.inline
  def apply(): DescribeProtectedResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectedResourceOutput]
  }
  
  @scala.inline
  implicit class DescribeProtectedResourceOutputMutableBuilder[Self <: DescribeProtectedResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastBackupTime(value: timestamp): Self = StObject.set(x, "LastBackupTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastBackupTimeUndefined: Self = StObject.set(x, "LastBackupTime", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
