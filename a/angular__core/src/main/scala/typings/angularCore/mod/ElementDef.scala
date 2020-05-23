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
    val __obj = js.Dynamic.literal(allProviders = allProviders.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], componentProvider = componentProvider.asInstanceOf[js.Any], componentRendererType = componentRendererType.asInstanceOf[js.Any], componentView = componentView.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction3(handleEvent), name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], publicProviders = publicProviders.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDef]
  }
}

