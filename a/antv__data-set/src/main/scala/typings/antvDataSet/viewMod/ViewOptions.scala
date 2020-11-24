package typings.antvDataSet.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends js.Object {
  
  var watchingStates: js.UndefOr[js.Array[String]] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
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
    def setWatchingStatesVarargs(value: String*): Self = this.set("watchingStates", js.Array(value :_*))
    
    @scala.inline
    def setWatchingStates(value: js.Array[String]): Self = this.set("watchingStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchingStates: Self = this.set("watchingStates", js.undefined)
  }
}
