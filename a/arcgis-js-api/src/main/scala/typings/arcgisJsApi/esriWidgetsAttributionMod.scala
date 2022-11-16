package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Attribution
import typings.arcgisJsApi.esri.AttributionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttributionMod {
  
  @JSImport("esri/widgets/Attribution", JSImport.Namespace)
  @js.native
  /**
    * The Attribution widget displays attribution text for the layers in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html)
    */
  open class ^ ()
    extends StObject
       with Attribution {
    def this(properties: AttributionProperties) = this()
  }
}
