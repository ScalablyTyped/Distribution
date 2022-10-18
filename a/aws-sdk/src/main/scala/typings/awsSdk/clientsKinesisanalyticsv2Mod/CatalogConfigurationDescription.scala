package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogConfigurationDescription extends StObject {
  
  /**
    * The configuration parameters for the default Amazon Glue database. You use this database for SQL queries that you write in a Kinesis Data Analytics Studio notebook.
    */
  var GlueDataCatalogConfigurationDescription: typings.awsSdk.clientsKinesisanalyticsv2Mod.GlueDataCatalogConfigurationDescription
}
object CatalogConfigurationDescription {
  
  inline def apply(GlueDataCatalogConfigurationDescription: GlueDataCatalogConfigurationDescription): CatalogConfigurationDescription = {
    val __obj = js.Dynamic.literal(GlueDataCatalogConfigurationDescription = GlueDataCatalogConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogConfigurationDescription]
  }
  
  extension [Self <: CatalogConfigurationDescription](x: Self) {
    
    inline def setGlueDataCatalogConfigurationDescription(value: GlueDataCatalogConfigurationDescription): Self = StObject.set(x, "GlueDataCatalogConfigurationDescription", value.asInstanceOf[js.Any])
  }
}
