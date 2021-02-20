package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsIndex extends StObject {
  
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    */
  var dateFields: js.Array[_ | Field] = js.native
  
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    */
  def get(fieldName: String): Field = js.native
  
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    */
  def has(fieldName: String): Boolean = js.native
  
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    */
  def isDateField(fieldName: String): Boolean = js.native
}
object FieldsIndex {
  
  @scala.inline
  def apply(
    dateFields: js.Array[_ | Field],
    get: String => Field,
    has: String => Boolean,
    isDateField: String => Boolean
  ): FieldsIndex = {
    val __obj = js.Dynamic.literal(dateFields = dateFields.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDateField = js.Any.fromFunction1(isDateField))
    __obj.asInstanceOf[FieldsIndex]
  }
  
  @scala.inline
  implicit class FieldsIndexMutableBuilder[Self <: FieldsIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFields(value: js.Array[_ | Field]): Self = StObject.set(x, "dateFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldsVarargs(value: (js.Any | Field)*): Self = StObject.set(x, "dateFields", js.Array(value :_*))
    
    @scala.inline
    def setGet(value: String => Field): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDateField(value: String => Boolean): Self = StObject.set(x, "isDateField", js.Any.fromFunction1(value))
  }
}
