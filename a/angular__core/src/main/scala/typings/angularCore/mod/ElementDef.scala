package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementDef extends js.Object {
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
  @scala.inline
  def apply(
    allProviders: StringDictionary[NodeDef] = null,
    attrs: js.Array[js.Tuple3[String, String, String]] = null,
    componentProvider: NodeDef = null,
    componentRendererType: RendererType2 = null,
    componentView: ViewDefinitionFactory = null,
    handleEvent: (/* view */ ViewData, /* eventName */ String, /* event */ js.Any) => Boolean = null,
    name: String = null,
    ns: String = null,
    publicProviders: StringDictionary[NodeDef] = null,
    template: ɵViewDefinition = null
  ): ElementDef = {
    val __obj = js.Dynamic.literal()
    if (allProviders != null) __obj.updateDynamic("allProviders")(allProviders.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (componentProvider != null) __obj.updateDynamic("componentProvider")(componentProvider.asInstanceOf[js.Any])
    if (componentRendererType != null) __obj.updateDynamic("componentRendererType")(componentRendererType.asInstanceOf[js.Any])
    if (componentView != null) __obj.updateDynamic("componentView")(componentView.asInstanceOf[js.Any])
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(js.Any.fromFunction3(handleEvent))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (publicProviders != null) __obj.updateDynamic("publicProviders")(publicProviders.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDef]
  }
}

