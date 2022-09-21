package typings.appiumAdb

import typings.appiumAdb.anon.AdbExecOptionsoutputForma
import typings.appiumAdb.anon.ConnectedDevicesOptionsve
import typings.appiumAdb.anon.FULL
import typings.appiumAdb.appiumAdbBooleans.`false`
import typings.appiumAdb.appiumAdbNumbers.`20000`
import typings.appiumAdb.appiumAdbStrings.`null`
import typings.appiumAdb.appiumAdbStrings.device
import typings.appiumAdb.appiumAdbStrings.full
import typings.appiumAdb.appiumAdbStrings.offline
import typings.appiumAdb.appiumAdbStrings.stdout
import typings.appiumAdb.appiumAdbStrings.undefined
import typings.node.bufferMod.global.Buffer
import typings.semver.mod.SemVer
import typings.std.Record
import typings.teenProcess.mod.ExecOptions
import typings.teenProcess.mod.SubProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCallsMod {
  
  @JSImport("appium-adb/lib/tools/system-calls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("appium-adb/lib/tools/system-calls", JSImport.Default)
  @js.native
  val default: SystemCalls = js.native
  
  @JSImport("appium-adb/lib/tools/system-calls", "DEFAULT_ADB_EXEC_TIMEOUT")
  @js.native
  val DEFAULT_ADB_EXEC_TIMEOUT: `20000` = js.native
  
  inline def getAndroidBinaryPath(binaryName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidBinaryPath")(binaryName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait AdbExecOptions
    extends StObject
       with ExecOptions {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: js.UndefOr[stdout | full | undefined] = js.undefined
  }
  object AdbExecOptions {
    
    inline def apply(): AdbExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdbExecOptions]
    }
    
    extension [Self <: AdbExecOptions](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setOutputFormat(value: stdout | full | undefined): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    }
  }
  
  trait AvdLaunchOptions extends StObject {
    
    /**
      * Additional emulator command line arguments
      */
    var args: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Emulator system country
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * Additional emulator environment variables
      */
    var env: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Emulator system language
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Emulator startup timeout in milliseconds
      * @default 60000
      */
    var launchTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum period of time to wait until Emulator
      * is ready for usage in milliseconds
      * @default 60000
      */
    var readyTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of startup retries
      * @default 1
      */
    var retryTimes: js.UndefOr[Double] = js.undefined
  }
  object AvdLaunchOptions {
    
    inline def apply(): AvdLaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvdLaunchOptions]
    }
    
    extension [Self <: AvdLaunchOptions](x: Self) {
      
      inline def setArgs(value: String | js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setEnv(value: Record[String, String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLaunchTimeout(value: Double): Self = StObject.set(x, "launchTimeout", value.asInstanceOf[js.Any])
      
      inline def setLaunchTimeoutUndefined: Self = StObject.set(x, "launchTimeout", js.undefined)
      
      inline def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
      
      inline def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
      
      inline def setRetryTimes(value: Double): Self = StObject.set(x, "retryTimes", value.asInstanceOf[js.Any])
      
      inline def setRetryTimesUndefined: Self = StObject.set(x, "retryTimes", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.aapt
    - typings.appiumAdb.appiumAdbStrings.aapt2
    - typings.appiumAdb.appiumAdbStrings.adb
    - typings.appiumAdb.appiumAdbStrings.apkanalyzer
    - typings.appiumAdb.appiumAdbStrings.apksignerDotjar
    - typings.appiumAdb.appiumAdbStrings.bundletool
    - typings.appiumAdb.appiumAdbStrings.zipalign
  */
  trait BinaryName extends StObject
  object BinaryName {
    
    inline def aapt: typings.appiumAdb.appiumAdbStrings.aapt = "aapt".asInstanceOf[typings.appiumAdb.appiumAdbStrings.aapt]
    
    inline def aapt2: typings.appiumAdb.appiumAdbStrings.aapt2 = "aapt2".asInstanceOf[typings.appiumAdb.appiumAdbStrings.aapt2]
    
    inline def adb: typings.appiumAdb.appiumAdbStrings.adb = "adb".asInstanceOf[typings.appiumAdb.appiumAdbStrings.adb]
    
    inline def apkanalyzer: typings.appiumAdb.appiumAdbStrings.apkanalyzer = "apkanalyzer".asInstanceOf[typings.appiumAdb.appiumAdbStrings.apkanalyzer]
    
    inline def apksignerDotjar: typings.appiumAdb.appiumAdbStrings.apksignerDotjar = "apksigner.jar".asInstanceOf[typings.appiumAdb.appiumAdbStrings.apksignerDotjar]
    
    inline def bundletool: typings.appiumAdb.appiumAdbStrings.bundletool = "bundletool".asInstanceOf[typings.appiumAdb.appiumAdbStrings.bundletool]
    
    inline def zipalign: typings.appiumAdb.appiumAdbStrings.zipalign = "zipalign".asInstanceOf[typings.appiumAdb.appiumAdbStrings.zipalign]
  }
  
  trait BinaryVersion extends StObject {
    
    /**
      * The ADB binary build number
      */
    var build: Double
    
    /**
      * The ADB binary version number
      */
    var version: SemVer
  }
  object BinaryVersion {
    
    inline def apply(build: Double, version: SemVer): BinaryVersion = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryVersion]
    }
    
    extension [Self <: BinaryVersion](x: Self) {
      
      inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: SemVer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait BridgeVersion extends StObject {
    
    /**
      * The Android Debug Bridge version number
      */
    var version: SemVer
  }
  object BridgeVersion {
    
    inline def apply(version: SemVer): BridgeVersion = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeVersion]
    }
    
    extension [Self <: BridgeVersion](x: Self) {
      
      inline def setVersion(value: SemVer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectedDevicesOptions extends StObject {
    
    /**
      * Whether to get long output, which includes extra properties in each device.
      * Akin to running `adb devices -l`.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectedDevicesOptions {
    
    inline def apply(): ConnectedDevicesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectedDevicesOptions]
    }
    
    extension [Self <: ConnectedDevicesOptions](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Device extends StObject {
    
    /** Current device state, as it is visible in _adb devices -l_ output. */
    var state: String
    
    /** The device udid. */
    var udid: String
  }
  object Device {
    
    inline def apply(state: String, udid: String): Device = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], udid = udid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecResult extends StObject {
    
    var stderr: String
    
    var stdout: String
  }
  object ExecResult {
    
    inline def apply(stderr: String, stdout: String): ExecResult = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecResult]
    }
    
    extension [Self <: ExecResult](x: Self) {
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootResult extends StObject {
    
    /**
      * True if the call to root/unroot was successful
      */
    var isSuccessful: Boolean
    
    /**
      * True if the device was already rooted
      */
    var wasAlreadyRooted: Boolean
  }
  object RootResult {
    
    inline def apply(isSuccessful: Boolean, wasAlreadyRooted: Boolean): RootResult = {
      val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any], wasAlreadyRooted = wasAlreadyRooted.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootResult]
    }
    
    extension [Self <: RootResult](x: Self) {
      
      inline def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
      
      inline def setWasAlreadyRooted(value: Boolean): Self = StObject.set(x, "wasAlreadyRooted", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShellExecOptions
    extends StObject
       with ExecOptions {
    
    /** @default [falsy] Whether to keep root mode after command execution is completed. */
    var keepPrivileged: js.UndefOr[Boolean] = js.undefined
    
    /** @default [falsy] Whether to run the given command as root. */
    var privileged: js.UndefOr[Boolean] = js.undefined
  }
  object ShellExecOptions {
    
    inline def apply(): ShellExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellExecOptions]
    }
    
    extension [Self <: ShellExecOptions](x: Self) {
      
      inline def setKeepPrivileged(value: Boolean): Self = StObject.set(x, "keepPrivileged", value.asInstanceOf[js.Any])
      
      inline def setKeepPrivilegedUndefined: Self = StObject.set(x, "keepPrivileged", js.undefined)
      
      inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
      
      inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    }
  }
  
  @js.native
  trait SystemCalls extends StObject {
    
    var EXEC_OUTPUT_FORMAT: FULL = js.native
    
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
    
    /**
      * Switch adb server root privileges.
      * @param isElevated - Should we elevate to to root or unroot? (default true)
      */
    def changeUserPrivileges(isElevated: Boolean): js.Promise[RootResult] = js.native
    
    def createSubProcess(): SubProcess = js.native
    def createSubProcess(args: js.Array[String]): SubProcess = js.native
    
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
      * Retrieve the current adb port.
      * @todo can probably deprecate this now that the logic is just to read this.adbPort
      * @return The current adb port number.
      */
    def getAdbServerPort(): Double = js.native
    
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
      * Retrieve the current emulator port from _adb devives_ output.
      *
      * @return The current emulator port.
      * @throws If there are no connected devices.
      */
    def getEmulatorPort(): js.Promise[Double] = js.native
    
    /**
      * Retrieve the current emulator port by parsing emulator name string.
      *
      * @param emStr - Emulator name string.
      * @return Either the current emulator port or
      *                          _false_ if port number cannot be parsed.
      */
    def getPortFromEmulatorString(emStr: String): Double | `false` = js.native
    
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
      * Retrieve full path to the given binary.
      *
      * @param binaryName - The name of the binary.
      * @return Full path to the given binary including current SDK root.
      */
    def getSdkBinaryPath(binaryName: String): js.Promise[String] = js.native
    
    /**
      * Get the adb version. The result of this method is cached.
      *
      * @return The current adb version.
      * @throws If it is not possible to parse adb version.
      */
    def getVersion(): js.Promise[Version] = js.native
    
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
      * Reset Telnet authentication token.
      * @see {@link http://tools.android.com/recent/emulator2516releasenotes} for more details.
      *
      * @returns If token reset was successful.
      */
    def resetTelnetAuthToken(): js.Promise[Boolean] = js.native
    
    /**
      * Restart adb server, unless _this.suppressKillServer_ property is true.
      */
    def restartAdb(): js.Promise[Unit] = js.native
    
    /**
      * Switch adb server to root mode.
      */
    def root(): js.Promise[RootResult] = js.native
    
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
      * Set _emulatorPort_ property of the current class.
      *
      * @param emPort - The emulator port to be set.
      */
    def setEmulatorPort(emPort: Double): Unit = js.native
    
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
      * Switch adb server to non-root mode.
      */
    def unroot(): js.Promise[RootResult] = js.native
    
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
  }
  
  trait VerboseDevice
    extends StObject
       with Device {
    
    /** The device codename, such as "flow". */
    var device: String
    
    /** The model name of the device, such as "Nexus_7". */
    var model: String
    
    /** The product codename of the device, such as "razor". */
    var product: String
    
    /** The Transport ID for the device, such as "1". */
    var transport_id: js.UndefOr[String] = js.undefined
    
    /** Represents the USB port the device is connected to, such as "1-1". */
    var usb: js.UndefOr[String] = js.undefined
  }
  object VerboseDevice {
    
    inline def apply(device: String, model: String, product: String, state: String, udid: String): VerboseDevice = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], udid = udid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerboseDevice]
    }
    
    extension [Self <: VerboseDevice](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setTransport_id(value: String): Self = StObject.set(x, "transport_id", value.asInstanceOf[js.Any])
      
      inline def setTransport_idUndefined: Self = StObject.set(x, "transport_id", js.undefined)
      
      inline def setUsb(value: String): Self = StObject.set(x, "usb", value.asInstanceOf[js.Any])
      
      inline def setUsbUndefined: Self = StObject.set(x, "usb", js.undefined)
    }
  }
  
  trait Version extends StObject {
    
    /**
      * This version number might not be
      * be present for older ADB releases.
      */
    var binary: js.UndefOr[BinaryVersion] = js.undefined
    
    var bridge: BridgeVersion
  }
  object Version {
    
    inline def apply(bridge: BridgeVersion): Version = {
      val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setBinary(value: BinaryVersion): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setBridge(value: BridgeVersion): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    }
  }
}
