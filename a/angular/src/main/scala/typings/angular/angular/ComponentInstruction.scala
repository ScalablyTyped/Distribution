package typings.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `ComponentInstruction` represents the route state for a single component. An `Instruction` is
  * composed of a tree of these `ComponentInstruction`s.
  *
  * `ComponentInstructions` is a public API. Instances of `ComponentInstruction` are passed
  * to route lifecycle hooks, like {@link CanActivate}.
  *
  * `ComponentInstruction`s are [https://en.wikipedia.org/wiki/Hash_consing](hash consed). You should
  * never construct one yourself with "new." Instead, rely on {@link Router/RouteRecognizer} to
  * construct `ComponentInstruction`s.
  *
  * You should not modify this object. It should be treated as immutable.
  */
trait ComponentInstruction extends js.Object {
  var componentType: js.Any
  var data: RouteData
  var params: StringDictionary[js.Any]
  var reuse: Boolean
  var routeData: RouteData
  var specificity: Double
  var terminal: Boolean
  var urlParams: js.Array[String]
  var urlPath: String
}

object ComponentInstruction {
  @scala.inline
  def apply(
    componentType: js.Any,
    data: RouteData,
    params: StringDictionary[js.Any],
    reuse: Boolean,
    routeData: RouteData,
    specificity: Double,
    terminal: Boolean,
    urlParams: js.Array[String],
    urlPath: String
  ): ComponentInstruction = {
    val __obj = js.Dynamic.literal(componentType = componentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reuse = reuse.asInstanceOf[js.Any], routeData = routeData.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], urlParams = urlParams.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInstruction]
  }
}

