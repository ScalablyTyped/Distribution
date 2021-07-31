package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransports extends StObject {
  
  def get(name: TransportType): ITransportFactoryFactory
  
  def isRegistered(name: TransportType): Boolean
  
  def list(): js.Array[TransportType]
  
  def register(name: TransportType, factory: ITransportFactoryFactory): Unit
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
  implicit class ITransportsMutableBuilder[Self <: ITransports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: TransportType => ITransportFactoryFactory): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegistered(value: TransportType => Boolean): Self = StObject.set(x, "isRegistered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Array[TransportType]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: (TransportType, ITransportFactoryFactory) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
  }
}
