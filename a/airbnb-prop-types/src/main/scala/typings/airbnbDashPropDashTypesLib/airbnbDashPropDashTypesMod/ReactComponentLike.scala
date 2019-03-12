package typings
package airbnbDashPropDashTypesLib.airbnbDashPropDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactComponentLike extends js.Object {
  var context: js.Any
  var props: js.Any
  var refs: js.Any
  var state: js.Any
  def forceUpdate(args: js.Any*): js.Any
  def render(): propDashTypesLib.propDashTypesMod.ReactNodeLike
  def setState(args: js.Any*): js.Any
}

object ReactComponentLike {
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: /* repeated */ js.Any => js.Any,
    props: js.Any,
    refs: js.Any,
    render: () => propDashTypesLib.propDashTypesMod.ReactNodeLike,
    setState: /* repeated */ js.Any => js.Any,
    state: js.Any
  ): ReactComponentLike = {
    val __obj = js.Dynamic.literal(context = context, forceUpdate = js.Any.fromFunction1(forceUpdate), props = props, refs = refs, render = js.Any.fromFunction0(render), setState = js.Any.fromFunction1(setState), state = state)
  
    __obj.asInstanceOf[ReactComponentLike]
  }
}

