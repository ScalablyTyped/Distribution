package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementations of this interface do provide access to a simple mail client if there is one available
  * @see com.sun.star.system.XSimpleMailClient
  */
@js.native
trait XSimpleMailClientSupplier extends XInterface {
  /**
    * Allows a client to query for an object that implements {@link XSimpleMailClient} .
    * @returns An interface to a simple mail client if there is one available on the system or an empty reference else.
    * @see com.sun.star.system.XSimpleMailClient
    */
  def querySimpleMailClient(): XSimpleMailClient = js.native
}

object XSimpleMailClientSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    querySimpleMailClient: () => XSimpleMailClient,
    release: () => Unit
  ): XSimpleMailClientSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), querySimpleMailClient = js.Any.fromFunction0(querySimpleMailClient), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSimpleMailClientSupplier]
  }
  @scala.inline
  implicit class XSimpleMailClientSupplierOps[Self <: XSimpleMailClientSupplier] (val x: Self) extends AnyVal {
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
    def setQuerySimpleMailClient(value: () => XSimpleMailClient): Self = this.set("querySimpleMailClient", js.Any.fromFunction0(value))
  }
  
}

