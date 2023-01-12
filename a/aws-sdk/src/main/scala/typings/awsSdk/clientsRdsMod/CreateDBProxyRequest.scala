package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBProxyRequest extends StObject {
  
  /**
    * The authorization mechanism that the proxy uses.
    */
  var Auth: UserAuthConfigList
  
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your Amazon Web Services account in the specified Amazon Web Services Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var DBProxyName: String
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL databases, specify MYSQL. For Aurora PostgreSQL and RDS for PostgreSQL databases, specify POSTGRESQL. For RDS for Microsoft SQL Server, specify SQLSERVER.
    */
  var EngineFamily: typings.awsSdk.clientsRdsMod.EngineFamily
  
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  var IdleClientTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in Amazon Web Services Secrets Manager.
    */
  var RoleArn: String
  
  /**
    * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * One or more VPC security group IDs to associate with the new proxy.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * One or more VPC subnet IDs to associate with the new proxy.
    */
  var VpcSubnetIds: StringList
}
object CreateDBProxyRequest {
  
  inline def apply(
    Auth: UserAuthConfigList,
    DBProxyName: String,
    EngineFamily: EngineFamily,
    RoleArn: String,
    VpcSubnetIds: StringList
  ): CreateDBProxyRequest = {
    val __obj = js.Dynamic.literal(Auth = Auth.asInstanceOf[js.Any], DBProxyName = DBProxyName.asInstanceOf[js.Any], EngineFamily = EngineFamily.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], VpcSubnetIds = VpcSubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBProxyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBProxyRequest] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: UserAuthConfigList): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    inline def setAuthVarargs(value: UserAuthConfig*): Self = StObject.set(x, "Auth", js.Array(value*))
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDebugLogging(value: Boolean): Self = StObject.set(x, "DebugLogging", value.asInstanceOf[js.Any])
    
    inline def setDebugLoggingUndefined: Self = StObject.set(x, "DebugLogging", js.undefined)
    
    inline def setEngineFamily(value: EngineFamily): Self = StObject.set(x, "EngineFamily", value.asInstanceOf[js.Any])
    
    inline def setIdleClientTimeout(value: IntegerOptional): Self = StObject.set(x, "IdleClientTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleClientTimeoutUndefined: Self = StObject.set(x, "IdleClientTimeout", js.undefined)
    
    inline def setRequireTLS(value: Boolean): Self = StObject.set(x, "RequireTLS", value.asInstanceOf[js.Any])
    
    inline def setRequireTLSUndefined: Self = StObject.set(x, "RequireTLS", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
    
    inline def setVpcSubnetIds(value: StringList): Self = StObject.set(x, "VpcSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetIdsVarargs(value: String*): Self = StObject.set(x, "VpcSubnetIds", js.Array(value*))
  }
}
