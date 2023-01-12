package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseInputDefinition extends StObject {
  
  /**
    * The table within the target database.
    */
  var DatabaseTableName: js.UndefOr[typings.awsSdk.clientsDatabrewMod.DatabaseTableName] = js.undefined
  
  /**
    * The Glue Connection that stores the connection information for the target database.
    */
  var GlueConnectionName: typings.awsSdk.clientsDatabrewMod.GlueConnectionName
  
  /**
    * Custom SQL to run against the provided Glue connection. This SQL will be used as the input for DataBrew projects and jobs.
    */
  var QueryString: js.UndefOr[typings.awsSdk.clientsDatabrewMod.QueryString] = js.undefined
  
  var TempDirectory: js.UndefOr[S3Location] = js.undefined
}
object DatabaseInputDefinition {
  
  inline def apply(GlueConnectionName: GlueConnectionName): DatabaseInputDefinition = {
    val __obj = js.Dynamic.literal(GlueConnectionName = GlueConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInputDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseInputDefinition] (val x: Self) extends AnyVal {
    
    inline def setDatabaseTableName(value: DatabaseTableName): Self = StObject.set(x, "DatabaseTableName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTableNameUndefined: Self = StObject.set(x, "DatabaseTableName", js.undefined)
    
    inline def setGlueConnectionName(value: GlueConnectionName): Self = StObject.set(x, "GlueConnectionName", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
    
    inline def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}
