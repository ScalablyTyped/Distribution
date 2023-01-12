package typings.appiumAdb

import typings.appiumAdb.anon.Build
import typings.appiumAdb.anon.PickSystemCallsgetBinaryF
import typings.appiumAdb.appiumAdbInts.`120000`
import typings.appiumAdb.appiumAdbInts.`20000`
import typings.appiumAdb.appiumAdbInts.`60000`
import typings.appiumAdb.appiumAdbStrings.Dotapk
import typings.appiumAdb.appiumAdbStrings.Dotapks
import typings.appiumAdb.libToolsApkUtilsMod.StartAppOptions
import typings.std.Record
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("appium-adb/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("appium-adb/lib/helpers", "APKS_EXTENSION")
  @js.native
  val APKS_EXTENSION: Dotapks = js.native
  
  @JSImport("appium-adb/lib/helpers", "APKS_INSTALL_TIMEOUT")
  @js.native
  val APKS_INSTALL_TIMEOUT: `120000` = js.native
  
  @JSImport("appium-adb/lib/helpers", "APK_EXTENSION")
  @js.native
  val APK_EXTENSION: Dotapk = js.native
  
  @JSImport("appium-adb/lib/helpers", "APK_INSTALL_TIMEOUT")
  @js.native
  val APK_INSTALL_TIMEOUT: `60000` = js.native
  
  @JSImport("appium-adb/lib/helpers", "DEFAULT_ADB_EXEC_TIMEOUT")
  @js.native
  val DEFAULT_ADB_EXEC_TIMEOUT: `20000` = js.native
  
  inline def buildInstallArgs(apiLevel: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildInstallArgs")(apiLevel.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def buildInstallArgs(apiLevel: Double, options: InstallOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildInstallArgs")(apiLevel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def buildStartCmd(startAppOptions: StartAppOptions, apiLevel: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildStartCmd")(startAppOptions.asInstanceOf[js.Any], apiLevel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def dirExists(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirExists")().asInstanceOf[js.Promise[Boolean]]
  inline def dirExists(location: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirExists")(location.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def escapeShellArg(arg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeShellArg")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractMatchingPermissions(dumpsysOutput: String, groupNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMatchingPermissions")(dumpsysOutput.asInstanceOf[js.Any], groupNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def extractMatchingPermissions(dumpsysOutput: String, groupNames: js.Array[String], grantedState: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMatchingPermissions")(dumpsysOutput.asInstanceOf[js.Any], groupNames.asInstanceOf[js.Any], grantedState.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def formatConfigMarker(
    configsGetter: js.Function0[js.Array[String] | js.Promise[js.Array[String]]],
    desiredMarker: String,
    defaultMarker: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatConfigMarker")(configsGetter.asInstanceOf[js.Any], desiredMarker.asInstanceOf[js.Any], defaultMarker.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getAndroidPlatformAndPath(sdkRoot: String): js.Promise[PlatformInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidPlatformAndPath")(sdkRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PlatformInfo]]
  
  inline def getAndroidPrefsRoot(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidPrefsRoot")().asInstanceOf[js.Promise[String]]
  
  inline def getApkanalyzerForOs(sysHelpers: PickSystemCallsgetBinaryF): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApkanalyzerForOs")(sysHelpers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getApksignerForOs(sysHelpers: PickSystemCallsgetBinaryF): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApksignerForOs")(sysHelpers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getBuildToolsDirs(sdkRoot: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildToolsDirs")(sdkRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getIMEListFromOutput(stdout: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIMEListFromOutput")(stdout.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getJavaForOs(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJavaForOs")().asInstanceOf[js.Promise[String]]
  
  inline def getJavaHome(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJavaHome")().asInstanceOf[js.Promise[String]]
  
  inline def getModuleRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleRoot")().asInstanceOf[String]
  
  inline def getOpenSslForOs(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenSslForOs")().asInstanceOf[js.Promise[String]]
  
  inline def getSdkRootFromEnv(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkRootFromEnv")().asInstanceOf[js.UndefOr[String]]
  
  inline def getSdkToolsVersion(): js.Promise[Build] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkToolsVersion")().asInstanceOf[js.Promise[Build]]
  
  inline def getSurfaceOrientation(dumpsys: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSurfaceOrientation")(dumpsys.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def isCurrentFocusOnKeyguard(dumpsys: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentFocusOnKeyguard")(dumpsys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScreenOnFully(dumpsys: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScreenOnFully")(dumpsys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isShowingLockscreen(dumpsys: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShowingLockscreen")(dumpsys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchComponentName(classString: String): RegExpExecArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchComponentName")(classString.asInstanceOf[js.Any]).asInstanceOf[RegExpExecArray | Null]
  
  inline def parseAapt2Strings(rawOutput: String, configMarker: String): Record[String, String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAapt2Strings")(rawOutput.asInstanceOf[js.Any], configMarker.asInstanceOf[js.Any])).asInstanceOf[Record[String, String | js.Array[String]]]
  
  inline def parseAaptStrings(rawOutput: String, configMarker: String): Record[String, String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAaptStrings")(rawOutput.asInstanceOf[js.Any], configMarker.asInstanceOf[js.Any])).asInstanceOf[Record[String, String | js.Array[String]]]
  
  inline def parseJsonData(output: String, entityName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonData")(output.asInstanceOf[js.Any], entityName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseLaunchableActivityNames(dumpsys: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLaunchableActivityNames")(dumpsys.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parseManifest(manifest: js.Object): ManifestInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseManifest")(manifest.asInstanceOf[js.Any]).asInstanceOf[ManifestInfo]
  
  inline def requireSdkRoot(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSdkRoot")().asInstanceOf[js.Promise[String]]
  inline def requireSdkRoot(customRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSdkRoot")(customRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def toAvdLocaleArgs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toAvdLocaleArgs")().asInstanceOf[js.Array[String]]
  inline def toAvdLocaleArgs(language: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toAvdLocaleArgs")(language.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def toAvdLocaleArgs(language: String, country: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toAvdLocaleArgs")(language.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def toAvdLocaleArgs(language: Unit, country: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toAvdLocaleArgs")(language.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unsignApk(apkPath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsignApk")(apkPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def unzipFile(zipPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipFile")(zipPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unzipFile(zipPath: String, dstRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipFile")(zipPath.asInstanceOf[js.Any], dstRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait InstallOptions extends StObject {
    
    /**
      * Set to true in order to allow test packages installation.
      * @default false
      */
    var allowTestPackages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true in order to grant all the
      * permissions requested in the application's manifest
      * automatically after the installation is completed under Android 6+.
      * @default false
      */
    var grantPermissions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Install apks partially. It is used for 'install-multiple'.
      * @see https://android.stackexchange.com/questions/111064/what-is-a-partial-application-install-via-adb
      * @default false
      */
    var partialInstall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set it to false if you don't want
      * the application to be upgraded/reinstalled
      * if it is already present on the device.
      * @default true
      */
    var replace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to install the app on sdcard
      * instead of the device memory.
      * @default false
      */
    var useSdcard: js.UndefOr[Boolean] = js.undefined
  }
  object InstallOptions {
    
    inline def apply(): InstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowTestPackages(value: Boolean): Self = StObject.set(x, "allowTestPackages", value.asInstanceOf[js.Any])
      
      inline def setAllowTestPackagesUndefined: Self = StObject.set(x, "allowTestPackages", js.undefined)
      
      inline def setGrantPermissions(value: Boolean): Self = StObject.set(x, "grantPermissions", value.asInstanceOf[js.Any])
      
      inline def setGrantPermissionsUndefined: Self = StObject.set(x, "grantPermissions", js.undefined)
      
      inline def setPartialInstall(value: Boolean): Self = StObject.set(x, "partialInstall", value.asInstanceOf[js.Any])
      
      inline def setPartialInstallUndefined: Self = StObject.set(x, "partialInstall", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setUseSdcard(value: Boolean): Self = StObject.set(x, "useSdcard", value.asInstanceOf[js.Any])
      
      inline def setUseSdcardUndefined: Self = StObject.set(x, "useSdcard", js.undefined)
    }
  }
  
  trait ManifestInfo extends StObject {
    
    /**
      * The name of the main package activity
      */
    var activity: js.UndefOr[String] = js.undefined
    
    /**
      * The application identifier
      */
    var pkg: String
    
    /**
      * The version code number (might be `NaN`)
      */
    var versionCode: Double
    
    /**
      * The version name  (might be `NaN`)
      */
    var versionName: String | Null
  }
  object ManifestInfo {
    
    inline def apply(pkg: String, versionCode: Double): ManifestInfo = {
      val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any], versionCode = versionCode.asInstanceOf[js.Any], versionName = null)
      __obj.asInstanceOf[ManifestInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManifestInfo] (val x: Self) extends AnyVal {
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
      
      inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
      
      inline def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    }
  }
  
  trait PlatformInfo extends StObject {
    
    /**
      * The platform name, for example `android-24`
      * or `null` if it cannot be found
      */
    var platform: js.UndefOr[String] = js.undefined
    
    /**
      * Full path to the platform SDK folder
      * or `null` if it cannot be found
      */
    var platformPath: js.UndefOr[String] = js.undefined
  }
  object PlatformInfo {
    
    inline def apply(): PlatformInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlatformInfo] (val x: Self) extends AnyVal {
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformPath(value: String): Self = StObject.set(x, "platformPath", value.asInstanceOf[js.Any])
      
      inline def setPlatformPathUndefined: Self = StObject.set(x, "platformPath", js.undefined)
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
}
