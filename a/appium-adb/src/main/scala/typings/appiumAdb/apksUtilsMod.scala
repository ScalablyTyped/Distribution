package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.appiumAdbBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apksUtilsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/apks-utils", JSImport.Default)
  @js.native
  val default: ApksUtils = js.native
  
  @js.native
  trait ApksUtils extends StObject {
    
    /**
      * Executes bundletool utility with given arguments and returns the actual stdout
      *
      * @param args - the list of bundletool arguments
      * @param errorMsg - The customized error message string
      * @returns the actual command stdout
      * @throws If bundletool jar does not exist in PATH or there was an error while
      * executing it
      */
    def execBundletool(args: js.Array[String], errorMsg: String): js.Promise[String] = js.native
    
    /**
      * Extracts and returns the full path to the master .apk file inside the bundle.
      *
      * @param apks - The full path to the .apks file
      * @returns The full path to the master bundle .apk
      * @throws If there was an error while extracting/finding the file
      */
    def extractBaseApk(apks: String): js.Promise[String] = js.native
    
    /**
      * Extracts and returns the full path to the .apk, which contains the corresponding
      * resources for the given language in the .apks bundle.
      *
      * @param apks - The full path to the .apks file
      * @param language - The language abbreviation. The default language is
      * going to be selected if it is not set.
      * @returns The full path to the corresponding language .apk or the master .apk
      * if language split is not enabled for the bundle.
      * @throws If there was an error while extracting/finding the file
      */
    def extractLanguageApk(apks: String): js.Promise[String] = js.native
    def extractLanguageApk(apks: String, language: String): js.Promise[String] = js.native
    
    /**
      * @param specLocation - The full path to the generated device spec location
      * @returns The same `specLocation` value
      * @throws If it is not possible to retrieve the spec for the current device
      */
    def getDeviceSpec(specLocation: String): js.Promise[String] = js.native
    
    /**
      * Installs the given .apks package into the device under test
      *
      * @param apks - The full path to the .apks file
      * @param options - Installation options
      * @throws If the .apks bundle cannot be installed
      */
    def installApks(apks: String): js.Promise[Unit] = js.native
    def installApks(apks: String, options: InstallApksOptions): js.Promise[Unit] = js.native
  }
  
  trait InstallApksOptions extends StObject {
    
    /**
      * @default [false] Set to true in order to allow test
      * packages installation.
      */
    var allowTestPackages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [false] Set to true in order to grant all the
      * permissions requested in the application's manifest
      * automatically after the installation is completed
      * under Android 6+.
      */
    var grantPermissions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [20000] The count of milliseconds to wait until the
      * installation is completed
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default [false] Set to true to install the app on sdcard
      * instead of the device memory.
      */
    var useSdcard: js.UndefOr[`false`] = js.undefined
  }
  object InstallApksOptions {
    
    inline def apply(): InstallApksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallApksOptions]
    }
    
    extension [Self <: InstallApksOptions](x: Self) {
      
      inline def setAllowTestPackages(value: Boolean): Self = StObject.set(x, "allowTestPackages", value.asInstanceOf[js.Any])
      
      inline def setAllowTestPackagesUndefined: Self = StObject.set(x, "allowTestPackages", js.undefined)
      
      inline def setGrantPermissions(value: Boolean): Self = StObject.set(x, "grantPermissions", value.asInstanceOf[js.Any])
      
      inline def setGrantPermissionsUndefined: Self = StObject.set(x, "grantPermissions", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseSdcard(value: `false`): Self = StObject.set(x, "useSdcard", value.asInstanceOf[js.Any])
      
      inline def setUseSdcardUndefined: Self = StObject.set(x, "useSdcard", js.undefined)
    }
  }
  
  type _To = ApksUtils
  
  /* This means you don't have to write `default`, but can instead just say `apksUtilsMod.foo` */
  override def _to: ApksUtils = default
}
