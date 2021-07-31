package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to get a password from interaction helper, extends {@link XInteractionPassword} with possibility to provide password to modify.
  * @since OOo 3.3
  */
trait XInteractionPassword2
  extends StObject
     with XInteractionPassword {
  
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
  
  @scala.inline
  implicit class XInteractionPassword2MutableBuilder[Self <: XInteractionPassword2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPasswordToModify(value: () => String): Self = StObject.set(x, "getPasswordToModify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecommendReadOnly(value: () => Boolean): Self = StObject.set(x, "getRecommendReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPasswordToModify(value: String): Self = StObject.set(x, "PasswordToModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendReadOnly(value: Boolean): Self = StObject.set(x, "RecommendReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPasswordToModify(value: String => Unit): Self = StObject.set(x, "setPasswordToModify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecommendReadOnly(value: Boolean => Unit): Self = StObject.set(x, "setRecommendReadOnly", js.Any.fromFunction1(value))
  }
}
