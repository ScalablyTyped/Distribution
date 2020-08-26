package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  /**
    * The primary aspect of the binding scope.  Typically a view-model instance.
    */
  var bindingContext: js.Any = js.native
  /**
    * The "parallel" or "artificial" aspect of the binding scope. Provides access to the parent binding
    * context and stores contextual bindable members such as $event, $index, $odd, etc. Members on this
    * object take precedence over members of the bindingContext object.
    */
  var overrideContext: OverrideContext = js.native
}

object Scope {
  @scala.inline
  def apply(bindingContext: js.Any, overrideContext: OverrideContext): Scope = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], overrideContext = overrideContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
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
    def setBindingContext(value: js.Any): Self = this.set("bindingContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideContext(value: OverrideContext): Self = this.set("overrideContext", value.asInstanceOf[js.Any])
  }
  
}

