package typings.activexDashLibreoffice.comNs.sunNs.starNs.mailNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interface that will be used to query for user information which are necessary to login to a network resource. An implementation of this
  * interface may for instance show a dialog to query the user for the necessary data.
  * @since OOo 2.0
  */
trait XAuthenticator extends XInterface {
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  val Password: String
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  val UserName: String
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  def getPassword(): String
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  def getUserName(): String
}

object XAuthenticator {
  @scala.inline
  def apply(
    Password: String,
    UserName: String,
    acquire: () => Unit,
    getPassword: () => String,
    getUserName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAuthenticator = {
    val __obj = js.Dynamic.literal(Password = Password, UserName = UserName, acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getUserName = js.Any.fromFunction0(getUserName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAuthenticator]
  }
}

