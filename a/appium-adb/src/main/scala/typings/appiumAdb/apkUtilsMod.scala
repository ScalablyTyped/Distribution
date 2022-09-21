package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.anon.ApkStrings
import typings.appiumAdb.anon.NEWERVERSIONINSTALLED
import typings.appiumAdb.appiumAdbBooleans.`false`
import typings.appiumAdb.appiumAdbStrings.newerVersionInstalled
import typings.appiumAdb.appiumAdbStrings.notInstalled
import typings.appiumAdb.appiumAdbStrings.olderVersionInstalled
import typings.appiumAdb.appiumAdbStrings.sameVersionInstalled
import typings.appiumAdb.appiumAdbStrings.unknown
import typings.teenProcess.mod.ExecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apkUtilsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/apk-utils", JSImport.Default)
  @js.native
  val default: ApkUtils = js.native
  
  /* Inlined {  UNKNOWN :'unknown',   NOT_INSTALLED :'notInstalled',   NEWER_VERSION_INSTALLED :'newerVersionInstalled',   SAME_VERSION_INSTALLED :'sameVersionInstalled',   OLDER_VERSION_INSTALLED :'olderVersionInstalled'}[keyof {  UNKNOWN :'unknown',   NOT_INSTALLED :'notInstalled',   NEWER_VERSION_INSTALLED :'newerVersionInstalled',   SAME_VERSION_INSTALLED :'sameVersionInstalled',   OLDER_VERSION_INSTALLED :'olderVersionInstalled'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.sameVersionInstalled
    - typings.appiumAdb.appiumAdbStrings.olderVersionInstalled
    - typings.appiumAdb.appiumAdbStrings.newerVersionInstalled
    - typings.appiumAdb.appiumAdbStrings.unknown
    - typings.appiumAdb.appiumAdbStrings.notInstalled
  */
  trait APP_INSTALL_STATE extends StObject
  object APP_INSTALL_STATE {
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE.NEWER_VERSION_INSTALLED")
    @js.native
    def NEWER_VERSION_INSTALLED: newerVersionInstalled = js.native
    inline def NEWER_VERSION_INSTALLED_=(x: newerVersionInstalled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEWER_VERSION_INSTALLED")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE.NOT_INSTALLED")
    @js.native
    def NOT_INSTALLED: notInstalled = js.native
    inline def NOT_INSTALLED_=(x: notInstalled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_INSTALLED")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE.OLDER_VERSION_INSTALLED")
    @js.native
    def OLDER_VERSION_INSTALLED: olderVersionInstalled = js.native
    inline def OLDER_VERSION_INSTALLED_=(x: olderVersionInstalled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OLDER_VERSION_INSTALLED")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE.SAME_VERSION_INSTALLED")
    @js.native
    def SAME_VERSION_INSTALLED: sameVersionInstalled = js.native
    inline def SAME_VERSION_INSTALLED_=(x: sameVersionInstalled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAME_VERSION_INSTALLED")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/apk-utils", "APP_INSTALL_STATE.UNKNOWN")
    @js.native
    def UNKNOWN: unknown = js.native
    inline def UNKNOWN_=(x: unknown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("appium-adb/lib/tools/apk-utils", "REMOTE_CACHE_ROOT")
  @js.native
  val REMOTE_CACHE_ROOT: /* "/data/local/tmp/appium_cache" */ String = js.native
  
  @js.native
  trait ApkUtils extends StObject {
    
    var APP_INSTALL_STATE: NEWERVERSIONINSTALLED = js.native
    
    /**
      * Caches the given APK at a remote location to speed up further APK deployments.
      *
      * @param apkPath - Full path to the apk on the local FS
      * @param options - Caching options
      * @returns - Full path to the cached apk on the remote file system
      * @throws if there was a failure while caching the app
      */
    def cacheApk(apkPath: String): js.Promise[String] = js.native
    def cacheApk(apkPath: String, options: CachingOptions): js.Promise[String] = js.native
    
    /**
      * Helper method to call `adb dumpsys window windows/displays`
      */
    def dumpWindows(): js.Promise[String] = js.native
    
    /**
      * Make sure current device locale is expected or not.
      *
      * @param language - Language. The language field is case insensitive, but Locale always canonicalizes to lower case.
      * @param country - Country. The language field is case insensitive, but Locale always canonicalizes to lower case.
      * @param script - Script. The script field is case insensitive but Locale always canonicalizes to title case.
      *
      * @return If current locale is language and country as arguments, return true.
      */
    def ensureCurrentLocale(language: String, country: String): js.Promise[Boolean] = js.native
    def ensureCurrentLocale(language: String, country: String, script: String): js.Promise[Boolean] = js.native
    
    /**
      * Extract string resources from the given package on local file system.
      *
      * @param appPath - The full path to the .apk(s) package.
      * @param language - The name of the language to extract the resources for.
      *                             The default language is used if this equals to `null`/`undefined`
      * @param out - The name of the destination folder on the local file system to
      *                       store the extracted file to.
      * @return A mapping object, where properties are: 'apkStrings', containing
      *                  parsed resource file represented as JSON object, and 'localPath',
      *                  containing the path to the extracted file on the local file system.
      */
    def extractStringsFromApk(appPath: String, language: String, out: String): js.Promise[ApkStrings] = js.native
    def extractStringsFromApk(appPath: String, language: Null, out: String): js.Promise[ApkStrings] = js.native
    def extractStringsFromApk(appPath: String, language: Unit, out: String): js.Promise[ApkStrings] = js.native
    
    /**
      * Get the package info from local apk file.
      *
      * @param appPath - The full path to existing .apk(s) package on the local
      *                           file system.
      * @return The parsed application information.
      */
    def getApkInfo(appPath: String): js.Promise[AppInfo | js.Object] = js.native
    
    /**
      * Retrieves the current installation state of the particular application
      *
      * @param appPath - Full path to the application
      * @param pkg - Package identifier. If omitted then the script will
      *                        try to extract it on its own
      * @returns One of `APP_INSTALL_STATE` constants
      */
    def getApplicationInstallState(appPath: String): js.Promise[APP_INSTALL_STATE] = js.native
    def getApplicationInstallState(appPath: String, pkg: String): js.Promise[APP_INSTALL_STATE] = js.native
    
    /**
      * Get the country name of the device under test.
      *
      * @return The name of device country.
      */
    def getDeviceCountry(): js.Promise[String] = js.native
    
    /**
      * Get the language name of the device under test.
      *
      * @return The name of device language.
      */
    def getDeviceLanguage(): js.Promise[String] = js.native
    
    /**
      * Get the locale name of the device under test.
      *
      * @return The name of device locale.
      */
    def getDeviceLocale(): js.Promise[String] = js.native
    
    /**
      * Get the name of currently focused package and activity.
      *
      * @return The mapping, where property names are 'appPackage' and 'appActivity'.
      * @throws If there is an error while parsing the data.
      */
    def getFocusedPackageAndActivity(): js.Promise[PackageActivityInfo] = js.native
    
    /**
      * Get the package info from the installed application.
      *
      * @param pkg - The name of the installed package.
      * @return The parsed application information.
      */
    def getPackageInfo(pkg: String): js.Promise[AppInfo] = js.native
    
    /**
      * Install the package from the local file system.
      *
      * @param appPath - The full path to the local package.
      * @param options - The set of installation options.
      * @throws If an unexpected error happens during install.
      */
    def install(appPath: String): js.Promise[Unit] = js.native
    def install(appPath: String, options: InstallOptions): js.Promise[Unit] = js.native
    
    /**
      * Install the package after it was pushed to the device under test.
      *
      * @param apkPathOnDevice - The full path to the package on the device file system.
      * @param opts [{}] - Additional exec options. See {@link https://github.com/appium/node-teen_process}
      *                             for more details on this parameter.
      * @throws If there was a failure during application install.
      */
    def installFromDevicePath(apkPathOnDevice: String): js.Promise[Unit] = js.native
    def installFromDevicePath(apkPathOnDevice: String, opts: ExecOptions): js.Promise[Unit] = js.native
    
    /**
      * Install the package from the local file system or upgrade it if an older
      * version of the same package is already installed.
      *
      * @param appPath - The full path to the local package.
      * @param pkg - The name of the installed package. The method will
      *                        perform faster if it is set.
      * @param options - Set of install options.
      * @throws If an unexpected error happens during install.
      */
    def installOrUpgrade(appPath: String): js.Promise[InstallOrUpgradeResult] = js.native
    def installOrUpgrade(appPath: String, pkg: String): js.Promise[InstallOrUpgradeResult] = js.native
    def installOrUpgrade(appPath: String, pkg: String, options: InstallOrUpgradeOptions): js.Promise[InstallOrUpgradeResult] = js.native
    def installOrUpgrade(appPath: String, pkg: Null, options: InstallOrUpgradeOptions): js.Promise[InstallOrUpgradeResult] = js.native
    def installOrUpgrade(appPath: String, pkg: Unit, options: InstallOrUpgradeOptions): js.Promise[InstallOrUpgradeResult] = js.native
    
    /**
      * Check whether the particular package is present on the device under test.
      *
      * @param pkg - The name of the package to check.
      * @return True if the package is installed.
      * @throws If there was an error while detecting application state
      */
    def isAppInstalled(pkg: String): js.Promise[Boolean] = js.native
    
    def pullApk(pkg: String, tmpDir: String): js.Promise[String] = js.native
    
    /**
      * Set the locale name of the device under test.
      *
      * @param language - Language. The language field is case insensitive, but Locale always canonicalizes to lower case.
      *                            format: [a-zA-Z]{2,8}. e.g. en, ja : https://developer.android.com/reference/java/util/Locale.html
      * @param country - Country. The country (region) field is case insensitive, but Locale always canonicalizes to upper case.
      *                            format: [a-zA-Z]| [0-9]{3}. e.g. US, JP : https://developer.android.com/reference/java/util/Locale.html
      * @param script - Script. The script field is case insensitive but Locale always canonicalizes to title case.
      *                            format: [a-zA-Z]{4}. e.g. Hans in zh-Hans-CN : https://developer.android.com/reference/java/util/Locale.html
      */
    def setDeviceLanguageCountry(language: String, country: String): js.Promise[Unit] = js.native
    def setDeviceLanguageCountry(language: String, country: String, script: String): js.Promise[Unit] = js.native
    
    /**
      * Set the locale name of the device under test and the format of the locale is en-US, for example.
      * This method call setDeviceLanguageCountry, so, please use setDeviceLanguageCountry as possible.
      *
      * @param locale - Names of the device language and the country connected with `-`. e.g. en-US.
      */
    def setDeviceLocale(locale: String): js.Promise[Unit] = js.native
    
    /**
      * Start the particular package/activity on the device under test.
      *
      * @param startAppOptions [{}] - Startup options mapping.
      * @return The output of the corresponding adb command.
      * @throws If there is an error while executing the activity
      */
    def startApp(): js.Promise[String] = js.native
    def startApp(startAppOptions: StartAppOptions): js.Promise[String] = js.native
    
    /**
      * Start the particular URI on the device under test.
      *
      * @param uri - The name of URI to start.
      * @param pkg - The name of the package to start the URI with.
      */
    def startUri(uri: String, pkg: String): js.Promise[Unit] = js.native
    def startUri(uri: String, pkg: String, opts: StartUriOptions): js.Promise[Unit] = js.native
    
    /**
      * Uninstall the given package from the device under test.
      *
      * @param pkg - The name of the package to be uninstalled.
      * @param options - The set of uninstallation options.
      * @return True if the package was found on the device and
      *                   successfully uninstalled.
      */
    def uninstallApk(pkg: String): js.Promise[Boolean] = js.native
    def uninstallApk(pkg: String, options: UninstallOptions): js.Promise[Boolean] = js.native
    
    /**
      * Wait for the given activity to be focused
      *
      * @param pkg - The name of the package to wait for.
      * @param activity - The name of the activity, belonging to that package,
      *                            to wait for.
      * @param waitMs [20000] - Number of milliseconds to wait before timeout occurs.
      * @throws If timeout happens.
      */
    def waitForActivity(pkg: String, act: String): js.Promise[Unit] = js.native
    def waitForActivity(pkg: String, act: String, waitMs: Double): js.Promise[Unit] = js.native
    
    /**
      * Wait for the given activity to be focused/non-focused.
      *
      * @param pkg - The name of the package to wait for.
      * @param activity - The name of the activity, belonging to that package,
      *                            to wait for.
      * @param waitForStop - Whether to wait until the activity is focused (true)
      *                                or is not focused (false).
      * @param waitMs [20000] - Number of milliseconds to wait before timeout occurs.
      * @throws If timeout happens.
      */
    def waitForActivityOrNot(pkg: String, activity: String, waitForStop: Boolean): js.Promise[Unit] = js.native
    def waitForActivityOrNot(pkg: String, activity: String, waitForStop: Boolean, waitMs: Double): js.Promise[Unit] = js.native
    
    /**
      * Wait for the given activity to be non-focused.
      *
      * @param pkg - The name of the package to wait for.
      * @param activity - The name of the activity, belonging to that package,
      *                            to wait for.
      * @param waitMs [20000] - Number of milliseconds to wait before timeout occurs.
      * @throws If timeout happens.
      */
    def waitForNotActivity(pkg: String, act: String): js.Promise[Unit] = js.native
    def waitForNotActivity(pkg: String, act: String, waitMs: Double): js.Promise[Unit] = js.native
  }
  
  trait AppInfo extends StObject {
    
    /**
      * Package name, for example 'com.acme.app'.
      */
    var name: String
    
    /**
      * Version code.
      */
    var versionCode: Double
    
    /**
      * Version name, for example '1.0'.
      */
    var versionName: String | Null
  }
  object AppInfo {
    
    inline def apply(name: String, versionCode: Double): AppInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versionCode = versionCode.asInstanceOf[js.Any], versionName = null)
      __obj.asInstanceOf[AppInfo]
    }
    
    extension [Self <: AppInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
      
      inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
      
      inline def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    }
  }
  
  trait CachingOptions extends StObject {
    
    /**
      * The count of milliseconds to wait until the
      * app is uploaded to the remote location.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CachingOptions {
    
    inline def apply(): CachingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CachingOptions]
    }
    
    extension [Self <: CachingOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait InstallOptions extends StObject {
    
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
      * @default [true] Set it to false if you don't want
      * the application to be upgraded/reinstalled
      * if it is already present on the device.
      */
    var replace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [60000] The count of milliseconds to wait until the
      * app is installed.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default [false] Set to true to install the app on sdcard
      * instead of the device memory.
      */
    var useSdcard: js.UndefOr[`false`] = js.undefined
  }
  object InstallOptions {
    
    inline def apply(): InstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOptions]
    }
    
    extension [Self <: InstallOptions](x: Self) {
      
      inline def setAllowTestPackages(value: Boolean): Self = StObject.set(x, "allowTestPackages", value.asInstanceOf[js.Any])
      
      inline def setAllowTestPackagesUndefined: Self = StObject.set(x, "allowTestPackages", js.undefined)
      
      inline def setGrantPermissions(value: Boolean): Self = StObject.set(x, "grantPermissions", value.asInstanceOf[js.Any])
      
      inline def setGrantPermissionsUndefined: Self = StObject.set(x, "grantPermissions", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseSdcard(value: `false`): Self = StObject.set(x, "useSdcard", value.asInstanceOf[js.Any])
      
      inline def setUseSdcardUndefined: Self = StObject.set(x, "useSdcard", js.undefined)
    }
  }
  
  trait InstallOrUpgradeOptions extends StObject {
    
    /**
      * @default [false] Set to true in order to allow test
      * packages installation.
      */
    var allowTestPackages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [false] Set to `true` in order to always prefer
      * the current build over any installed packages having
      * the same identifier
      */
    var enforceCurrentBuild: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [false] Set to true in order to grant all the
      * permissions requested in the application's manifest
      * automatically after the installation is completed
      * under Android 6+.
      */
    var grantPermissions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [60000] The count of milliseconds to wait until the
      * app is installed.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @default [false] Set to true to install the app on sdcard
      * instead of the device memory.
      */
    var useSdcard: js.UndefOr[`false`] = js.undefined
  }
  object InstallOrUpgradeOptions {
    
    inline def apply(): InstallOrUpgradeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOrUpgradeOptions]
    }
    
    extension [Self <: InstallOrUpgradeOptions](x: Self) {
      
      inline def setAllowTestPackages(value: Boolean): Self = StObject.set(x, "allowTestPackages", value.asInstanceOf[js.Any])
      
      inline def setAllowTestPackagesUndefined: Self = StObject.set(x, "allowTestPackages", js.undefined)
      
      inline def setEnforceCurrentBuild(value: Boolean): Self = StObject.set(x, "enforceCurrentBuild", value.asInstanceOf[js.Any])
      
      inline def setEnforceCurrentBuildUndefined: Self = StObject.set(x, "enforceCurrentBuild", js.undefined)
      
      inline def setGrantPermissions(value: Boolean): Self = StObject.set(x, "grantPermissions", value.asInstanceOf[js.Any])
      
      inline def setGrantPermissionsUndefined: Self = StObject.set(x, "grantPermissions", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseSdcard(value: `false`): Self = StObject.set(x, "useSdcard", value.asInstanceOf[js.Any])
      
      inline def setUseSdcardUndefined: Self = StObject.set(x, "useSdcard", js.undefined)
    }
  }
  
  trait InstallOrUpgradeResult extends StObject {
    
    /**
      * One of `adb.APP_INSTALL_STATE` states, which reflects
      * the state of the application before being installed.
      */
    var appState: APP_INSTALL_STATE
    
    /**
      * Equals to `true` if the target app has been uninstalled
      * before being installed
      */
    var wasUninstalled: Boolean
  }
  object InstallOrUpgradeResult {
    
    inline def apply(appState: APP_INSTALL_STATE, wasUninstalled: Boolean): InstallOrUpgradeResult = {
      val __obj = js.Dynamic.literal(appState = appState.asInstanceOf[js.Any], wasUninstalled = wasUninstalled.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallOrUpgradeResult]
    }
    
    extension [Self <: InstallOrUpgradeResult](x: Self) {
      
      inline def setAppState(value: APP_INSTALL_STATE): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
      
      inline def setWasUninstalled(value: Boolean): Self = StObject.set(x, "wasUninstalled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageActivityInfo extends StObject {
    
    /** The name of main application activity. */
    var appActivity: String | Null
    
    /** The name of application package, for example 'com.acme.app'. */
    var appPackage: String | Null
  }
  object PackageActivityInfo {
    
    inline def apply(): PackageActivityInfo = {
      val __obj = js.Dynamic.literal(appActivity = null, appPackage = null)
      __obj.asInstanceOf[PackageActivityInfo]
    }
    
    extension [Self <: PackageActivityInfo](x: Self) {
      
      inline def setAppActivity(value: String): Self = StObject.set(x, "appActivity", value.asInstanceOf[js.Any])
      
      inline def setAppActivityNull: Self = StObject.set(x, "appActivity", null)
      
      inline def setAppPackage(value: String): Self = StObject.set(x, "appPackage", value.asInstanceOf[js.Any])
      
      inline def setAppPackageNull: Self = StObject.set(x, "appPackage", null)
    }
  }
  
  trait StartAppOptions extends StObject {
    
    /**
      * The name of the intent action that will launch the required app.
      * This or activity is required in order to be able to launch an app.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the main application activity.
      * This or action is required in order to be able to launch an app.
      */
    var activity: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the application package
      */
    var pkg: String
    
    /**
      * If this property is set to `true`
      * and the activity name does not start with '.' then the method
      * will try to add the missing dot and start the activity once more
      * if the first startup try fails.
      * @default true
      */
    var retry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set it to `true` in order to forcefully
      * stop the activity if it is already running.
      * @default true
      */
    var stopApp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of the user profile to start
      * the given activity with. The default OS user profile (usually zero) is used
      * when this property is unset
      */
    var user: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The name of the activity to wait to on startup
      * (this only makes sense if this name is different from the one,
      * which is set as `activity`)
      */
    var waitActivity: js.UndefOr[String] = js.undefined
    
    /**
      * The number of milliseconds to wait until the
      * `waitActivity` is focused
      */
    var waitDuration: js.UndefOr[String] = js.undefined
    
    /**
      * if `false` then adb won't wait
      * for the started activity to return the control
      * @default true
      */
    var waitForLaunch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the package to wait to on startup
      * (this only makes sense if this name is different from the one,
      * which is set as `pkg`)
      */
    var waitPkg: js.UndefOr[String] = js.undefined
  }
  object StartAppOptions {
    
    inline def apply(pkg: String): StartAppOptions = {
      val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartAppOptions]
    }
    
    extension [Self <: StartAppOptions](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setStopApp(value: Boolean): Self = StObject.set(x, "stopApp", value.asInstanceOf[js.Any])
      
      inline def setStopAppUndefined: Self = StObject.set(x, "stopApp", js.undefined)
      
      inline def setUser(value: String | Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWaitActivity(value: String): Self = StObject.set(x, "waitActivity", value.asInstanceOf[js.Any])
      
      inline def setWaitActivityUndefined: Self = StObject.set(x, "waitActivity", js.undefined)
      
      inline def setWaitDuration(value: String): Self = StObject.set(x, "waitDuration", value.asInstanceOf[js.Any])
      
      inline def setWaitDurationUndefined: Self = StObject.set(x, "waitDuration", js.undefined)
      
      inline def setWaitForLaunch(value: Boolean): Self = StObject.set(x, "waitForLaunch", value.asInstanceOf[js.Any])
      
      inline def setWaitForLaunchUndefined: Self = StObject.set(x, "waitForLaunch", js.undefined)
      
      inline def setWaitPkg(value: String): Self = StObject.set(x, "waitPkg", value.asInstanceOf[js.Any])
      
      inline def setWaitPkgUndefined: Self = StObject.set(x, "waitPkg", js.undefined)
    }
  }
  
  trait StartUriOptions extends StObject {
    
    /**
      * if `false` then adb won't wait for the started activity to return the control
      * @default true
      */
    var waitForLaunch: js.UndefOr[Boolean] = js.undefined
  }
  object StartUriOptions {
    
    inline def apply(): StartUriOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartUriOptions]
    }
    
    extension [Self <: StartUriOptions](x: Self) {
      
      inline def setWaitForLaunch(value: Boolean): Self = StObject.set(x, "waitForLaunch", value.asInstanceOf[js.Any])
      
      inline def setWaitForLaunchUndefined: Self = StObject.set(x, "waitForLaunch", js.undefined)
    }
  }
  
  trait UninstallOptions extends StObject {
    
    /**
      * @default [false] Set to true in order to keep the
      * application data and cache folders after uninstall.
      */
    var keepData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default [20000] The count of milliseconds to wait until the
      * app is uninstalled.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object UninstallOptions {
    
    inline def apply(): UninstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UninstallOptions]
    }
    
    extension [Self <: UninstallOptions](x: Self) {
      
      inline def setKeepData(value: Boolean): Self = StObject.set(x, "keepData", value.asInstanceOf[js.Any])
      
      inline def setKeepDataUndefined: Self = StObject.set(x, "keepData", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type _To = ApkUtils
  
  /* This means you don't have to write `default`, but can instead just say `apkUtilsMod.foo` */
  override def _to: ApkUtils = default
}
