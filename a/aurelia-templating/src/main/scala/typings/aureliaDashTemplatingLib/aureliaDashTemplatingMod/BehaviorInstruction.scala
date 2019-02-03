package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "BehaviorInstruction")
@js.native
class BehaviorInstruction () extends js.Object {
  var anchorIsContainer: scala.Boolean = js.native
  var attrName: java.lang.String = js.native
  var attributes: js.Object = js.native
  var contentFactory: js.Any = js.native
  var enhance: scala.Boolean = js.native
  var host: stdLib.Element = js.native
  var inheritBindingContext: scala.Boolean = js.native
  var initiatedByBehavior: scala.Boolean = js.native
  var originalAttrName: java.lang.String = js.native
  var partReplacements: js.Any = js.native
  var skipContentProcessing: scala.Boolean = js.native
  var `type`: HtmlBehaviorResource = js.native
  var viewFactory: ViewFactory = js.native
  var viewModel: js.Object = js.native
}

/* static members */
@JSImport("aurelia-templating", "BehaviorInstruction")
@js.native
object BehaviorInstruction extends js.Object {
  /**
    * A default behavior used in scenarios where explicit configuration isn't available.
    */
  var normal: aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  /**
    * Creates a custom attribute instruction.
    * @param attrName The name of the attribute.
    * @param type The HtmlBehaviorResource to create.
    * @return The created instruction.
    */
  def attribute(attrName: java.lang.String): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  def attribute(
    attrName: java.lang.String,
    `type`: aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  /**
    * Creates a dynamic component instruction.
    * @param host The element that will parent the dynamic component.
    * @param viewModel The dynamic component's view model instance.
    * @param viewFactory A view factory used in generating the component's view.
    * @return The created instruction.
    */
  def dynamic(
    host: stdLib.Element,
    viewModel: js.Object,
    viewFactory: aureliaDashTemplatingLib.aureliaDashTemplatingMod.ViewFactory
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  /**
    * Creates a custom element instruction.
    * @param node The node that represents the custom element.
    * @param type The HtmlBehaviorResource to create.
    * @return The created instruction.
    */
  def element(node: stdLib.Node, `type`: aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  /**
    * Creates an instruction for element enhancement.
    * @return The created instruction.
    */
  def enhance(): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
  /**
    * Creates an instruction for unit testing.
    * @param type The HtmlBehaviorResource to create.
    * @param attributes A key/value lookup of attributes for the behaior.
    * @return The created instruction.
    */
  def unitTest(
    `type`: aureliaDashTemplatingLib.aureliaDashTemplatingMod.HtmlBehaviorResource,
    attributes: js.Object
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction = js.native
}

