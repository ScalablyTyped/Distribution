package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorSizeSlider
import typings.arcgisJsApi.esri.ColorSizeSliderConstructor
import typings.arcgisJsApi.esri.ColorSizeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSizeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider", JSImport.Namespace)
  @js.native
  val ^ : ColorSizeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ColorSizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html)
    */
  class Class () extends ColorSizeSlider {
    def this(properties: ColorSizeSliderProperties) = this()
  }
  
  type _To = ColorSizeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorSizeSliderMod.foo` */
  override def _to: ColorSizeSliderConstructor = ^
}
