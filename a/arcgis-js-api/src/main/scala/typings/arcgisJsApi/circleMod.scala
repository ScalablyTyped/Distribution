package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Circle
import typings.arcgisJsApi.esri.CircleConstructor
import typings.arcgisJsApi.esri.CircleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod extends Shortcut {
  
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  val ^ : CircleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  /**
    * A circle is a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) created by specifying a [center point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center) and a [radius](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html)
    */
  class Class () extends Circle {
    def this(properties: CircleProperties) = this()
  }
  
  type _To = CircleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `circleMod.foo` */
  override def _to: CircleConstructor = ^
}
