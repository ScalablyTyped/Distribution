package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactState extends StObject {
  
  /** Indicates when the the contact was put in that state. */
  val timestamp: js.Date
  
  /** The contact state type, as per the ContactStateType enumeration. */
  val `type`: ContactStateType
}
object ContactState {
  
  inline def apply(timestamp: js.Date, `type`: ContactStateType): ContactState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactState] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContactStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
