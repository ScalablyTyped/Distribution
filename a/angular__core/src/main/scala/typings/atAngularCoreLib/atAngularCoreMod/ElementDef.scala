package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementDef extends js.Object {
  /**
    * same as visiblePublicProviders, but also includes private providers
    * that are located on this element.
    */
  var allProviders: org.scalablytyped.runtime.StringDictionary[NodeDef] | scala.Null
  /** ns, name, value */
  var attrs: (js.Array[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]]) | scala.Null
  var componentProvider: NodeDef | scala.Null
  var componentRendererType: RendererType2 | scala.Null
  var componentView: ViewDefinitionFactory | scala.Null
  var handleEvent: ElementHandleEventFn | scala.Null
  var name: java.lang.String | scala.Null
  var ns: java.lang.String | scala.Null
  /**
    * visible public providers for DI in the view,
    * as see from this element. This does not include private providers.
    */
  var publicProviders: org.scalablytyped.runtime.StringDictionary[NodeDef] | scala.Null
  var template: ɵViewDefinition | scala.Null
}

object ElementDef {
  @scala.inline
  def apply(
    allProviders: org.scalablytyped.runtime.StringDictionary[NodeDef] = null,
    attrs: js.Array[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]] = null,
    componentProvider: NodeDef = null,
    componentRendererType: RendererType2 = null,
    componentView: ViewDefinitionFactory = null,
    handleEvent: ElementHandleEventFn = null,
    name: java.lang.String = null,
    ns: java.lang.String = null,
    publicProviders: org.scalablytyped.runtime.StringDictionary[NodeDef] = null,
    template: ɵViewDefinition = null
  ): ElementDef = {
    val __obj = js.Dynamic.literal()
    if (allProviders != null) __obj.updateDynamic("allProviders")(allProviders)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (componentProvider != null) __obj.updateDynamic("componentProvider")(componentProvider)
    if (componentRendererType != null) __obj.updateDynamic("componentRendererType")(componentRendererType)
    if (componentView != null) __obj.updateDynamic("componentView")(componentView)
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(handleEvent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (publicProviders != null) __obj.updateDynamic("publicProviders")(publicProviders)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ElementDef]
  }
}

