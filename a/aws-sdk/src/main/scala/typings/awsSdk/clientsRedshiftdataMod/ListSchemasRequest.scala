package typings.awsSdk.clientsRedshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasRequest extends StObject {
  
  /**
    * The cluster identifier. This parameter is required when connecting to a cluster and authenticating using either Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: js.UndefOr[Location] = js.undefined
  
  /**
    * A database name. The connected database is specified when you connect with your authentication credentials. 
    */
  var ConnectedDatabase: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database that contains the schemas to list. If ConnectedDatabase is not specified, this is also the database to connect to with your authentication credentials.
    */
  var Database: String
  
  /**
    * The database user name. This parameter is required when connecting to a cluster and authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of schemas to return in the response. If more schemas exist than fit in one response, then NextToken is returned to page through the results. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A pattern to filter results by schema name. Within a schema pattern, "%" means match any substring of 0 or more characters and "_" means match any one character. Only schema name entries matching the search pattern are returned. 
    */
  var SchemaPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.clientsRedshiftdataMod.SecretArn] = js.undefined
  
  /**
    * The serverless workgroup name. This parameter is required when connecting to a serverless workgroup and authenticating using either Secrets Manager or temporary credentials.
    */
  var WorkgroupName: js.UndefOr[WorkgroupNameString] = js.undefined
}
object ListSchemasRequest {
  
  inline def apply(Database: String): ListSchemasRequest = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasRequest]
  }
  
  extension [Self <: ListSchemasRequest](x: Self) {
    
    inline def setClusterIdentifier(value: Location): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setConnectedDatabase(value: String): Self = StObject.set(x, "ConnectedDatabase", value.asInstanceOf[js.Any])
    
    inline def setConnectedDatabaseUndefined: Self = StObject.set(x, "ConnectedDatabase", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaPattern(value: String): Self = StObject.set(x, "SchemaPattern", value.asInstanceOf[js.Any])
    
    inline def setSchemaPatternUndefined: Self = StObject.set(x, "SchemaPattern", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupNameString): Self = StObject.set(x, "WorkgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "WorkgroupName", js.undefined)
  }
}
