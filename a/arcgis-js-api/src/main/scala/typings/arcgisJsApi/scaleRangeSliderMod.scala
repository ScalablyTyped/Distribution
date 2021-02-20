package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleRangeSlider
import typings.arcgisJsApi.esri.ScaleRangeSliderConstructor
import typings.arcgisJsApi.esri.ScaleRangeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleRangeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : ScaleRangeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleRangeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ScaleRangeSlider widget allows the user to set a minimum and maximum scale based on named scale ranges.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html)
    */
  class Class () extends ScaleRangeSlider {
    def this(properties: ScaleRangeSliderProperties) = this()
  }
  
  type _To = ScaleRangeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleRangeSliderMod.foo` */
  override def _to: ScaleRangeSliderConstructor = ^
}
