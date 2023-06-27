package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GroundView
import typings.arcgisJsApi.esri.GroundViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsGroundViewMod {
  
  @JSImport("esri/views/GroundView", JSImport.Namespace)
  @js.native
  /**
  		 * This class represents the view for the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) of a map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html)
  		 */
  open class ^ ()
    extends StObject
       with GroundView {
    def this(properties: GroundViewProperties) = this()
  }
}
