package typings.angularfire

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularFireSimpleObject
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  @JSName("$id")
  var $id: String
  
  @JSName("$priority")
  var $priority: Double
  
  @JSName("$value")
  var $value: js.Any
}
object AngularFireSimpleObject {
  
  @scala.inline
  def apply($id: String, $priority: Double, $value: js.Any): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $priority = $priority.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
  
  @scala.inline
  implicit class AngularFireSimpleObjectMutableBuilder[Self <: AngularFireSimpleObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$priority(value: Double): Self = StObject.set(x, "$priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$value(value: js.Any): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
  }
}
