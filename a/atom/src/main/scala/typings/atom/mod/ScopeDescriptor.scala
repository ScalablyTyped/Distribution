package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeDescriptor extends js.Object {
  /** Returns all scopes for this descriptor. */
  def getScopesArray(): js.Array[String] = js.native
}

object ScopeDescriptor {
  @scala.inline
  def apply(getScopesArray: () => js.Array[String]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(getScopesArray = js.Any.fromFunction0(getScopesArray))
    __obj.asInstanceOf[ScopeDescriptor]
  }
  @scala.inline
  implicit class ScopeDescriptorOps[Self <: ScopeDescriptor] (val x: Self) extends AnyVal {
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
    def setGetScopesArray(value: () => js.Array[String]): Self = this.set("getScopesArray", js.Any.fromFunction0(value))
  }
  
}

