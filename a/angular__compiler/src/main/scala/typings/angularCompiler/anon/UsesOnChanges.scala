package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsesOnChanges extends js.Object {
  
  /**
    * Whether the directive uses NgOnChanges.
    */
  var usesOnChanges: Boolean = js.native
}
object UsesOnChanges {
  
  @scala.inline
  def apply(usesOnChanges: Boolean): UsesOnChanges = {
    val __obj = js.Dynamic.literal(usesOnChanges = usesOnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsesOnChanges]
  }
  
  @scala.inline
  implicit class UsesOnChangesOps[Self <: UsesOnChanges] (val x: Self) extends AnyVal {
    
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
    def setUsesOnChanges(value: Boolean): Self = this.set("usesOnChanges", value.asInstanceOf[js.Any])
  }
}
