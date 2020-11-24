package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransportFactory extends js.Object {
  
  def create(): ITransport = js.native
  
  var `type`: TransportType = js.native
}
object ITransportFactory {
  
  @scala.inline
  def apply(create: () => ITransport, `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
  
  @scala.inline
  implicit class ITransportFactoryOps[Self <: ITransportFactory] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => ITransport): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: TransportType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
