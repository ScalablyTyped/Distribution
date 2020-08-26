package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing isolated connections via a factory.
  *
  * The {@link XIsolatedConnection} allows to create connections which are not shared among others as it is the case when creating connections in normal
  * way.
  * @see com.sun.star.sdb.DataSource
  * @since OOo 1.1.2
  */
@js.native
trait XIsolatedConnection extends XInterface {
  /**
    * attempts to establish a database connection.
    * @param user The user name.
    * @param password The password.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnection(user: String, password: String): XConnection = js.native
  /**
    * attempts to establish a database connection.
    *
    * If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler The handler which ask for the needed information when they are missing.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnectionWithCompletion(handler: XInteractionHandler): XConnection = js.native
}

object XIsolatedConnection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getIsolatedConnection: (String, String) => XConnection,
    getIsolatedConnectionWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIsolatedConnection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIsolatedConnection]
  }
  @scala.inline
  implicit class XIsolatedConnectionOps[Self <: XIsolatedConnection] (val x: Self) extends AnyVal {
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
    def setGetIsolatedConnection(value: (String, String) => XConnection): Self = this.set("getIsolatedConnection", js.Any.fromFunction2(value))
    @scala.inline
    def setGetIsolatedConnectionWithCompletion(value: XInteractionHandler => XConnection): Self = this.set("getIsolatedConnectionWithCompletion", js.Any.fromFunction1(value))
  }
  
}

