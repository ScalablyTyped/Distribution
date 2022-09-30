package typings.appiumAdb

import typings.appiumAdb.aabUtilsMod.ApkCreationOptions
import typings.appiumAdb.adbCommandsMod.ScreenrecordOptions
import typings.appiumAdb.adbCommandsMod.SetPropOptions
import typings.appiumAdb.adbEmuCommandsMod.EmuVersionInfo
import typings.appiumAdb.adbEmuCommandsMod.ExecTelnetOptions
import typings.appiumAdb.adbEmuCommandsMod.GSM_CALL_ACTIONS
import typings.appiumAdb.adbEmuCommandsMod.GSM_VOICE_STATES
import typings.appiumAdb.adbEmuCommandsMod.NETWORK_SPEED
import typings.appiumAdb.adbEmuCommandsMod.POWER_AC_STATES
import typings.appiumAdb.adbEmuCommandsMod.SENSORS
import typings.appiumAdb.androidManifestMod.APKInfo
import typings.appiumAdb.anon.ACCELERATION
import typings.appiumAdb.anon.AdbExecOptionsoutputForma
import typings.appiumAdb.anon.ApkStrings
import typings.appiumAdb.anon.ConnectedDevicesOptionsve
import typings.appiumAdb.anon.Data
import typings.appiumAdb.anon.EDGE
import typings.appiumAdb.anon.FULL
import typings.appiumAdb.anon.GSMACCEPT
import typings.appiumAdb.anon.GSMVOICEDENIED
import typings.appiumAdb.anon.Items
import typings.appiumAdb.anon.NEWERVERSIONINSTALLED
import typings.appiumAdb.anon.POWERACOFF
import typings.appiumAdb.anon.PartialAdbExecutable
import typings.appiumAdb.anon.PartialRecordBinaryNamest
import typings.appiumAdb.anon.StatusBarNotifications
import typings.appiumAdb.apkSigningMod.CertCheckOptions
import typings.appiumAdb.apkSigningMod.KeystoreHash
import typings.appiumAdb.apkUtilsMod.APP_INSTALL_STATE
import typings.appiumAdb.apkUtilsMod.AppInfo
import typings.appiumAdb.apkUtilsMod.CachingOptions
import typings.appiumAdb.apkUtilsMod.InstallOptions
import typings.appiumAdb.apkUtilsMod.InstallOrUpgradeOptions
import typings.appiumAdb.apkUtilsMod.InstallOrUpgradeResult
import typings.appiumAdb.apkUtilsMod.PackageActivityInfo
import typings.appiumAdb.apkUtilsMod.StartAppOptions
import typings.appiumAdb.apkUtilsMod.StartUriOptions
import typings.appiumAdb.apkUtilsMod.UninstallOptions
import typings.appiumAdb.apksUtilsMod.InstallApksOptions
import typings.appiumAdb.appiumAdbBooleans.`false`
import typings.appiumAdb.appiumAdbInts.`0`
import typings.appiumAdb.appiumAdbInts.`1`
import typings.appiumAdb.appiumAdbInts.`2`
import typings.appiumAdb.appiumAdbInts.`3`
import typings.appiumAdb.appiumAdbInts.`4`
import typings.appiumAdb.appiumAdbStrings.`null`
import typings.appiumAdb.appiumAdbStrings.device
import typings.appiumAdb.appiumAdbStrings.offline
import typings.appiumAdb.appiumAdbStrings.password
import typings.appiumAdb.appiumAdbStrings.pattern
import typings.appiumAdb.appiumAdbStrings.pin
import typings.appiumAdb.keyboardCommandsMod.KeyboardState
import typings.appiumAdb.logcatMod.Log
import typings.appiumAdb.logcatMod.LogcatOpts
import typings.appiumAdb.settingsClientCommandsMod.Location
import typings.appiumAdb.settingsClientCommandsMod.SettingsAppStartupOptions
import typings.appiumAdb.settingsClientCommandsMod.SmsListOptions
import typings.appiumAdb.systemCallsMod.AdbExecOptions
import typings.appiumAdb.systemCallsMod.AvdLaunchOptions
import typings.appiumAdb.systemCallsMod.BinaryName
import typings.appiumAdb.systemCallsMod.ConnectedDevicesOptions
import typings.appiumAdb.systemCallsMod.Device
import typings.appiumAdb.systemCallsMod.ExecResult
import typings.appiumAdb.systemCallsMod.RootResult
import typings.appiumAdb.systemCallsMod.ShellExecOptions
import typings.appiumAdb.systemCallsMod.VerboseDevice
import typings.appiumAdb.systemCallsMod.Version
import typings.node.bufferMod.global.Buffer
import typings.std.RegExpExecArray
import typings.teenProcess.mod.ExecOptions
import typings.teenProcess.mod.SubProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adbMod {
  
  @JSImport("appium-adb/lib/adb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("appium-adb/lib/adb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createADB(): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")().asInstanceOf[js.Promise[ADB]]
    inline def createADB(opts: CreateAdbOptions): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ADB]]
  }
  
  /* Inlined parent appium-adb.appium-adb/lib/tools.AdbMethods */
  /* Inlined parent std.Required<appium-adb.appium-adb/lib/adb.CreateAdbOptions> */
  @js.native
  trait ADB extends StObject {
    
    var APP_INSTALL_STATE: NEWERVERSIONINSTALLED = js.native
    
    var EXEC_OUTPUT_FORMAT: FULL = js.native
    
    var GSM_CALL_ACTIONS: GSMACCEPT = js.native
    
    var GSM_SIGNAL_STRENGTHS: js.Tuple5[`0`, `1`, `2`, `3`, `4`] = js.native
    
    var GSM_VOICE_STATES: GSMVOICEDENIED = js.native
    
    var NETWORK_SPEED: EDGE = js.native
    
    var POWER_AC_STATES: POWERACOFF = js.native
    
    var SENSORS: ACCELERATION = js.native
    
    /**
      * Execute the given adb command.
      *
      * @param cmd - The array of rest command line parameters
      *                      or a single string parameter.
      * @param opts - Additional options mapping. See
      *                        {@link https://github.com/appium/node-teen_process}
      *                        for more details.
      * @return - Command's stdout.
      * @throws If the command returned non-zero exit code.
      */
    def adbExec(cmd: js.Array[String]): js.Promise[ExecResult] = js.native
    def adbExec(cmd: js.Array[String], opts: AdbExecOptionsoutputForma): js.Promise[ExecResult] = js.native
    def adbExec(cmd: js.Array[String], opts: AdbExecOptions): js.Promise[String] = js.native
    
    /**
      * Execute the given emulator command using _adb emu_ tool.
      *
      * @param cmd - The array of rest command line parameters.
      */
    def adbExecEmu(cmd: js.Array[String]): js.Promise[Unit] = js.native
    
    var adbExecTimeout: Double = js.native
    
    var adbPort: Double = js.native
    
    /**
      * Adds an existing package(s) into the Doze whitelist on Android 8+
      *
      * @param  packages One or more packages to add. If the package
      * already exists in the whitelist then it is only going to be added once.
      * If the package with the given name is not installed/not known then an error
      * will be thrown.
      * @returns `true` if the command to add package(s) has been executed
      */
    def addToDeviceIdleWhitelist(packages: String*): js.Promise[Boolean] = js.native
    
    var allowDelayAdb: Boolean = js.native
    
    var allowOfflineDevices: Boolean = js.native
    
    /**
      * Collect Android coverage by instrumenting the particular activity.
      *
      * @param instrumentClass - The name of the instrumentation class.
      * @param waitPkg - The name of the package to be instrumented.
      * @param waitActivity - The name of the main activity in this package.
      *
      * @return The promise is successfully resolved if the instrumentation starts
      *                   without errors.
      */
    def androidCoverage(instrumentClass: String, waitPkg: String, waitActivity: String): js.Promise[Unit] = js.native
    
    var appDeviceReadyTimeout: Double = js.native
    
    /**
      * Retrieve the list of available input methods (IMEs) for the device under test.
      *
      * @return The list of IME names or an empty list.
      */
    def availableIMEs(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Send the special keycode to the device under test in order to emulate
      * Back button tap.
      */
    def back(): js.Promise[Unit] = js.native
    
    var binaries: PartialRecordBinaryNamest = js.native
    
    /**
      * Broadcast a message to the given intent.
      *
      * @param intent - The name of the intent to broadcast to.
      * @throws If intent name is not a valid class name.
      */
    def broadcast(intent: String): js.Promise[Unit] = js.native
    
    /**
      * Broadcast the state of Airplane mode on the device under test.
      * This method should be called after {@link #setAirplaneMode}, otherwise
      * the mode change is not going to be applied for the device.
      *
      * @param on - True to broadcast enable and false to broadcast disable.
      */
    def broadcastAirplaneMode(on: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Broadcast process killing on the device under test.
      *
      * @param intent - The name of the intent to broadcast to.
      * @param processName - The name of the killed process.
      * @throws If the process was not killed.
      */
    def broadcastProcessEnd(intent: String, processName: String): js.Promise[Unit] = js.native
    
    /**
      * Retrieve the `adb bugreport` command output. This
      * operation may take up to several minutes.
      *
      * @param timeout [120000] - Command timeout in milliseconds
      * @returns Command stdout
      */
    def bugreport(): js.Promise[String] = js.native
    def bugreport(timeout: Double): js.Promise[String] = js.native
    
    var buildToolsVersion: String = js.native
    
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
      * Switch adb server root privileges.
      * @param isElevated - Should we elevate to to root or unroot? (default true)
      */
    def changeUserPrivileges(isElevated: Boolean): js.Promise[RootResult] = js.native
    
    /**
      * Check if the app is already signed with the default Appium certificate.
      *
      * @param appPath - The full path to the local .apk(s) file.
      * @param pgk - The name of application package.
      * @return True if given application is already signed.
      */
    def checkApkCert(appPath: String, pkg: String): js.Promise[Boolean] = js.native
    def checkApkCert(appPath: String, pkg: String, opts: CertCheckOptions): js.Promise[Boolean] = js.native
    
    /**
      * Check if given emulator exists in the list of available avds.
      *
      * @param avdName - The name of emulator to verify for existence.
      * Should NOT start with '@' character
      * @throws If the emulator with given name does not exist.
      */
    def checkAvdExist(avdName: String): js.Promise[Unit] = js.native
    
    /**
      * Clear the user data of the particular application on the device
      * under test.
      *
      * @param pkg - The package name to be cleared.
      * @return The output of the corresponding adb command.
      */
    def clear(pkg: String): js.Promise[String] = js.native
    
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
      * Clear the active text field on the device under test by sending
      * special keyevents to it.
      *
      * @param length [100] - The maximum length of the text in the field to be cleared.
      */
    def clearTextField(): js.Promise[Unit] = js.native
    def clearTextField(length: Double): js.Promise[Unit] = js.native
    
    def clone(opts: CreateAdbOptions): ADB = js.native
    
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
    
    def createSubProcess(): SubProcess = js.native
    def createSubProcess(args: js.Array[String]): SubProcess = js.native
    
    var curDeviceId: String = js.native
    
    /**
      * Presses the corresponding key combination to make sure the device's screen
      * is not turned off and is locked if the latter is enabled.
      */
    def cycleWakeUp(): js.Promise[Unit] = js.native
    
    /**
      * Get the default input method on the device under test.
      *
      * @return The name of the default input method.
      */
    def defaultIME(): js.Promise[String | Null] = js.native
    
    /**
      * Delete HTTP proxy in device global settings.
      * Rebooting the test device is necessary to apply the change.
      */
    def deleteHttpProxy(): js.Promise[Unit] = js.native
    
    /**
      * Disable the particular input method on the device under test.
      *
      * @param imeId - One of existing IME ids.
      */
    def disableIME(imeId: String): js.Promise[Unit] = js.native
    
    /**
      * Dismisses keyguard overlay.
      */
    def dismissKeyguard(): js.Promise[Unit] = js.native
    
    /**
      * Helper method to call `adb dumpsys window windows/displays`
      */
    def dumpWindows(): js.Promise[String] = js.native
    
    var emulatorPort: Double = js.native
    
    /**
      * Enable the particular input method on the device under test.
      *
      * @param imeId - One of existing IME ids.
      */
    def enableIME(imeId: String): js.Promise[Unit] = js.native
    
    /**
      * Retrieve the list of enabled input methods (IMEs) for the device under test.
      *
      * @return The list of enabled IME names or an empty list.
      */
    def enabledIMEs(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Kill Android instruments if they are currently running.
      */
    def endAndroidCoverage(): js.Promise[Unit] = js.native
    
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
      * Executes a command through emulator telnet console interface and returns its output
      *
      * @param cmd - The actual command to execute. See
      * https://developer.android.com/studio/run/emulator-console for more details
      * on available commands
      * @param opts
      * @returns The command output
      * @throws If there was an error while connecting to the Telnet console
      * or if the given command returned non-OK response
      */
    def execEmuConsoleCommand(cmd: String): js.Promise[String] = js.native
    def execEmuConsoleCommand(cmd: String, opts: ExecTelnetOptions): js.Promise[String] = js.native
    def execEmuConsoleCommand(cmd: js.Array[String]): js.Promise[String] = js.native
    def execEmuConsoleCommand(cmd: js.Array[String], opts: ExecTelnetOptions): js.Promise[String] = js.native
    
    var executable: AdbExecutable = js.native
    
    /**
      * Execute apksigner utility with given arguments.
      *
      * @param args - The list of tool arguments.
      * @return - Command stdout
      * @throws If apksigner binary is not present on the local file system
      *                 or the return code is not equal to zero.
      */
    def executeApksigner(): js.Promise[String] = js.native
    def executeApksigner(args: js.Array[String]): js.Promise[String] = js.native
    
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
      * Builds a universal .apk from the given .aab package. See
      * https://developer.android.com/studio/command-line/bundletool#generate_apks
      * for more details.
      *
      * @param aabPath Full path to the source .aab package
      * @returns The path to the resulting universal .apk. The .apk is stored in the internal cache
      * by default.
      * @throws If there was an error while creating the universal .apk
      */
    def extractUniversalApk(aabPath: String): js.Promise[String] = js.native
    def extractUniversalApk(aabPath: String, opts: ApkCreationOptions): js.Promise[String] = js.native
    
    /**
      * Verify whether a remote path exists on the device under test.
      *
      * @param remotePath - The remote path to verify.
      * @return True if the given path exists on the device.
      */
    def fileExists(remotePath: String): js.Promise[Boolean] = js.native
    
    /**
      * Get the size of the particular file located on the device under test.
      *
      * @param remotePath - The remote path to the file.
      * @return File size in bytes.
      * @throws If there was an error while getting the size of the given file.
      */
    def fileSize(remotePath: String): js.Promise[Double] = js.native
    
    /**
      * Emulate fingerprint touch event on the connected emulator.
      *
      * @param fingerprintId - The ID of the fingerprint.
      */
    def fingerprint(fingerprintId: String): js.Promise[Unit] = js.native
    
    /**
      * Force application to stop on the device under test.
      *
      * @param pkg - The package name to be stopped.
      * @return The output of the corresponding adb command.
      */
    def forceStop(pkg: String): js.Promise[String] = js.native
    
    /**
      * Setup TCP port forwarding with adb on the device under test. The difference
      * between {@link #forwardPort} is that this method does setup for an abstract
      * local port.
      *
      * @param systemPort - The number of the local system port.
      * @param devicePort - The number of the remote device port.
      */
    def forwardAbstractPort(systemPort: String, devicePort: String): js.Promise[Unit] = js.native
    def forwardAbstractPort(systemPort: String, devicePort: Double): js.Promise[Unit] = js.native
    def forwardAbstractPort(systemPort: Double, devicePort: String): js.Promise[Unit] = js.native
    def forwardAbstractPort(systemPort: Double, devicePort: Double): js.Promise[Unit] = js.native
    
    /**
      * Setup TCP port forwarding with adb on the device under test.
      *
      * @param systemPort - The number of the local system port.
      * @param devicePort - The number of the remote device port.
      */
    def forwardPort(systemPort: String, devicePort: String): js.Promise[Unit] = js.native
    def forwardPort(systemPort: String, devicePort: Double): js.Promise[Unit] = js.native
    def forwardPort(systemPort: Double, devicePort: String): js.Promise[Unit] = js.native
    def forwardPort(systemPort: Double, devicePort: Double): js.Promise[Unit] = js.native
    
    /**
      * @return the actual path to adb executable.
      */
    def getAdbPath(): String = js.native
    
    /**
      * Retrieve the current adb port.
      * @todo can probably deprecate this now that the logic is just to read this.adbPort
      * @return The current adb port number.
      */
    def getAdbServerPort(): Double = js.native
    
    /**
      * Get the path to adb executable and assign it
      * to this.executable.path and this.binaries.adb properties.
      *
      * @return ADB instance.
      */
    def getAdbWithCorrectAdbPath(): js.Promise[Unit] = js.native
    
    /**
      * Retrieve the API level of the device under test.
      *
      * @return The API level as integer number, for example 21 for
      *                  Android Lollipop. The result of this method is cached, so all the further
      * calls return the same value as the first one.
      */
    def getApiLevel(): js.Promise[Double] = js.native
    
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
      * Retrieve full path to a binary file using the standard system lookup tool.
      *
      * @param binaryName - The name of the binary.
      * @return Full path to the binary received from 'which'/'where'
      *                  output.
      * @throws If lookup tool returns non-zero return code.
      */
    def getBinaryFromPath(binaryName: String): js.Promise[String] = js.native
    
    /**
      * Retrieve full path to the given binary.
      *
      * @param binaryName - Simple name of a binary file.
      * @return Full path to the given binary. The method tries
      *                  to enumerate all the known locations where the binary
      *                  might be located and stops the search as soon as the first
      *                  match is found on the local file system.
      * @throws If the binary with given name is not present at any
      *                 of known locations or Android SDK is not installed on the
      *                 local file system.
      */
    def getBinaryFromSdkRoot(binaryName: BinaryName): js.Promise[String] = js.native
    
    /**
      * Retrieve full binary name for the current operating system.
      *
      * @param binaryName - simple binary name, for example 'android'.
      * @return Formatted binary name depending on the current platform,
      *                  for example, 'android.bat' on Windows.
      */
    def getBinaryNameForOS(binaryName: String): String = js.native
    
    /**
      * Retrieves the text content of the device's clipboard.
      * The method works for Android below and above 29.
      * It temorarily enforces the IME setting in order to workaround
      * security limitations if needed.
      * This method only works if Appium Settings v. 2.15+ is installed
      * on the device under test
      *
      * @returns The actual content of the main clipboard as
      * base64-encoded string or an empty string if the clipboard is empty
      * @throws If there was a problem while getting the
      * clipboard contant
      */
    def getClipboard(): js.Promise[String] = js.native
    
    def getConnectedDevices(): js.Promise[js.Array[Device]] = js.native
    /**
      * Retrieve the list of devices visible to adb.
      *
      * @return The list of devices or an empty list if
      *                          no devices are connected.
      * @throws If there was an error while listing devices.
      */
    def getConnectedDevices(opts: ConnectedDevicesOptionsve): js.Promise[js.Array[VerboseDevice]] = js.native
    def getConnectedDevices(opts: ConnectedDevicesOptions): js.Promise[js.Array[Device]] = js.native
    
    /**
      * Retrieve the list of currently connected emulators.
      *
      * @return The list of connected devices.
      */
    def getConnectedEmulators(): js.Promise[js.Array[Device]] = js.native
    
    /**
      * Retrieve the list of denied permissions for the particular package.
      *
      * @param pkg - The package name to be processed.
      * @param cmdOutput [null] - Optional parameter containing command output of
      *                                    _dumpsys package_ command. It may speed up the method execution.
      * @return The list of denied permissions or an empty list.
      */
    def getDeniedPermissions(pkg: String): js.Promise[js.Array[String]] = js.native
    def getDeniedPermissions(pkg: String, cmdOutput: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get the country name of the device under test.
      *
      * @return The name of device country.
      */
    def getDeviceCountry(): js.Promise[String] = js.native
    
    /**
      * Retrieves the list of packages from Doze whitelist on Android 8+
      *
      * @returns The list of whitelisted packages. An example output:
      * system,com.android.shell,2000
      * system,com.google.android.cellbroadcastreceiver,10143
      * user,io.appium.settings,10157
      */
    def getDeviceIdleWhitelist(): js.Promise[js.Array[String]] = js.native
    
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
      * @return Current product country name on the device under test.
      */
    def getDeviceProductCountry(): js.Promise[String] = js.native
    
    /**
      * @return Current product language name on the device under test.
      */
    def getDeviceProductLanguage(): js.Promise[String] = js.native
    
    /**
      * @return Current product locale name on the device under test.
      */
    def getDeviceProductLocale(): js.Promise[String] = js.native
    
    /**
      * Get the particular property of the device under test.
      *
      * @param property - The name of the property. This name should
      *                            be known to _adb shell getprop_ tool.
      *
      * @return The value of the given property.
      */
    def getDeviceProperty(property: String): js.Promise[String] = js.native
    
    /**
      * @param specLocation - The full path to the generated device spec location
      * @returns The same `specLocation` value
      * @throws If it is not possible to retrieve the spec for the current device
      */
    def getDeviceSpec(specLocation: String): js.Promise[String] = js.native
    
    /**
      * @return Current country name on the device under test.
      */
    def getDeviceSysCountry(): js.Promise[String] = js.native
    
    /**
      * @return Current system language on the device under test.
      */
    def getDeviceSysLanguage(): js.Promise[String] = js.native
    
    /**
      * @return Current system locale name on the device under test.
      */
    def getDeviceSysLocale(): js.Promise[String] = js.native
    
    /**
      * Retrieve the list of devices visible to adb within the given timeout.
      *
      * @param timeoutMs - The maximum number of milliseconds to get at least
      *                             one list item.
      * @return The list of connected devices.
      * @throws If no connected devices can be detected within the given timeout.
      */
    def getDevicesWithRetry(): js.Promise[js.Array[Device]] = js.native
    def getDevicesWithRetry(timeoutMs: Double): js.Promise[js.Array[Device]] = js.native
    
    /**
      * Retrieves emulator image properties from the local file system
      *
      * @param avdName Emulator name. Should NOT start with '@' character
      * @throws if there was a failure while extracting the properties
      * @returns The content of emulator image properties file.
      * Usually this configuration .ini file has the following content:
      *   avd.ini.encoding=UTF-8
      *   path=/Users/username/.android/avd/Pixel_XL_API_30.avd
      *   path.rel=avd/Pixel_XL_API_30.avd
      *   target=android-30
      */
    def getEmuImageProperties(avdName: String): js.Promise[js.Object] = js.native
    
    /**
      * Retrieves emulator version from the file system
      *
      * @returns If no version info could be parsed then an empty
      * object is returned
      */
    def getEmuVersionInfo(): js.Promise[EmuVersionInfo] = js.native
    
    /**
      * Retrieve the current emulator port from _adb devives_ output.
      *
      * @return The current emulator port.
      * @throws If there are no connected devices.
      */
    def getEmulatorPort(): js.Promise[Double] = js.native
    
    /**
      * Get the name of currently focused package and activity.
      *
      * @return The mapping, where property names are 'appPackage' and 'appActivity'.
      * @throws If there is an error while parsing the data.
      */
    def getFocusedPackageAndActivity(): js.Promise[PackageActivityInfo] = js.native
    
    /**
      * Get TCP port forwarding with adb on the device under test.
      * @return The output of the corresponding adb command. An array contains each forwarding line of output
      */
    def getForwardList(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get the current cached GPS location from the device under test.
      *
      * @returns The current location
      * @throws If the current location cannot be retrieved
      */
    def getGeoLocation(): js.Promise[Location] = js.native
    
    /**
      * Retrieve the list of granted permissions for the particular package.
      *
      * @param pkg - The package name to be processed.
      * @param cmdOutput [null] - Optional parameter containing command output of
      *                                    _dumpsys package_ command. It may speed up the method execution.
      * @return The list of granted permissions or an empty list.
      * @throws If there was an error while changing permissions.
      */
    def getGrantedPermissions(pkg: String): js.Promise[js.Array[String]] = js.native
    def getGrantedPermissions(pkg: String, cmdOutput: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Retrieve the the hash of the given keystore.
      *
      * @throws If getting keystore hash fails.
      */
    def getKeystoreHash(keytool: String, md5re: js.RegExp): js.Promise[KeystoreHash] = js.native
    
    /**
      * Retrieve the list of location providers for the device under test.
      *
      * @return The list of available location providers or an empty list.
      */
    def getLocationProviders(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Retrieve the output from the currently running logcat process.
      * The logcat process should be executed by {2link #startLogcat} method.
      *
      * @return The collected logcat output.
      * @throws If logcat process is not running.
      */
    def getLogcatLogs(): js.Array[Log] = js.native
    
    /**
      * @return The manufacturer name of the device under test.
      */
    def getManufacturer(): js.Promise[String] = js.native
    
    /**
      * @return The model name of the device under test.
      */
    def getModel(): js.Promise[String] = js.native
    
    /**
      * Returns process name for the given process identifier
      *
      * @param pid - The valid process identifier
      * @throws If the given PID is either invalid or is not present
      * in the active processes list
      * @returns The process name
      */
    def getNameByPid(pid: String): js.Promise[String] = js.native
    def getNameByPid(pid: Double): js.Promise[String] = js.native
    
    /**
      * Retrieves Android notifications via Appium Settings helper.
      * Appium Settings app itself must be *manually* granted to access notifications
      * under device Settings in order to make this feature working.
      * Appium Settings helper keeps all the active notifications plus
      * notifications that appeared while it was running in the internal buffer,
      * but no more than 100 items altogether. Newly appeared notifications
      * are always added to the head of the notifications array.
      * The `isRemoved` flag is set to `true` for notifications that have been removed.
      *
      * See https://developer.android.com/reference/android/service/notification/StatusBarNotification
      * and https://developer.android.com/reference/android/app/Notification.html
      * for more information on available notification properties and their values.
      *
      * @returns The example output is:
      * ```json
      * {
      *   "statusBarNotifications":[
      *     {
      *       "isGroup":false,
      *       "packageName":"io.appium.settings",
      *       "isClearable":false,
      *       "isOngoing":true,
      *       "id":1,
      *       "tag":null,
      *       "notification":{
      *         "title":null,
      *         "bigTitle":"Appium Settings",
      *         "text":null,
      *         "bigText":"Keep this service running, so Appium for Android can properly interact with several system APIs",
      *         "tickerText":null,
      *         "subText":null,
      *         "infoText":null,
      *         "template":"android.app.Notification$BigTextStyle"
      *       },
      *       "userHandle":0,
      *       "groupKey":"0|io.appium.settings|1|null|10133",
      *       "overrideGroupKey":null,
      *       "postTime":1576853518850,
      *       "key":"0|io.appium.settings|1|null|10133",
      *       "isRemoved":false
      *     }
      *   ]
      * }
      * ```
      * @throws If there was an error while getting the notifications list
      */
    def getNotifications(): js.Promise[StatusBarNotifications] = js.native
    
    /**
      * Get the list of process ids for the particular process on the device under test.
      *
      * @param name - The part of process name.
      * @return The list of matched process IDs or an empty list.
      * @throws If the passed process name is not a valid one
      */
    def getPIDsByName(name: String): js.Promise[js.Array[Double]] = js.native
    
    /**
      * Get the package info from the installed application.
      *
      * @param pkg - The name of the installed package.
      * @return The parsed application information.
      */
    def getPackageInfo(pkg: String): js.Promise[AppInfo] = js.native
    
    /**
      * Retrieve the platform version of the device under test.
      *
      * @return The platform version as a string, for example '5.0' for
      * Android Lollipop.
      */
    def getPlatformVersion(): js.Promise[String] = js.native
    
    /**
      * Retrieve the current emulator port by parsing emulator name string.
      *
      * @param emStr - Emulator name string.
      * @return Either the current emulator port or
      *                          _false_ if port number cannot be parsed.
      */
    def getPortFromEmulatorString(emStr: String): Double | `false` = js.native
    
    /**
      * Retrieve the list of requested permissions for the particular package.
      *
      * @param pkg - The package name to be processed.
      * @param cmdOutput [null] - Optional parameter containing command output of
      *                                    _dumpsys package_ command. It may speed up the method execution.
      * @return The list of requested permissions or an empty list.
      */
    def getReqPermissions(pkg: String): js.Promise[js.Array[String]] = js.native
    def getReqPermissions(pkg: String, cmdOutput: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get TCP port forwarding with adb on the device under test.
      * @return The output of the corresponding adb command. An array contains each forwarding line of output
      */
    def getReverseList(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get the object for the currently running emulator.
      *
      * @param avdName - Emulator name.
      * @return Currently running emulator or _null_.
      */
    def getRunningAVD(avdName: String): js.Promise[Device | Null] = js.native
    
    /**
      * Get the object for the currently running emulator.
      *
      * @param avdName - Emulator name.
      * @param timeoutMs [20000] - The maximum number of milliseconds
      *                                     to wait until at least one running AVD object
      *                                     is detected.
      * @return Currently running emulator or _null_.
      * @throws If no device has been detected within the timeout.
      */
    def getRunningAVDWithRetry(avdName: String): js.Promise[Device | Null] = js.native
    def getRunningAVDWithRetry(avdName: String, timeoutMs: Double): js.Promise[Device | Null] = js.native
    
    /**
      * Get the current screen density in dpi
      *
      * @return Device screen density as a number or _null_ if it
      *                  cannot be determined
      */
    def getScreenDensity(): js.Promise[Double | Null] = js.native
    
    /**
      * Retrieve current screen orientation of the device under test.
      *
      * @return The current orientation encoded as an integer number.
      */
    def getScreenOrientation(): js.Promise[Double] = js.native
    
    /**
      * Get the current screen size.
      *
      * @return Device screen size as string in format 'WxH' or
      *                  _null_ if it cannot be determined.
      */
    def getScreenSize(): js.Promise[String | Null] = js.native
    
    /**
      * Retrieve full path to the given binary.
      *
      * @param binaryName - The name of the binary.
      * @return Full path to the given binary including current SDK root.
      */
    def getSdkBinaryPath(binaryName: String): js.Promise[String] = js.native
    
    /**
      * Get device property.
      * [android.provider.Settings]{@link https://developer.android.com/reference/android/provider/Settings.html}
      *
      * @param namespace - one of {system, secure, global}, case-insensitive.
      * @param setting - property name.
      * @return property value.
      */
    def getSetting(namespace: String, setting: String): js.Promise[String] = js.native
    
    /**
      * Retrieves the list of the most recent SMS
      * properties list via Appium Settings helper.
      * Messages are sorted by date in descending order.
      *
      * @param opts
      * @returns The example output is:
      * ```json
      * {
      *   "items":[
      *     {
      *       "id":"2",
      *       "address":"+123456789",
      *       "person":null,
      *       "date":"1581936422203",
      *       "read":"0",
      *       "status":"-1",
      *       "type":"1",
      *       "subject":null,
      *       "body":"\"text message2\"",
      *       "serviceCenter":null
      *     },
      *     {
      *       "id":"1",
      *       "address":"+123456789",
      *       "person":null,
      *       "date":"1581936382740",
      *       "read":"0",
      *       "status":"-1",
      *       "type":"1",
      *       "subject":null,
      *       "body":"\"text message\"",
      *       "serviceCenter":null
      *     }
      *   ],
      *   "total":2
      * }
      * ```
      * @throws If there was an error while getting the SMS list
      */
    def getSmsList(): js.Promise[Items] = js.native
    def getSmsList(opts: SmsListOptions): js.Promise[Items] = js.native
    
    /**
      * Get tz database time zone formatted timezone
      *
      * @returns TZ database Time Zones format
      *
      * @throws If any exception is reported by adb shell.
      */
    def getTimeZone(): js.Promise[String] = js.native
    
    /**
      * Get the adb version. The result of this method is cached.
      *
      * @return The current adb version.
      * @throws If it is not possible to parse adb version.
      */
    def getVersion(): js.Promise[Version] = js.native
    
    /**
      * Send the special keycode to the device under test in order to emulate
      * Home button tap.
      */
    def goToHome(): js.Promise[Unit] = js.native
    
    /**
      * Grant all permissions requested by the particular package.
      * This method is only useful on Android 6.0+ and for applications
      * that support components-based permissions setting.
      *
      * @param pkg - The package name to be processed.
      * @param apk - The path to the actual apk file.
      * @throws If there was an error while granting permissions
      */
    def grantAllPermissions(pkg: String, apk: String): js.Promise[Unit] = js.native
    
    /**
      * Grant single permission for the particular package.
      *
      * @param pkg - The package name to be processed.
      * @param permission - The full name of the permission to be granted.
      * @throws If there was an error while changing permissions.
      */
    def grantPermission(pkg: String, permission: String): js.Promise[Unit] = js.native
    
    /**
      * Grant multiple permissions for the particular package.
      * This call is more performant than `grantPermission` one, since it combines
      * multiple `adb shell` calls into a single command.
      *
      * @param pkg - The package name to be processed.
      * @param permissions - The list of permissions to be granted.
      * @throws If there was an error while changing permissions.
      */
    def grantPermissions(pkg: String, permissions: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Emulate GSM call event on the connected emulator.
      *
      * @param phoneNumber - The phone number of the caller.
      * @param action [''] - One of available GSM call actions.
      * @throws If phone number has invalid format.
      * @throws If _action_ value is invalid.
      */
    def gsmCall(phoneNumber: String): js.Promise[Unit] = js.native
    def gsmCall(phoneNumber: String, action: GSM_CALL_ACTIONS): js.Promise[Unit] = js.native
    def gsmCall(phoneNumber: Double): js.Promise[Unit] = js.native
    def gsmCall(phoneNumber: Double, action: GSM_CALL_ACTIONS): js.Promise[Unit] = js.native
    
    /**
      * Emulate GSM signal strength change event on the connected emulator.
      *
      * @param strength [4] - A number in range [0, 4];
      * @throws If _strength_ value is invalid.
      */
    def gsmSignal(): js.Promise[Unit] = js.native
    def gsmSignal(strength: String): js.Promise[Unit] = js.native
    def gsmSignal(strength: Double): js.Promise[Unit] = js.native
    
    /**
      * Emulate GSM voice event on the connected emulator.
      *
      * @param state ['on'] - Either 'on' or 'off'.
      * @throws If _state_ value is invalid.
      */
    def gsmVoice(): js.Promise[Unit] = js.native
    def gsmVoice(state: GSM_VOICE_STATES): js.Promise[Unit] = js.native
    
    /**
      * Check whether package manifest contains Internet permissions.
      *
      * @param appPath - The full path to .apk(s) package.
      * @return True if the manifest requires Internet access permission.
      */
    def hasInternetPermissionFromManifest(appPath: String): js.Promise[Boolean] = js.native
    
    /**
      * Hides software keyboard if it is visible.
      * Noop if the keyboard is already hidden.
      *
      * @param timeoutMs [1000] For how long to wait (in milliseconds)
      * until the keyboard is actually hidden.
      * @returns `false` if the keyboard was already hidden
      * @throws If the keyboard cannot be hidden.
      */
    def hideKeyboard(): js.Promise[Boolean] = js.native
    def hideKeyboard(timeoutMs: Double): js.Promise[Boolean] = js.native
    
    /**
      * Get the full path to aapt tool and assign it to
      * this.binaries.aapt property
      */
    def initAapt(): js.Promise[Unit] = js.native
    
    /**
      * Get the full path to aapt2 tool and assign it to
      * this.binaries.aapt2 property
      */
    def initAapt2(): js.Promise[Unit] = js.native
    
    /**
      * Get the full path to bundletool binary and assign it to
      * this.binaries.bundletool property
      */
    def initBundletool(): js.Promise[Unit] = js.native
    
    /**
      * Get the full path to zipalign tool and assign it to
      * this.binaries.zipalign property
      */
    def initZipAlign(): js.Promise[Unit] = js.native
    
    /**
      * Send the particular text to the device under test.
      *
      * @param text - The actual text to be sent.
      */
    def inputText(text: String): js.Promise[Unit] = js.native
    
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
      * Install the package from the local file system.
      *
      * @param appPath - The full path to the local package.
      * @param options - The set of installation options.
      * @throws If an unexpected error happens during install.
      */
    def install(appPath: String): js.Promise[Unit] = js.native
    def install(appPath: String, options: InstallOptions): js.Promise[Unit] = js.native
    
    /**
      * Installs the given .apks package into the device under test
      *
      * @param apks - The full path to the .apks file
      * @param options - Installation options
      * @throws If the .apks bundle cannot be installed
      */
    def installApks(apks: String): js.Promise[Unit] = js.native
    def installApks(apks: String, options: InstallApksOptions): js.Promise[Unit] = js.native
    
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
    
    def installMitmCertificate(cert: String): js.Promise[Unit] = js.native
    /**
      * Installs the given certificate on a rooted real device or
      * an emulator. The emulator must be executed with `-writable-system`
      * command line option and adb daemon should be running in root
      * mode for this method to work properly. The method also requires
      * openssl tool to be available on the destination system.
      * Read https://github.com/appium/appium/issues/10964
      * for more details on this topic
      *
      * @param cert - base64-decoded content of the actual certificate
      * represented as a string or a buffer
      * @throws If openssl tool is not available on the destination system
      * or if there was an error while installing the certificate
      */
    def installMitmCertificate(cert: Buffer): js.Promise[Unit] = js.native
    
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
      * Instrument the particular activity.
      *
      * @param pkg - The name of the package to be instrumented.
      * @param activity - The name of the main activity in this package.
      * @param instrumentWith - The name of the package to instrument
      *                                  the activity with.
      * @throws If any exception is reported by adb shell.
      */
    def instrument(pkg: String, activity: String, instrumentWith: String): js.Promise[Unit] = js.native
    
    var instrumentProc: SubProcess = js.native
    
    /**
      * Check the state of Airplane mode on the device under test.
      *
      * @return True if Airplane mode is enabled.
      */
    def isAirplaneModeOn(): js.Promise[Boolean] = js.native
    
    /**
      * Check the state of animation on the device under test.
      *
      * @return True if at least one of animation scale settings
      *                   is not equal to '0.0'.
      */
    def isAnimationOn(): js.Promise[Boolean] = js.native
    
    /**
      * Check whether the particular package is present on the device under test.
      *
      * @param pkg - The name of the package to check.
      * @return True if the package is installed.
      * @throws If there was an error while detecting application state
      */
    def isAppInstalled(pkg: String): js.Promise[Boolean] = js.native
    
    /**
      * Check the state of Data transfer on the device under test.
      *
      * @return True if Data transfer is enabled.
      */
    def isDataOn(): js.Promise[Boolean] = js.native
    
    /**
      * Verify whether a device is connected.
      *
      * @return True if at least one device is visible to adb.
      */
    def isDeviceConnected(): js.Promise[Boolean] = js.native
    
    /**
      * Check the emulator state.
      *
      * @return True if Emulator is visible to adb.
      */
    def isEmulatorConnected(): js.Promise[Boolean] = js.native
    
    /**
      * Checks whether incremental install feature is supported by ADB.
      * Read https://developer.android.com/preview/features#incremental
      * for more details on it.
      *
      * @returns `true` if the feature is supported by both adb and the
      * device under test
      */
    def isIncrementalInstallSupported(): js.Promise[Boolean] = js.native
    
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
    
    def isMitmCertificateInstalled(cert: String): js.Promise[Boolean] = js.native
    /**
      * Verifies if the given root certificate is already installed on the device.
      *
      * @param cert - base64-decoded content of the actual certificate
      * represented as a string or a buffer
      * @throws If openssl tool is not available on the destination system
      * or if there was an error while checking the certificate
      * @returns true if the given certificate is already installed
      */
    def isMitmCertificateInstalled(cert: Buffer): js.Promise[Boolean] = js.native
    
    /**
      * Checks whether the current user is root
      *
      * @return True if the user is root
      * @throws if there was an error while identifying
      * the user.
      */
    def isRoot(): js.Promise[Boolean] = js.native
    
    /**
      * Retrieve the screen lock state of the device under test.
      *
      * @return True if the device is locked.
      */
    def isScreenLocked(): js.Promise[Boolean] = js.native
    
    /**
      * Retrieve the state of the software keyboard on the device under test.
      *
      * @return The keyboard state.
      */
    def isSoftKeyboardPresent(): js.Promise[KeyboardState] = js.native
    
    /**
      * Checks the state of streamed install feature.
      * This feature allows to speed up apk installation
      * since it does not require the original apk to be pushed to
      * the device under test first, which also saves space.
      * Although, it is required that both the device under test
      * and the adb server have the mentioned functionality.
      * See https://github.com/aosp-mirror/platform_system_core/blob/master/adb/client/adb_install.cpp
      * for more details
      *
      * @returns `true` if the feature is supported by both adb and the
      * device under test
      */
    def isStreamedInstallSupported(): js.Promise[Boolean] = js.native
    
    /**
      * Verify whether the given argument is a
      * valid class name.
      *
      * @param classString - The actual class name to be verified.
      * @return The result of Regexp.exec operation
      *                          or _null_ if no matches are found.
      */
    def isValidClass(classString: String): RegExpExecArray | Null = js.native
    
    /**
      * Check the state of WiFi on the device under test.
      *
      * @return True if WiFi is enabled.
      */
    def isWifiOn(): js.Promise[Boolean] = js.native
    
    var keyAlias: String = js.native
    
    var keyPassword: String = js.native
    
    /**
      * Send the particular keycode to the device under test.
      *
      * @param keycode - The actual key code to be sent.
      */
    def keyevent(keycode: String): js.Promise[Unit] = js.native
    def keyevent(keycode: Double): js.Promise[Unit] = js.native
    
    var keystorePassword: String = js.native
    
    var keystorePath: String = js.native
    
    /**
      * Shutdown all running emulators by killing their processes.
      *
      * @throws If killing tool returned non-zero return code.
      */
    def killAllEmulators(): js.Promise[Unit] = js.native
    
    /**
      * Kill emulator with the given name. No error
      * is thrown is given avd does not exist/is not running.
      *
      * @param avdName - The name of the emulator to be killed. If empty,
      *                            the current emulator will be killed.
      * @param timeout [60000] - The amount of time to wait before throwing
      *                                    an exception about unsuccessful killing
      * @return - True if the emulator was killed, false otherwise.
      * @throws if there was a failure by killing the emulator
      */
    def killEmulator(): js.Promise[Boolean] = js.native
    def killEmulator(avdName: String): js.Promise[Boolean] = js.native
    def killEmulator(avdName: String, timeout: Double): js.Promise[Boolean] = js.native
    def killEmulator(avdName: Null, timeout: Double): js.Promise[Boolean] = js.native
    def killEmulator(avdName: Unit, timeout: Double): js.Promise[Boolean] = js.native
    
    /**
      * Kill application
      *
      * @param pkg - The package name to be stopped.
      * @return The output of the corresponding adb command.
      */
    def killPackage(pkg: String): js.Promise[String] = js.native
    
    /**
      * Kill the particular process on the device under test.
      * The current user is automatically switched to root if necessary in order
      * to properly kill the process.
      *
      * @param pid - The ID of the process to be killed.
      * @throws If the process cannot be killed.
      */
    def killProcessByPID(pid: String): js.Promise[Unit] = js.native
    def killProcessByPID(pid: Double): js.Promise[Unit] = js.native
    
    /**
      * Get the list of process ids for the particular process on the device under test.
      *
      * @param name - The part of process name.
      * @return The list of matched process IDs or an empty list.
      */
    def killProcessesByName(name: String): js.Promise[Unit] = js.native
    
    /**
      * Kill adb server.
      */
    def killServer(): js.Promise[Unit] = js.native
    
    /**
      * Start an emulator with given parameters and wait until it is full started.
      *
      * @param avdName - The name of an existing emulator.
      * @param opts
      * @returns Emulator subprocess instance
      * @throws If the emulator fails to start within the given timeout.
      */
    def launchAVD(avdName: String): js.Promise[SubProcess] = js.native
    def launchAVD(avdName: String, opts: AvdLaunchOptions): js.Promise[SubProcess] = js.native
    
    /**
      * Retrieves the list of features supported by the device under test
      *
      * @returns the list of supported feature names or an empty list.
      * @example
      * ['cmd',
      * 'ls_v2',
      * 'fixed_push_mkdir',
      * 'shell_v2',
      * 'abb',
      * 'stat_v2',
      * 'apex',
      * 'abb_exec',
      * 'remount_shell',
      * 'fixed_push_symlink_timestamp']
      * ```
      * @throws if there was an error while retrieving the list
      */
    def listFeatures(): js.Promise[js.Array[String]] = js.native
    
    /**
      * At some point of time Google has changed the default `ps` behaviour, so it only
      * lists processes that belong to the current shell user rather to all
      * users. It is necessary to execute ps with -A command line argument
      * to mimic the previous behaviour.
      *
      * @returns the output of `ps` command where all processes are included
      */
    def listProcessStatus(): js.Promise[String] = js.native
    
    /**
      * Send the special keycode to the device under test in order to lock it.
      */
    def lock(): js.Promise[Unit] = js.native
    
    /**
      * Get the output of _ls_ command on the device under test.
      *
      * @param remotePath - The remote path (the first argument to the _ls_ command).
      * @param opts [[]] - Additional _ls_ options.
      * @return The _ls_ output as an array of split lines.
      *                          An empty array is returned of the given _remotePath_
      *                          does not exist.
      */
    def ls(remotePath: String): js.Promise[js.Array[String]] = js.native
    def ls(remotePath: String, opts: js.Array[String]): js.Promise[js.Array[String]] = js.native
    
    /**
      * Recursively create a new folder on the device under test.
      *
      * @param remotePath - The new path to be created.
      * @return mkdir command output.
      */
    def mkdir(remotePath: String): js.Promise[String] = js.native
    
    /**
      * Emulate network speed change event on the connected emulator.
      *
      * @param speed ['full'] - One of possible NETWORK_SPEED values.
      * @throws If _speed_ value is invalid.
      */
    def networkSpeed(): js.Promise[Unit] = js.native
    def networkSpeed(speed: NETWORK_SPEED): js.Promise[Unit] = js.native
    
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
      * Performs the given editor action on the focused input field.
      * This method requires Appium Settings helper to be installed on the device.
      * No exception is thrown if there was a failure while performing the action.
      * You must investigate the logcat output if something did not work as expected.
      *
      * @param action - Either action code or name. The following action
      *                                 names are supported: `normal, unspecified, none,
      *                                 go, search, send, next, done, previous`
      */
    def performEditorAction(action: String): js.Promise[Unit] = js.native
    def performEditorAction(action: Double): js.Promise[Unit] = js.native
    
    /**
      * Execute ping shell command on the device under test.
      *
      * @return True if the command output contains 'ping' substring.
      * @throws If there was an error while executing 'ping' command on the
      *                 device under test.
      */
    def ping(): js.Promise[Boolean] = js.native
    
    /**
      * Emulate power state change on the connected emulator.
      *
      * @param state ['on'] - Either 'on' or 'off'.
      */
    def powerAC(): js.Promise[Unit] = js.native
    def powerAC(state: POWER_AC_STATES): js.Promise[Unit] = js.native
    
    /**
      * Emulate power capacity change on the connected emulator.
      *
      * @param percent [100] - Percentage value in range [0, 100].
      */
    def powerCapacity(): js.Promise[Unit] = js.native
    def powerCapacity(percent: String): js.Promise[Unit] = js.native
    def powerCapacity(percent: Double): js.Promise[Unit] = js.native
    
    /**
      * Emulate power off event on the connected emulator.
      */
    def powerOFF(): js.Promise[Unit] = js.native
    
    /**
      * Check whether the process with the particular name is running on the device
      * under test.
      *
      * @param processName - The name of the process to be checked.
      * @return True if the given process is running.
      * @throws If the given process name is not a valid class name.
      */
    def processExists(processName: String): js.Promise[Boolean] = js.native
    
    /**
      * Receive a file from the device under test.
      *
      * @param remotePath - The source path on the remote device.
      * @param localPath - The destination path to the file on the local file system.
      * @param opts - Additional options mapping. See
      *                        https://github.com/appium/node-teen_process,
      *                        _exec_ method options, for more information about available
      *                        options.
      */
    def pull(remotePath: String, localPath: String): js.Promise[Unit] = js.native
    def pull(remotePath: String, localPath: String, opts: ExecOptions): js.Promise[Unit] = js.native
    
    def pullApk(pkg: String, tmpDir: String): js.Promise[String] = js.native
    
    /**
      * Send a file to the device under test.
      *
      * @param localPath - The path to the file on the local file system.
      * @param remotePath - The destination path on the remote device.
      * @param opts - Additional options mapping. See
      *                        https://github.com/appium/node-teen_process,
      *                        _exec_ method options, for more information about available
      *                        options.
      */
    def push(localPath: String, remotePath: String): js.Promise[Unit] = js.native
    def push(localPath: String, remotePath: String, opts: ExecOptions): js.Promise[Unit] = js.native
    
    /**
      * Reboot the current device and wait until it is completed.
      *
      * @param retries [DEFAULT_ADB_REBOOT_RETRIES] - The maximum number of reboot retries.
      * @throws If the device failed to reboot and number of retries is exceeded.
      */
    def reboot(): js.Promise[Unit] = js.native
    def reboot(retries: Double): js.Promise[Unit] = js.native
    
    /**
      * Kick current connection from host/device side and make it reconnect
      *
      * @param target [offline] One of possible targets to reconnect:
      * offline, device or null
      * Providing `null` will cause reconnection to happen from the host side.
      *
      * @throws If either ADB version is too old and does not support this
      * command or there was a failure during reconnect.
      */
    def reconnect(): js.Promise[Unit] = js.native
    def reconnect(target: offline | device | `null`): js.Promise[Unit] = js.native
    
    /**
      * Sends an async request to refresh the GPS cache.
      * This feature only works if the device under test has
      * Google Play Services installed. In case the vanilla
      * LocationManager is used the device API level must be at
      * version 30 (Android R) or higher.
      *
      * @param timeoutMs [20000] The maximum number of milliseconds
      * to block until GPS cache is refreshed. Providing zero or a negative
      * value to it skips waiting completely.
      *
      * @throws If the GPS cache cannot be refreshed.
      */
    def refreshGeoLocationCache(): js.Promise[Unit] = js.native
    def refreshGeoLocationCache(timeoutMs: Double): js.Promise[Unit] = js.native
    
    var remoteAppsCacheLimit: Double = js.native
    
    /**
      * Removes the previously set callback for the logcat output event.
      *
      * @param listener - The listener function, which has been previously
      *                              passed to `setLogcatListener`
      * @throws If logcat process is not running.
      */
    def removeLogcatListener(listener: js.Function1[/* outputObj */ Log, Unit]): Unit = js.native
    
    /**
      * Remove TCP port forwarding with adb on the device under test. The forwarding
      * for the given port should be setup with {@link #forwardPort} first.
      *
      * @param systemPort - The number of the local system port
      *                                     to remove forwarding on.
      */
    def removePortForward(systemPort: String): js.Promise[Unit] = js.native
    def removePortForward(systemPort: Double): js.Promise[Unit] = js.native
    
    /**
      * Remove TCP port forwarding with adb on the device under test. The forwarding
      * for the given port should be setup with {@link #forwardPort} first.
      *
      * @param devicePort - The number of the remote device port
      *                                     to remove forwarding on.
      */
    def removePortReverse(devicePort: String): js.Promise[Unit] = js.native
    def removePortReverse(devicePort: Double): js.Promise[Unit] = js.native
    
    /**
      * Ensures that Appium Settings helper application is running
      * and starts it if necessary
      *
      * @param opts
      * @throws If Appium Settings has failed to start
      * @returns self instance for chaining
      */
    def requireRunningSettingsApp(): js.Promise[this.type] = js.native
    def requireRunningSettingsApp(opts: SettingsAppStartupOptions): js.Promise[this.type] = js.native
    
    /**
      * Reset Telnet authentication token.
      * @see {@link http://tools.android.com/recent/emulator2516releasenotes} for more details.
      *
      * @returns If token reset was successful.
      */
    def resetTelnetAuthToken(): js.Promise[Boolean] = js.native
    
    /**
      * Restart the device under test using adb commands.
      *
      * @throws If start fails.
      */
    def restart(): js.Promise[Unit] = js.native
    
    /**
      * Restart adb server, unless _this.suppressKillServer_ property is true.
      */
    def restartAdb(): js.Promise[Unit] = js.native
    
    /**
      * Setup TCP port forwarding with adb on the device under test.
      * Only available for API 21+.
      *
      * @param devicePort - The number of the remote device port.
      * @param systemPort - The number of the local system port.
      */
    def reversePort(devicePort: String, systemPort: String): js.Promise[Unit] = js.native
    def reversePort(devicePort: String, systemPort: Double): js.Promise[Unit] = js.native
    def reversePort(devicePort: Double, systemPort: String): js.Promise[Unit] = js.native
    def reversePort(devicePort: Double, systemPort: Double): js.Promise[Unit] = js.native
    
    /**
      * Revoke single permission from the particular package.
      *
      * @param pkg - The package name to be processed.
      * @param permission - The full name of the permission to be revoked.
      * @throws If there was an error while changing permissions.
      */
    def revokePermission(pkg: String, permission: String): js.Promise[Unit] = js.native
    
    /**
      * Forcefully recursively remove a path on the device under test.
      * Be careful while calling this method.
      *
      * @param path - The path to be removed recursively.
      */
    def rimraf(path: String): js.Promise[Unit] = js.native
    
    /**
      * Switch adb server to root mode.
      */
    def root(): js.Promise[RootResult] = js.native
    
    /**
      * Change the display orientation on the connected emulator.
      * The orientation is changed (PI/2 is added) every time
      * this method is called.
      */
    def rotate(): js.Promise[Unit] = js.native
    
    /**
      * Executes the given function with the given input method context
      * and then restores the IME to the original value
      *
      * @param ime - Valid IME identifier
      * @param fn - Function to execute
      */
    def runInImeContext[T](ime: String, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Performs recursive media scan at the given destination.
      * All successfully scanned items are being added to the device's
      * media library.
      *
      * @param destination File/folder path on the remote device.
      * @throws If there was an unexpected error by scanning.
      */
    def scanMedia(destination: String): js.Promise[Unit] = js.native
    
    /**
      * Initiate screenrecord utility on the device
      *
      * @param destination - Full path to the writable media file destination
      *                               on the device file system.
      * @param options [{}]
      * @returns screenrecord process, which can be then controlled by the client code
      */
    def screenrecord(destination: String): SubProcess = js.native
    def screenrecord(destination: String, options: ScreenrecordOptions): SubProcess = js.native
    
    var sdkRoot: String = js.native
    
    /**
      * Emulate send SMS event on the connected emulator.
      *
      * @param phoneNumber - The phone number of message sender.
      * @param message [''] - The message content.
      * @throws If phone number has invalid format.
      */
    def sendSMS(phoneNumber: String): js.Promise[Unit] = js.native
    def sendSMS(phoneNumber: String, message: String): js.Promise[Unit] = js.native
    def sendSMS(phoneNumber: Double): js.Promise[Unit] = js.native
    def sendSMS(phoneNumber: Double, message: String): js.Promise[Unit] = js.native
    
    /**
      * Send an arbitrary Telnet command to the device under test.
      *
      * @param command - The command to be sent.
      *
      * @return The actual output of the given command.
      */
    def sendTelnetCommand(command: String): js.Promise[String] = js.native
    
    def sensorSet(sensor: SENSORS, value: String): js.Promise[Unit] = js.native
    /**
      * Emulate sensors values on the connected emulator.
      *
      * @param sensor - Sensor type declared in SENSORS items.
      * @param value  - Number to set as the sensor value.
      * @throws - If sensor type or sensor value is not defined
      */
    def sensorSet(sensor: SENSORS, value: Double): js.Promise[Unit] = js.native
    
    /**
      * Change the state of Airplane mode in Settings on the device under test.
      *
      * @param on - True to enable the Airplane mode in Settings and false to disable it.
      */
    def setAirplaneMode(on: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Change the state of animation on the device under test.
      * Animation on the device is controlled by the following global properties:
      * [ANIMATOR_DURATION_SCALE]{@link https://developer.android.com/reference/android/provider/Settings.Global.html#ANIMATOR_DURATION_SCALE},
      * [TRANSITION_ANIMATION_SCALE]{@link https://developer.android.com/reference/android/provider/Settings.Global.html#TRANSITION_ANIMATION_SCALE},
      * [WINDOW_ANIMATION_SCALE]{@link https://developer.android.com/reference/android/provider/Settings.Global.html#WINDOW_ANIMATION_SCALE}.
      * This method sets all this properties to 0.0 to disable (1.0 to enable) animation.
      *
      * Turning off animation might be useful to improve stability
      * and reduce tests execution time.
      *
      * @param on - True to enable and false to disable it.
      */
    def setAnimationState(on: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Change the state of Data transfer on the device under test.
      *
      * @param on - True to enable and false to disable it.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    def setDataState(on: Boolean): js.Promise[Unit] = js.native
    def setDataState(on: Boolean, isEmulator: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Reset access to non-SDK APIs to its default setting.
      * https://developer.android.com/preview/restrictions-non-sdk-interfaces
      *
      * @param ignoreError [false] Whether to ignore an exception in 'adb shell settings delete global' command
      * @throws If there was an error and ignoreError was true while executing 'adb shell settings delete global'
      *                 command on the device under test.
      */
    def setDefaultHiddenApiPolicy(): js.Promise[Unit] = js.native
    def setDefaultHiddenApiPolicy(ignoreError: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Set the the current device object.
      *
      * @param deviceObj - The device object to be set.
      */
    def setDevice(deviceObj: Device): Unit = js.native
    
    /**
      * Set the identifier of the current device (_this.curDeviceId_).
      *
      * @param - The device identifier.
      */
    def setDeviceId(deviceId: String): Unit = js.native
    
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
      * Set the particular property of the device under test.
      *
      * @param property - The name of the property. This name should
      *                            be known to _adb shell setprop_ tool.
      * @param val - The new property value.
      *
      * @throws If _setprop_ utility fails to change property value.
      */
    def setDeviceProperty(prop: String, `val`: String): js.Promise[Unit] = js.native
    def setDeviceProperty(prop: String, `val`: String, opts: SetPropOptions): js.Promise[Unit] = js.native
    
    /**
      * Change the locale on the device under test. Don't need to reboot the device after changing the locale.
      * This method sets an arbitrary locale following:
      *   https://developer.android.com/reference/java/util/Locale.html
      *   https://developer.android.com/reference/java/util/Locale.html#Locale(java.lang.String,%20java.lang.String)
      *
      * @param language - Language. e.g. en, ja
      * @param country - Country. e.g. US, JP
      * @param script - Script. e.g. Hans in `zh-Hans-CN`
      */
    def setDeviceSysLocaleViaSettingApp(language: String, country: String): js.Promise[Unit] = js.native
    def setDeviceSysLocaleViaSettingApp(language: String, country: String, script: String): js.Promise[Unit] = js.native
    
    /**
      * Set _emulatorPort_ property of the current class.
      *
      * @param emPort - The emulator port to be set.
      */
    def setEmulatorPort(emPort: Double): Unit = js.native
    
    /**
      * Emulate geolocation coordinates on the device under test.
      *
      * @param location - Location object. The `altitude` value is ignored
      * while mocking the position.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    def setGeoLocation(location: Location): js.Promise[Unit] = js.native
    def setGeoLocation(location: Location, isEmulator: Boolean): js.Promise[Unit] = js.native
    
    def setHiddenApiPolicy(value: String): js.Promise[Unit] = js.native
    def setHiddenApiPolicy(value: String, ignoreError: Boolean): js.Promise[Unit] = js.native
    /**
      * Set hidden api policy to manage access to non-SDK APIs.
      * https://developer.android.com/preview/restrictions-non-sdk-interfaces
      *
      * @param value - The API enforcement policy.
      * ### For Android P
      * - 0: Disable non-SDK API usage detection. This will also disable logging, and also break the strict mode API,
      *      detectNonSdkApiUsage(). Not recommended.
      * - 1: "Just warn" - permit access to all non-SDK APIs, but keep warnings in the log.
      *      The strict mode API will keep working.
      * - 2: Disallow usage of dark grey and black listed APIs.
      * - 3: Disallow usage of blacklisted APIs, but allow usage of dark grey listed APIs.
      *
      * ### For Android Q
      * https://developer.android.com/preview/non-sdk-q#enable-non-sdk-access
      * - 0: Disable all detection of non-SDK interfaces. Using this setting disables all log messages for non-SDK interface usage
      *      and prevents you from testing your app using the StrictMode API. This setting is not recommended.
      * - 1: Enable access to all non-SDK interfaces, but print log messages with warnings for any non-SDK interface usage.
      *      Using this setting also allows you to test your app using the StrictMode API.
      * - 2: Disallow usage of non-SDK interfaces that belong to either the black list
      *      or to a restricted greylist for your target API level.
      *
      * @param ignoreError [false] Whether to ignore an exception in 'adb shell settings put global' command
      * @throws If there was an error and ignoreError was true while executing 'adb shell settings put global'
      *                 command on the device under test.
      */
    def setHiddenApiPolicy(value: Double): js.Promise[Unit] = js.native
    def setHiddenApiPolicy(value: Double, ignoreError: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Setup HTTP proxy in device global settings.
      * Read https://android.googlesource.com/platform/frameworks/base/+/android-9.0.0_r21/core/java/android/provider/Settings.java for each property
      *
      * @param proxyHost - The host name of the proxy.
      * @param proxyPort - The port number to be set.
      */
    def setHttpProxy(proxyHost: String, proxyPort: String): js.Promise[Unit] = js.native
    def setHttpProxy(proxyHost: String, proxyPort: Double): js.Promise[Unit] = js.native
    
    /**
      * Set the particular input method on the device under test.
      *
      * @param imeId - One of existing IME ids.
      */
    def setIME(imeId: String): js.Promise[Unit] = js.native
    
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
      * Set the callback for the logcat output event.
      *
      * @param listener - The listener function, which accepts one argument. The argument is
      *                              a log record object with `timestamp`, `level` and `message` properties.
      * @throws If logcat process is not running.
      */
    def setLogcatListener(listener: js.Function1[/* outputObj */ Log, Unit]): Unit = js.native
    
    /**
      * Set device property.
      * [android.provider.Settings]{@link https://developer.android.com/reference/android/provider/Settings.html}
      *
      * @param namespace - one of {system, secure, global}, case-insensitive.
      * @param setting - property name.
      * @param value - property value.
      * @return command output.
      */
    def setSetting(namespace: String, setting: String, value: String): js.Promise[String] = js.native
    def setSetting(namespace: String, setting: String, value: Double): js.Promise[String] = js.native
    
    /**
      * Change the state of WiFi and/or Data transfer on the device under test.
      *
      * @param wifi - True to enable and false to disable WiFi.
      * @param data - True to enable and false to disable Data transfer.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    def setWifiAndData(options: Data): js.Promise[Unit] = js.native
    def setWifiAndData(options: Data, isEmulator: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Change the state of WiFi on the device under test.
      *
      * @param on - True to enable and false to disable it.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    def setWifiState(on: Boolean): js.Promise[Unit] = js.native
    def setWifiState(on: Boolean, isEmulator: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Execute the given command using _adb shell_ prefix.
      *
      * @param cmd - The array of rest command line parameters or a single
      *                                      string parameter.
      * @param opts [{}] - Additional options mapping.
      * @return - Command's stdout.
      * @throws If the command returned non-zero exit code.
      */
    def shell(cmd: String): js.Promise[String] = js.native
    def shell(cmd: String, opts: ShellExecOptions): js.Promise[String] = js.native
    def shell(cmd: js.Array[String]): js.Promise[String] = js.native
    def shell(cmd: js.Array[String], opts: ShellExecOptions): js.Promise[String] = js.native
    
    /**
      * Creates chunks for the given arguments and executes them in `adb shell`.
      * This is faster than calling `adb shell` separately for each arg, however
      * there is a limit for a maximum length of a single adb command. that is why
      * we need all this complicated logic.
      *
      * @param argTransformer A function, that receives single argument
      * from the `args` array and transforms it into a shell command. The result
      * of the function must be an array, where each item is a part of a single command.
      * The last item of the array could be ';'. If this is not a semicolon then it is going to
      * be added automatically.
      * @param args Array of argument values to create chunks for
      * @throws If any of the chunks returns non-zero exit code after being executed
      */
    def shellChunks[A /* <: Double | String */](argTransformer: js.Function1[/* arg */ A, js.Array[String]], args: js.Array[A]): js.Promise[Unit] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with either
      * custom or default certificate based on _this.useKeystore_ property value
      * and Zip-aligns it after signing.
      *
      * @param appPath - The full path to the local .apk(s) file.
      * @throws If signing fails.
      */
    def sign(appPath: String): js.Promise[Unit] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with a custom certificate.
      *
      * @param apk - The full path to the local apk file.
      * @throws If signing fails.
      */
    def signWithCustomCert(apk: String): js.Promise[Unit] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with the default certificate.
      *
      * @param apk - The full path to the local apk file.
      * @throws If signing fails.
      */
    def signWithDefaultCert(apk: String): js.Promise[Unit] = js.native
    
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
      * Start the logcat process to gather logs.
      *
      * @throws If restart fails.
      */
    def startLogcat(): js.Promise[Unit] = js.native
    def startLogcat(opts: LogcatOpts): js.Promise[Unit] = js.native
    
    /**
      * Start the particular URI on the device under test.
      *
      * @param uri - The name of URI to start.
      * @param pkg - The name of the package to start the URI with.
      */
    def startUri(uri: String, pkg: String): js.Promise[Unit] = js.native
    def startUri(uri: String, pkg: String, opts: StartUriOptions): js.Promise[Unit] = js.native
    
    /**
      * Stop the particular package if it is running and clears its application data.
      *
      * @param pkg - The package name to be processed.
      */
    def stopAndClear(pkg: String): js.Promise[Unit] = js.native
    
    /**
      * Stop the active logcat process which gathers logs.
      * The call will be ignored if no logcat process is running.
      */
    def stopLogcat(): js.Promise[Unit] = js.native
    
    var suppressKillServer: Boolean = js.native
    
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
    
    var tmpDir: String = js.native
    
    /**
      * Toggle the state of GPS location provider.
      *
      * @param enabled - Whether to enable (true) or disable (false) the GPS provider.
      */
    def toggleGPSLocationProvider(enabled: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Types the given Unicode string.
      * It is expected that the focus is already put
      * to the destination input field before this method is called.
      *
      * @param text The string to type
      * @returns `true` if the input text has been successfully sent to adb
      */
    def typeUnicode(text: String): js.Promise[Boolean] = js.native
    
    var udid: String = js.native
    
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
      * Switch adb server to non-root mode.
      */
    def unroot(): js.Promise[RootResult] = js.native
    
    var useKeystore: Boolean = js.native
    
    /**
      * Verify the emulator is connected.
      *
      * @throws If Emulator is not visible to adb.
      */
    def verifyEmulatorConnected(): js.Promise[Unit] = js.native
    
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
      * Check if the current device is ready to accept further commands (booting completed).
      *
      * @param appDeviceReadyTimeout [30] - The maximum number of seconds to wait.
      * @throws If the device is not ready within the given timeout.
      */
    def waitForDevice(): js.Promise[Unit] = js.native
    def waitForDevice(appDeviceReadyTimeout: Double): js.Promise[Unit] = js.native
    
    /**
      * Check if the current emulator is ready to accept further commands (booting completed).
      *
      * @param timeoutMs [20000] - The maximum number of milliseconds to wait.
      * @throws If the emulator is not ready within the given timeout.
      */
    def waitForEmulatorReady(): js.Promise[Unit] = js.native
    def waitForEmulatorReady(timeoutMs: String): js.Promise[Unit] = js.native
    
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
    
    /**
      * Perform zip-aligning to the given local apk file.
      *
      * @param apk - The full path to the local apk file.
      * @returns True if the apk has been successfully aligned
      * or false if the apk has been already aligned.
      * @throws If zip-align fails.
      */
    def zipAlignApk(apk: String): js.Promise[Boolean] = js.native
  }
  object ADB {
    
    @JSImport("appium-adb/lib/adb", "ADB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createADB(): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")().asInstanceOf[js.Promise[ADB]]
    inline def createADB(opts: CreateAdbOptions): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ADB]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("appium-adb/lib/adb", "ADB")
  @js.native
  open class ADBCls ()
    extends StObject
       with ADB {
    def this(opts: CreateAdbOptions) = this()
  }
  
  @JSImport("appium-adb/lib/adb", "DEFAULT_ADB_PORT")
  @js.native
  val DEFAULT_ADB_PORT: Double = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("appium-adb/lib/adb", JSImport.Default)
  @js.native
  open class defaultCls ()
    extends StObject
       with ADB {
    def this(opts: CreateAdbOptions) = this()
  }
  
  inline def getAndroidBinaryPath(binaryName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidBinaryPath")(binaryName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getSdkRootFromEnv(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkRootFromEnv")().asInstanceOf[js.UndefOr[String]]
  
  trait AdbExecutable extends StObject {
    
    var defaultArgs: js.Array[String]
    
    var path: String
  }
  object AdbExecutable {
    
    inline def apply(defaultArgs: js.Array[String], path: String): AdbExecutable = {
      val __obj = js.Dynamic.literal(defaultArgs = defaultArgs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdbExecutable]
    }
    
    extension [Self <: AdbExecutable](x: Self) {
      
      inline def setDefaultArgs(value: js.Array[String]): Self = StObject.set(x, "defaultArgs", value.asInstanceOf[js.Any])
      
      inline def setDefaultArgsVarargs(value: String*): Self = StObject.set(x, "defaultArgs", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateAdbOptions extends StObject {
    
    var adbExecTimeout: js.UndefOr[Double] = js.undefined
    
    var adbPort: js.UndefOr[Double] = js.undefined
    
    var allowDelayAdb: js.UndefOr[Boolean] = js.undefined
    
    var allowOfflineDevices: js.UndefOr[Boolean] = js.undefined
    
    var appDeviceReadyTimeout: js.UndefOr[Double | Null] = js.undefined
    
    var binaries: js.UndefOr[PartialRecordBinaryNamest] = js.undefined
    
    var buildToolsVersion: js.UndefOr[String | Null] = js.undefined
    
    var curDeviceId: js.UndefOr[String | Null] = js.undefined
    
    var emulatorPort: js.UndefOr[Double | Null] = js.undefined
    
    var executable: js.UndefOr[PartialAdbExecutable] = js.undefined
    
    var instrumentProc: js.UndefOr[SubProcess | Null] = js.undefined
    
    var keyAlias: js.UndefOr[String | Null] = js.undefined
    
    var keyPassword: js.UndefOr[String | Null] = js.undefined
    
    var keystorePassword: js.UndefOr[String | Null] = js.undefined
    
    var keystorePath: js.UndefOr[String | Null] = js.undefined
    
    var remoteAppsCacheLimit: js.UndefOr[Double] = js.undefined
    
    var sdkRoot: js.UndefOr[String | Null] = js.undefined
    
    var suppressKillServer: js.UndefOr[Boolean | Null] = js.undefined
    
    var tmpDir: js.UndefOr[String] = js.undefined
    
    var udid: js.UndefOr[String | Null] = js.undefined
    
    var useKeystore: js.UndefOr[Boolean | Null] = js.undefined
  }
  object CreateAdbOptions {
    
    inline def apply(): CreateAdbOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAdbOptions]
    }
    
    extension [Self <: CreateAdbOptions](x: Self) {
      
      inline def setAdbExecTimeout(value: Double): Self = StObject.set(x, "adbExecTimeout", value.asInstanceOf[js.Any])
      
      inline def setAdbExecTimeoutUndefined: Self = StObject.set(x, "adbExecTimeout", js.undefined)
      
      inline def setAdbPort(value: Double): Self = StObject.set(x, "adbPort", value.asInstanceOf[js.Any])
      
      inline def setAdbPortUndefined: Self = StObject.set(x, "adbPort", js.undefined)
      
      inline def setAllowDelayAdb(value: Boolean): Self = StObject.set(x, "allowDelayAdb", value.asInstanceOf[js.Any])
      
      inline def setAllowDelayAdbUndefined: Self = StObject.set(x, "allowDelayAdb", js.undefined)
      
      inline def setAllowOfflineDevices(value: Boolean): Self = StObject.set(x, "allowOfflineDevices", value.asInstanceOf[js.Any])
      
      inline def setAllowOfflineDevicesUndefined: Self = StObject.set(x, "allowOfflineDevices", js.undefined)
      
      inline def setAppDeviceReadyTimeout(value: Double): Self = StObject.set(x, "appDeviceReadyTimeout", value.asInstanceOf[js.Any])
      
      inline def setAppDeviceReadyTimeoutNull: Self = StObject.set(x, "appDeviceReadyTimeout", null)
      
      inline def setAppDeviceReadyTimeoutUndefined: Self = StObject.set(x, "appDeviceReadyTimeout", js.undefined)
      
      inline def setBinaries(value: PartialRecordBinaryNamest): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setBuildToolsVersion(value: String): Self = StObject.set(x, "buildToolsVersion", value.asInstanceOf[js.Any])
      
      inline def setBuildToolsVersionNull: Self = StObject.set(x, "buildToolsVersion", null)
      
      inline def setBuildToolsVersionUndefined: Self = StObject.set(x, "buildToolsVersion", js.undefined)
      
      inline def setCurDeviceId(value: String): Self = StObject.set(x, "curDeviceId", value.asInstanceOf[js.Any])
      
      inline def setCurDeviceIdNull: Self = StObject.set(x, "curDeviceId", null)
      
      inline def setCurDeviceIdUndefined: Self = StObject.set(x, "curDeviceId", js.undefined)
      
      inline def setEmulatorPort(value: Double): Self = StObject.set(x, "emulatorPort", value.asInstanceOf[js.Any])
      
      inline def setEmulatorPortNull: Self = StObject.set(x, "emulatorPort", null)
      
      inline def setEmulatorPortUndefined: Self = StObject.set(x, "emulatorPort", js.undefined)
      
      inline def setExecutable(value: PartialAdbExecutable): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
      
      inline def setInstrumentProc(value: SubProcess): Self = StObject.set(x, "instrumentProc", value.asInstanceOf[js.Any])
      
      inline def setInstrumentProcNull: Self = StObject.set(x, "instrumentProc", null)
      
      inline def setInstrumentProcUndefined: Self = StObject.set(x, "instrumentProc", js.undefined)
      
      inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
      
      inline def setKeyAliasNull: Self = StObject.set(x, "keyAlias", null)
      
      inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
      
      inline def setKeyPassword(value: String): Self = StObject.set(x, "keyPassword", value.asInstanceOf[js.Any])
      
      inline def setKeyPasswordNull: Self = StObject.set(x, "keyPassword", null)
      
      inline def setKeyPasswordUndefined: Self = StObject.set(x, "keyPassword", js.undefined)
      
      inline def setKeystorePassword(value: String): Self = StObject.set(x, "keystorePassword", value.asInstanceOf[js.Any])
      
      inline def setKeystorePasswordNull: Self = StObject.set(x, "keystorePassword", null)
      
      inline def setKeystorePasswordUndefined: Self = StObject.set(x, "keystorePassword", js.undefined)
      
      inline def setKeystorePath(value: String): Self = StObject.set(x, "keystorePath", value.asInstanceOf[js.Any])
      
      inline def setKeystorePathNull: Self = StObject.set(x, "keystorePath", null)
      
      inline def setKeystorePathUndefined: Self = StObject.set(x, "keystorePath", js.undefined)
      
      inline def setRemoteAppsCacheLimit(value: Double): Self = StObject.set(x, "remoteAppsCacheLimit", value.asInstanceOf[js.Any])
      
      inline def setRemoteAppsCacheLimitUndefined: Self = StObject.set(x, "remoteAppsCacheLimit", js.undefined)
      
      inline def setSdkRoot(value: String): Self = StObject.set(x, "sdkRoot", value.asInstanceOf[js.Any])
      
      inline def setSdkRootNull: Self = StObject.set(x, "sdkRoot", null)
      
      inline def setSdkRootUndefined: Self = StObject.set(x, "sdkRoot", js.undefined)
      
      inline def setSuppressKillServer(value: Boolean): Self = StObject.set(x, "suppressKillServer", value.asInstanceOf[js.Any])
      
      inline def setSuppressKillServerNull: Self = StObject.set(x, "suppressKillServer", null)
      
      inline def setSuppressKillServerUndefined: Self = StObject.set(x, "suppressKillServer", js.undefined)
      
      inline def setTmpDir(value: String): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
      
      inline def setTmpDirUndefined: Self = StObject.set(x, "tmpDir", js.undefined)
      
      inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
      
      inline def setUdidNull: Self = StObject.set(x, "udid", null)
      
      inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
      
      inline def setUseKeystore(value: Boolean): Self = StObject.set(x, "useKeystore", value.asInstanceOf[js.Any])
      
      inline def setUseKeystoreNull: Self = StObject.set(x, "useKeystore", null)
      
      inline def setUseKeystoreUndefined: Self = StObject.set(x, "useKeystore", js.undefined)
    }
  }
}
