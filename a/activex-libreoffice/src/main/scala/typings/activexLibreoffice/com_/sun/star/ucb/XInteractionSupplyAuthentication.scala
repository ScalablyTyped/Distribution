package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  */
trait XInteractionSupplyAuthentication
  extends StObject
     with XInteractionContinuation {
  
  /** Specifies if an "account" value can be handed back. */
  def canSetAccount(): Boolean
  
  /** Specifies if a "password" value can be handed back. */
  def canSetPassword(): Boolean
  
  /** Specifies if a new "realm" value can be handed back. */
  def canSetRealm(): Boolean
  
  /** Specifies if a "user name" value can be handed back. */
  def canSetUserName(): Boolean
  
  /**
    * Specifies the available modes of how long to remember the account.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberAccountModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication]
  
  /**
    * Specifies the available modes of how long to remember the password.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberPasswordModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication]
  
  /**
    * Set a new "account" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetAccount()} returned `TRUE` .
    */
  def setAccount(Account: String): Unit
  
  /**
    * Set a new "password" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetPassword()} returned `TRUE` .
    */
  def setPassword(Password: String): Unit
  
  /**
    * Set a new "realm" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetRealm()} returned `TRUE` .
    */
  def setRealm(Realm: String): Unit
  
  /**
    * Set a new mode of how long to remember the account.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setAccount()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberAccountModes()} .
    */
  def setRememberAccount(Remember: RememberAuthentication): Unit
  
  /**
    * Set a new mode of how long to remember the password.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setPassword()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberPasswordModes()} .
    */
  def setRememberPassword(Remember: RememberAuthentication): Unit
  
  /**
    * Set a new "user name" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetUserName()} returned `TRUE` .
    */
  def setUserName(UserName: String): Unit
}
object XInteractionSupplyAuthentication {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    canSetAccount: () => Boolean,
    canSetPassword: () => Boolean,
    canSetRealm: () => Boolean,
    canSetUserName: () => Boolean,
    getRememberAccountModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    getRememberPasswordModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setAccount: String => Unit,
    setPassword: String => Unit,
    setRealm: String => Unit,
    setRememberAccount: RememberAuthentication => Unit,
    setRememberPassword: RememberAuthentication => Unit,
    setUserName: String => Unit
  ): XInteractionSupplyAuthentication = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canSetAccount = js.Any.fromFunction0(canSetAccount), canSetPassword = js.Any.fromFunction0(canSetPassword), canSetRealm = js.Any.fromFunction0(canSetRealm), canSetUserName = js.Any.fromFunction0(canSetUserName), getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setAccount = js.Any.fromFunction1(setAccount), setPassword = js.Any.fromFunction1(setPassword), setRealm = js.Any.fromFunction1(setRealm), setRememberAccount = js.Any.fromFunction1(setRememberAccount), setRememberPassword = js.Any.fromFunction1(setRememberPassword), setUserName = js.Any.fromFunction1(setUserName))
    __obj.asInstanceOf[XInteractionSupplyAuthentication]
  }
  
  @scala.inline
  implicit class XInteractionSupplyAuthenticationMutableBuilder[Self <: XInteractionSupplyAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanSetAccount(value: () => Boolean): Self = StObject.set(x, "canSetAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanSetPassword(value: () => Boolean): Self = StObject.set(x, "canSetPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanSetRealm(value: () => Boolean): Self = StObject.set(x, "canSetRealm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanSetUserName(value: () => Boolean): Self = StObject.set(x, "canSetUserName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRememberAccountModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = StObject.set(x, "getRememberAccountModes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRememberPasswordModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = StObject.set(x, "getRememberPasswordModes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAccount(value: String => Unit): Self = StObject.set(x, "setAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPassword(value: String => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRealm(value: String => Unit): Self = StObject.set(x, "setRealm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRememberAccount(value: RememberAuthentication => Unit): Self = StObject.set(x, "setRememberAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRememberPassword(value: RememberAuthentication => Unit): Self = StObject.set(x, "setRememberPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserName(value: String => Unit): Self = StObject.set(x, "setUserName", js.Any.fromFunction1(value))
  }
}
