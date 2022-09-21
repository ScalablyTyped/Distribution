package typings.angularfire

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularFireSimpleObject
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$id")
  var $id: String
  
  @JSName("$priority")
  var $priority: Double
  
  @JSName("$value")
  var $value: Any
}
object AngularFireSimpleObject {
  
  inline def apply($id: String, $priority: Double, $value: Any): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $priority = $priority.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
  
  extension [Self <: AngularFireSimpleObject](x: Self) {
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$priority(value: Double): Self = StObject.set(x, "$priority", value.asInstanceOf[js.Any])
    
    inline def set$value(value: Any): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
  }
}
