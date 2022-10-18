package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionRequest extends StObject {
  
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
}
object BeginTransactionRequest {
  
  inline def apply(resourceArn: Arn, secretArn: Arn): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  extension [Self <: BeginTransactionRequest](x: Self) {
    
    inline def setDatabase(value: DbName): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: DbName): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
  }
}
