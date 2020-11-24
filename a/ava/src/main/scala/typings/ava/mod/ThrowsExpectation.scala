package typings.ava.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowsExpectation extends js.Object {
  
  /** The thrown error must have a code that equals the given string or number. */
  var code: js.UndefOr[String | Double] = js.native
  
  /** The thrown error must be an instance of this constructor. */
  var instanceOf: js.UndefOr[Constructor] = js.native
  
  /** The thrown error must be strictly equal to this value. */
  var is: js.UndefOr[Error] = js.native
  
  /** The thrown error must have a message that equals the given string, or matches the regular expression. */
  var message: js.UndefOr[String | RegExp] = js.native
  
  /** The thrown error must have a name that equals the given string. */
  var name: js.UndefOr[String] = js.native
}
object ThrowsExpectation {
  
  @scala.inline
  def apply(): ThrowsExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrowsExpectation]
  }
  
  @scala.inline
  implicit class ThrowsExpectationOps[Self <: ThrowsExpectation] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String | Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setInstanceOf(value: Constructor): Self = this.set("instanceOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceOf: Self = this.set("instanceOf", js.undefined)
    
    @scala.inline
    def setIs(value: Error): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setMessage(value: String | RegExp): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
