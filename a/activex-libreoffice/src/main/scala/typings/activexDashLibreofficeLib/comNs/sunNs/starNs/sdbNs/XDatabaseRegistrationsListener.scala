package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implemented by components which want to be notified of changes in the application-wide registered databases.
  * @see XDatabaseRegistrations
  * @since OOo 3.3
  */
trait XDatabaseRegistrationsListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * called when a the location of a registered database changed
    *
    * Note that this talks about registration data only. That is, if the actual file denoted by the database registration is moved, this is in no way
    * monitored or reported. Only (successful) calls to {@link XDatabaseRegistrations.changeDatabaseLocation()} are reported here.
    */
  def changedDatabaseLocation(Event: DatabaseRegistrationEvent): scala.Unit
  /** called when a database has been registered */
  def registeredDatabaseLocation(Event: DatabaseRegistrationEvent): scala.Unit
  /** called when a database registration has been revoked */
  def revokedDatabaseLocation(Event: DatabaseRegistrationEvent): scala.Unit
}

object XDatabaseRegistrationsListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changedDatabaseLocation: js.Function1[DatabaseRegistrationEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registeredDatabaseLocation: js.Function1[DatabaseRegistrationEvent, scala.Unit],
    release: js.Function0[scala.Unit],
    revokedDatabaseLocation: js.Function1[DatabaseRegistrationEvent, scala.Unit]
  ): XDatabaseRegistrationsListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("changedDatabaseLocation")(changedDatabaseLocation)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registeredDatabaseLocation")(registeredDatabaseLocation)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("revokedDatabaseLocation")(revokedDatabaseLocation)
    __obj.asInstanceOf[XDatabaseRegistrationsListener]
  }
}

