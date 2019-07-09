package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field
  extends Accessor
     with JSONSupport {
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    *
    * @default null
    */
  var alias: java.lang.String = js.native
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    *
    * @default undefined
    */
  var defaultValue: scala.Double | java.lang.String | js.Any = js.native
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The domain associated with the field. Domains are used to constrain the values allowed in a field. There are two types of domains: [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) and [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    *
    * @default null
    */
  var domain: Domain = js.native
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    *
    * @default true
    */
  var editable: scala.Boolean = js.native
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    *
    * @default -1
    */
  var length: scala.Double = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    *
    * @default null
    */
  var name: java.lang.String = js.native
  /**
    * Indicates if the field can accept `null` values. *Requires ArcGIS Server version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    *
    * @default true
    */
  var nullable: scala.Boolean = js.native
  /**
    * The data type of the field.  **Possible Values:** small-integer | integer | single | double | long | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    *
    * @default null
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`small-integer` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.integer | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.single | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.double | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.long | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.string | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.date | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.oid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.geometry | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blob | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.raster | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.guid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`global-id` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.xml = js.native
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
  var valueType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.binary | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.coordinate | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`count-or-amount` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`date-and-time` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.description | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`location-or-place-name` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.measurement | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`name-or-title` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.none | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`ordered-or-ranked` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`percentage-or-ratio` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`type-or-category` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`unique-identifier` = js.native
}

@JSGlobal("__esri.Field")
@js.native
class FieldCls () extends Field {
  def this(properties: FieldProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

