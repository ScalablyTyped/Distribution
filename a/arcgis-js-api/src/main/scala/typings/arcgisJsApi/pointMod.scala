package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Point
import typings.arcgisJsApi.esri.PointConstructor
import typings.arcgisJsApi.esri.PointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod extends Shortcut {
  
  @JSImport("esri/geometry/Point", JSImport.Namespace)
  @js.native
  val ^ : PointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Point", JSImport.Namespace)
  @js.native
  /**
    * A location defined by X, Y, and Z coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
    */
  class Class () extends Point {
    def this(properties: PointProperties) = this()
  }
  
  type _To = PointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointMod.foo` */
  override def _to: PointConstructor = ^
}
