package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SearchTable
import typings.arcgisJsApi.esri.SearchTableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchTableMod {
  
  @JSImport("esri/webdoc/applicationProperties/SearchTable", JSImport.Namespace)
  @js.native
  /**
  		 * Represents a table to be included in search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html)
  		 */
  open class ^ ()
    extends StObject
       with SearchTable {
    def this(properties: SearchTableProperties) = this()
  }
}
