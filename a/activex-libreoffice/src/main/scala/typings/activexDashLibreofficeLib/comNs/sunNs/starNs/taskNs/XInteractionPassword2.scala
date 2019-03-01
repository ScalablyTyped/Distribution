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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("PasswordToModify")(PasswordToModify)
    __obj.updateDynamic("RecommendReadOnly")(RecommendReadOnly)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPassword")(getPassword)
    __obj.updateDynamic("getPasswordToModify")(getPasswordToModify)
    __obj.updateDynamic("getRecommendReadOnly")(getRecommendReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setPassword")(setPassword)
    __obj.updateDynamic("setPasswordToModify")(setPasswordToModify)
    __obj.updateDynamic("setRecommendReadOnly")(setRecommendReadOnly)
    __obj.asInstanceOf[XInteractionPassword2]
  }
}

