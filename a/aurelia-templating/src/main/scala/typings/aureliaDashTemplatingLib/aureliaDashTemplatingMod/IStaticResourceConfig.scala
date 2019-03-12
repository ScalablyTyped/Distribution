package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticResourceConfig extends js.Object {
  /**
    * List of bindable properties of this custom element / custom attribute, by name or full config object
    */
  var bindables: js.UndefOr[java.lang.String | js.Array[IBindablePropertyConfig]] = js.undefined
  /**
    * Flag a custom element as containerless. Which will remove their render target
    */
  var containerless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to set default binding mode of default custom attribute view model "value" property
    */
  var defaultBindingMode: js.UndefOr[
    aureliaDashBindingLib.aureliaDashBindingMod.bindingMode | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneTime | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.twoWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.fromView | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.toView
  ] = js.undefined
  /**
    * Flags a custom attribute has dynamic options
    */
  var hasDynamicOptions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of this resource. Reccommended to explicitly set to works better with minifier
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom processing of the attributes on an element before the framework inspects them.
    */
  var processAttributes: js.UndefOr[
    js.Function5[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources, 
      /* node */ stdLib.Element, 
      /* attributes */ stdLib.NamedNodeMap, 
      /* elementInstruction */ BehaviorInstruction, 
      scala.Unit
    ]
  ] = js.undefined
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
      /* resources */ ViewResources, 
      /* node */ stdLib.Element, 
      /* instruction */ BehaviorInstruction, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Options that will be used if the element is flagged with usesShadowDOM
    */
  var shadowDOMOptions: js.UndefOr[stdLib.ShadowRootInit] = js.undefined
  /**
    * Used to tell if a custom attribute is a template controller
    */
  var templateController: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Resource type of this class, omit equals to custom element
    */
  var `type`: js.UndefOr[
    aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.element | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.attribute | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.valueConverter | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.bindingBehavior | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.viewEngineHooks
  ] = js.undefined
  /**
    * Flag if this custom element uses native shadow dom instead of emulation
    */
  var usesShadowDOM: js.UndefOr[scala.Boolean] = js.undefined
}

object IStaticResourceConfig {
  @scala.inline
  def apply(
    bindables: java.lang.String | js.Array[IBindablePropertyConfig] = null,
    containerless: js.UndefOr[scala.Boolean] = js.undefined,
    defaultBindingMode: aureliaDashBindingLib.aureliaDashBindingMod.bindingMode | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneTime | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.twoWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.fromView | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.toView = null,
    hasDynamicOptions: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    processAttributes: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources, /* node */ stdLib.Element, /* attributes */ stdLib.NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => scala.Unit = null,
    processContent: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources, /* node */ stdLib.Element, /* instruction */ BehaviorInstruction) => scala.Boolean = null,
    shadowDOMOptions: stdLib.ShadowRootInit = null,
    templateController: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.element | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.attribute | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.valueConverter | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.bindingBehavior | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.viewEngineHooks = null,
    usesShadowDOM: js.UndefOr[scala.Boolean] = js.undefined
  ): IStaticResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (bindables != null) __obj.updateDynamic("bindables")(bindables.asInstanceOf[js.Any])
    if (!js.isUndefined(containerless)) __obj.updateDynamic("containerless")(containerless)
    if (defaultBindingMode != null) __obj.updateDynamic("defaultBindingMode")(defaultBindingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicOptions)) __obj.updateDynamic("hasDynamicOptions")(hasDynamicOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (processAttributes != null) __obj.updateDynamic("processAttributes")(js.Any.fromFunction5(processAttributes))
    if (processContent != null) __obj.updateDynamic("processContent")(js.Any.fromFunction4(processContent))
    if (shadowDOMOptions != null) __obj.updateDynamic("shadowDOMOptions")(shadowDOMOptions)
    if (!js.isUndefined(templateController)) __obj.updateDynamic("templateController")(templateController)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usesShadowDOM)) __obj.updateDynamic("usesShadowDOM")(usesShadowDOM)
    __obj.asInstanceOf[IStaticResourceConfig]
  }
}

