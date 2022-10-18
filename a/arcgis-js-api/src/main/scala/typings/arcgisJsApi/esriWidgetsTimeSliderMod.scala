package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeSlider
import typings.arcgisJsApi.esri.TimeSliderConstructor
import typings.arcgisJsApi.esri.TimeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsTimeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/TimeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/TimeSlider", JSImport.Namespace)
  @js.native
  /**
    * The TimeSlider widget simplifies visualization of temporal data in your application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html)
    */
  open class Class ()
    extends StObject
       with TimeSlider {
    def this(properties: TimeSliderProperties) = this()
  }
  
  type _To = js.Object & TimeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsTimeSliderMod.foo` */
  override def _to: js.Object & TimeSliderConstructor = ^
}
