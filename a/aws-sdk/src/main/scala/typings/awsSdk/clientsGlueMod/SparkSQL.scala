package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSQL extends StObject {
  
  /**
    * The data inputs identified by their node names. You can associate a table name with each input node to use in the SQL query. The name you choose must meet the Spark SQL naming restrictions.
    */
  var Inputs: ManyInputs
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the SparkSQL transform.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you have a datasource named "MyDataSource". If you specify From as MyDataSource, and Alias as SqlName, then in your SQL you can do:  select * from SqlName  and that gets data from MyDataSource.
    */
  var SqlAliases: typings.awsSdk.clientsGlueMod.SqlAliases
  
  /**
    * A SQL query that must use Spark SQL syntax and return a single data set.
    */
  var SqlQuery: typings.awsSdk.clientsGlueMod.SqlQuery
}
object SparkSQL {
  
  inline def apply(Inputs: ManyInputs, Name: NodeName, SqlAliases: SqlAliases, SqlQuery: SqlQuery): SparkSQL = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SqlAliases = SqlAliases.asInstanceOf[js.Any], SqlQuery = SqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkSQL]
  }
  
  extension [Self <: SparkSQL](x: Self) {
    
    inline def setInputs(value: ManyInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setSqlAliases(value: SqlAliases): Self = StObject.set(x, "SqlAliases", value.asInstanceOf[js.Any])
    
    inline def setSqlAliasesVarargs(value: SqlAlias*): Self = StObject.set(x, "SqlAliases", js.Array(value*))
    
    inline def setSqlQuery(value: SqlQuery): Self = StObject.set(x, "SqlQuery", value.asInstanceOf[js.Any])
  }
}
