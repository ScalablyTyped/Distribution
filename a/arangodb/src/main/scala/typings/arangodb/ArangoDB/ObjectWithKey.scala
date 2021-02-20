package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectWithKey
  extends /* key */ StringDictionary[js.Any]
     with DocumentLike {
  
  var _key: String = js.native
}
object ObjectWithKey {
  
  @scala.inline
  def apply(_key: String): ObjectWithKey = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithKey]
  }
  
  @scala.inline
  implicit class ObjectWithKeyMutableBuilder[Self <: ObjectWithKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_key(value: String): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
  }
}
