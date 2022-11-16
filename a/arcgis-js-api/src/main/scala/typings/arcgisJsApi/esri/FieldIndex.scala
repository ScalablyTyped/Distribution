package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldIndex
  extends StObject
     with Accessor {
  
  /**
    * Specifies if the field is indexed in ascending order.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#ascending)
    */
  var ascending: Boolean = js.native
  
  /**
    * Description of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#description)
    */
  var description: String = js.native
  
  /**
    * The ordered field names included in this index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#fieldNames)
    */
  var fieldNames: js.Array[String] = js.native
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#name)
    */
  var name: String = js.native
  
  /**
    * Specifies if the values in the field are unique (no duplicate values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html#unique)
    */
  var unique: Boolean = js.native
}
