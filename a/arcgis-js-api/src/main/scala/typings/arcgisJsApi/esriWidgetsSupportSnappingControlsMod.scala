package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SnappingControls
import typings.arcgisJsApi.esri.SnappingControlsConstructor
import typings.arcgisJsApi.esri.SnappingControlsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportSnappingControlsMod extends Shortcut {
  
  @JSImport("esri/widgets/support/SnappingControls", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SnappingControlsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/SnappingControls", JSImport.Namespace)
  @js.native
  /**
    * The SnappingControls widget provides a user interface to use alongside the [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html)
    */
  open class Class ()
    extends StObject
       with SnappingControls {
    def this(properties: SnappingControlsProperties) = this()
  }
  
  type _To = js.Object & SnappingControlsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportSnappingControlsMod.foo` */
  override def _to: js.Object & SnappingControlsConstructor = ^
}
