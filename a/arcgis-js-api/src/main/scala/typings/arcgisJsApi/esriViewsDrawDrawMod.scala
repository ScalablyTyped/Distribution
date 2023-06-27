package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Draw
import typings.arcgisJsApi.esri.DrawProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawDrawMod {
  
  @JSImport("esri/views/draw/Draw", JSImport.Namespace)
  @js.native
  /**
  		 * The Draw class provides advanced drawing capabilities for developers who need complete control over creating temporary graphics with different geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html)
  		 */
  open class ^ ()
    extends StObject
       with Draw {
    def this(properties: DrawProperties) = this()
  }
}
