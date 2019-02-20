package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a change in a database registration
  * @see XDatabaseRegistrations
  * @see XDatabaseRegistrationsListener
  * @since LibreOffice 3.3
  */
trait DatabaseRegistrationEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Name: java.lang.String
  var NewLocation: java.lang.String
  var OldLocation: java.lang.String
}

