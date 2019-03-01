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
    acquire: js.Function0[scala.Unit],
    getPassword: js.Function0[java.lang.String],
    getUserName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAuthenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("UserName")(UserName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPassword")(getPassword)
    __obj.updateDynamic("getUserName")(getUserName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAuthenticator]
  }
}

