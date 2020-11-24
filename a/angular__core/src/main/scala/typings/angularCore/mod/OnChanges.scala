package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChanges extends js.Object {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  def ngOnChanges(changes: SimpleChanges): Unit = js.native
}
object OnChanges {
  
  @scala.inline
  def apply(ngOnChanges: SimpleChanges => Unit): OnChanges = {
    val __obj = js.Dynamic.literal(ngOnChanges = js.Any.fromFunction1(ngOnChanges))
    __obj.asInstanceOf[OnChanges]
  }
  
  @scala.inline
  implicit class OnChangesOps[Self <: OnChanges] (val x: Self) extends AnyVal {
    
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
    def setNgOnChanges(value: SimpleChanges => Unit): Self = this.set("ngOnChanges", js.Any.fromFunction1(value))
  }
}
