package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineOfSight
import typings.arcgisJsApi.esri.LineOfSightProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLineOfSightMod {
  
  @JSImport("esri/widgets/LineOfSight", JSImport.Namespace)
  @js.native
  /**
  		 * The LineOfSight widget is a 3D analysis tool that allows you to perform visibility analysis in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html)
  		 */
  open class ^ ()
    extends StObject
       with LineOfSight {
    def this(properties: LineOfSightProperties) = this()
  }
}
