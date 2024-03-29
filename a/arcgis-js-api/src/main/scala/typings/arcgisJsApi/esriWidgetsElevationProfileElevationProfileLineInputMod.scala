package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ElevationProfileLineInput
import typings.arcgisJsApi.esri.ElevationProfileLineInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsElevationProfileElevationProfileLineInputMod {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineInput", JSImport.Namespace)
  @js.native
  /**
  		 * Profile line which samples elevation from the geometry of the input [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) itself, typically used on input lines with z values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineInput.html)
  		 */
  open class ^ ()
    extends StObject
       with ElevationProfileLineInput {
    def this(properties: ElevationProfileLineInputProperties) = this()
  }
}
