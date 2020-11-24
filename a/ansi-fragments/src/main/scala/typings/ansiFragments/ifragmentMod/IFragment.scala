package typings.ansiFragments.ifragmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFragment extends js.Object {
  
  def build(): String = js.native
}
object IFragment {
  
  @scala.inline
  def apply(build: () => String): IFragment = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[IFragment]
  }
  
  @scala.inline
  implicit class IFragmentOps[Self <: IFragment] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => String): Self = this.set("build", js.Any.fromFunction0(value))
  }
}
