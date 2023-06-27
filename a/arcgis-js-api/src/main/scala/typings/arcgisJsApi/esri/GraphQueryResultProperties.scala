package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQueryResultProperties extends StObject {
  
  /**
  		 * An array of the result types that are returned from a search or query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQueryResult.html#resultRows)
  		 */
  var resultRows: js.UndefOr[
    js.Array[
      js.Array[
        PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null | (js.Array[
          PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null
        ])
      ]
    ]
  ] = js.undefined
}
object GraphQueryResultProperties {
  
  inline def apply(): GraphQueryResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQueryResultProperties] (val x: Self) extends AnyVal {
    
    inline def setResultRows(
      value: js.Array[
          js.Array[
            PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null | (js.Array[
              PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null
            ])
          ]
        ]
    ): Self = StObject.set(x, "resultRows", value.asInstanceOf[js.Any])
    
    inline def setResultRowsUndefined: Self = StObject.set(x, "resultRows", js.undefined)
    
    inline def setResultRowsVarargs(
      value: (js.Array[
          PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null | (js.Array[
            PathProperties | GraphObjectProperties | GeometryProperties | DateProperties | String | Double | Null
          ])
        ])*
    ): Self = StObject.set(x, "resultRows", js.Array(value*))
  }
}
