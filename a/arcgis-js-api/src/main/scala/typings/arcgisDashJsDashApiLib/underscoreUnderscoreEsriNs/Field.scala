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
    * The domain associated with the field.
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
}

