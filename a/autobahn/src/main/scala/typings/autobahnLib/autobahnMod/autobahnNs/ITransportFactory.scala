package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportFactory extends js.Object {
  var `type`: TransportType
  def create(): ITransport
}

object ITransportFactory {
  @scala.inline
  def apply(create: () => ITransport, `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
}

