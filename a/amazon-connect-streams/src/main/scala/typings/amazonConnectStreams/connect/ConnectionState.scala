package typings.amazonConnectStreams.connect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionState extends StObject {
  
  /** A `Date` object that indicates when the the connection was put in that state. */
  val timestamp: Date = js.native
  
  /** The connection state type, as per the `ConnectionStateType` enumeration. */
  val `type`: ConnectionStateType = js.native
}
object ConnectionState {
  
  @scala.inline
  def apply(timestamp: Date, `type`: ConnectionStateType): ConnectionState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
  
  @scala.inline
  implicit class ConnectionStateMutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConnectionStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
