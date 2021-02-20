package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncName extends StObject {
  
  var defaultNames: js.Array[String] = js.native
  
  var name: String = js.native
  
  var nicknames: js.Array[String] = js.native
}
object SmartHomeV1SyncName {
  
  @scala.inline
  def apply(defaultNames: js.Array[String], name: String, nicknames: js.Array[String]): SmartHomeV1SyncName = {
    val __obj = js.Dynamic.literal(defaultNames = defaultNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nicknames = nicknames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncName]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncNameMutableBuilder[Self <: SmartHomeV1SyncName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultNames(value: js.Array[String]): Self = StObject.set(x, "defaultNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNamesVarargs(value: String*): Self = StObject.set(x, "defaultNames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknames(value: js.Array[String]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknamesVarargs(value: String*): Self = StObject.set(x, "nicknames", js.Array(value :_*))
  }
}
