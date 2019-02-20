package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the event which is notified when a change in a string entry list occurred
  * @see XListEntrySource
  * @see XListEntryListener
  */
trait ListEntryEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** denotes the number of changed entries, in case a change of an entry **range** is being notified. */
  var Count: scala.Double
  /**
    * denotes the changed entries
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Entries: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * denotes the position where a change occurred.
    *
    * The concrete semantics of the value depends on the concrete event being notified.
    */
  var Position: scala.Double
}

