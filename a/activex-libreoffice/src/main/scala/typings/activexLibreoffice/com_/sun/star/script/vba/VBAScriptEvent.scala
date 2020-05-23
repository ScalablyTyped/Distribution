package typings.activexLibreoffice.com_.sun.star.script.vba

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], ModuleName = ModuleName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VBAScriptEvent]
  }
}

