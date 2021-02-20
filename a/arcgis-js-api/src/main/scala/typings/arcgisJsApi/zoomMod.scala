package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Zoom
import typings.arcgisJsApi.esri.ZoomConstructor
import typings.arcgisJsApi.esri.ZoomProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod extends Shortcut {
  
  @JSImport("esri/widgets/Zoom", JSImport.Namespace)
  @js.native
  val ^ : ZoomConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Zoom", JSImport.Namespace)
  @js.native
  /**
    * The Zoom widget allows users to zoom in/out within a view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html)
    */
  class Class () extends Zoom {
    def this(properties: ZoomProperties) = this()
  }
  
  type _To = ZoomConstructor
  
  /* This means you don't have to write `^`, but can instead just say `zoomMod.foo` */
  override def _to: ZoomConstructor = ^
}
