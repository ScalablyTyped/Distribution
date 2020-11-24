package typings.ava.pluginMod.SharedWorker

import typings.ava.avaStrings.experimental
import typings.ava.pluginMod.SharedWorker.Experimental.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactoryOptions extends js.Object {
  
  @JSName("negotiateProtocol")
  def negotiateProtocol_experimental[Data](supported: js.Array[experimental]): Protocol[Data] = js.native
}
object FactoryOptions {
  
  @scala.inline
  def apply(negotiateProtocol: js.Array[experimental] => Protocol[js.Any]): FactoryOptions = {
    val __obj = js.Dynamic.literal(negotiateProtocol = js.Any.fromFunction1(negotiateProtocol))
    __obj.asInstanceOf[FactoryOptions]
  }
  
  @scala.inline
  implicit class FactoryOptionsOps[Self <: FactoryOptions] (val x: Self) extends AnyVal {
    
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
    def setNegotiateProtocol(value: js.Array[experimental] => Protocol[js.Any]): Self = this.set("negotiateProtocol", js.Any.fromFunction1(value))
  }
}
