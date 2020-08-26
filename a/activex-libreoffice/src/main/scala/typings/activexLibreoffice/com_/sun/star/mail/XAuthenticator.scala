package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interface that will be used to query for user information which are necessary to login to a network resource. An implementation of this
  * interface may for instance show a dialog to query the user for the necessary data.
  * @since OOo 2.0
  */
@js.native
trait XAuthenticator extends XInterface {
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  val Password: String = js.native
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  val UserName: String = js.native
  /**
    * Will be called when the password of the user is needed.
    * @returns the password of the user.
    */
  def getPassword(): String = js.native
  /**
    * Will be called when the user name is needed.
    * @returns the user name.
    */
  def getUserName(): String = js.native
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
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getUserName = js.Any.fromFunction0(getUserName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAuthenticator]
  }
  @scala.inline
  implicit class XAuthenticatorOps[Self <: XAuthenticator] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPassword(value: () => String): Self = this.set("getPassword", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserName(value: () => String): Self = this.set("getUserName", js.Any.fromFunction0(value))
  }
  
}

