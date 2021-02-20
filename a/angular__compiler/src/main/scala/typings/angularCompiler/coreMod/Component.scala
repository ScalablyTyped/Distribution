package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends Directive {
  
  var animations: js.UndefOr[js.Array[_]] = js.native
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.native
  
  var entryComponents: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var moduleId: js.UndefOr[String] = js.native
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  var styleUrls: js.UndefOr[js.Array[String]] = js.native
  
  var styles: js.UndefOr[js.Array[String]] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.native
}
object Component {
  
  @scala.inline
  def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    @scala.inline
    def setEntryComponents(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setViewProviders(value: js.Array[Provider]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
    
    @scala.inline
    def setViewProvidersVarargs(value: Provider*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
  }
}
