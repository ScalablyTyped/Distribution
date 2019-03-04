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
    acquire: js.Function0[scala.Unit],
    getPassword: js.Function0[java.lang.String],
    getPasswordToModify: js.Function0[java.lang.String],
    getRecommendReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setPassword: js.Function1[java.lang.String, scala.Unit],
    setPasswordToModify: js.Function1[java.lang.String, scala.Unit],
    setRecommendReadOnly: js.Function1[scala.Boolean, scala.Unit]
  ): XInteractionPassword2 = {
    val __obj = js.Dynamic.literal(Password = Password, PasswordToModify = PasswordToModify, RecommendReadOnly = RecommendReadOnly, acquire = acquire, getPassword = getPassword, getPasswordToModify = getPasswordToModify, getRecommendReadOnly = getRecommendReadOnly, queryInterface = queryInterface, release = release, select = select, setPassword = setPassword, setPasswordToModify = setPasswordToModify, setRecommendReadOnly = setRecommendReadOnly)
  
    __obj.asInstanceOf[XInteractionPassword2]
  }
}

