package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQueryResult
  extends StObject
     with Accessor {
  
  /**
  		 * An array of the result types that are returned from a search or query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryResult.html#resultRows)
  		 */
  var resultRows: js.Array[
    js.Array[
      Path | GraphObject | Geometry_ | js.Date | String | Double | Null | (js.Array[Path | GraphObject | Geometry_ | js.Date | String | Double | Null])
    ]
  ] = js.native
}
