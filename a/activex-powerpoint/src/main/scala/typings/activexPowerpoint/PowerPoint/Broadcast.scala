package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcast extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val AttendeeUrl: String = js.native
  
  def End(): Unit = js.native
  
  val IsBroadcasting: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Broadcast_typekey")
  var PowerPointDotBroadcast_typekey: Broadcast = js.native
  
  def Start(serverUrl: String): Unit = js.native
}
object Broadcast {
  
  @scala.inline
  def apply(
    Application: Application,
    AttendeeUrl: String,
    End: () => Unit,
    IsBroadcasting: Boolean,
    Parent: js.Any,
    PowerPointDotBroadcast_typekey: Broadcast,
    Start: String => Unit
  ): Broadcast = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttendeeUrl = AttendeeUrl.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), IsBroadcasting = IsBroadcasting.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = js.Any.fromFunction1(Start))
    __obj.updateDynamic("PowerPoint.Broadcast_typekey")(PowerPointDotBroadcast_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  
  @scala.inline
  implicit class BroadcastMutableBuilder[Self <: Broadcast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeUrl(value: String): Self = StObject.set(x, "AttendeeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "End", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBroadcasting(value: Boolean): Self = StObject.set(x, "IsBroadcasting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotBroadcast_typekey(value: Broadcast): Self = StObject.set(x, "PowerPoint.Broadcast_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String => Unit): Self = StObject.set(x, "Start", js.Any.fromFunction1(value))
  }
}
