package typings.assertionError.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowDiff extends js.Object {
  
  var showDiff: Boolean = js.native
}
object ShowDiff {
  
  @scala.inline
  def apply(showDiff: Boolean): ShowDiff = {
    val __obj = js.Dynamic.literal(showDiff = showDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowDiff]
  }
  
  @scala.inline
  implicit class ShowDiffOps[Self <: ShowDiff] (val x: Self) extends AnyVal {
    
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
    def setShowDiff(value: Boolean): Self = this.set("showDiff", value.asInstanceOf[js.Any])
  }
}
