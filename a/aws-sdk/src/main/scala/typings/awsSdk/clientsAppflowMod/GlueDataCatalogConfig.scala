package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueDataCatalogConfig extends StObject {
  
  /**
    * The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your Amazon Web Services account. These tables contain metadata for the data that's transferred by the flow that you configure with this parameter.  When you configure a new flow with this parameter, you must specify an existing database. 
    */
  var databaseName: GlueDataCatalogDatabaseName
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to create Data Catalog tables, databases, and partitions. For an example IAM policy that has the required permissions, see Identity-based policy examples for Amazon AppFlow.
    */
  var roleArn: GlueDataCatalogIAMRole
  
  /**
    * A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure with this setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
    */
  var tablePrefix: GlueDataCatalogTablePrefix
}
object GlueDataCatalogConfig {
  
  inline def apply(
    databaseName: GlueDataCatalogDatabaseName,
    roleArn: GlueDataCatalogIAMRole,
    tablePrefix: GlueDataCatalogTablePrefix
  ): GlueDataCatalogConfig = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tablePrefix = tablePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueDataCatalogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlueDataCatalogConfig] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: GlueDataCatalogDatabaseName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: GlueDataCatalogIAMRole): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTablePrefix(value: GlueDataCatalogTablePrefix): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
  }
}
