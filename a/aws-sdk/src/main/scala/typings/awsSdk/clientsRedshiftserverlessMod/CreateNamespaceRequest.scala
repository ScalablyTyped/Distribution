package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamespaceRequest extends StObject {
  
  /**
    * The password of the administrator for the first database created in the namespace.
    */
  var adminUserPassword: js.UndefOr[DbPassword] = js.undefined
  
  /**
    * The username of the administrator for the first database created in the namespace.
    */
  var adminUsername: js.UndefOr[DbUser] = js.undefined
  
  /**
    * The name of the first database created in the namespace.
    */
  var dbName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
    */
  var defaultIamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of IAM roles to associate with the namespace.
    */
  var iamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Key Management Service key used to encrypt your data.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The types of logs the namespace can export. Available export types are userlog, connectionlog, and useractivitylog.
    */
  var logExports: js.UndefOr[LogExportList] = js.undefined
  
  /**
    * The name of the namespace.
    */
  var namespaceName: NamespaceName
  
  /**
    * A list of tag instances.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateNamespaceRequest {
  
  inline def apply(namespaceName: NamespaceName): CreateNamespaceRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamespaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNamespaceRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminUserPassword(value: DbPassword): Self = StObject.set(x, "adminUserPassword", value.asInstanceOf[js.Any])
    
    inline def setAdminUserPasswordUndefined: Self = StObject.set(x, "adminUserPassword", js.undefined)
    
    inline def setAdminUsername(value: DbUser): Self = StObject.set(x, "adminUsername", value.asInstanceOf[js.Any])
    
    inline def setAdminUsernameUndefined: Self = StObject.set(x, "adminUsername", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setDefaultIamRoleArn(value: String): Self = StObject.set(x, "defaultIamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultIamRoleArnUndefined: Self = StObject.set(x, "defaultIamRoleArn", js.undefined)
    
    inline def setIamRoles(value: IamRoleArnList): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
    
    inline def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
    
    inline def setIamRolesVarargs(value: IamRoleArn*): Self = StObject.set(x, "iamRoles", js.Array(value*))
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLogExports(value: LogExportList): Self = StObject.set(x, "logExports", value.asInstanceOf[js.Any])
    
    inline def setLogExportsUndefined: Self = StObject.set(x, "logExports", js.undefined)
    
    inline def setLogExportsVarargs(value: LogExport*): Self = StObject.set(x, "logExports", js.Array(value*))
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
