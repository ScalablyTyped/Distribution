package typings.ariClient.anon

import typings.ariClient.mod.IndexableObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.UndefOr[IndexableObject] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: IndexableObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
