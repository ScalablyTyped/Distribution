package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to get a password from interaction helper, extends {@link XInteractionPassword} with possibility to provide password to modify.
  * @since OOo 3.3
  */
trait XInteractionPassword2 extends XInteractionPassword {
  /** gets "password to modify" from the continuation. */
  var PasswordToModify: String
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  var RecommendReadOnly: Boolean
  /** gets "password to modify" from the continuation. */
  def getPasswordToModify(): String
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  def getRecommendReadOnly(): Boolean
  /** stores "password to modify" to the continuation. */
  def setPasswordToModify(aPasswd: String): Unit
  /** stores "recommend readonly" to the continuation. It specifies whether the document should be loaded readonly per default. */
  def setRecommendReadOnly(bReadOnly: Boolean): Unit
}

object XInteractionPassword2 {
  @scala.inline
  def apply(
    Password: String,
    PasswordToModify: String,
    RecommendReadOnly: Boolean,
    acquire: () => Unit,
    getPassword: () => String,
    getPasswordToModify: () => String,
    getRecommendReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setPassword: String => Unit,
    setPasswordToModify: String => Unit,
    setRecommendReadOnly: Boolean => Unit
  ): XInteractionPassword2 = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], PasswordToModify = PasswordToModify.asInstanceOf[js.Any], RecommendReadOnly = RecommendReadOnly.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getPasswordToModify = js.Any.fromFunction0(getPasswordToModify), getRecommendReadOnly = js.Any.fromFunction0(getRecommendReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setPassword = js.Any.fromFunction1(setPassword), setPasswordToModify = js.Any.fromFunction1(setPasswordToModify), setRecommendReadOnly = js.Any.fromFunction1(setRecommendReadOnly))
    __obj.asInstanceOf[XInteractionPassword2]
  }
}

