package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogSummary extends StObject {
  
  /**
    * The name of the data catalog.
    */
  var CatalogName: js.UndefOr[CatalogNameString] = js.undefined
  
  /**
    * The data catalog type.
    */
  var Type: js.UndefOr[DataCatalogType] = js.undefined
}
object DataCatalogSummary {
  
  inline def apply(): DataCatalogSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogSummary]
  }
  
  extension [Self <: DataCatalogSummary](x: Self) {
    
    inline def setCatalogName(value: CatalogNameString): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    inline def setCatalogNameUndefined: Self = StObject.set(x, "CatalogName", js.undefined)
    
    inline def setType(value: DataCatalogType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
