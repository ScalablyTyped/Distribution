package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransports extends js.Object {
  
  def get(name: TransportType): ITransportFactoryFactory = js.native
  
  def isRegistered(name: TransportType): Boolean = js.native
  
  def list(): js.Array[TransportType] = js.native
  
  def register(name: TransportType, factory: ITransportFactoryFactory): Unit = js.native
}
object ITransports {
  
  @scala.inline
  def apply(
    get: TransportType => ITransportFactoryFactory,
    isRegistered: TransportType => Boolean,
    list: () => js.Array[TransportType],
    register: (TransportType, ITransportFactoryFactory) => Unit
  ): ITransports = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isRegistered = js.Any.fromFunction1(isRegistered), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[ITransports]
  }
  
  @scala.inline
  implicit class ITransportsOps[Self <: ITransports] (val x: Self) extends AnyVal {
    
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
    def setGet(value: TransportType => ITransportFactoryFactory): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegistered(value: TransportType => Boolean): Self = this.set("isRegistered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Array[TransportType]): Self = this.set("list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: (TransportType, ITransportFactoryFactory) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
  }
}
