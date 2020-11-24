package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveSections extends js.Object {
  
  var activeSections: js.Array[Double] = js.native
}
object ActiveSections {
  
  @scala.inline
  def apply(activeSections: js.Array[Double]): ActiveSections = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveSections]
  }
  
  @scala.inline
  implicit class ActiveSectionsOps[Self <: ActiveSections] (val x: Self) extends AnyVal {
    
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
    def setActiveSectionsVarargs(value: Double*): Self = this.set("activeSections", js.Array(value :_*))
    
    @scala.inline
    def setActiveSections(value: js.Array[Double]): Self = this.set("activeSections", value.asInstanceOf[js.Any])
  }
}
