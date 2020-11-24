package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgent extends js.Object {
  
  /**
    * Mutates the current user agent ading the given user agent options.
    */
  def add(options: UserAgentOptions): UserAgent = js.native
  
  /**
    * The raw value of the user agent.
    *
    * @readonly
    */
  var value: String = js.native
}
object UserAgent {
  
  @scala.inline
  def apply(add: UserAgentOptions => UserAgent, value: String): UserAgent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: UserAgentOptions => UserAgent): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
