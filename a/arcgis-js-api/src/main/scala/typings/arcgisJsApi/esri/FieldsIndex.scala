package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsIndex extends StObject {
  
  /**
    * An array of date fields or field json objects.
    *
    * @default []
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    */
  var dateFields: js.Array[Any | Field]
  
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    */
  def get(fieldName: String): Field
  
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    */
  def has(fieldName: String): Boolean
  
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    */
  def isDateField(fieldName: String): Boolean
}
object FieldsIndex {
  
  inline def apply(
    dateFields: js.Array[Any | Field],
    get: String => Field,
    has: String => Boolean,
    isDateField: String => Boolean
  ): FieldsIndex = {
    val __obj = js.Dynamic.literal(dateFields = dateFields.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDateField = js.Any.fromFunction1(isDateField))
    __obj.asInstanceOf[FieldsIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldsIndex] (val x: Self) extends AnyVal {
    
    inline def setDateFields(value: js.Array[Any | Field]): Self = StObject.set(x, "dateFields", value.asInstanceOf[js.Any])
    
    inline def setDateFieldsVarargs(value: (Any | Field)*): Self = StObject.set(x, "dateFields", js.Array(value*))
    
    inline def setGet(value: String => Field): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setIsDateField(value: String => Boolean): Self = StObject.set(x, "isDateField", js.Any.fromFunction1(value))
  }
}
