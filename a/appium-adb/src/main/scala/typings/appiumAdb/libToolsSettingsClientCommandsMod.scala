package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import typings.appiumAdb.anon.BigText
import typings.appiumAdb.anon.Items
import typings.appiumAdb.anon.StatusBarNotifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsSettingsClientCommandsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/settings-client-commands", JSImport.Default)
  @js.native
  val default: SettingsClientCommands = js.native
  
  trait Location extends StObject {
    
    var altitude: js.UndefOr[Double | String] = js.undefined
    
    var latitude: Double | String
    
    var longitude: Double | String
  }
  object Location {
    
    inline def apply(latitude: Double | String, longitude: Double | String): Location = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setAltitude(value: Double | String): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
      
      inline def setLatitude(value: Double | String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double | String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait SettingsAppStartupOptions extends StObject {
    
    /**
      * The maximum number of milliseconds
      * to wait until the app has started
      * @default 5000
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SettingsAppStartupOptions {
    
    inline def apply(): SettingsAppStartupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsAppStartupOptions]
    }
    
    extension [Self <: SettingsAppStartupOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait SettingsClientCommands extends StObject {
    
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
    
    /**
      * Get the current cached GPS location from the device under test.
      *
      * @returns The current location
      * @throws If the current location cannot be retrieved
      */
    def getGeoLocation(): js.Promise[Location] = js.native
    
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
      * Performs recursive media scan at the given destination.
      * All successfully scanned items are being added to the device's
      * media library.
      *
      * @param destination File/folder path on the remote device.
      * @throws If there was an unexpected error by scanning.
      */
    def scanMedia(destination: String): js.Promise[Unit] = js.native
    
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
      * Emulate geolocation coordinates on the device under test.
      *
      * @param location - Location object. The `altitude` value is ignored
      * while mocking the position.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    def setGeoLocation(location: Location): js.Promise[Unit] = js.native
    def setGeoLocation(location: Location, isEmulator: Boolean): js.Promise[Unit] = js.native
    
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
      * Types the given Unicode string.
      * It is expected that the focus is already put
      * to the destination input field before this method is called.
      *
      * @param text The string to type
      * @returns `true` if the input text has been successfully sent to adb
      */
    def typeUnicode(text: String): js.Promise[Boolean] = js.native
  }
  
  trait SmsItem extends StObject {
    
    var address: String
    
    var body: String
    
    var date: String
    
    var id: String
    
    var person: String | Null
    
    var read: String
    
    var serviceCenter: String | Null
    
    var status: String
    
    var subject: String | Null
    
    var `type`: String
  }
  object SmsItem {
    
    inline def apply(
      address: String,
      body: String,
      date: String,
      id: String,
      read: String,
      status: String,
      `type`: String
    ): SmsItem = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], person = null, serviceCenter = null, subject = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsItem]
    }
    
    extension [Self <: SmsItem](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
      
      inline def setPersonNull: Self = StObject.set(x, "person", null)
      
      inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setServiceCenter(value: String): Self = StObject.set(x, "serviceCenter", value.asInstanceOf[js.Any])
      
      inline def setServiceCenterNull: Self = StObject.set(x, "serviceCenter", null)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmsListOptions extends StObject {
    
    /**
      * The maximum count of recent messages to retrieve
      * @default 100
      */
    var max: js.UndefOr[Double] = js.undefined
  }
  object SmsListOptions {
    
    inline def apply(): SmsListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsListOptions]
    }
    
    extension [Self <: SmsListOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  trait StatusBarNotification extends StObject {
    
    var groupKey: String
    
    var id: Double
    
    var isClearable: Boolean
    
    var isGroup: Boolean
    
    var isOngoing: Boolean
    
    var isRemoved: Boolean
    
    var key: String
    
    var notification: BigText
    
    var overrideGroupKey: String | Null
    
    var packageName: String
    
    var postTime: Double
    
    var tag: String | Null
    
    var userHandle: Double
  }
  object StatusBarNotification {
    
    inline def apply(
      groupKey: String,
      id: Double,
      isClearable: Boolean,
      isGroup: Boolean,
      isOngoing: Boolean,
      isRemoved: Boolean,
      key: String,
      notification: BigText,
      packageName: String,
      postTime: Double,
      userHandle: Double
    ): StatusBarNotification = {
      val __obj = js.Dynamic.literal(groupKey = groupKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isClearable = isClearable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOngoing = isOngoing.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], postTime = postTime.asInstanceOf[js.Any], userHandle = userHandle.asInstanceOf[js.Any], overrideGroupKey = null, tag = null)
      __obj.asInstanceOf[StatusBarNotification]
    }
    
    extension [Self <: StatusBarNotification](x: Self) {
      
      inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsClearable(value: Boolean): Self = StObject.set(x, "isClearable", value.asInstanceOf[js.Any])
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsOngoing(value: Boolean): Self = StObject.set(x, "isOngoing", value.asInstanceOf[js.Any])
      
      inline def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: BigText): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setOverrideGroupKey(value: String): Self = StObject.set(x, "overrideGroupKey", value.asInstanceOf[js.Any])
      
      inline def setOverrideGroupKeyNull: Self = StObject.set(x, "overrideGroupKey", null)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPostTime(value: Double): Self = StObject.set(x, "postTime", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagNull: Self = StObject.set(x, "tag", null)
      
      inline def setUserHandle(value: Double): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SettingsClientCommands
  
  /* This means you don't have to write `default`, but can instead just say `libToolsSettingsClientCommandsMod.foo` */
  override def _to: SettingsClientCommands = default
}
