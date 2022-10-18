package typings.angularNotifications

import typings.angular.mod.IModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object notifications {
    
    trait IAnimation extends StObject {
      
      var duration: Double
      
      var enabled: Boolean
    }
    object IAnimation {
      
      inline def apply(duration: Double, enabled: Boolean): IAnimation = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAnimation]
      }
      
      extension [Self <: IAnimation](x: Self) {
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      }
    }
    
    trait INotification extends StObject {
      
      var content: String
      
      var icon: String
      
      var image: String
      
      var timestamp: String
      
      var title: String
      
      var `type`: String
      
      var userData: String
    }
    object INotification {
      
      inline def apply(
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
      
      extension [Self <: INotification](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INotificationFactory
      extends StObject
         with IModule {
      
      def awesomeNotify(`type`: String, icon: String, title: String, content: String, userData: Any): INotification = js.native
      
      def clear(): Unit = js.native
      
      /* ========== SETTINGS RELATED METHODS =============*/
      def disableHtml5Mode(): Unit = js.native
      
      def disableType(notificationType: String): Unit = js.native
      
      def enableHtml5Mode(): Unit = js.native
      
      def enableType(notificationType: String): Unit = js.native
      
      def error(title: String): INotification = js.native
      def error(title: String, content: String): INotification = js.native
      def error(title: String, content: String, userData: Any): INotification = js.native
      
      /* ============ QUERYING RELATED METHODS ============*/
      def getAll(): js.Array[INotification] = js.native
      
      def getQueue(): js.Array[INotification] = js.native
      
      def getSettings(): ISettings = js.native
      
      /* ============== NOTIFICATION METHODS ==============*/
      def info(title: String): INotification = js.native
      def info(title: String, content: String): INotification = js.native
      def info(title: String, content: String, userData: Any): INotification = js.native
      
      def makeNotification(`type`: String, image: String, icon: String, title: String, content: String, userData: Any): INotification = js.native
      
      def notify(image: String, title: String, content: String, userData: Any): INotification = js.native
      
      def requestHtml5ModePermissions(): Boolean = js.native
      
      def restore(): Unit = js.native
      
      /* ============ PERSISTENCE METHODS ============ */
      def save(): Unit = js.native
      
      def success(title: String): INotification = js.native
      def success(title: String, content: String): INotification = js.native
      def success(title: String, content: String, userData: Any): INotification = js.native
      
      def toggleHtml5Mode(): Unit = js.native
      
      def toggleType(notificationType: String): Unit = js.native
      
      def warning(title: String): INotification = js.native
      def warning(title: String, content: String): INotification = js.native
      def warning(title: String, content: String, userData: Any): INotification = js.native
    }
    
    trait ISettings extends StObject {
      
      var custom: IAnimation
      
      var details: Boolean
      
      var error: IAnimation
      
      var html5DefaultIcon: String
      
      var html5Mode: Boolean
      
      var info: IAnimation
      
      var localStorage: Boolean
      
      var progress: IAnimation
      
      var success: IAnimation
      
      var warning: IAnimation
    }
    object ISettings {
      
      inline def apply(
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
      
      extension [Self <: ISettings](x: Self) {
        
        inline def setCustom(value: IAnimation): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setError(value: IAnimation): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setHtml5DefaultIcon(value: String): Self = StObject.set(x, "html5DefaultIcon", value.asInstanceOf[js.Any])
        
        inline def setHtml5Mode(value: Boolean): Self = StObject.set(x, "html5Mode", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: IAnimation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
        
        inline def setProgress(value: IAnimation): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setSuccess(value: IAnimation): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setWarning(value: IAnimation): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      }
    }
  }
}
