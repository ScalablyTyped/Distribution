package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionConfiguration extends StObject {
  
  /**
    * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
    */
  var DatabaseHost: typings.awsSdk.clientsKendraMod.DatabaseHost
  
  /**
    * The name of the database containing the document data.
    */
  var DatabaseName: typings.awsSdk.clientsKendraMod.DatabaseName
  
  /**
    * The port that the database uses for connections.
    */
  var DatabasePort: typings.awsSdk.clientsKendraMod.DatabasePort
  
  /**
    * The Amazon Resource Name (ARN) of credentials stored in Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Database Data Source. For more information about Secrets Manager, see  What Is Secrets Manager in the  Secrets Manager  user guide.
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The name of the table that contains the document data.
    */
  var TableName: typings.awsSdk.clientsKendraMod.TableName
}
object ConnectionConfiguration {
  
  inline def apply(
    DatabaseHost: DatabaseHost,
    DatabaseName: DatabaseName,
    DatabasePort: DatabasePort,
    SecretArn: SecretArn,
    TableName: TableName
  ): ConnectionConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseHost = DatabaseHost.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], DatabasePort = DatabasePort.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDatabaseHost(value: DatabaseHost): Self = StObject.set(x, "DatabaseHost", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabasePort(value: DatabasePort): Self = StObject.set(x, "DatabasePort", value.asInstanceOf[js.Any])
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
