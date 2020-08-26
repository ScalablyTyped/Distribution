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
@js.native
trait ComponentInstruction extends js.Object {
  var componentType: js.Any = js.native
  var data: RouteData = js.native
  var params: StringDictionary[js.Any] = js.native
  var reuse: Boolean = js.native
  var routeData: RouteData = js.native
  var specificity: Double = js.native
  var terminal: Boolean = js.native
  var urlParams: js.Array[String] = js.native
  var urlPath: String = js.native
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
  @scala.inline
  implicit class ComponentInstructionOps[Self <: ComponentInstruction] (val x: Self) extends AnyVal {
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
    def setComponentType(value: js.Any): Self = this.set("componentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: RouteData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setReuse(value: Boolean): Self = this.set("reuse", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteData(value: RouteData): Self = this.set("routeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecificity(value: Double): Self = this.set("specificity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlParamsVarargs(value: String*): Self = this.set("urlParams", js.Array(value :_*))
    @scala.inline
    def setUrlParams(value: js.Array[String]): Self = this.set("urlParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlPath(value: String): Self = this.set("urlPath", value.asInstanceOf[js.Any])
  }
  
}

