package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketAclGrantConfiguration extends StObject {
  
  /**
    * The grantee to whom you’re assigning access rights.
    */
  var grantee: AclGrantee
  
  /**
    * The permissions being granted.
    */
  var permission: AclPermission
}
object S3BucketAclGrantConfiguration {
  
  inline def apply(grantee: AclGrantee, permission: AclPermission): S3BucketAclGrantConfiguration = {
    val __obj = js.Dynamic.literal(grantee = grantee.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketAclGrantConfiguration]
  }
  
  extension [Self <: S3BucketAclGrantConfiguration](x: Self) {
    
    inline def setGrantee(value: AclGrantee): Self = StObject.set(x, "grantee", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: AclPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
  }
}
