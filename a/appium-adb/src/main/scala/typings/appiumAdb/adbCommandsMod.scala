package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.anon.Data
import typings.appiumAdb.logcatMod.Log
import typings.appiumAdb.logcatMod.LogcatOpts
import typings.std.RegExpExecArray
import typings.teenProcess.mod.ExecOptions
import typings.teenProcess.mod.SubProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adbCommandsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/adb-commands", JSImport.Default)
  @js.native
  val default: AdbCommands = js.native
  
  @js.native
  trait AdbCommands extends StObject {
    
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
    
    /**
      * Clear the user data of the particular application on the device
      * under test.
      *
      * @param pkg - The package name to be cleared.
      * @return The output of the corresponding adb command.
      */
    def clear(pkg: String): js.Promise[String] = js.native
    
    /**
      * Clear the active text field on the device under test by sending
      * special keyevents to it.
      *
      * @param length [100] - The maximum length of the text in the field to be cleared.
      */
    def clearTextField(): js.Promise[Unit] = js.native
    def clearTextField(length: Double): js.Promise[Unit] = js.native
    
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
      * Retrieves the list of packages from Doze whitelist on Android 8+
      *
      * @returns The list of whitelisted packages. An example output:
      * system,com.android.shell,2000
      * system,com.google.android.cellbroadcastreceiver,10143
      * user,io.appium.settings,10157
      */
    def getDeviceIdleWhitelist(): js.Promise[js.Array[String]] = js.native
    
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
      * Get TCP port forwarding with adb on the device under test.
      * @return The output of the corresponding adb command. An array contains each forwarding line of output
      */
    def getForwardList(): js.Promise[js.Array[String]] = js.native
    
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
      * Get the list of process ids for the particular process on the device under test.
      *
      * @param name - The part of process name.
      * @return The list of matched process IDs or an empty list.
      * @throws If the passed process name is not a valid one
      */
    def getPIDsByName(name: String): js.Promise[js.Array[Double]] = js.native
    
    /**
      * Retrieve the platform version of the device under test.
      *
      * @return The platform version as a string, for example '5.0' for
      * Android Lollipop.
      */
    def getPlatformVersion(): js.Promise[String] = js.native
    
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
      * Get device property.
      * [android.provider.Settings]{@link https://developer.android.com/reference/android/provider/Settings.html}
      *
      * @param namespace - one of {system, secure, global}, case-insensitive.
      * @param setting - property name.
      * @return property value.
      */
    def getSetting(namespace: String, setting: String): js.Promise[String] = js.native
    
    /**
      * Get tz database time zone formatted timezone
      *
      * @returns TZ database Time Zones format
      *
      * @throws If any exception is reported by adb shell.
      */
    def getTimeZone(): js.Promise[String] = js.native
    
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
      * Instrument the particular activity.
      *
      * @param pkg - The name of the package to be instrumented.
      * @param activity - The name of the main activity in this package.
      * @param instrumentWith - The name of the package to instrument
      *                                  the activity with.
      * @throws If any exception is reported by adb shell.
      */
    def instrument(pkg: String, activity: String, instrumentWith: String): js.Promise[Unit] = js.native
    
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
      * Checks whether incremental install feature is supported by ADB.
      * Read https://developer.android.com/preview/features#incremental
      * for more details on it.
      *
      * @returns `true` if the feature is supported by both adb and the
      * device under test
      */
    def isIncrementalInstallSupported(): js.Promise[Boolean] = js.native
    
    /**
      * Retrieve the screen lock state of the device under test.
      *
      * @return True if the device is locked.
      */
    def isScreenLocked(): js.Promise[Boolean] = js.native
    
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
    
    /**
      * Send the particular keycode to the device under test.
      *
      * @param keycode - The actual key code to be sent.
      */
    def keyevent(keycode: String): js.Promise[Unit] = js.native
    def keyevent(keycode: Double): js.Promise[Unit] = js.native
    
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
      * Recursively create a new folder on the device under test.
      *
      * @param remotePath - The new path to be created.
      * @return mkdir command output.
      */
    def mkdir(remotePath: String): js.Promise[String] = js.native
    
    /**
      * Execute ping shell command on the device under test.
      *
      * @return True if the command output contains 'ping' substring.
      * @throws If there was an error while executing 'ping' command on the
      *                 device under test.
      */
    def ping(): js.Promise[Boolean] = js.native
    
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
      * Restart the device under test using adb commands.
      *
      * @throws If start fails.
      */
    def restart(): js.Promise[Unit] = js.native
    
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
      * Executes the given function with the given input method context
      * and then restores the IME to the original value
      *
      * @param ime - Valid IME identifier
      * @param fn - Function to execute
      */
    def runInImeContext[T](ime: String, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
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
    
    /**
      * Send an arbitrary Telnet command to the device under test.
      *
      * @param command - The command to be sent.
      *
      * @return The actual output of the given command.
      */
    def sendTelnetCommand(command: String): js.Promise[String] = js.native
    
    /**
      * Change the state of Airplane mode in Settings on the device under test.
      *
      * @param on - True to enable the Airplane mode in Settings and false to disable it.
      */
    def setAirplaneMode(on: Boolean): js.Promise[Unit] = js.native
    
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
      * Start the logcat process to gather logs.
      *
      * @throws If restart fails.
      */
    def startLogcat(): js.Promise[Unit] = js.native
    def startLogcat(opts: LogcatOpts): js.Promise[Unit] = js.native
    
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
    
    /**
      * Toggle the state of GPS location provider.
      *
      * @param enabled - Whether to enable (true) or disable (false) the GPS provider.
      */
    def toggleGPSLocationProvider(enabled: Boolean): js.Promise[Unit] = js.native
  }
  
  trait ScreenrecordOptions extends StObject {
    
    /**
      * The video bit rate for the video, in megabits per second.
      * You can increase the bit rate to improve video quality,
      * but doing so results in larger movie files.
      * @default 4
      */
    var bitRate: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set it to `true` in order to display additional information on the video overlay,
      * such as a timestamp, that is helpful in videos captured to illustrate bugs.
      * This option is only supported since API level 27 (Android P).
      * @default false
      */
    var bugReport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum recording time, in seconds.
      * The default (and maximum) value is 180 (3 minutes).
      * @default 180
      */
    var timeLimit: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The format is widthxheight.
      * The default value is the device's native display resolution (if supported),
      * 1280x720 if not. For best results,
      * use a size supported by your device's Advanced Video Coding (AVC) encoder.
      * For example, "1280x720"
      */
    var videoSize: js.UndefOr[String] = js.undefined
  }
  object ScreenrecordOptions {
    
    inline def apply(): ScreenrecordOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenrecordOptions]
    }
    
    extension [Self <: ScreenrecordOptions](x: Self) {
      
      inline def setBitRate(value: String | Double): Self = StObject.set(x, "bitRate", value.asInstanceOf[js.Any])
      
      inline def setBitRateUndefined: Self = StObject.set(x, "bitRate", js.undefined)
      
      inline def setBugReport(value: Boolean): Self = StObject.set(x, "bugReport", value.asInstanceOf[js.Any])
      
      inline def setBugReportUndefined: Self = StObject.set(x, "bugReport", js.undefined)
      
      inline def setTimeLimit(value: String | Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setVideoSize(value: String): Self = StObject.set(x, "videoSize", value.asInstanceOf[js.Any])
      
      inline def setVideoSizeUndefined: Self = StObject.set(x, "videoSize", js.undefined)
    }
  }
  
  trait SetPropOptions extends StObject {
    
    /**
      * Do we run setProp as a privileged command?
      * @default true
      */
    var privileged: js.UndefOr[Boolean] = js.undefined
  }
  object SetPropOptions {
    
    inline def apply(): SetPropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetPropOptions]
    }
    
    extension [Self <: SetPropOptions](x: Self) {
      
      inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
      
      inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    }
  }
  
  type _To = AdbCommands
  
  /* This means you don't have to write `default`, but can instead just say `adbCommandsMod.foo` */
  override def _to: AdbCommands = default
}
