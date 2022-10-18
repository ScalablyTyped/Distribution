package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueDataCatalogConfigurationUpdate extends StObject {
  
  /**
    * The updated Amazon Resource Name (ARN) of the database.
    */
  var DatabaseARNUpdate: DatabaseARN
}
object GlueDataCatalogConfigurationUpdate {
  
  inline def apply(DatabaseARNUpdate: DatabaseARN): GlueDataCatalogConfigurationUpdate = {
    val __obj = js.Dynamic.literal(DatabaseARNUpdate = DatabaseARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueDataCatalogConfigurationUpdate]
  }
  
  extension [Self <: GlueDataCatalogConfigurationUpdate](x: Self) {
    
    inline def setDatabaseARNUpdate(value: DatabaseARN): Self = StObject.set(x, "DatabaseARNUpdate", value.asInstanceOf[js.Any])
  }
}
