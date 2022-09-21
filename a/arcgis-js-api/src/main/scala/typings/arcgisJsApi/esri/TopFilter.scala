package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopFilter
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * When one or more field names are provided in this property, the output result will be grouped based on unique values from those fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#groupByFields)
    */
  var groupByFields: js.Array[String] = js.native
  
  /**
    * One or more field names used to order the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#orderByFields)
    */
  var orderByFields: js.Array[String] = js.native
  
  /**
    * Defines the number of features to be returned from the top features query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#topCount)
    */
  var topCount: Double = js.native
}
