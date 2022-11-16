package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`count-or-amount`
import typings.arcgisJsApi.arcgisJsApiStrings.`date-and-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typings.arcgisJsApi.arcgisJsApiStrings.`location-or-place-name`
import typings.arcgisJsApi.arcgisJsApiStrings.`name-or-title`
import typings.arcgisJsApi.arcgisJsApiStrings.`ordered-or-ranked`
import typings.arcgisJsApi.arcgisJsApiStrings.`percentage-or-ratio`
import typings.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typings.arcgisJsApi.arcgisJsApiStrings.`type-or-category`
import typings.arcgisJsApi.arcgisJsApiStrings.`unique-identifier`
import typings.arcgisJsApi.arcgisJsApiStrings.binary
import typings.arcgisJsApi.arcgisJsApiStrings.blob
import typings.arcgisJsApi.arcgisJsApiStrings.coordinate
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.description
import typings.arcgisJsApi.arcgisJsApiStrings.double
import typings.arcgisJsApi.arcgisJsApiStrings.guid
import typings.arcgisJsApi.arcgisJsApiStrings.integer
import typings.arcgisJsApi.arcgisJsApiStrings.long
import typings.arcgisJsApi.arcgisJsApiStrings.measurement
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.oid
import typings.arcgisJsApi.arcgisJsApiStrings.raster
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The display name for the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    */
  var alias: String = js.native
  
  /**
    * The default value set for the field.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    */
  var defaultValue: js.UndefOr[Double | String | Null] = js.native
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: String = js.native
  
  /**
    * The domain associated with the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    */
  var domain: CodedValueDomain | RangeDomain | InheritedDomain = js.native
  
  /**
    * Indicates whether the field is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    */
  var editable: Boolean = js.native
  
  /**
    * The field length.
    *
    * @default -1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    */
  var length: Double = js.native
  
  /**
    * The name of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    */
  var name: String = js.native
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    */
  var nullable: Boolean = js.native
  
  /**
    * The data type of the field.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string_ | date | oid | typings.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
  
  /**
    * The types of values that can be assigned to a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none_ | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier` = js.native
}
