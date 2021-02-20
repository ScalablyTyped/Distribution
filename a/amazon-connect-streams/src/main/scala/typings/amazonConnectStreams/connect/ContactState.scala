package typings.amazonConnectStreams.connect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactState extends StObject {
  
  /** Indicates when the the contact was put in that state. */
  val timestamp: Date = js.native
  
  /** The contact state type, as per the ContactStateType enumeration. */
  val `type`: ContactStateType = js.native
}
object ContactState {
  
  @scala.inline
  def apply(timestamp: Date, `type`: ContactStateType): ContactState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactState]
  }
  
  @scala.inline
  implicit class ContactStateMutableBuilder[Self <: ContactState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContactStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
