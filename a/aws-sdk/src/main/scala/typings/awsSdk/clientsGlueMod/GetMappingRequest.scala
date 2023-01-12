package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMappingRequest extends StObject {
  
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsSdk.clientsGlueMod.Location] = js.undefined
  
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.undefined
  
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry
}
object GetMappingRequest {
  
  inline def apply(Source: CatalogEntry): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setSinks(value: CatalogEntries): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksUndefined: Self = StObject.set(x, "Sinks", js.undefined)
    
    inline def setSinksVarargs(value: CatalogEntry*): Self = StObject.set(x, "Sinks", js.Array(value*))
    
    inline def setSource(value: CatalogEntry): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
