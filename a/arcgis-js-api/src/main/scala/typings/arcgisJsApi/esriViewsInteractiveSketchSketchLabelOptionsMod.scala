package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SketchLabelOptions
import typings.arcgisJsApi.esri.SketchLabelOptionsConstructor
import typings.arcgisJsApi.esri.SketchLabelOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInteractiveSketchSketchLabelOptionsMod extends Shortcut {
  
  @JSImport("esri/views/interactive/sketch/SketchLabelOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SketchLabelOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/interactive/sketch/SketchLabelOptions", JSImport.Namespace)
  @js.native
  /**
    * The `SketchLabelOptions` allows users to configure the labels which are shown next to each segment of a graphic while sketching and editing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-sketch-SketchLabelOptions.html)
    */
  open class Class ()
    extends StObject
       with SketchLabelOptions {
    def this(properties: SketchLabelOptionsProperties) = this()
  }
  
  type _To = js.Object & SketchLabelOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsInteractiveSketchSketchLabelOptionsMod.foo` */
  override def _to: js.Object & SketchLabelOptionsConstructor = ^
}
