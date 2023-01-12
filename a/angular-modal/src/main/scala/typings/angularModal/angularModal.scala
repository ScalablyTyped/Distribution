package typings.angularModal

import org.scalablytyped.runtime.Instantiable1
import typings.angular.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularModal {
  
  @js.native
  trait AngularModal extends StObject {
    
    def activate(): Any = js.native
    def activate(locals: js.Object): Any = js.native
    def activate[T](locals: T): Any = js.native
    
    def active(): Boolean = js.native
    
    def deactivate(): Any = js.native
  }
  
  type AngularModalControllerDefinition = (Instantiable1[/* args (repeated) */ Any, Any]) | js.Function | String
  
  type AngularModalFactory = js.Function1[
    /* settings */ AngularModalSettingsWithTemplate | AngularModalSettingsWithTemplateUrl, 
    AngularModal
  ]
  
  // Possible arguments to IControllerService
  type AngularModalJQuerySelector = String | Element | (js.Array[Any | Element]) | JQuery | js.Function | js.Object
  
  // Possible arguments to IAugmentedJQueryStatic
  trait AngularModalSettings extends StObject {
    
    var container: js.UndefOr[AngularModalJQuerySelector] = js.undefined
    
    var controller: js.UndefOr[AngularModalControllerDefinition] = js.undefined
    
    var controllerAs: js.UndefOr[String] = js.undefined
  }
  object AngularModalSettings {
    
    inline def apply(): AngularModalSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AngularModalSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AngularModalSettings] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: AngularModalJQuerySelector): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContainerVarargs(value: (Any | Element)*): Self = StObject.set(x, "container", js.Array(value*))
      
      inline def setController(value: AngularModalControllerDefinition): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    }
  }
  
  trait AngularModalSettingsWithTemplate
    extends StObject
       with AngularModalSettings {
    
    var template: Any
  }
  object AngularModalSettingsWithTemplate {
    
    inline def apply(template: Any): AngularModalSettingsWithTemplate = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularModalSettingsWithTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AngularModalSettingsWithTemplate] (val x: Self) extends AnyVal {
      
      inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  trait AngularModalSettingsWithTemplateUrl
    extends StObject
       with AngularModalSettings {
    
    var templateUrl: String
  }
  object AngularModalSettingsWithTemplateUrl {
    
    inline def apply(templateUrl: String): AngularModalSettingsWithTemplateUrl = {
      val __obj = js.Dynamic.literal(templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularModalSettingsWithTemplateUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AngularModalSettingsWithTemplateUrl] (val x: Self) extends AnyVal {
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
}
