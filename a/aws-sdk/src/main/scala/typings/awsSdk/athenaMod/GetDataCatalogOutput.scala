package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCatalogOutput extends StObject {
  
  /**
    * The data catalog returned.
    */
  var DataCatalog: js.UndefOr[typings.awsSdk.athenaMod.DataCatalog] = js.undefined
}
object GetDataCatalogOutput {
  
  inline def apply(): GetDataCatalogOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogOutput]
  }
  
  extension [Self <: GetDataCatalogOutput](x: Self) {
    
    inline def setDataCatalog(value: DataCatalog): Self = StObject.set(x, "DataCatalog", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogUndefined: Self = StObject.set(x, "DataCatalog", js.undefined)
  }
}
