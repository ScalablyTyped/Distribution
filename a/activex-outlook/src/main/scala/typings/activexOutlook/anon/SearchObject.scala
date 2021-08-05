package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchObject extends StObject {
  
  val SearchObject: Search
}
object SearchObject {
  
  inline def apply(SearchObject: Search): SearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchObject]
  }
  
  extension [Self <: SearchObject](x: Self) {
    
    inline def setSearchObject(value: Search): Self = StObject.set(x, "SearchObject", value.asInstanceOf[js.Any])
  }
}
