package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Polygon
import typings.arcgisJsApi.esri.PolygonConstructor
import typings.arcgisJsApi.esri.PolygonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod extends Shortcut {
  
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  val ^ : PolygonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  /**
    * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
    */
  class Class () extends Polygon {
    def this(properties: PolygonProperties) = this()
  }
  
  type _To = PolygonConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polygonMod.foo` */
  override def _to: PolygonConstructor = ^
}
