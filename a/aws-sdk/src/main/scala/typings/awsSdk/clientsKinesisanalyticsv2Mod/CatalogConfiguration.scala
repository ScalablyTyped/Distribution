package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogConfiguration extends StObject {
  
  /**
    * The configuration parameters for the default Amazon Glue database. You use this database for Apache Flink SQL queries and table API transforms that you write in a Kinesis Data Analytics Studio notebook.
    */
  var GlueDataCatalogConfiguration: typings.awsSdk.clientsKinesisanalyticsv2Mod.GlueDataCatalogConfiguration
}
object CatalogConfiguration {
  
  inline def apply(GlueDataCatalogConfiguration: GlueDataCatalogConfiguration): CatalogConfiguration = {
    val __obj = js.Dynamic.literal(GlueDataCatalogConfiguration = GlueDataCatalogConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGlueDataCatalogConfiguration(value: GlueDataCatalogConfiguration): Self = StObject.set(x, "GlueDataCatalogConfiguration", value.asInstanceOf[js.Any])
  }
}
