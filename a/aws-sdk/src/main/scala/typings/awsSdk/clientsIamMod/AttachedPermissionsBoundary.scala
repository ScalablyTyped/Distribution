package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedPermissionsBoundary extends StObject {
  
  /**
    *  The ARN of the policy used to set the permissions boundary for the user or role.
    */
  var PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined
  
  /**
    *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
    */
  var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined
}
object AttachedPermissionsBoundary {
  
  inline def apply(): AttachedPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPermissionsBoundary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachedPermissionsBoundary] (val x: Self) extends AnyVal {
    
    inline def setPermissionsBoundaryArn(value: arnType): Self = StObject.set(x, "PermissionsBoundaryArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryArnUndefined: Self = StObject.set(x, "PermissionsBoundaryArn", js.undefined)
    
    inline def setPermissionsBoundaryType(value: PermissionsBoundaryAttachmentType): Self = StObject.set(x, "PermissionsBoundaryType", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryTypeUndefined: Self = StObject.set(x, "PermissionsBoundaryType", js.undefined)
  }
}
