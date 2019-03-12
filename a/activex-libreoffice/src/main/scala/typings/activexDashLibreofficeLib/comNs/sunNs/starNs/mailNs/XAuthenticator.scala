package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interface that will be used to query for user information which are necessary to login to a network resource. An implementation of this
  * interface may for instance show a dialog to query the user for the necessary data.
  * @since OOo 2.0
  */
trait XAuthenticator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  val Password: java.lang.String
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  val UserName: java.lang.String
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  def getPassword(): java.lang.String
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  def getUserName(): java.lang.String
}

object XAuthenticator {
  @scala.inline
  def apply(
    Password: java.lang.String,
    UserName: java.lang.String,
    acquire: () => scala.Unit,
    getPassword: () => java.lang.String,
    getUserName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAuthenticator = {
    val __obj = js.Dynamic.literal(Password = Password, UserName = UserName, acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getUserName = js.Any.fromFunction0(getUserName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAuthenticator]
  }
}

