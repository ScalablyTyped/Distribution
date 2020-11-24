package typings.airbnbPropTypes.mod

import typings.propTypes.mod.ReactNodeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactComponentLike extends js.Object {
  
  var context: js.Any = js.native
  
  def forceUpdate(args: js.Any*): js.Any = js.native
  
  var props: js.Any = js.native
  
  var refs: js.Any = js.native
  
  def render(): ReactNodeLike = js.native
  
  def setState(args: js.Any*): js.Any = js.native
  
  var state: js.Any = js.native
}
object ReactComponentLike {
  
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: /* repeated */ js.Any => js.Any,
    props: js.Any,
    refs: js.Any,
    render: () => ReactNodeLike,
    setState: /* repeated */ js.Any => js.Any,
    state: js.Any
  ): ReactComponentLike = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction1(forceUpdate), props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactComponentLike]
  }
  
  @scala.inline
  implicit class ReactComponentLikeOps[Self <: ReactComponentLike] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdate(value: /* repeated */ js.Any => js.Any): Self = this.set("forceUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: js.Any): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: () => ReactNodeLike): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(value: /* repeated */ js.Any => js.Any): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
