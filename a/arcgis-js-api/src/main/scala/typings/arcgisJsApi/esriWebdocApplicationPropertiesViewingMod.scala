package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Viewing
import typings.arcgisJsApi.esri.ViewingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesViewingMod {
  
  @JSImport("esri/webdoc/applicationProperties/Viewing", JSImport.Namespace)
  @js.native
  /**
  		 * Represents view-specific properties of application and UI elements for the web map or web scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html)
  		 */
  open class ^ ()
    extends StObject
       with Viewing {
    def this(properties: ViewingProperties) = this()
  }
}
