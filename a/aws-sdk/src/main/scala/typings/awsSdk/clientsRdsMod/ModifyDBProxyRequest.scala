package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyRequest extends StObject {
  
  /**
    * The new authentication settings for the DBProxy.
    */
  var Auth: js.UndefOr[UserAuthConfigList] = js.undefined
  
  /**
    * The identifier for the DBProxy to modify.
    */
  var DBProxyName: String
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  var IdleClientTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The new identifier for the DBProxy. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewDBProxyName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
    */
  var RequireTLS: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in Amazon Web Services Secrets Manager.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The new list of security groups for the DBProxy.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.undefined
}
object ModifyDBProxyRequest {
  
  inline def apply(DBProxyName: String): ModifyDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBProxyRequest] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: UserAuthConfigList): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "Auth", js.undefined)
    
    inline def setAuthVarargs(value: UserAuthConfig*): Self = StObject.set(x, "Auth", js.Array(value*))
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDebugLogging(value: BooleanOptional): Self = StObject.set(x, "DebugLogging", value.asInstanceOf[js.Any])
    
    inline def setDebugLoggingUndefined: Self = StObject.set(x, "DebugLogging", js.undefined)
    
    inline def setIdleClientTimeout(value: IntegerOptional): Self = StObject.set(x, "IdleClientTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleClientTimeoutUndefined: Self = StObject.set(x, "IdleClientTimeout", js.undefined)
    
    inline def setNewDBProxyName(value: String): Self = StObject.set(x, "NewDBProxyName", value.asInstanceOf[js.Any])
    
    inline def setNewDBProxyNameUndefined: Self = StObject.set(x, "NewDBProxyName", js.undefined)
    
    inline def setRequireTLS(value: BooleanOptional): Self = StObject.set(x, "RequireTLS", value.asInstanceOf[js.Any])
    
    inline def setRequireTLSUndefined: Self = StObject.set(x, "RequireTLS", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
