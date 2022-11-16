package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Measurement
import typings.arcgisJsApi.esri.MeasurementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsMeasurementMod {
  
  @JSImport("esri/widgets/Measurement", JSImport.Namespace)
  @js.native
  /**
    * The Measurement widget groups and manages multiple measurement tools and allows you to easily switch between them using the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html#activeTool) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html)
    */
  open class ^ ()
    extends StObject
       with Measurement {
    def this(properties: MeasurementProperties) = this()
  }
}
