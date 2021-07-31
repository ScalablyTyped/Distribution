package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClassedColorSlider
import typings.arcgisJsApi.esri.ClassedColorSliderConstructor
import typings.arcgisJsApi.esri.ClassedColorSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedColorSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassedColorSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider", JSImport.Namespace)
  @js.native
  /**
    * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
    */
  class Class ()
    extends StObject
       with ClassedColorSlider {
    def this(properties: ClassedColorSliderProperties) = this()
  }
  
  type _To = js.Object & ClassedColorSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedColorSliderMod.foo` */
  override def _to: js.Object & ClassedColorSliderConstructor = ^
}
