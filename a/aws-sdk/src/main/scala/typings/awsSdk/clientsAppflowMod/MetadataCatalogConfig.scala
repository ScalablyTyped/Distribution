package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataCatalogConfig extends StObject {
  
  /**
    * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog.
    */
  var glueDataCatalog: js.UndefOr[GlueDataCatalogConfig] = js.undefined
}
object MetadataCatalogConfig {
  
  inline def apply(): MetadataCatalogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCatalogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataCatalogConfig] (val x: Self) extends AnyVal {
    
    inline def setGlueDataCatalog(value: GlueDataCatalogConfig): Self = StObject.set(x, "glueDataCatalog", value.asInstanceOf[js.Any])
    
    inline def setGlueDataCatalogUndefined: Self = StObject.set(x, "glueDataCatalog", js.undefined)
  }
}
