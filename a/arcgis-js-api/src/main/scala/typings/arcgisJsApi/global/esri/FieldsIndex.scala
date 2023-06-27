package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FieldsIndex")
@js.native
open class FieldsIndex ()
  extends StObject
     with typings.arcgisJsApi.esri.FieldsIndex {
  def this(properties: Any) = this()
  
  /**
  		 * An array of date fields or field json objects.
  		 *
  		 * @default []
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
  		 */
  /* CompleteClass */
  var dateFields: js.Array[Any | typings.arcgisJsApi.esri.Field] = js.native
  
  /**
  		 * Returns a field with the specified field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
  		 */
  /* CompleteClass */
  override def get(fieldName: String): typings.arcgisJsApi.esri.Field = js.native
  
  /**
  		 * Checks if a field with the specified field name exists in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
  		 */
  /* CompleteClass */
  override def has(fieldName: String): Boolean = js.native
  
  /**
  		 * Checks if a field with the specified field name is a date field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
  		 */
  /* CompleteClass */
  override def isDateField(fieldName: String): Boolean = js.native
}
