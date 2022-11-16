package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Magnifier
import typings.arcgisJsApi.esri.MagnifierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsMagnifierMod {
  
  @JSImport("esri/views/Magnifier", JSImport.Namespace)
  @js.native
  /**
    * The Magnifier allows end users to show a portion of the view as a magnified image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html)
    */
  open class ^ ()
    extends StObject
       with Magnifier {
    def this(properties: MagnifierProperties) = this()
  }
}
