package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  var dataset: StringDictionary[String]
  
  var id: String
  
  var tagName: String
}
object EventTarget {
  
  inline def apply(dataset: StringDictionary[String], id: String, tagName: String): EventTarget = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  extension [Self <: EventTarget](x: Self) {
    
    inline def setDataset(value: StringDictionary[String]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
