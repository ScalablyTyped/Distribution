package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldIndexProperties extends StObject {
  
  /**
    * Specifies if the field is indexed in ascending order.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#ascending)
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ordered field names included in this index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#fieldNames)
    */
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the values in the field are unique (no duplicate values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#unique)
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}
object FieldIndexProperties {
  
  inline def apply(): FieldIndexProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldIndexProperties]
  }
  
  extension [Self <: FieldIndexProperties](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
