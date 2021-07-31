package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for getting sets of permissions of a specified user or the default permissions if no user is given.
  * @see com.sun.star.security.Policy
  * @since OOo 1.1.2
  */
trait XPolicy
  extends StObject
     with XInterface {
  
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  val DefaultPermissions: SafeArray[js.Any]
  
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  def getDefaultPermissions(): SafeArray[js.Any]
  
  /**
    * Gets the permissions of the specified user excluding the default permissions granted to all users.
    * @param userId user id
    * @returns permissions of the specified user
    */
  def getPermissions(userId: String): SafeArray[js.Any]
  
  /** Refreshes the policy configuration. */
  def refresh(): Unit
}
object XPolicy {
  
  @scala.inline
  def apply(
    DefaultPermissions: SafeArray[js.Any],
    acquire: () => Unit,
    getDefaultPermissions: () => SafeArray[js.Any],
    getPermissions: String => SafeArray[js.Any],
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit
  ): XPolicy = {
    val __obj = js.Dynamic.literal(DefaultPermissions = DefaultPermissions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultPermissions = js.Any.fromFunction0(getDefaultPermissions), getPermissions = js.Any.fromFunction1(getPermissions), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPolicy]
  }
  
  @scala.inline
  implicit class XPolicyMutableBuilder[Self <: XPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPermissions(value: SafeArray[js.Any]): Self = StObject.set(x, "DefaultPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultPermissions(value: () => SafeArray[js.Any]): Self = StObject.set(x, "getDefaultPermissions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPermissions(value: String => SafeArray[js.Any]): Self = StObject.set(x, "getPermissions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
