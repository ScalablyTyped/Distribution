package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterIamRole extends StObject {
  
  /**
    * The status of the IAM role's association with the cluster. Valid values: in-sync | adding | removing 
    */
  var ApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IAM role.
    */
  var IamRoleArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterIamRole {
  
  inline def apply(): AwsRedshiftClusterIamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterIamRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRedshiftClusterIamRole] (val x: Self) extends AnyVal {
    
    inline def setApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setApplyStatusUndefined: Self = StObject.set(x, "ApplyStatus", js.undefined)
    
    inline def setIamRoleArn(value: NonEmptyString): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
