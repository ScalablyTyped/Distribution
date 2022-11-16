package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Search
import typings.arcgisJsApi.esri.SearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchMod {
  
  @JSImport("esri/webdoc/applicationProperties/Search", JSImport.Namespace)
  @js.native
  /**
    * Represents the search parameters set within the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html)
    */
  open class ^ ()
    extends StObject
       with Search {
    def this(properties: SearchProperties) = this()
  }
}
