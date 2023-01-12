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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setGlueDataCatalogConfigurationDescription(value: GlueDataCatalogConfigurationDescription): Self = StObject.set(x, "GlueDataCatalogConfigurationDescription", value.asInstanceOf[js.Any])
  }
}
