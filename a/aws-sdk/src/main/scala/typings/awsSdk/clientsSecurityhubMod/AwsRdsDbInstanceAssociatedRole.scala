package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbInstanceAssociatedRole extends StObject {
  
  /**
    * The name of the feature associated with the IAM role.
    */
  var FeatureName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Describes the state of the association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the DB instance and can be used to access other Amazon Web Services services on your behalf.    PENDING - The IAM role ARN is being associated with the DB instance.    INVALID - The IAM role ARN is associated with the DB instance. But the DB instance is unable to assume the IAM role in order to access other Amazon Web Services services on your behalf.   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbInstanceAssociatedRole {
  
  inline def apply(): AwsRdsDbInstanceAssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceAssociatedRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbInstanceAssociatedRole] (val x: Self) extends AnyVal {
    
    inline def setFeatureName(value: NonEmptyString): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    inline def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
