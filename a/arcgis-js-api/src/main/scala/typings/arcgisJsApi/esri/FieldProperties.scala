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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldProperties extends StObject {
  
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    */
  var defaultValue: js.UndefOr[Double | String | js.Any] = js.native
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The domain associated with the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    */
  var domain: js.UndefOr[DomainProperties] = js.native
  
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.native
  
  /**
    * The types of values that can be assigned to a field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: js.UndefOr[
    binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
  ] = js.native
}
object FieldProperties {
  
  @scala.inline
  def apply(): FieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProperties]
  }
  
  @scala.inline
  implicit class FieldPropertiesMutableBuilder[Self <: FieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double | String | js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainProperties): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setType(
      value: `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueType(
      value: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
    ): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
