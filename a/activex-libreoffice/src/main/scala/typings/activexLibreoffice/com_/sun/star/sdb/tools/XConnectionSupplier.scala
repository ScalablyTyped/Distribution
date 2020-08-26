package typings.activexLibreoffice.com_.sun.star.sdb.tools

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to access the active connection
  * @see com.sun.star.sdbcx.XConnection
  * @since OOo 3.3
  */
@js.native
trait XConnectionSupplier extends XInitialization {
  /** returns the source connection. */
  var ActiveConnection: XConnection = js.native
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
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConnectionSupplier]
  }
  @scala.inline
  implicit class XConnectionSupplierOps[Self <: XConnectionSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveConnection(value: XConnection): Self = this.set("ActiveConnection", value.asInstanceOf[js.Any])
  }
  
}

