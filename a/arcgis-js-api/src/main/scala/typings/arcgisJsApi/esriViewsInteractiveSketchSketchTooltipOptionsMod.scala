package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SketchTooltipOptions
import typings.arcgisJsApi.esri.SketchTooltipOptionsConstructor
import typings.arcgisJsApi.esri.SketchTooltipOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInteractiveSketchSketchTooltipOptionsMod extends Shortcut {
  
  @JSImport("esri/views/interactive/sketch/SketchTooltipOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SketchTooltipOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/interactive/sketch/SketchTooltipOptions", JSImport.Namespace)
  @js.native
  /**
    * The `SketchTooltipOptions` allows users to configure the tooltips which are shown while sketching and editing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-sketch-SketchTooltipOptions.html)
    */
  open class Class ()
    extends StObject
       with SketchTooltipOptions {
    def this(properties: SketchTooltipOptionsProperties) = this()
  }
  
  type _To = js.Object & SketchTooltipOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsInteractiveSketchSketchTooltipOptionsMod.foo` */
  override def _to: js.Object & SketchTooltipOptionsConstructor = ^
}
