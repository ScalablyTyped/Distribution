package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.appiumAdbStrings.password
import typings.appiumAdb.appiumAdbStrings.pattern
import typings.appiumAdb.appiumAdbStrings.pin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsLockmgmtMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/lockmgmt", JSImport.Default)
  @js.native
  val default: LockMgmt = js.native
  
  @js.native
  trait LockMgmt extends StObject {
    
    /**
      * Clears current lock credentials. Usually it takes several seconds for a device to
      * sync the credential state after this method returns.
      *
      * @param credential [null] The credential value. It could be either
      * pin, password or a pattern. A pattern is specified by a non-separated list
      * of numbers that index the cell on the pattern in a 1-based manner in left
      * to right and top to bottom order, i.e. the top-left cell is indexed with 1,
      * whereas the bottom-right cell is indexed with 9. Example: 1234.
      * null/empty value assumes the device has no lock currently set.
      * @throws If operation faces an unexpected error
      */
    def clearLockCredential(): js.Promise[Unit] = js.native
    def clearLockCredential(credential: String): js.Promise[Unit] = js.native
    
    /**
      * Presses the corresponding key combination to make sure the device's screen
      * is not turned off and is locked if the latter is enabled.
      */
    def cycleWakeUp(): js.Promise[Unit] = js.native
    
    /**
      * Dismisses keyguard overlay.
      */
    def dismissKeyguard(): js.Promise[Unit] = js.native
    
    /**
      * Checks whether the device is locked with a credential (either pin or a password
      * or a pattern).
      *
      * @returns `true` if the device is locked
      * @throws If operation faces an unexpected error
      */
    def isLockEnabled(): js.Promise[Boolean] = js.native
    
    /**
      * Check whether the device supports lock settings management with `locksettings`
      * command line tool. This tool has been added to Android toolset since  API 27 Oreo
      *
      * @return True if the management is supported. The result is cached per ADB instance
      */
    def isLockManagementSupported(): js.Promise[Boolean] = js.native
    
    /**
      * Retrieve the screen lock state of the device under test.
      *
      * @return True if the device is locked.
      */
    def isScreenLocked(): js.Promise[Boolean] = js.native
    
    /**
      * Sets the device lock.
      *
      * @param credentialType One of: password, pin, pattern.
      * @param credential A non-empty credential value to be set.
      * Make sure your new credential matches to the actual system security requirements,
      * e.g. a minimum password length. A pattern is specified by a non-separated list
      * of numbers that index the cell on the pattern in a 1-based manner in left
      * to right and top to bottom order, i.e. the top-left cell is indexed with 1,
      * whereas the bottom-right cell is indexed with 9. Example: 1234.
      * @param oldCredential [null] An old credential string.
      * It is only required to be set in case you need to change the current
      * credential rather than to set a new one. Setting it to a wrong value will
      * make this method to fail and throw an exception.
      * @throws If there was a failure while verifying input arguments or setting
      * the credential
      */
    def setLockCredential(credentialType: password | pin | pattern, credential: String): js.Promise[Unit] = js.native
    def setLockCredential(credentialType: password | pin | pattern, credential: String, oldcredential: String): js.Promise[Unit] = js.native
    
    /**
      * Check whether the given credential is matches to the currently set one.
      *
      * @param credential [null] The credential value. It could be either
      * pin, password or a pattern. A pattern is specified by a non-separated list
      * of numbers that index the cell on the pattern in a 1-based manner in left
      * to right and top to bottom order, i.e. the top-left cell is indexed with 1,
      * whereas the bottom-right cell is indexed with 9. Example: 1234.
      * null/empty value assumes the device has no lock currently set.
      * @return True if the given credential matches to the device's one
      * @throws If the verification faces an unexpected error
      */
    def verifyLockCredential(): js.Promise[Boolean] = js.native
    def verifyLockCredential(credential: String): js.Promise[Boolean] = js.native
  }
  
  type _To = LockMgmt
  
  /* This means you don't have to write `default`, but can instead just say `libToolsLockmgmtMod.foo` */
  override def _to: LockMgmt = default
}
