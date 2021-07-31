package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSublayer
  extends StObject
     with Accessor
     with IntersectItem {
  
  /**
    * The sublayer's layer id as defined by the Scene Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#id)
    */
  val id: Double = js.native
  
  /**
    * Indicates if this sublayer is empty.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#isEmpty)
    */
  val isEmpty: Boolean = js.native
  
  /**
    * The modelName is a standard name for each sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#modelName)
    */
  val modelName: String = js.native
  
  /**
    * Opacity of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#opacity)
    */
  var opacity: Double = js.native
  
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#title)
    */
  var title: String = js.native
  
  /**
    * Indicates if the sublayer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#visible)
    */
  var visible: Boolean = js.native
}
