package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.vbaNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a VBA script event fired via {@link XVBACompatibility.broadcastVBAScriptEvent()} , and received by {@link
  * XVBAScriptListener.notifyVBAScriptEvent()} .
  * @see XVBACompatibility
  * @see XVBAScriptListener
  */
trait VBAScriptEvent extends EventObject {
  /**
    * Identifies the type of the event.
    * @see VBAScriptEventId
    */
  var Identifier: Double
  /**
    * Contains the name of the involved VBA module.
    * @see VBAScriptEventId
    */
  var ModuleName: String
}

object VBAScriptEvent {
  @scala.inline
  def apply(Identifier: Double, ModuleName: String, Source: XInterface): VBAScriptEvent = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, ModuleName = ModuleName, Source = Source)
  
    __obj.asInstanceOf[VBAScriptEvent]
  }
}

