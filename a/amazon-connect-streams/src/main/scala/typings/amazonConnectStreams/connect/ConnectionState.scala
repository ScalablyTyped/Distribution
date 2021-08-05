package typings.amazonConnectStreams.connect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionState extends StObject {
  
  /** A `Date` object that indicates when the the connection was put in that state. */
  val timestamp: Date
  
  /** The connection state type, as per the `ConnectionStateType` enumeration. */
  val `type`: ConnectionStateType
}
object ConnectionState {
  
  inline def apply(timestamp: Date, `type`: ConnectionStateType): ConnectionState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
  
  extension [Self <: ConnectionState](x: Self) {
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConnectionStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
