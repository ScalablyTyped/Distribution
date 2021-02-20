package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SlicePlane
import typings.arcgisJsApi.esri.SlicePlaneConstructor
import typings.arcgisJsApi.esri.SlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slicePlaneMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  val ^ : SlicePlaneConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  /**
    * Provides the shape definition of a slice plane for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html)
    */
  class Class () extends SlicePlane {
    def this(properties: SlicePlaneProperties) = this()
  }
  
  type _To = SlicePlaneConstructor
  
  /* This means you don't have to write `^`, but can instead just say `slicePlaneMod.foo` */
  override def _to: SlicePlaneConstructor = ^
}
