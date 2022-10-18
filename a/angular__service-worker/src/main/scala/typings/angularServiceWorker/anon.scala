package typings.angularServiceWorker

import typings.angularServiceWorker.angularServiceWorkerStrings.freshness
import typings.angularServiceWorker.angularServiceWorkerStrings.performance
import typings.angularServiceWorker.configMod.Duration
import typings.angularServiceWorker.configMod.Glob
import typings.std.EpochTimeStamp
import typings.std.NotificationAction
import typings.std.NotificationDirection
import typings.std.VibratePattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: String
    
    var notification: NotificationOptionstitles
  }
  object Action {
    
    inline def apply(action: String, notification: NotificationOptionstitles): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: NotificationOptionstitles): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppData extends StObject {
    
    var appData: js.UndefOr[js.Object] = js.undefined
    
    var hash: String
  }
  object AppData {
    
    inline def apply(hash: String): AppData = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppData]
    }
    
    extension [Self <: AppData](x: Self) {
      
      inline def setAppData(value: js.Object): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
      
      inline def setAppDataUndefined: Self = StObject.set(x, "appData", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheOpaqueResponses extends StObject {
    
    var cacheOpaqueResponses: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: Duration
    
    var maxSize: Double
    
    var strategy: js.UndefOr[freshness | performance] = js.undefined
    
    var timeout: js.UndefOr[Duration] = js.undefined
  }
  object CacheOpaqueResponses {
    
    inline def apply(maxAge: Duration, maxSize: Double): CacheOpaqueResponses = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheOpaqueResponses]
    }
    
    extension [Self <: CacheOpaqueResponses](x: Self) {
      
      inline def setCacheOpaqueResponses(value: Boolean): Self = StObject.set(x, "cacheOpaqueResponses", value.asInstanceOf[js.Any])
      
      inline def setCacheOpaqueResponsesUndefined: Self = StObject.set(x, "cacheOpaqueResponses", js.undefined)
      
      inline def setMaxAge(value: Duration): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: freshness | performance): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Files extends StObject {
    
    var files: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var urls: js.UndefOr[js.Array[Glob]] = js.undefined
  }
  object Files {
    
    inline def apply(): Files = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[Glob]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: Glob*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setUrls(value: js.Array[Glob]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: Glob*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait Hash extends StObject {
    
    var appData: js.UndefOr[js.Object] = js.undefined
    
    var hash: String
  }
  object Hash {
    
    inline def apply(hash: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setAppData(value: js.Object): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
      
      inline def setAppDataUndefined: Self = StObject.set(x, "appData", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.NotificationOptions & {  title :string} */
  trait NotificationOptionstitles extends StObject {
    
    /* standard dom */
    var actions: js.UndefOr[js.Array[NotificationAction]] = js.undefined
    
    /* standard dom */
    var badge: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var body: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var data: js.UndefOr[Any] = js.undefined
    
    /* standard dom */
    var dir: js.UndefOr[NotificationDirection] = js.undefined
    
    /* standard dom */
    var icon: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var image: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var lang: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var renotify: js.UndefOr[Boolean] = js.undefined
    
    /* standard dom */
    var requireInteraction: js.UndefOr[Boolean] = js.undefined
    
    /* standard dom */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /* standard dom */
    var tag: js.UndefOr[String] = js.undefined
    
    /* standard dom */
    var timestamp: js.UndefOr[EpochTimeStamp] = js.undefined
    
    var title: String
    
    /* standard dom */
    var vibrate: js.UndefOr[VibratePattern] = js.undefined
  }
  object NotificationOptionstitles {
    
    inline def apply(title: String): NotificationOptionstitles = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationOptionstitles]
    }
    
    extension [Self <: NotificationOptionstitles](x: Self) {
      
      inline def setActions(value: js.Array[NotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: NotificationAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDir(value: NotificationDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setRenotify(value: Boolean): Self = StObject.set(x, "renotify", value.asInstanceOf[js.Any])
      
      inline def setRenotifyUndefined: Self = StObject.set(x, "renotify", js.undefined)
      
      inline def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
      
      inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTimestamp(value: EpochTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVibrate(value: VibratePattern): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
      
      inline def setVibrateVarargs(value: Double*): Self = StObject.set(x, "vibrate", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<std.CacheQueryOptions, 'ignoreSearch'> */
  trait PickCacheQueryOptionsigno extends StObject {
    
    var ignoreSearch: js.UndefOr[Boolean] = js.undefined
  }
  object PickCacheQueryOptionsigno {
    
    inline def apply(): PickCacheQueryOptionsigno = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickCacheQueryOptionsigno]
    }
    
    extension [Self <: PickCacheQueryOptionsigno](x: Self) {
      
      inline def setIgnoreSearch(value: Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    }
  }
  
  trait ServerPublicKey extends StObject {
    
    var serverPublicKey: String
  }
  object ServerPublicKey {
    
    inline def apply(serverPublicKey: String): ServerPublicKey = {
      val __obj = js.Dynamic.literal(serverPublicKey = serverPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerPublicKey]
    }
    
    extension [Self <: ServerPublicKey](x: Self) {
      
      inline def setServerPublicKey(value: String): Self = StObject.set(x, "serverPublicKey", value.asInstanceOf[js.Any])
    }
  }
}
