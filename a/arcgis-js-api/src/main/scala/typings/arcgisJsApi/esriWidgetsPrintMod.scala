package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PrintProperties
import typings.arcgisJsApi.esri.Print_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsPrintMod {
  
  @JSImport("esri/widgets/Print", JSImport.Namespace)
  @js.native
  /**
  		 * The Print widget connects your application with a [printing service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
  		 */
  open class ^ ()
    extends StObject
       with Print_ {
    def this(properties: PrintProperties) = this()
  }
}
