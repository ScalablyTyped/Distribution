package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var _metadata: NodeVersion
  
  var context: Dictkey
  
  var messageId: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  var `type`: String
}
object Context {
  
  inline def apply(_metadata: NodeVersion, context: Dictkey, `type`: String): Context = {
    val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Dictkey): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_metadata(value: NodeVersion): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
  }
}
