package typings
package atAngularCoreLib.srcViewTypesMod

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
  var componentRendererType: atAngularCoreLib.srcRenderApiMod.RendererType2 | scala.Null
  var componentView: ViewDefinitionFactory | scala.Null
  var handleEvent: ElementHandleEventFn | scala.Null
  var name: java.lang.String | scala.Null
  var ns: java.lang.String | scala.Null
  /**
    * visible public providers for DI in the view,
    * as see from this element. This does not include private providers.
    */
  var publicProviders: org.scalablytyped.runtime.StringDictionary[NodeDef] | scala.Null
  var template: ViewDefinition | scala.Null
}

