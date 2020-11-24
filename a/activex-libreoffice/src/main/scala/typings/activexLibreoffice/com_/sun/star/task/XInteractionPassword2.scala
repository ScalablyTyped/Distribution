package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to get a password from interaction helper, extends {@link XInteractionPassword} with possibility to provide password to modify.
  * @since OOo 3.3
  */
@js.native
trait XInteractionPassword2 extends XInteractionPassword {
  
  /** gets "password to modify" from the continuation. */
  var PasswordToModify: String = js.native
  
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  var RecommendReadOnly: Boolean = js.native
  
  /** gets "password to modify" from the continuation. */
  def getPasswordToModify(): String = js.native
  
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  def getRecommendReadOnly(): Boolean = js.native
  
  /** stores "password to modify" to the continuation. */
  def setPasswordToModify(aPasswd: String): Unit = js.native
  
  /** stores "recommend readonly" to the continuation. It specifies whether the document should be loaded readonly per default. */
  def setRecommendReadOnly(bReadOnly: Boolean): Unit = js.native
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
  
  @scala.inline
  implicit class XInteractionPassword2Ops[Self <: XInteractionPassword2] (val x: Self) extends AnyVal {
    
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
    def setPasswordToModify(value: String): Self = this.set("PasswordToModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendReadOnly(value: Boolean): Self = this.set("RecommendReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPasswordToModify(value: () => String): Self = this.set("getPasswordToModify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecommendReadOnly(value: () => Boolean): Self = this.set("getRecommendReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPasswordToModify(value: String => Unit): Self = this.set("setPasswordToModify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecommendReadOnly(value: Boolean => Unit): Self = this.set("setRecommendReadOnly", js.Any.fromFunction1(value))
  }
}
