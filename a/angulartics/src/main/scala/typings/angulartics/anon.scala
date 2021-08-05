package typings.angulartics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoBasePath extends StObject {
    
    var autoBasePath: Boolean
    
    var autoTrackingFirstPage: Boolean
    
    var autoTrackingVirtualPages: Boolean
    
    var basePath: String
    
    var excludedRoutes: js.Array[String]
    
    var queryKeysBlacklisted: js.Array[String]
    
    var queryKeysWhitelisted: js.Array[String]
    
    var trackRelativePath: Boolean
    
    var trackRoutes: Boolean
    
    var trackStates: Boolean
  }
  object AutoBasePath {
    
    inline def apply(
      autoBasePath: Boolean,
      autoTrackingFirstPage: Boolean,
      autoTrackingVirtualPages: Boolean,
      basePath: String,
      excludedRoutes: js.Array[String],
      queryKeysBlacklisted: js.Array[String],
      queryKeysWhitelisted: js.Array[String],
      trackRelativePath: Boolean,
      trackRoutes: Boolean,
      trackStates: Boolean
    ): AutoBasePath = {
      val __obj = js.Dynamic.literal(autoBasePath = autoBasePath.asInstanceOf[js.Any], autoTrackingFirstPage = autoTrackingFirstPage.asInstanceOf[js.Any], autoTrackingVirtualPages = autoTrackingVirtualPages.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], excludedRoutes = excludedRoutes.asInstanceOf[js.Any], queryKeysBlacklisted = queryKeysBlacklisted.asInstanceOf[js.Any], queryKeysWhitelisted = queryKeysWhitelisted.asInstanceOf[js.Any], trackRelativePath = trackRelativePath.asInstanceOf[js.Any], trackRoutes = trackRoutes.asInstanceOf[js.Any], trackStates = trackStates.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoBasePath]
    }
    
    extension [Self <: AutoBasePath](x: Self) {
      
      inline def setAutoBasePath(value: Boolean): Self = StObject.set(x, "autoBasePath", value.asInstanceOf[js.Any])
      
      inline def setAutoTrackingFirstPage(value: Boolean): Self = StObject.set(x, "autoTrackingFirstPage", value.asInstanceOf[js.Any])
      
      inline def setAutoTrackingVirtualPages(value: Boolean): Self = StObject.set(x, "autoTrackingVirtualPages", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setExcludedRoutes(value: js.Array[String]): Self = StObject.set(x, "excludedRoutes", value.asInstanceOf[js.Any])
      
      inline def setExcludedRoutesVarargs(value: String*): Self = StObject.set(x, "excludedRoutes", js.Array(value :_*))
      
      inline def setQueryKeysBlacklisted(value: js.Array[String]): Self = StObject.set(x, "queryKeysBlacklisted", value.asInstanceOf[js.Any])
      
      inline def setQueryKeysBlacklistedVarargs(value: String*): Self = StObject.set(x, "queryKeysBlacklisted", js.Array(value :_*))
      
      inline def setQueryKeysWhitelisted(value: js.Array[String]): Self = StObject.set(x, "queryKeysWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setQueryKeysWhitelistedVarargs(value: String*): Self = StObject.set(x, "queryKeysWhitelisted", js.Array(value :_*))
      
      inline def setTrackRelativePath(value: Boolean): Self = StObject.set(x, "trackRelativePath", value.asInstanceOf[js.Any])
      
      inline def setTrackRoutes(value: Boolean): Self = StObject.set(x, "trackRoutes", value.asInstanceOf[js.Any])
      
      inline def setTrackStates(value: Boolean): Self = StObject.set(x, "trackStates", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferFlushDelay extends StObject {
    
    var bufferFlushDelay: Double
    
    var developerMode: Boolean
    
    var optOut: Boolean
    
    var pageTracking: AutoBasePath
    
    var trackExceptions: Boolean
  }
  object BufferFlushDelay {
    
    inline def apply(
      bufferFlushDelay: Double,
      developerMode: Boolean,
      optOut: Boolean,
      pageTracking: AutoBasePath,
      trackExceptions: Boolean
    ): BufferFlushDelay = {
      val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferFlushDelay]
    }
    
    extension [Self <: BufferFlushDelay](x: Self) {
      
      inline def setBufferFlushDelay(value: Double): Self = StObject.set(x, "bufferFlushDelay", value.asInstanceOf[js.Any])
      
      inline def setDeveloperMode(value: Boolean): Self = StObject.set(x, "developerMode", value.asInstanceOf[js.Any])
      
      inline def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      inline def setPageTracking(value: AutoBasePath): Self = StObject.set(x, "pageTracking", value.asInstanceOf[js.Any])
      
      inline def setTrackExceptions(value: Boolean): Self = StObject.set(x, "trackExceptions", value.asInstanceOf[js.Any])
    }
  }
}
