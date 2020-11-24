package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.bindingMode
import typings.aureliaTemplating.aureliaTemplatingStrings.attribute
import typings.aureliaTemplating.aureliaTemplatingStrings.bindingBehavior
import typings.aureliaTemplating.aureliaTemplatingStrings.element
import typings.aureliaTemplating.aureliaTemplatingStrings.fromView
import typings.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typings.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typings.aureliaTemplating.aureliaTemplatingStrings.toView
import typings.aureliaTemplating.aureliaTemplatingStrings.twoWay
import typings.aureliaTemplating.aureliaTemplatingStrings.valueConverter
import typings.std.Element
import typings.std.NamedNodeMap
import typings.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStaticResourceConfig extends js.Object {
  
  /**
    * List of bindable properties of this custom element / custom attribute, by name or full config object
    */
  var bindables: js.UndefOr[js.Array[String | IBindablePropertyConfig]] = js.native
  
  /**
    * Flag a custom element as containerless. Which will remove their render target
    */
  var containerless: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to set default binding mode of default custom attribute view model "value" property
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.native
  
  /**
    * Flags a custom attribute has dynamic options
    */
  var hasDynamicOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of this resource. Reccommended to explicitly set to works better with minifier
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Custom processing of the attributes on an element before the framework inspects them.
    */
  var processAttributes: js.UndefOr[
    js.Function5[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* attributes */ NamedNodeMap, 
      /* elementInstruction */ BehaviorInstruction, 
      Unit
    ]
  ] = js.native
  
  /**
    * Enables custom processing of the content that is places inside the custom element by its consumer.
    * Pass a boolean to direct the template compiler to not process
    * the content placed inside this element. Alternatively, pass a function which
    * can provide custom processing of the content. This function should then return
    * a boolean indicating whether the compiler should also process the content.
    */
  var processContent: js.UndefOr[
    js.Function4[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* instruction */ BehaviorInstruction, 
      Boolean
    ]
  ] = js.native
  
  /**
    * Options that will be used if the element is flagged with usesShadowDOM
    */
  var shadowDOMOptions: js.UndefOr[ShadowRootInit] = js.native
  
  /**
    * Used to tell if a custom attribute is a template controller
    */
  var templateController: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource type of this class, omit equals to custom element
    */
  var `type`: js.UndefOr[
    element | attribute | valueConverter | bindingBehavior | typings.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
  ] = js.native
  
  /**
    * Flag if this custom element uses native shadow dom instead of emulation
    */
  var usesShadowDOM: js.UndefOr[Boolean] = js.native
}
object IStaticResourceConfig {
  
  @scala.inline
  def apply(): IStaticResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStaticResourceConfig]
  }
  
  @scala.inline
  implicit class IStaticResourceConfigOps[Self <: IStaticResourceConfig] (val x: Self) extends AnyVal {
    
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
    def setBindablesVarargs(value: (String | IBindablePropertyConfig)*): Self = this.set("bindables", js.Array(value :_*))
    
    @scala.inline
    def setBindables(value: js.Array[String | IBindablePropertyConfig]): Self = this.set("bindables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindables: Self = this.set("bindables", js.undefined)
    
    @scala.inline
    def setContainerless(value: Boolean): Self = this.set("containerless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerless: Self = this.set("containerless", js.undefined)
    
    @scala.inline
    def setDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = this.set("defaultBindingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBindingMode: Self = this.set("defaultBindingMode", js.undefined)
    
    @scala.inline
    def setHasDynamicOptions(value: Boolean): Self = this.set("hasDynamicOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDynamicOptions: Self = this.set("hasDynamicOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProcessAttributes(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* attributes */ NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => Unit
    ): Self = this.set("processAttributes", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteProcessAttributes: Self = this.set("processAttributes", js.undefined)
    
    @scala.inline
    def setProcessContent(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* instruction */ BehaviorInstruction) => Boolean
    ): Self = this.set("processContent", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteProcessContent: Self = this.set("processContent", js.undefined)
    
    @scala.inline
    def setShadowDOMOptions(value: ShadowRootInit): Self = this.set("shadowDOMOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowDOMOptions: Self = this.set("shadowDOMOptions", js.undefined)
    
    @scala.inline
    def setTemplateController(value: Boolean): Self = this.set("templateController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateController: Self = this.set("templateController", js.undefined)
    
    @scala.inline
    def setType(
      value: element | attribute | valueConverter | bindingBehavior | typings.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUsesShadowDOM(value: Boolean): Self = this.set("usesShadowDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesShadowDOM: Self = this.set("usesShadowDOM", js.undefined)
  }
}
