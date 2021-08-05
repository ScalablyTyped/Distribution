package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component
  extends StObject
     with Directive {
  
  var animations: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[js.Any]]] = js.undefined
  
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var moduleId: js.UndefOr[String] = js.undefined
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
  
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setEntryComponents(value: js.Array[Type | js.Array[js.Any]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    inline def setEntryComponentsVarargs(value: (Type | js.Array[js.Any])*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    inline def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setViewProviders(value: js.Array[Provider]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
    
    inline def setViewProvidersVarargs(value: Provider*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
  }
}
