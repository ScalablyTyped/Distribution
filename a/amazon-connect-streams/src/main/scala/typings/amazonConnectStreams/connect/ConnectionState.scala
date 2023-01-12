package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionState extends StObject {
  
  /** A `Date` object that indicates when the the connection was put in that state. */
  val timestamp: js.Date
  
  /** The connection state type, as per the `ConnectionStateType` enumeration. */
  val `type`: ConnectionStateType
}
object ConnectionState {
  
  inline def apply(timestamp: js.Date, `type`: ConnectionStateType): ConnectionState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConnectionStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
