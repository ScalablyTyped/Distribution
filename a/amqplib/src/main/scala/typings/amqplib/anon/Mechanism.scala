package typings.amqplib.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mechanism extends js.Object {
  
  var mechanism: String = js.native
  
  def response(): Buffer = js.native
}
object Mechanism {
  
  @scala.inline
  def apply(mechanism: String, response: () => Buffer): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
    __obj.asInstanceOf[Mechanism]
  }
  
  @scala.inline
  implicit class MechanismOps[Self <: Mechanism] (val x: Self) extends AnyVal {
    
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
    def setMechanism(value: String): Self = this.set("mechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: () => Buffer): Self = this.set("response", js.Any.fromFunction0(value))
  }
}
