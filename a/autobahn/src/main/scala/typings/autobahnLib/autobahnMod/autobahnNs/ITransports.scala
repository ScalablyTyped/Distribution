package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransports extends js.Object {
  def get(name: TransportType): ITransportFactoryFactory
  def isRegistered(name: TransportType): scala.Boolean
  def list(): js.Array[TransportType]
  def register(name: TransportType, factory: ITransportFactoryFactory): scala.Unit
}

object ITransports {
  @scala.inline
  def apply(
    get: TransportType => ITransportFactoryFactory,
    isRegistered: TransportType => scala.Boolean,
    list: () => js.Array[TransportType],
    register: (TransportType, ITransportFactoryFactory) => scala.Unit
  ): ITransports = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isRegistered = js.Any.fromFunction1(isRegistered), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[ITransports]
  }
}

