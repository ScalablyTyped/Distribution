package typings.accedoAccedoOne

import typings.accedoAccedoOne.anon.Alpha2Code
import typings.accedoAccedoOne.anon.DeviceId
import typings.accedoAccedoOne.anon.Locales
import typings.accedoAccedoOne.anon.PickAccedoEntryParamsprev
import typings.accedoAccedoOne.anon.ReadonlyDetails
import typings.accedoAccedoOne.mod.AccedoLog.Level
import typings.accedoAccedoOne.mod.AccedoLog.Logobject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: AccedoConfig): AccedoClient = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[AccedoClient]
  
  @JSImport("@accedo/accedo-one", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AccedoLog {
    
    @js.native
    sealed trait Level extends StObject
    @JSImport("@accedo/accedo-one", "AccedoLog.Level")
    @js.native
    object Level extends StObject {
      
      @js.native
      sealed trait DEBUG
        extends StObject
           with Level
      
      @js.native
      sealed trait ERROR
        extends StObject
           with Level
      
      @js.native
      sealed trait INFO
        extends StObject
           with Level
      
      @js.native
      sealed trait WARN
        extends StObject
           with Level
    }
    
    trait Details extends StObject {
      
      /** The dimension 1 information */
      var dim1: js.UndefOr[String] = js.undefined
      
      /** The dimension 2 information */
      var dim2: js.UndefOr[String] = js.undefined
      
      /** The dimension 3 information */
      var dim3: js.UndefOr[String] = js.undefined
      
      /** The dimension 4 information */
      var dim4: js.UndefOr[String] = js.undefined
      
      /** The error code (max 5 digits) */
      var errorCode: js.UndefOr[Double] = js.undefined
      
      /** The log message */
      var message: String
    }
    object Details {
      
      inline def apply(message: String): Details = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[Details]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
        
        inline def setDim1(value: String): Self = StObject.set(x, "dim1", value.asInstanceOf[js.Any])
        
        inline def setDim1Undefined: Self = StObject.set(x, "dim1", js.undefined)
        
        inline def setDim2(value: String): Self = StObject.set(x, "dim2", value.asInstanceOf[js.Any])
        
        inline def setDim2Undefined: Self = StObject.set(x, "dim2", js.undefined)
        
        inline def setDim3(value: String): Self = StObject.set(x, "dim3", value.asInstanceOf[js.Any])
        
        inline def setDim3Undefined: Self = StObject.set(x, "dim3", js.undefined)
        
        inline def setDim4(value: String): Self = StObject.set(x, "dim4", value.asInstanceOf[js.Any])
        
        inline def setDim4Undefined: Self = StObject.set(x, "dim4", js.undefined)
        
        inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
        
        inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
    
    trait Logobject
      extends StObject
         with Details {
      
      /**
        * the log type
        */
      var logType: Level
      
      /** Extra metadata (will go through JSON.stringify) */
      var metadata: js.UndefOr[Any] = js.undefined
      
      /**
        * The timestamp for the log, as a UTC ISO 8601 string
        * (ie. '2016-07-04T06:17:21Z'), or a POSIX millisecond
        * number
        */
      var timestamp: String | Double
    }
    object Logobject {
      
      inline def apply(logType: Level, message: String, timestamp: String | Double): Logobject = {
        val __obj = js.Dynamic.literal(logType = logType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Logobject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Logobject] (val x: Self) extends AnyVal {
        
        inline def setLogType(value: Level): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setTimestamp(value: String | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait AccedoClient extends StObject {
    
    var config: AccedoConfig = js.native
    
    /**
      * Create a session and store it for reuse in this client instance.
      * Note you do not usually need to worry about this. Other methods
      * will call it automatically for you when it is needed.
      *
      * @returns a Promise of a string, the sessionKey
      */
    def createSession(): js.Promise[String] = js.native
    
    /**
      * Get all the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @returns A promise of the requested data
      */
    def getAllApplicationGroupScopeDataByUser(userName: String): js.Promise[Any] = js.native
    
    /**
      * Get all the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @returns A promise of the requested data
      */
    def getAllApplicationScopeDataByUser(userName: String): js.Promise[Any] = js.native
    
    /**
      * Lists all the assets.
      *
      * @returns A promise of a hash of assets (key: asset name, value: asset URL)
      */
    def getAllAssets(): js.Promise[String] = js.native
    
    /**
      * Get all the enabled plugins
      *
      * @returns A promise of the requested data
      */
    def getAllEnabledPlugins(): js.Promise[Any] = js.native
    
    /**
      * Get all the metadata
      *
      * @returns A promise of the requested data
      */
    def getAllMetadata(): js.Promise[Any] = js.native
    
    /**
      * Get all the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @returns A promise of the requested data
      */
    def getApplicationGroupScopeDataByUserAndKey(userName: String, key: String): js.Promise[Any] = js.native
    
    /**
      * Get all the application-scope data for a given user and data key
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      */
    def getApplicationScopeDataByUserAndKey(userName: String, key: String): js.Promise[Any] = js.native
    
    /**
      * Get the current application status
      *
      * @returns A promise of the application status (string)
      */
    def getApplicationStatus(): js.Promise[String] = js.native
    
    /**
      * Get all the available locales
      *
      * @returns A promise of the requested data
      */
    def getAvailableLocales(): js.Promise[Locales] = js.native
    
    /**
      * Get all the content entries, based on the given parameters.
      * DO NOT use several of the id, alias, typeId and typeAlias
      * options at the same time - behaviour would be ungaranteed.
      *
      * @param params
      */
    def getEntries(): js.Promise[Any] = js.native
    def getEntries(params: AccedoEntryParams): js.Promise[Any] = js.native
    
    /**
      * Get one content entry, based on the given parameters.
      *
      * @param alias
      * @param params
      */
    def getEntryByAlias[A](alias: A): js.Promise[A] = js.native
    def getEntryByAlias[A](alias: A, params: PickAccedoEntryParamsprev): js.Promise[A] = js.native
    
    /**
      * Get one content entry by id, based on the given parameters.
      *
      * @param id
      * @param params
      */
    def getEntryById(id: String): js.Promise[Any] = js.native
    def getEntryById(id: String, params: PickAccedoEntryParamsprev): js.Promise[Any] = js.native
    
    /**
      * Get the current log level
      *
      * @returns a promise of the log level (string)
      */
    def getLogLevel(): js.Promise[Level] = js.native
    
    /**
      * Get the metadata by a specific key
      *
      * @param key a key to get specific metadata
      * @returns a promise of the requested data
      */
    def getMetadataByKey(key: String): js.Promise[Any] = js.native
    
    /**
      * Get the metadata by specific keys
      *
      * @param keys an array of keys (strings)
      * @returns a promise of the requested data
      */
    def getMetadataByKeys(keys: js.Array[String]): js.Promise[Any] = js.native
    
    /**
      * Get the profile information
      *
      * @returns A promise of the requested data
      */
    def getProfileInfo(): js.Promise[AccedoProfile] = js.native
    
    /**
      * Returns the currently stored sessionKey for this client instance
      *
      * @returns string: the sessionKey, if any
      */
    def getSessionKey(): String = js.native
    
    /**
      * NOTE: the behaviour varies when run on Node.js or on browsers.
      *
      * On Node.js, the log will be sent immediately.
      * On browsers: add the log to a queue so several logs may be sent
      * as a batch, when a predefined total size is reached or after a
      * debouncing delay. Whenever the user navigates away, the SDK will
      * also attempt to send any queued-up log.
      *
      * If the current log level is high enough, lower level logs will be ignored.
      *
      * @param level the log level
      * @param details the log information
      * @param metadata extra metadata (will go through JSON.stringify). Can be passed as any number of trailing arguments.
      */
    def sendLog(level: Level, details: ReadonlyDetails): js.Promise[Boolean] = js.native
    def sendLog(level: Level, details: ReadonlyDetails, metadata: Any): js.Promise[Boolean] = js.native
    
    /**
      * Send batched logs, each with its own level, timestamp, details and extra metadata.
      * Note that on browsers, the other method, sendLog, is more convenient as it will
      * auto-batch logs for you.
      *
      * @param logs
      * @returns A promise of the success of the operation
      */
    def sendLogs(logs: js.Array[Logobject]): js.Promise[Boolean] = js.native
    
    /**
      * Send a usage START event
      *
      * @returns A promise denoting the success of the operation
      */
    def sendUsageStartEvent(): js.Promise[Boolean] = js.native
    
    /**
      * Send a usage QUIT event
      *
      * @param retentionTimeInSeconds the retention time, in seconds
      * @returns A promise denoting the success of the operation
      */
    def sendUsageStopEvent(): js.Promise[Boolean] = js.native
    def sendUsageStopEvent(retentionTimeInSeconds: String): js.Promise[Boolean] = js.native
    def sendUsageStopEvent(retentionTimeInSeconds: Double): js.Promise[Boolean] = js.native
    
    /**
      * Set the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationGroupScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationGroupScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
  }
  
  trait AccedoConfig extends StObject {
    
    /** The application Key */
    var appKey: String
    
    /**
      * A function that should return an object with deviceId and
      * sessionKey properties, saved from previous sessions (see
      * onDeviceIdGenerated, onSessionKeyChanged)
      */
    var browserInfoProvider: js.UndefOr[js.Function0[DeviceId]] = js.undefined
    
    /** The device identifier (if not provided, a uuid will be generated instead) */
    var deviceId: js.UndefOr[String] = js.undefined
    
    /** the user's IP, given to Accedo One for every request this client will trigger (for geolocation). */
    var ip: js.UndefOr[String] = js.undefined
    
    /** A function to use to see this SDK's logs */
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** Callback to obtain the new deviceId, if one gets generated */
    var onDeviceIdGenerated: js.UndefOr[js.Function1[/* deviceId */ String, Unit]] = js.undefined
    
    /** Callback to obtain the sessionKey, anytime a new one gets generated */
    var onSessionKeyChanged: js.UndefOr[js.Function1[/* sessionKey */ String, Unit]] = js.undefined
    
    /** The sessionKey (note a new one may be created when not given or expired) */
    var sessionKey: js.UndefOr[String] = js.undefined
    
    /** All APIs calls will use this as the base API URL (defaults to the Accedo One API URL) */
    var target: js.UndefOr[String] = js.undefined
  }
  object AccedoConfig {
    
    inline def apply(appKey: String): AccedoConfig = {
      val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccedoConfig] (val x: Self) extends AnyVal {
      
      inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      inline def setBrowserInfoProvider(value: () => DeviceId): Self = StObject.set(x, "browserInfoProvider", js.Any.fromFunction0(value))
      
      inline def setBrowserInfoProviderUndefined: Self = StObject.set(x, "browserInfoProvider", js.undefined)
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setOnDeviceIdGenerated(value: /* deviceId */ String => Unit): Self = StObject.set(x, "onDeviceIdGenerated", js.Any.fromFunction1(value))
      
      inline def setOnDeviceIdGeneratedUndefined: Self = StObject.set(x, "onDeviceIdGenerated", js.undefined)
      
      inline def setOnSessionKeyChanged(value: /* sessionKey */ String => Unit): Self = StObject.set(x, "onSessionKeyChanged", js.Any.fromFunction1(value))
      
      inline def setOnSessionKeyChangedUndefined: Self = StObject.set(x, "onSessionKeyChanged", js.undefined)
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait AccedoEntryParams extends StObject {
    
    /** an array of entry aliases (strings) */
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    /** when given, get the version at the given time */
    var at: js.UndefOr[String | js.Date] = js.undefined
    
    /** an array of entry ids (strings) */
    var id: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * if available, get the version for the given locale
      * (defaults to the default locale)
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Offset the result by that many pages */
    var offset: js.UndefOr[Double | String] = js.undefined
    
    /** when true, get the preview version */
    var preview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit to that many results per page (limits as per Accedo
      * One API, currently 1 to 50, default 20)
      */
    var size: js.UndefOr[Double | String] = js.undefined
    
    /** only return entries whose entry type has this alias */
    var typeAlias: js.UndefOr[String] = js.undefined
    
    /** only return entries of the given type ids (strings) */
    var typeId: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AccedoEntryParams {
    
    inline def apply(): AccedoEntryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccedoEntryParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccedoEntryParams] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setAt(value: String | js.Date): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTypeAlias(value: String): Self = StObject.set(x, "typeAlias", value.asInstanceOf[js.Any])
      
      inline def setTypeAliasUndefined: Self = StObject.set(x, "typeAlias", js.undefined)
      
      inline def setTypeId(value: js.Array[String]): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
      
      inline def setTypeIdUndefined: Self = StObject.set(x, "typeId", js.undefined)
      
      inline def setTypeIdVarargs(value: String*): Self = StObject.set(x, "typeId", js.Array(value*))
    }
  }
  
  trait AccedoLocale extends StObject {
    
    var code: String
    
    var countryInfo: Alpha2Code
    
    var displayName: String
  }
  object AccedoLocale {
    
    inline def apply(code: String, countryInfo: Alpha2Code, displayName: String): AccedoLocale = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryInfo = countryInfo.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccedoLocale] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCountryInfo(value: Alpha2Code): Self = StObject.set(x, "countryInfo", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccedoProfile extends StObject {
    
    var profileDescription: String
    
    var profileId: String
    
    var profileLastModified: String
    
    var profileName: String
  }
  object AccedoProfile {
    
    inline def apply(profileDescription: String, profileId: String, profileLastModified: String, profileName: String): AccedoProfile = {
      val __obj = js.Dynamic.literal(profileDescription = profileDescription.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], profileLastModified = profileLastModified.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccedoProfile] (val x: Self) extends AnyVal {
      
      inline def setProfileDescription(value: String): Self = StObject.set(x, "profileDescription", value.asInstanceOf[js.Any])
      
      inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
      
      inline def setProfileLastModified(value: String): Self = StObject.set(x, "profileLastModified", value.asInstanceOf[js.Any])
      
      inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    }
  }
}
