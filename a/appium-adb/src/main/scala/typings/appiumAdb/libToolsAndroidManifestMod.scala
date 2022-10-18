package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsAndroidManifestMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/android-manifest", JSImport.Default)
  @js.native
  val default: AndroidManifest = js.native
  
  trait APKInfo extends StObject {
    
    /** The name of main application activity. */
    var apkActivity: String
    
    /** The name of application package, for example 'com.acme.app'. */
    var apkPackage: String
  }
  object APKInfo {
    
    inline def apply(apkActivity: String, apkPackage: String): APKInfo = {
      val __obj = js.Dynamic.literal(apkActivity = apkActivity.asInstanceOf[js.Any], apkPackage = apkPackage.asInstanceOf[js.Any])
      __obj.asInstanceOf[APKInfo]
    }
    
    extension [Self <: APKInfo](x: Self) {
      
      inline def setApkActivity(value: String): Self = StObject.set(x, "apkActivity", value.asInstanceOf[js.Any])
      
      inline def setApkPackage(value: String): Self = StObject.set(x, "apkPackage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AndroidManifest extends StObject {
    
    /**
      * Create binary representation of package manifest (usually AndroidManifest.xml).
      * `${manifest}.apk` file will be created as the result of this method
      * containing the compiled manifest.
      *
      * @param manifest - Full path to the initial manifest template
      * @param manifestPackage - The name of the manifest package
      * @param targetPackage - The name of the destination package
      */
    def compileManifest(manifest: String, manifestPackage: String, targetPackage: String): js.Promise[Unit] = js.native
    
    /**
      * Check whether package manifest contains Internet permissions.
      *
      * @param appPath - The full path to .apk(s) package.
      * @return True if the manifest requires Internet access permission.
      */
    def hasInternetPermissionFromManifest(appPath: String): js.Promise[Boolean] = js.native
    
    /**
      * Replace/insert the specially precompiled manifest file into the
      * particular package.
      *
      * @param manifest - Full path to the precompiled manifest
      *                            created by `compileManifest` method call
      *                            without .apk extension
      * @param srcApk - Full path to the existing valid application package, where
      *                          this manifest has to be inserted to. This package
      *                          will NOT be modified.
      * @param dstApk - Full path to the resulting package.
      *                          The file will be overridden if it already exists.
      */
    def insertManifest(manifest: String, srcApk: String, dstApk: String): js.Promise[Unit] = js.native
    
    /**
      * Extract package and main activity name from application manifest.
      *
      * @param appPath - The full path to application .apk(s) package
      * @return The parsed application info.
      * @throws If there was an error while getting the data from the given
      *                 application package.
      */
    def packageAndLaunchActivityFromManifest(appPath: String): js.Promise[APKInfo] = js.native
    
    /**
      * Extract target SDK version from application manifest.
      *
      * @param appPath - The full path to .apk(s) package.
      * @return The version of the target SDK.
      * @throws If there was an error while getting the data from the given
      *                 application package.
      */
    def targetSdkVersionFromManifest(appPath: String): js.Promise[Double] = js.native
    
    /**
      * Extract target SDK version from package information.
      *
      * @param pkg - The class name of the package installed on the device under test.
      * @param cmdOutput - Optional parameter containing the output of
      *                              _dumpsys package_ command. It may speed up the method execution.
      * @return The version of the target SDK.
      */
    def targetSdkVersionUsingPKG(pkg: String): js.Promise[Double] = js.native
    def targetSdkVersionUsingPKG(pkg: String, cmdOutput: String): js.Promise[Double] = js.native
  }
  
  type _To = AndroidManifest
  
  /* This means you don't have to write `default`, but can instead just say `libToolsAndroidManifestMod.foo` */
  override def _to: AndroidManifest = default
}
