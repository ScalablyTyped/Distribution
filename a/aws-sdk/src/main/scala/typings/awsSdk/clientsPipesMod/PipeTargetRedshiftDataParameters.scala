package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetRedshiftDataParameters extends StObject {
  
  /**
    * The name of the database. Required when authenticating using temporary credentials.
    */
  var Database: typings.awsSdk.clientsPipesMod.Database
  
  /**
    * The database user name. Required when authenticating using temporary credentials.
    */
  var DbUser: js.UndefOr[typings.awsSdk.clientsPipesMod.DbUser] = js.undefined
  
  /**
    * The name or ARN of the secret that enables access to the database. Required when authenticating using SageMaker.
    */
  var SecretManagerArn: js.UndefOr[SecretManagerArnOrJsonPath] = js.undefined
  
  /**
    * The SQL statement text to run.
    */
  var Sqls: typings.awsSdk.clientsPipesMod.Sqls
  
  /**
    * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
    */
  var StatementName: js.UndefOr[typings.awsSdk.clientsPipesMod.StatementName] = js.undefined
  
  /**
    * Indicates whether to send an event back to EventBridge after the SQL statement runs.
    */
  var WithEvent: js.UndefOr[Boolean] = js.undefined
}
object PipeTargetRedshiftDataParameters {
  
  inline def apply(Database: Database, Sqls: Sqls): PipeTargetRedshiftDataParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Sqls = Sqls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeTargetRedshiftDataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetRedshiftDataParameters] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: DbUser): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setSecretManagerArn(value: SecretManagerArnOrJsonPath): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    inline def setSqls(value: Sqls): Self = StObject.set(x, "Sqls", value.asInstanceOf[js.Any])
    
    inline def setSqlsVarargs(value: Sql*): Self = StObject.set(x, "Sqls", js.Array(value*))
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    inline def setWithEvent(value: Boolean): Self = StObject.set(x, "WithEvent", value.asInstanceOf[js.Any])
    
    inline def setWithEventUndefined: Self = StObject.set(x, "WithEvent", js.undefined)
  }
}
