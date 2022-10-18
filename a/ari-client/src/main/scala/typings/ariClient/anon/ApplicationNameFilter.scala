package typings.ariClient.anon

import typings.ariClient.mod.IndexableObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationNameFilter extends StObject {
  
  var applicationName: String
  
  var filter: js.UndefOr[IndexableObject] = js.undefined
}
object ApplicationNameFilter {
  
  inline def apply(applicationName: String): ApplicationNameFilter = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationNameFilter]
  }
  
  extension [Self <: ApplicationNameFilter](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: IndexableObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
