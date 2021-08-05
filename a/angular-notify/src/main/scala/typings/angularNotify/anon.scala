package typings.angularNotify

import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Classes extends StObject {
    
    /**
      * Optional. A valid Angular scope object. The scope of the template will be created by calling $new() on this scope.
      */
    @JSName("$scope")
    var $scope: js.UndefOr[IScope] = js.undefined
    
    /**
      * Optional. A list of custom CSS classes to apply to the message element.
      */
    var classes: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Element that contains each notification. Defaults to document.body.
      */
    var container: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Optional. The duration (in milliseconds) of the message. A duration of 0 will prevent the message from closing automatically.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Required. The message to show.
      */
    var message: String
    
    /**
      * Optional. A string containing any valid Angular HTML which will be shown instead of the regular message text.
      * The string must contain one root element like all valid Angular HTML templates (so wrap everything in a <span>).
      */
    var messageTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Currently center and right are the only acceptable values.
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. A custom template for the UI of the message.
      */
    var templateUrl: js.UndefOr[String] = js.undefined
  }
  object Classes {
    
    inline def apply(message: String): Classes = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      inline def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
      
      inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    }
  }
  
  trait Container extends StObject {
    
    /**
      * The default element that contains each notification. Defaults to document.body.
      */
    var container: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The default duration (in milliseconds) of each message. A duration of 0 will prevent messages from closing automatically.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of total notifications that can be visible at one time. Older notifications will be closed when the maximum is reached.
      */
    var maximumOpen: js.UndefOr[Double] = js.undefined
    
    /**
      * The default position of each message. Currently only center and right are the supported values.
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * The Y pixel value where messages will be shown.
      */
    var startTop: js.UndefOr[Double] = js.undefined
    
    /**
      * The default message template.
      */
    var templateUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The number of pixels that should be reserved between messages vertically.
      */
    var verticalSpacing: js.UndefOr[Double] = js.undefined
  }
  object Container {
    
    inline def apply(): Container = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMaximumOpen(value: Double): Self = StObject.set(x, "maximumOpen", value.asInstanceOf[js.Any])
      
      inline def setMaximumOpenUndefined: Self = StObject.set(x, "maximumOpen", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStartTop(value: Double): Self = StObject.set(x, "startTop", value.asInstanceOf[js.Any])
      
      inline def setStartTopUndefined: Self = StObject.set(x, "startTop", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
      
      inline def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
    }
  }
}
