package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteInfoConstructor
  extends StObject
     with Instantiable0[RouteInfo]
     with Instantiable1[/* properties */ RouteInfoProperties, RouteInfo] {
  
  /**
  		 * Creates a [RouteInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#fromGraphic)
  		 */
  def fromGraphic(): RouteInfo = js.native
  def fromGraphic(graphic: Graphic): RouteInfo = js.native
  
  def fromJSON(json: Any): RouteInfo = js.native
}
