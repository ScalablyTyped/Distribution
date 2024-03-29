package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SearchLayer
import typings.arcgisJsApi.esri.SearchLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchLayerMod {
  
  @JSImport("esri/webdoc/applicationProperties/SearchLayer", JSImport.Namespace)
  @js.native
  /**
  		 * Represents a layer to be included in search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with SearchLayer {
    def this(properties: SearchLayerProperties) = this()
  }
}
