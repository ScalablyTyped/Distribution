package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typings.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typings.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.double
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.long
import typings.arcgisJsApi.arcgisJsApiStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValue
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value` = js.native
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#value)
    */
  var value: js.Any = js.native
}
