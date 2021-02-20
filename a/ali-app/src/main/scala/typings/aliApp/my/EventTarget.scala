package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends StObject {
  
  var dataset: StringDictionary[String] = js.native
  
  var id: String = js.native
  
  var tagName: String = js.native
}
object EventTarget {
  
  @scala.inline
  def apply(dataset: StringDictionary[String], id: String, tagName: String): EventTarget = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  @scala.inline
  implicit class EventTargetMutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: StringDictionary[String]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
