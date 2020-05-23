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
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.oid
import typings.arcgisJsApi.arcgisJsApiStrings.raster
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.string
import typings.arcgisJsApi.arcgisJsApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProperties extends js.Object {
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    *
    * @default null
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    *
    * @default undefined
    */
  var defaultValue: js.UndefOr[Double | String | js.Any] = js.undefined
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The domain associated with the field. Domains are used to constrain the values allowed in a field. There are two types of domains: [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) and [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    *
    * @default null
    */
  var domain: js.UndefOr[DomainProperties] = js.undefined
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    *
    * @default true
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    *
    * @default -1
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    *
    * @default null
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the field can accept `null` values. *Requires ArcGIS Server version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    *
    * @default true
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    *
    * @default null
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
  /**
    * The types of values that can be assigned to a field. See the table below for a list of possible values.
    *
    * | Mode | Description |
    * | ------|------------ |
    * | name-or-title | Text that represents a name, title, label, or keyword for each feature. |
    * | description | Text that provides a longer description of the feature, more than just a name or title. |
    * | type-or-category | Types or categories that group features based on common characteristics. |
    * | count-or-amount | Integers (no decimal) that represent how many or how much there is of a specific attribute. |
    * | percentage-or-ratio | Number values in this field reflect the relationship between different quantities. |
    * | measurement | A number that reflects a characteristic that you can precisely measure. |
    * | unique-identifier | The values in this field are used to positively distinguish one feature or entity from another. |
    * | ordered-or-ranked | The values in this field represent a feature's status in an ordered or ranked list. For example, a feature could be one of the following: `Small, medium, large`, `First, second, third, fourth`, or `Informational, warning, error, failure`.|
    * | binary | Only one of two values are possible for each feature. Some examples include the following: `On or off`, `Yes or no`, `True or false`, or `Inhabited or vacant`. |
    * | location-or-place-name | Values in this field represent a geographic location. Examples of values in such a field include a street address, city name, region, building name (such as A.K. Smiley Public Library), attraction name (such as Alameda County Fairgrounds or Cairngorms National Park), postal code, or country. |
    * | coordinate | These fields store a geographic coordinate value such as x, y, z, latitude, or longitude. |
    * | date-and-time | Values in this field store explicit dates and times or date references such as days of the week, months, or years. |
    * | none | No specified type. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: js.UndefOr[
    binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
  ] = js.undefined
}

object FieldProperties {
  @scala.inline
  def apply(
    alias: String = null,
    defaultValue: Double | String | js.Any = null,
    description: String = null,
    domain: DomainProperties = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    name: String = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    `type`: `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = null,
    valueType: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier` = null
  ): FieldProperties = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProperties]
  }
}

