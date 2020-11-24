package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipDirection extends js.Object {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
}
object ClipDirection {
  
  @scala.inline
  def apply(): ClipDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirection]
  }
  
  @scala.inline
  implicit class ClipDirectionOps[Self <: ClipDirection] (val x: Self) extends AnyVal {
    
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
    def setClipDirection(value: backward | forward | closest): Self = this.set("clipDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipDirection: Self = this.set("clipDirection", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
}
