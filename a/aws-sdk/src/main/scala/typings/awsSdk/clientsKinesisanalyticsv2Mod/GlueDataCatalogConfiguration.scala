package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueDataCatalogConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var DatabaseARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.DatabaseARN
}
object GlueDataCatalogConfiguration {
  
  inline def apply(DatabaseARN: DatabaseARN): GlueDataCatalogConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseARN = DatabaseARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueDataCatalogConfiguration]
  }
  
  extension [Self <: GlueDataCatalogConfiguration](x: Self) {
    
    inline def setDatabaseARN(value: DatabaseARN): Self = StObject.set(x, "DatabaseARN", value.asInstanceOf[js.Any])
  }
}
