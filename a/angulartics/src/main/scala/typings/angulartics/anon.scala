package typings.angulartics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoBasePath extends StObject {
    
    var autoBasePath: Boolean = js.native
    
    var autoTrackingFirstPage: Boolean = js.native
    
    var autoTrackingVirtualPages: Boolean = js.native
    
    var basePath: String = js.native
    
    var excludedRoutes: js.Array[String] = js.native
    
    var queryKeysBlacklisted: js.Array[String] = js.native
    
    var queryKeysWhitelisted: js.Array[String] = js.native
    
    var trackRelativePath: Boolean = js.native
    
    var trackRoutes: Boolean = js.native
    
    var trackStates: Boolean = js.native
  }
  object AutoBasePath {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AutoBasePathMutableBuilder[Self <: AutoBasePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoBasePath(value: Boolean): Self = StObject.set(x, "autoBasePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTrackingFirstPage(value: Boolean): Self = StObject.set(x, "autoTrackingFirstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTrackingVirtualPages(value: Boolean): Self = StObject.set(x, "autoTrackingVirtualPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedRoutes(value: js.Array[String]): Self = StObject.set(x, "excludedRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedRoutesVarargs(value: String*): Self = StObject.set(x, "excludedRoutes", js.Array(value :_*))
      
      @scala.inline
      def setQueryKeysBlacklisted(value: js.Array[String]): Self = StObject.set(x, "queryKeysBlacklisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryKeysBlacklistedVarargs(value: String*): Self = StObject.set(x, "queryKeysBlacklisted", js.Array(value :_*))
      
      @scala.inline
      def setQueryKeysWhitelisted(value: js.Array[String]): Self = StObject.set(x, "queryKeysWhitelisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryKeysWhitelistedVarargs(value: String*): Self = StObject.set(x, "queryKeysWhitelisted", js.Array(value :_*))
      
      @scala.inline
      def setTrackRelativePath(value: Boolean): Self = StObject.set(x, "trackRelativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackRoutes(value: Boolean): Self = StObject.set(x, "trackRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStates(value: Boolean): Self = StObject.set(x, "trackStates", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BufferFlushDelay extends StObject {
    
    var bufferFlushDelay: Double = js.native
    
    var developerMode: Boolean = js.native
    
    var optOut: Boolean = js.native
    
    var pageTracking: AutoBasePath = js.native
    
    var trackExceptions: Boolean = js.native
  }
  object BufferFlushDelay {
    
    @scala.inline
    def apply(
      bufferFlushDelay: Double,
      developerMode: Boolean,
      optOut: Boolean,
      pageTracking: AutoBasePath,
      trackExceptions: Boolean
    ): BufferFlushDelay = {
      val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferFlushDelay]
    }
    
    @scala.inline
    implicit class BufferFlushDelayMutableBuilder[Self <: BufferFlushDelay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferFlushDelay(value: Double): Self = StObject.set(x, "bufferFlushDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperMode(value: Boolean): Self = StObject.set(x, "developerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTracking(value: AutoBasePath): Self = StObject.set(x, "pageTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackExceptions(value: Boolean): Self = StObject.set(x, "trackExceptions", value.asInstanceOf[js.Any])
    }
  }
}
