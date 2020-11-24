package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementDef extends js.Object {
  
  /**
    * same as visiblePublicProviders, but also includes private providers
    * that are located on this element.
    */
  var allProviders: StringDictionary[NodeDef] | Null = js.native
  
  /** ns, name, value */
  var attrs: (js.Array[js.Tuple3[String, String, String]]) | Null = js.native
  
  var componentProvider: NodeDef | Null = js.native
  
  var componentRendererType: RendererType2 | Null = js.native
  
  var componentView: ViewDefinitionFactory | Null = js.native
  
  var handleEvent: ElementHandleEventFn | Null = js.native
  
  var name: String | Null = js.native
  
  var ns: String | Null = js.native
  
  /**
    * visible public providers for DI in the view,
    * as see from this element. This does not include private providers.
    */
  var publicProviders: StringDictionary[NodeDef] | Null = js.native
  
  var template: ɵViewDefinition | Null = js.native
}
object ElementDef {
  
  @scala.inline
  def apply(): ElementDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDef]
  }
  
  @scala.inline
  implicit class ElementDefOps[Self <: ElementDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllProviders(value: StringDictionary[NodeDef]): Self = this.set("allProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllProvidersNull: Self = this.set("allProviders", null)
    
    @scala.inline
    def setAttrsVarargs(value: (js.Tuple3[String, String, String])*): Self = this.set("attrs", js.Array(value :_*))
    
    @scala.inline
    def setAttrs(value: js.Array[js.Tuple3[String, String, String]]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
    
    @scala.inline
    def setComponentProvider(value: NodeDef): Self = this.set("componentProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentProviderNull: Self = this.set("componentProvider", null)
    
    @scala.inline
    def setComponentRendererType(value: RendererType2): Self = this.set("componentRendererType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRendererTypeNull: Self = this.set("componentRendererType", null)
    
    @scala.inline
    def setComponentView(value: ViewDefinitionFactory): Self = this.set("componentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentViewNull: Self = this.set("componentView", null)
    
    @scala.inline
    def setHandleEvent(value: (/* view */ ViewData, /* eventName */ String, /* event */ js.Any) => Boolean): Self = this.set("handleEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandleEventNull: Self = this.set("handleEvent", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsNull: Self = this.set("ns", null)
    
    @scala.inline
    def setPublicProviders(value: StringDictionary[NodeDef]): Self = this.set("publicProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicProvidersNull: Self = this.set("publicProviders", null)
    
    @scala.inline
    def setTemplate(value: ɵViewDefinition): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
  }
}
