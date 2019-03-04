package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportFactory extends js.Object {
  // constructor(options: any);
  var `type`: java.lang.String
  def create(): ITransport
}

object ITransportFactory {
  @scala.inline
  def apply(create: js.Function0[ITransport], `type`: java.lang.String): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = create)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITransportFactory]
  }
}

