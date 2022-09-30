package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.anon.ACCELERATION
import typings.appiumAdb.anon.EDGE
import typings.appiumAdb.anon.GSMACCEPT
import typings.appiumAdb.anon.GSMVOICEDENIED
import typings.appiumAdb.anon.POWERACOFF
import typings.appiumAdb.appiumAdbInts.`0`
import typings.appiumAdb.appiumAdbInts.`1`
import typings.appiumAdb.appiumAdbInts.`2`
import typings.appiumAdb.appiumAdbInts.`3`
import typings.appiumAdb.appiumAdbInts.`4`
import typings.appiumAdb.appiumAdbStrings.acceleration
import typings.appiumAdb.appiumAdbStrings.accept
import typings.appiumAdb.appiumAdbStrings.call
import typings.appiumAdb.appiumAdbStrings.cancel
import typings.appiumAdb.appiumAdbStrings.denied
import typings.appiumAdb.appiumAdbStrings.edge
import typings.appiumAdb.appiumAdbStrings.evdo
import typings.appiumAdb.appiumAdbStrings.full
import typings.appiumAdb.appiumAdbStrings.gprs
import typings.appiumAdb.appiumAdbStrings.gsm
import typings.appiumAdb.appiumAdbStrings.hold
import typings.appiumAdb.appiumAdbStrings.home
import typings.appiumAdb.appiumAdbStrings.hsdpa
import typings.appiumAdb.appiumAdbStrings.humidity
import typings.appiumAdb.appiumAdbStrings.light
import typings.appiumAdb.appiumAdbStrings.lte
import typings.appiumAdb.appiumAdbStrings.off
import typings.appiumAdb.appiumAdbStrings.on
import typings.appiumAdb.appiumAdbStrings.pressure
import typings.appiumAdb.appiumAdbStrings.proximity
import typings.appiumAdb.appiumAdbStrings.roaming
import typings.appiumAdb.appiumAdbStrings.scsd
import typings.appiumAdb.appiumAdbStrings.searching
import typings.appiumAdb.appiumAdbStrings.temperature
import typings.appiumAdb.appiumAdbStrings.umts
import typings.appiumAdb.appiumAdbStrings.unregistered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adbEmuCommandsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/adb-emu-commands", JSImport.Default)
  @js.native
  val default: AdbEmuCommands = js.native
  
  /* Inlined {  GSM_CALL :'call',   GSM_ACCEPT :'accept',   GSM_CANCEL :'cancel',   GSM_HOLD :'hold'}[keyof {  GSM_CALL :'call',   GSM_ACCEPT :'accept',   GSM_CANCEL :'cancel',   GSM_HOLD :'hold'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.call
    - typings.appiumAdb.appiumAdbStrings.accept
    - typings.appiumAdb.appiumAdbStrings.cancel
    - typings.appiumAdb.appiumAdbStrings.hold
  */
  trait GSM_CALL_ACTIONS extends StObject
  object GSM_CALL_ACTIONS {
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_CALL_ACTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_CALL_ACTIONS.GSM_ACCEPT")
    @js.native
    def GSM_ACCEPT: accept = js.native
    inline def GSM_ACCEPT_=(x: accept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_ACCEPT")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_CALL_ACTIONS.GSM_CALL")
    @js.native
    def GSM_CALL: call = js.native
    inline def GSM_CALL_=(x: call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_CALL_ACTIONS.GSM_CANCEL")
    @js.native
    def GSM_CANCEL: cancel = js.native
    inline def GSM_CANCEL_=(x: cancel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_CALL_ACTIONS.GSM_HOLD")
    @js.native
    def GSM_HOLD: hold = js.native
    inline def GSM_HOLD_=(x: hold): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_HOLD")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  GSM_CALL :'call',   GSM_ACCEPT :'accept',   GSM_CANCEL :'cancel',   GSM_HOLD :'hold'}[keyof {  GSM_CALL :'call',   GSM_ACCEPT :'accept',   GSM_CANCEL :'cancel',   GSM_HOLD :'hold'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.call
    - typings.appiumAdb.appiumAdbStrings.accept
    - typings.appiumAdb.appiumAdbStrings.cancel
    - typings.appiumAdb.appiumAdbStrings.hold
  */
  trait GSM_VOICE_STATES extends StObject
  object GSM_VOICE_STATES {
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_DENIED")
    @js.native
    def GSM_VOICE_DENIED: denied = js.native
    inline def GSM_VOICE_DENIED_=(x: denied): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_DENIED")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_HOME")
    @js.native
    def GSM_VOICE_HOME: home = js.native
    inline def GSM_VOICE_HOME_=(x: home): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_HOME")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_OFF")
    @js.native
    def GSM_VOICE_OFF: off = js.native
    inline def GSM_VOICE_OFF_=(x: off): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_ON")
    @js.native
    def GSM_VOICE_ON: on = js.native
    inline def GSM_VOICE_ON_=(x: on): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_ROAMING")
    @js.native
    def GSM_VOICE_ROAMING: roaming = js.native
    inline def GSM_VOICE_ROAMING_=(x: roaming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_ROAMING")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_SEARCHING")
    @js.native
    def GSM_VOICE_SEARCHING: searching = js.native
    inline def GSM_VOICE_SEARCHING_=(x: searching): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_SEARCHING")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "GSM_VOICE_STATES.GSM_VOICE_UNREGISTERED")
    @js.native
    def GSM_VOICE_UNREGISTERED: unregistered = js.native
    inline def GSM_VOICE_UNREGISTERED_=(x: unregistered): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM_VOICE_UNREGISTERED")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  GSM :'gsm',   SCSD :'scsd',   GPRS :'gprs',   EDGE :'edge',   UMTS :'umts',   HSDPA :'hsdpa',   LTE :'lte',   EVDO :'evdo',   FULL :'full'}[keyof {  GSM :'gsm',   SCSD :'scsd',   GPRS :'gprs',   EDGE :'edge',   UMTS :'umts',   HSDPA :'hsdpa',   LTE :'lte',   EVDO :'evdo',   FULL :'full'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.edge
    - typings.appiumAdb.appiumAdbStrings.evdo
    - typings.appiumAdb.appiumAdbStrings.lte
    - typings.appiumAdb.appiumAdbStrings.gprs
    - typings.appiumAdb.appiumAdbStrings.full
    - typings.appiumAdb.appiumAdbStrings.umts
    - typings.appiumAdb.appiumAdbStrings.scsd
    - typings.appiumAdb.appiumAdbStrings.hsdpa
    - typings.appiumAdb.appiumAdbStrings.gsm
  */
  trait NETWORK_SPEED extends StObject
  object NETWORK_SPEED {
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED")
    @js.native
    val ^ : js.Any = js.native
    
    // GPRS (up: 28.8, down: 57.6).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.EDGE")
    @js.native
    def EDGE: edge = js.native
    inline def EDGE_=(x: edge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE")(x.asInstanceOf[js.Any])
    
    // LTE (up: 58,000, down: 173,000).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.EVDO")
    @js.native
    def EVDO: evdo = js.native
    inline def EVDO_=(x: evdo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVDO")(x.asInstanceOf[js.Any])
    
    // EVDO (up: 75,000, down: 280,000).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.FULL")
    @js.native
    def FULL: full = js.native
    inline def FULL_=(x: full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL")(x.asInstanceOf[js.Any])
    
    // HSCSD (up: 14.4, down: 57.6).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.GPRS")
    @js.native
    def GPRS: gprs = js.native
    inline def GPRS_=(x: gprs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GPRS")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.GSM")
    @js.native
    def GSM: gsm = js.native
    inline def GSM_=(x: gsm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSM")(x.asInstanceOf[js.Any])
    
    // UMTS/3G (up: 384.0, down: 384.0).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.HSDPA")
    @js.native
    def HSDPA: hsdpa = js.native
    inline def HSDPA_=(x: hsdpa): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSDPA")(x.asInstanceOf[js.Any])
    
    // HSDPA (up: 5760.0, down: 13,980.0).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.LTE")
    @js.native
    def LTE: lte = js.native
    inline def LTE_=(x: lte): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LTE")(x.asInstanceOf[js.Any])
    
    // GSM/CSD (up: 14.4, down: 14.4).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.SCSD")
    @js.native
    def SCSD: scsd = js.native
    inline def SCSD_=(x: scsd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCSD")(x.asInstanceOf[js.Any])
    
    // EDGE/EGPRS (up: 473.6, down: 473.6).
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "NETWORK_SPEED.UMTS")
    @js.native
    def UMTS: umts = js.native
    inline def UMTS_=(x: umts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UMTS")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  POWER_AC_ON :'on',   POWER_AC_OFF :'off'}[keyof {  POWER_AC_ON :'on',   POWER_AC_OFF :'off'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.on
    - typings.appiumAdb.appiumAdbStrings.off
  */
  trait POWER_AC_STATES extends StObject
  object POWER_AC_STATES {
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "POWER_AC_STATES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "POWER_AC_STATES.POWER_AC_OFF")
    @js.native
    def POWER_AC_OFF: off = js.native
    inline def POWER_AC_OFF_=(x: off): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POWER_AC_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "POWER_AC_STATES.POWER_AC_ON")
    @js.native
    def POWER_AC_ON: on = js.native
    inline def POWER_AC_ON_=(x: on): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POWER_AC_ON")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  ACCELERATION :'acceleration',   LIGHT :'light',   PROXIMITY :'proximity',   TEMPERATURE :'temperature',   PRESSURE :'pressure',   HUMIDITY :'humidity'}[keyof {  ACCELERATION :'acceleration',   LIGHT :'light',   PROXIMITY :'proximity',   TEMPERATURE :'temperature',   PRESSURE :'pressure',   HUMIDITY :'humidity'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.appiumAdb.appiumAdbStrings.proximity
    - typings.appiumAdb.appiumAdbStrings.light
    - typings.appiumAdb.appiumAdbStrings.pressure
    - typings.appiumAdb.appiumAdbStrings.temperature
    - typings.appiumAdb.appiumAdbStrings.acceleration
    - typings.appiumAdb.appiumAdbStrings.humidity
  */
  trait SENSORS extends StObject
  object SENSORS {
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.ACCELERATION")
    @js.native
    def ACCELERATION: acceleration = js.native
    inline def ACCELERATION_=(x: acceleration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCELERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.HUMIDITY")
    @js.native
    def HUMIDITY: humidity = js.native
    inline def HUMIDITY_=(x: humidity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HUMIDITY")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.LIGHT")
    @js.native
    def LIGHT: light = js.native
    inline def LIGHT_=(x: light): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.PRESSURE")
    @js.native
    def PRESSURE: pressure = js.native
    inline def PRESSURE_=(x: pressure): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSURE")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.PROXIMITY")
    @js.native
    def PROXIMITY: proximity = js.native
    inline def PROXIMITY_=(x: proximity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROXIMITY")(x.asInstanceOf[js.Any])
    
    @JSImport("appium-adb/lib/tools/adb-emu-commands", "SENSORS.TEMPERATURE")
    @js.native
    def TEMPERATURE: temperature = js.native
    inline def TEMPERATURE_=(x: temperature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPERATURE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AdbEmuCommands extends StObject {
    
    var GSM_CALL_ACTIONS: GSMACCEPT = js.native
    
    var GSM_SIGNAL_STRENGTHS: js.Tuple5[`0`, `1`, `2`, `3`, `4`] = js.native
    
    var GSM_VOICE_STATES: GSMVOICEDENIED = js.native
    
    var NETWORK_SPEED: EDGE = js.native
    
    var POWER_AC_STATES: POWERACOFF = js.native
    
    var SENSORS: ACCELERATION = js.native
    
    /**
      * Check if given emulator exists in the list of available avds.
      *
      * @param avdName - The name of emulator to verify for existence.
      * Should NOT start with '@' character
      * @throws If the emulator with given name does not exist.
      */
    def checkAvdExist(avdName: String): js.Promise[Unit] = js.native
    
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
    
    /**
      * Emulate fingerprint touch event on the connected emulator.
      *
      * @param fingerprintId - The ID of the fingerprint.
      */
    def fingerprint(fingerprintId: String): js.Promise[Unit] = js.native
    
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
      * Check the emulator state.
      *
      * @return True if Emulator is visible to adb.
      */
    def isEmulatorConnected(): js.Promise[Boolean] = js.native
    
    /**
      * Emulate network speed change event on the connected emulator.
      *
      * @param speed ['full'] - One of possible NETWORK_SPEED values.
      * @throws If _speed_ value is invalid.
      */
    def networkSpeed(): js.Promise[Unit] = js.native
    def networkSpeed(speed: NETWORK_SPEED): js.Promise[Unit] = js.native
    
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
      * Change the display orientation on the connected emulator.
      * The orientation is changed (PI/2 is added) every time
      * this method is called.
      */
    def rotate(): js.Promise[Unit] = js.native
    
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
      * Verify the emulator is connected.
      *
      * @throws If Emulator is not visible to adb.
      */
    def verifyEmulatorConnected(): js.Promise[Unit] = js.native
  }
  
  trait EmuInfo extends StObject {
    
    /**
      * Full path to the emulator config .ini file,
      * for example `/Users/user/.android/avd/Pixel_XL_API_30.ini`
      */
    var config: String
    
    /**
      * Emulator name, for example `Pixel_XL_API_30`
      */
    var name: String
  }
  object EmuInfo {
    
    inline def apply(config: String, name: String): EmuInfo = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmuInfo]
    }
    
    extension [Self <: EmuInfo](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmuVersionInfo extends StObject {
    
    /**
      * The build identifier, for example 6306047
      */
    var buildId: js.UndefOr[Double] = js.undefined
    
    /**
      * The actual revision number, for example '30.0.5'
      */
    var revision: js.UndefOr[String] = js.undefined
  }
  object EmuVersionInfo {
    
    inline def apply(): EmuVersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmuVersionInfo]
    }
    
    extension [Self <: EmuVersionInfo](x: Self) {
      
      inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    }
  }
  
  trait ExecTelnetOptions extends StObject {
    
    /**
      * Console connection timeout in milliseconds
      * @default 5000
      */
    var connTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * A timeout used to wait for a server
      * reply to the given command
      * @default 60000
      */
    var execTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Telnet console initialization timeout
      * in milliseconds (the time between connection happens and the command prompt
      * is available)
      * @default 5000
      */
    var initTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The emulator port number. The method will try to parse it
      * from the current device identifier if unset
      */
    var port: js.UndefOr[Double | String] = js.undefined
  }
  object ExecTelnetOptions {
    
    inline def apply(): ExecTelnetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecTelnetOptions]
    }
    
    extension [Self <: ExecTelnetOptions](x: Self) {
      
      inline def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
      
      inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
      
      inline def setExecTimeoutUndefined: Self = StObject.set(x, "execTimeout", js.undefined)
      
      inline def setInitTimeout(value: Double): Self = StObject.set(x, "initTimeout", value.asInstanceOf[js.Any])
      
      inline def setInitTimeoutUndefined: Self = StObject.set(x, "initTimeout", js.undefined)
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  type _To = AdbEmuCommands
  
  /* This means you don't have to write `default`, but can instead just say `adbEmuCommandsMod.foo` */
  override def _to: AdbEmuCommands = default
}
