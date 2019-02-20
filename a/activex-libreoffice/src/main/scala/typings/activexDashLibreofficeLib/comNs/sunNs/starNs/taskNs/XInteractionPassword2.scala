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

