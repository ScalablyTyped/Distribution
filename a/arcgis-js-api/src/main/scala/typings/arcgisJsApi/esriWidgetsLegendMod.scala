package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Legend
import typings.arcgisJsApi.esri.LegendProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLegendMod {
  
  @JSImport("esri/widgets/Legend", JSImport.Namespace)
  @js.native
  /**
    * The Legend widget describes the symbols used to represent layers in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html)
    */
  open class ^ ()
    extends StObject
       with Legend {
    def this(properties: LegendProperties) = this()
  }
}
