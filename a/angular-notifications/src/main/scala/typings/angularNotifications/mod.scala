package typings.angularNotifications

import typings.angular.mod.IModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object notifications {
    
    @js.native
    trait IAnimation extends StObject {
      
      var duration: Double = js.native
      
      var enabled: Boolean = js.native
    }
    object IAnimation {
      
      @scala.inline
      def apply(duration: Double, enabled: Boolean): IAnimation = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAnimation]
      }
      
      @scala.inline
      implicit class IAnimationMutableBuilder[Self <: IAnimation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INotification extends StObject {
      
      var content: String = js.native
      
      var icon: String = js.native
      
      var image: String = js.native
      
      var timestamp: String = js.native
      
      var title: String = js.native
      
      var `type`: String = js.native
      
      var userData: String = js.native
    }
    object INotification {
      
      @scala.inline
      def apply(
        content: String,
        icon: String,
        image: String,
        timestamp: String,
        title: String,
        `type`: String,
        userData: String
      ): INotification = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[INotification]
      }
      
      @scala.inline
      implicit class INotificationMutableBuilder[Self <: INotification] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INotificationFactory extends IModule {
      
      def awesomeNotify(`type`: String, icon: String, title: String, content: String, userData: js.Any): INotification = js.native
      
      def clear(): Unit = js.native
      
      /* ========== SETTINGS RELATED METHODS =============*/
      def disableHtml5Mode(): Unit = js.native
      
      def disableType(notificationType: String): Unit = js.native
      
      def enableHtml5Mode(): Unit = js.native
      
      def enableType(notificationType: String): Unit = js.native
      
      def error(title: String): INotification = js.native
      def error(title: String, content: String): INotification = js.native
      def error(title: String, content: String, userData: js.Any): INotification = js.native
      
      /* ============ QUERYING RELATED METHODS ============*/
      def getAll(): js.Array[INotification] = js.native
      
      def getQueue(): js.Array[INotification] = js.native
      
      def getSettings(): ISettings = js.native
      
      /* ============== NOTIFICATION METHODS ==============*/
      def info(title: String): INotification = js.native
      def info(title: String, content: String): INotification = js.native
      def info(title: String, content: String, userData: js.Any): INotification = js.native
      
      def makeNotification(`type`: String, image: String, icon: String, title: String, content: String, userData: js.Any): INotification = js.native
      
      def notify(image: String, title: String, content: String, userData: js.Any): INotification = js.native
      
      def requestHtml5ModePermissions(): Boolean = js.native
      
      def restore(): Unit = js.native
      
      /* ============ PERSISTENCE METHODS ============ */
      def save(): Unit = js.native
      
      def success(title: String): INotification = js.native
      def success(title: String, content: String): INotification = js.native
      def success(title: String, content: String, userData: js.Any): INotification = js.native
      
      def toggleHtml5Mode(): Unit = js.native
      
      def toggleType(notificationType: String): Unit = js.native
      
      def warning(title: String): INotification = js.native
      def warning(title: String, content: String): INotification = js.native
      def warning(title: String, content: String, userData: js.Any): INotification = js.native
    }
    
    @js.native
    trait ISettings extends StObject {
      
      var custom: IAnimation = js.native
      
      var details: Boolean = js.native
      
      var error: IAnimation = js.native
      
      var html5DefaultIcon: String = js.native
      
      var html5Mode: Boolean = js.native
      
      var info: IAnimation = js.native
      
      var localStorage: Boolean = js.native
      
      var progress: IAnimation = js.native
      
      var success: IAnimation = js.native
      
      var warning: IAnimation = js.native
    }
    object ISettings {
      
      @scala.inline
      def apply(
        custom: IAnimation,
        details: Boolean,
        error: IAnimation,
        html5DefaultIcon: String,
        html5Mode: Boolean,
        info: IAnimation,
        localStorage: Boolean,
        progress: IAnimation,
        success: IAnimation,
        warning: IAnimation
      ): ISettings = {
        val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], html5DefaultIcon = html5DefaultIcon.asInstanceOf[js.Any], html5Mode = html5Mode.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISettings]
      }
      
      @scala.inline
      implicit class ISettingsMutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustom(value: IAnimation): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: IAnimation): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml5DefaultIcon(value: String): Self = StObject.set(x, "html5DefaultIcon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml5Mode(value: Boolean): Self = StObject.set(x, "html5Mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInfo(value: IAnimation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(value: IAnimation): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuccess(value: IAnimation): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWarning(value: IAnimation): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      }
    }
  }
}
