package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegistration extends js.Object {
  var active: scala.Boolean = js.native
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint = js.native
  var id: scala.Double = js.native
  var options: IRegisterOptions = js.native
  var procedure: java.lang.String = js.native
  var session: Session = js.native
  def endpoint(): scala.Unit = js.native
  def endpoint(args: js.Array[_]): scala.Unit = js.native
  def endpoint(args: js.Array[_], kwargs: js.Any): scala.Unit = js.native
  def endpoint(args: js.Array[_], kwargs: js.Any, details: IInvocation): scala.Unit = js.native
  def unregister(): whenLib.WhenNs.Promise[_] = js.native
}

