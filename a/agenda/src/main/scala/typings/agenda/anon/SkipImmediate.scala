package typings.agenda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipImmediate extends js.Object {
  
  var skipImmediate: js.UndefOr[Boolean] = js.native
  
  var timezone: js.UndefOr[String] = js.native
}
object SkipImmediate {
  
  @scala.inline
  def apply(): SkipImmediate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipImmediate]
  }
  
  @scala.inline
  implicit class SkipImmediateOps[Self <: SkipImmediate] (val x: Self) extends AnyVal {
    
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
    def setSkipImmediate(value: Boolean): Self = this.set("skipImmediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipImmediate: Self = this.set("skipImmediate", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
