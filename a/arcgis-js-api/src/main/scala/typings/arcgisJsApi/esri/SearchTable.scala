package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTable
  extends StObject
     with Accessor {
  
  /**
  		 * The field to use for search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html#field)
  		 */
  var field: SearchTableField = js.native
  
  /**
  		 * The id of the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html#id)
  		 */
  var id: String = js.native
}
