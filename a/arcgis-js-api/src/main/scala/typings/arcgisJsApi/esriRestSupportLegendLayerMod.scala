package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LegendLayer
import typings.arcgisJsApi.esri.LegendLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportLegendLayerMod {
  
  @JSImport("esri/rest/support/LegendLayer", JSImport.Namespace)
  @js.native
  /**
    * Define layer properties for the legend layers associated with a [PrintTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html)
    */
  open class ^ ()
    extends StObject
       with LegendLayer {
    def this(properties: LegendLayerProperties) = this()
  }
}
