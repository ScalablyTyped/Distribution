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
  val DefaultPermissions: SafeArray[Any]
  
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  def getDefaultPermissions(): SafeArray[Any]
  
  /**
    * Gets the permissions of the specified user excluding the default permissions granted to all users.
    * @param userId user id
    * @returns permissions of the specified user
    */
  def getPermissions(userId: String): SafeArray[Any]
  
  /** Refreshes the policy configuration. */
  def refresh(): Unit
}
object XPolicy {
  
  inline def apply(
    DefaultPermissions: SafeArray[Any],
    acquire: () => Unit,
    getDefaultPermissions: () => SafeArray[Any],
    getPermissions: String => SafeArray[Any],
    queryInterface: `type` => Any,
    refresh: () => Unit,
    release: () => Unit
  ): XPolicy = {
    val __obj = js.Dynamic.literal(DefaultPermissions = DefaultPermissions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultPermissions = js.Any.fromFunction0(getDefaultPermissions), getPermissions = js.Any.fromFunction1(getPermissions), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPolicy]
  }
  
  extension [Self <: XPolicy](x: Self) {
    
    inline def setDefaultPermissions(value: SafeArray[Any]): Self = StObject.set(x, "DefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultPermissions(value: () => SafeArray[Any]): Self = StObject.set(x, "getDefaultPermissions", js.Any.fromFunction0(value))
    
    inline def setGetPermissions(value: String => SafeArray[Any]): Self = StObject.set(x, "getPermissions", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
