package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncBlockerContext extends StObject {
  
  /**
    * The key for the sync blocker context.
    */
  var key: String
  
  /**
    * The value of the sync blocker context.
    */
  var value: String
}
object SyncBlockerContext {
  
  inline def apply(key: String, value: String): SyncBlockerContext = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncBlockerContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncBlockerContext] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
