package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a VBA script event fired via {@link XVBACompatibility.broadcastVBAScriptEvent()} , and received by {@link
  * XVBAScriptListener.notifyVBAScriptEvent()} .
  * @see XVBACompatibility
  * @see XVBAScriptListener
  */
trait VBAScriptEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * Identifies the type of the event.
    * @see VBAScriptEventId
    */
  var Identifier: scala.Double
  /**
    * Contains the name of the involved VBA module.
    * @see VBAScriptEventId
    */
  var ModuleName: java.lang.String
}

