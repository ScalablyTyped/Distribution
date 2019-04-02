package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    *
    * @default undefined
    */
  var defaultValue: js.UndefOr[scala.Double | java.lang.String | js.Any] = js.undefined
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
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    *
    * @default -1
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    *
    * @default null
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if the field can accept `null` values. *Requires ArcGIS Server version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    *
    * @default true
    */
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The data type of the field.  **Possible Values:** small-integer | integer | single | double | long | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    *
    * @default null
    */
  var `type`: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`small-integer` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.integer | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.single | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.double | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.long | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.string | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.date | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.oid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.geometry | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blob | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.raster | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.guid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`global-id` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.xml
  ] = js.undefined
}

object FieldProperties {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    defaultValue: scala.Double | java.lang.String | js.Any = null,
    domain: DomainProperties = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`small-integer` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.integer | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.single | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.double | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.long | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.string | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.date | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.oid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.geometry | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blob | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.raster | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.guid | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`global-id` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.xml = null
  ): FieldProperties = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProperties]
  }
}

