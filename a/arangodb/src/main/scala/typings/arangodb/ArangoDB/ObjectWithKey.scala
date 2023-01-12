package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWithKey
  extends StObject
     with /* key */ StringDictionary[Any]
     with DocumentLike {
  
  var _key: String
}
object ObjectWithKey {
  
  inline def apply(_key: String): ObjectWithKey = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithKey] (val x: Self) extends AnyVal {
    
    inline def set_key(value: String): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
  }
}
