package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`count-or-amount`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`date-and-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`global-id`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`location-or-place-name`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`name-or-title`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`ordered-or-ranked`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`percentage-or-ratio`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`small-integer`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`type-or-category`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`unique-identifier`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.binary
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.blob
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.coordinate
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.date
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.description
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.double
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.guid
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.integer
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.long
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.measurement
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.oid
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.raster
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.single
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.string
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xml
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
    `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml
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
    length: Int | Double = null,
    name: String = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    `type`: `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml = null,
    valueType: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier` = null
  ): FieldProperties = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProperties]
  }
}

