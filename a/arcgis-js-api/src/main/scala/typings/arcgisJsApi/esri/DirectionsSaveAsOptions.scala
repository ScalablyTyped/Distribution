package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsSaveAsOptions extends StObject {
  
  /**
  		 * The folder in which to save the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#saveAs)
  		 */
  var folder: js.UndefOr[PortalFolder] = js.undefined
}
object DirectionsSaveAsOptions {
  
  inline def apply(): DirectionsSaveAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsSaveAsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsSaveAsOptions] (val x: Self) extends AnyVal {
    
    inline def setFolder(value: PortalFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
  }
}
