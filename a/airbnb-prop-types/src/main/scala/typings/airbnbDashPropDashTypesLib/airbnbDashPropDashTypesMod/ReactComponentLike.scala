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
    forceUpdate: js.Function1[/* repeated */ js.Any, js.Any],
    props: js.Any,
    refs: js.Any,
    render: js.Function0[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    setState: js.Function1[/* repeated */ js.Any, js.Any],
    state: js.Any
  ): ReactComponentLike = {
    val __obj = js.Dynamic.literal(context = context, forceUpdate = forceUpdate, props = props, refs = refs, render = render, setState = setState, state = state)
  
    __obj.asInstanceOf[ReactComponentLike]
  }
}

