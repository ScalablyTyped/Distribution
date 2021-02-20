package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Compass
import typings.arcgisJsApi.esri.CompassConstructor
import typings.arcgisJsApi.esri.CompassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compassMod extends Shortcut {
  
  @JSImport("esri/widgets/Compass", JSImport.Namespace)
  @js.native
  val ^ : CompassConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
  
  type _To = CompassConstructor
  
  /* This means you don't have to write `^`, but can instead just say `compassMod.foo` */
  override def _to: CompassConstructor = ^
}
