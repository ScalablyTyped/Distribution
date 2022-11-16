package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MultipointDrawAction
import typings.arcgisJsApi.esri.MultipointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawMultipointDrawActionMod {
  
  @JSImport("esri/views/draw/MultipointDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses the view events to generate a set of coordinates to create a new [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html)
    */
  open class ^ ()
    extends StObject
       with MultipointDrawAction {
    def this(properties: MultipointDrawActionProperties) = this()
  }
}
