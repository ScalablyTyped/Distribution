package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClassedSizeSlider
import typings.arcgisJsApi.esri.ClassedSizeSliderConstructor
import typings.arcgisJsApi.esri.ClassedSizeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classedSizeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassedSizeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
    */
  open class Class ()
    extends StObject
       with ClassedSizeSlider {
    def this(properties: ClassedSizeSliderProperties) = this()
  }
  
  type _To = js.Object & ClassedSizeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classedSizeSliderMod.foo` */
  override def _to: js.Object & ClassedSizeSliderConstructor = ^
}
