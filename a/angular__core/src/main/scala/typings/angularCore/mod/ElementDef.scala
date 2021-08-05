package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDef extends StObject {
  
  /**
    * same as visiblePublicProviders, but also includes private providers
    * that are located on this element.
    */
  var allProviders: StringDictionary[NodeDef] | Null
  
  /** ns, name, value */
  var attrs: (js.Array[js.Tuple3[String, String, String]]) | Null
  
  var componentProvider: NodeDef | Null
  
  var componentRendererType: RendererType2 | Null
  
  var componentView: ViewDefinitionFactory | Null
  
  var handleEvent: ElementHandleEventFn | Null
  
  var name: String | Null
  
  var ns: String | Null
  
  /**
    * visible public providers for DI in the view,
    * as see from this element. This does not include private providers.
    */
  var publicProviders: StringDictionary[NodeDef] | Null
  
  var template: ɵViewDefinition | Null
}
object ElementDef {
  
  inline def apply(): ElementDef = {
    val __obj = js.Dynamic.literal(allProviders = null, attrs = null, componentProvider = null, componentRendererType = null, componentView = null, handleEvent = null, name = null, ns = null, publicProviders = null, template = null)
    __obj.asInstanceOf[ElementDef]
  }
  
  extension [Self <: ElementDef](x: Self) {
    
    inline def setAllProviders(value: StringDictionary[NodeDef]): Self = StObject.set(x, "allProviders", value.asInstanceOf[js.Any])
    
    inline def setAllProvidersNull: Self = StObject.set(x, "allProviders", null)
    
    inline def setAttrs(value: js.Array[js.Tuple3[String, String, String]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
    
    inline def setAttrsVarargs(value: (js.Tuple3[String, String, String])*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    inline def setComponentProvider(value: NodeDef): Self = StObject.set(x, "componentProvider", value.asInstanceOf[js.Any])
    
    inline def setComponentProviderNull: Self = StObject.set(x, "componentProvider", null)
    
    inline def setComponentRendererType(value: RendererType2): Self = StObject.set(x, "componentRendererType", value.asInstanceOf[js.Any])
    
    inline def setComponentRendererTypeNull: Self = StObject.set(x, "componentRendererType", null)
    
    inline def setComponentView(value: ViewDefinitionFactory): Self = StObject.set(x, "componentView", value.asInstanceOf[js.Any])
    
    inline def setComponentViewNull: Self = StObject.set(x, "componentView", null)
    
    inline def setHandleEvent(value: (/* view */ ViewData, /* eventName */ String, /* event */ js.Any) => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction3(value))
    
    inline def setHandleEventNull: Self = StObject.set(x, "handleEvent", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsNull: Self = StObject.set(x, "ns", null)
    
    inline def setPublicProviders(value: StringDictionary[NodeDef]): Self = StObject.set(x, "publicProviders", value.asInstanceOf[js.Any])
    
    inline def setPublicProvidersNull: Self = StObject.set(x, "publicProviders", null)
    
    inline def setTemplate(value: ɵViewDefinition): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
  }
}
