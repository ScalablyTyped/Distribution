package typings.appiumAdb

import typings.appiumAdb.libToolsAabUtilsMod.AabUtils
import typings.appiumAdb.libToolsAdbCommandsMod.AdbCommands
import typings.appiumAdb.libToolsAdbEmuCommandsMod.AdbEmuCommands
import typings.appiumAdb.libToolsAndroidManifestMod.AndroidManifest
import typings.appiumAdb.libToolsApkSigningMod.ApkSigning
import typings.appiumAdb.libToolsApkUtilsMod.ApkUtils
import typings.appiumAdb.libToolsApksUtilsMod.ApksUtils
import typings.appiumAdb.libToolsKeyboardCommandsMod.KeyboardCommands
import typings.appiumAdb.libToolsLockmgmtMod.LockMgmt
import typings.appiumAdb.libToolsSettingsClientCommandsMod.SettingsClientCommands
import typings.appiumAdb.libToolsSystemCallsMod.SystemCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsMod {
  
  @JSImport("appium-adb/lib/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("appium-adb/lib/tools", JSImport.Default)
  @js.native
  val default: AdbMethods = js.native
  
  inline def getAndroidBinaryPath(binaryName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidBinaryPath")(binaryName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @js.native
  trait AdbMethods
    extends StObject
       with AdbCommands
       with AndroidManifest
       with SystemCalls
       with ApkSigning
       with ApkUtils
       with ApksUtils
       with AabUtils
       with AdbEmuCommands
       with SettingsClientCommands
       with LockMgmt
       with KeyboardCommands {
    
    /**
      * Retrieve the screen lock state of the device under test.
      *
      * @return True if the device is locked.
      */
    /* InferMemberOverrides */
    override def isScreenLocked(): js.Promise[Boolean] = js.native
    
    /**
      * Change the state of Data transfer on the device under test.
      *
      * @param on - True to enable and false to disable it.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    /* InferMemberOverrides */
    override def setDataState(on: Boolean): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    override def setDataState(on: Boolean, isEmulator: Boolean): js.Promise[Unit] = js.native
  }
}
