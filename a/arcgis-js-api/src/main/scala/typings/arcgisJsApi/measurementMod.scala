package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Measurement
import typings.arcgisJsApi.esri.MeasurementConstructor
import typings.arcgisJsApi.esri.MeasurementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measurementMod extends Shortcut {
  
  @JSImport("esri/widgets/Measurement", JSImport.Namespace)
  @js.native
  val ^ : MeasurementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Measurement", JSImport.Namespace)
  @js.native
  /**
    * The Measurement widget groups and manages multiple measurement tools and allows you to easily switch between them using the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#activeTool) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html)
    */
  class Class () extends Measurement {
    def this(properties: MeasurementProperties) = this()
  }
  
  type _To = MeasurementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `measurementMod.foo` */
  override def _to: MeasurementConstructor = ^
}
