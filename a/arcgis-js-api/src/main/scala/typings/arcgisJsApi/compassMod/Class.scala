package typings.arcgisJsApi.compassMod

import typings.arcgisJsApi.esri.Compass
import typings.arcgisJsApi.esri.CompassProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/widgets/Compass", JSImport.Namespace)
@js.native
/**
  * The Compass widget indicates where north is in relation to the current view [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) or [camera heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html)
  */
class Class () extends Compass {
  def this(properties: CompassProperties) = this()
}
