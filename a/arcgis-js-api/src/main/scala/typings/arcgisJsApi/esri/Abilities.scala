package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abilities extends StObject {
  
  /**
    * Indicates whether the time ability is enabled in the Bookmarks widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#Abilities)
    */
  var time: js.UndefOr[Boolean] = js.undefined
}
object Abilities {
  
  inline def apply(): Abilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abilities]
  }
  
  extension [Self <: Abilities](x: Self) {
    
    inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
