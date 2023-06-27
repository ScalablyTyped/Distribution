package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FloorFilter
import typings.arcgisJsApi.esri.FloorFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFloorFilterMod {
  
  @JSImport("esri/widgets/FloorFilter", JSImport.Namespace)
  @js.native
  /**
  		 * The FloorFilter widget simplifies visualization of GIS data for a specific floor of a building in your application.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html)
  		 */
  open class ^ ()
    extends StObject
       with FloorFilter {
    def this(properties: FloorFilterProperties) = this()
  }
}
