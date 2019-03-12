package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to get a password from interaction helper, extends {@link XInteractionPassword} with possibility to provide password to modify.
  * @since OOo 3.3
  */
trait XInteractionPassword2 extends XInteractionPassword {
  /** gets "password to modify" from the continuation. */
  var PasswordToModify: java.lang.String
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  var RecommendReadOnly: scala.Boolean
  /** gets "password to modify" from the continuation. */
  def getPasswordToModify(): java.lang.String
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  def getRecommendReadOnly(): scala.Boolean
  /** stores "password to modify" to the continuation. */
  def setPasswordToModify(aPasswd: java.lang.String): scala.Unit
  /** stores "recommend readonly" to the continuation. It specifies whether the document should be loaded readonly per default. */
  def setRecommendReadOnly(bReadOnly: scala.Boolean): scala.Unit
}

object XInteractionPassword2 {
  @scala.inline
  def apply(
    Password: java.lang.String,
    PasswordToModify: java.lang.String,
    RecommendReadOnly: scala.Boolean,
    acquire: () => scala.Unit,
    getPassword: () => java.lang.String,
    getPasswordToModify: () => java.lang.String,
    getRecommendReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    select: () => scala.Unit,
    setPassword: java.lang.String => scala.Unit,
    setPasswordToModify: java.lang.String => scala.Unit,
    setRecommendReadOnly: scala.Boolean => scala.Unit
  ): XInteractionPassword2 = {
    val __obj = js.Dynamic.literal(Password = Password, PasswordToModify = PasswordToModify, RecommendReadOnly = RecommendReadOnly, acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getPasswordToModify = js.Any.fromFunction0(getPasswordToModify), getRecommendReadOnly = js.Any.fromFunction0(getRecommendReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setPassword = js.Any.fromFunction1(setPassword), setPasswordToModify = js.Any.fromFunction1(setPasswordToModify), setRecommendReadOnly = js.Any.fromFunction1(setRecommendReadOnly))
  
    __obj.asInstanceOf[XInteractionPassword2]
  }
}

