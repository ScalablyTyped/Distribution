package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.toolsNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to access the active connection
  * @see com.sun.star.sdbcx.XConnection
  * @since OOo 3.3
  */
trait XConnectionSupplier extends XInitialization {
  /** returns the source connection. */
  var ActiveConnection: XConnection
}

object XConnectionSupplier {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnectionSupplier = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConnectionSupplier]
  }
}

