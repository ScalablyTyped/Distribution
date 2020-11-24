package typings.awsCryptoIe11Detection.keyOperationMod

import typings.awsCryptoIe11Detection.keyMod.Key
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOperation extends js.Object {
  
  def oncomplete(event: Event): Unit = js.native
  
  def onerror(event: Event): Unit = js.native
  
  val result: js.UndefOr[Key] = js.native
}
object KeyOperation {
  
  @scala.inline
  def apply(oncomplete: Event => Unit, onerror: Event => Unit): KeyOperation = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror))
    __obj.asInstanceOf[KeyOperation]
  }
  
  @scala.inline
  implicit class KeyOperationOps[Self <: KeyOperation] (val x: Self) extends AnyVal {
    
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
    def setOncomplete(value: Event => Unit): Self = this.set("oncomplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerror(value: Event => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResult(value: Key): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
