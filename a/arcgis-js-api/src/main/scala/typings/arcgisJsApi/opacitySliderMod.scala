package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpacitySlider
import typings.arcgisJsApi.esri.OpacitySliderConstructor
import typings.arcgisJsApi.esri.OpacitySliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacitySliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/OpacitySlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OpacitySliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/OpacitySlider", JSImport.Namespace)
  @js.native
  /**
    * The OpacitySlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html)
    */
  class Class ()
    extends StObject
       with OpacitySlider {
    def this(properties: OpacitySliderProperties) = this()
  }
  
  type _To = js.Object & OpacitySliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `opacitySliderMod.foo` */
  override def _to: js.Object & OpacitySliderConstructor = ^
}
