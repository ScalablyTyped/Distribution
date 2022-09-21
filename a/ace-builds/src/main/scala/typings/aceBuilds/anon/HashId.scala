package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashId extends StObject {
  
  var hashId: Double
  
  var key: String
}
object HashId {
  
  inline def apply(hashId: Double, key: String): HashId = {
    val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashId]
  }
  
  extension [Self <: HashId](x: Self) {
    
    inline def setHashId(value: Double): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
