package typings.autobahn.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRegistration extends js.Object {
  
  var active: Boolean = js.native
  
  def endpoint(): Unit = js.native
  def endpoint(args: js.UndefOr[scala.Nothing], kwargs: js.UndefOr[scala.Nothing], details: IInvocation): Unit = js.native
  def endpoint(args: js.UndefOr[scala.Nothing], kwargs: js.Any): Unit = js.native
  def endpoint(args: js.UndefOr[scala.Nothing], kwargs: js.Any, details: IInvocation): Unit = js.native
  def endpoint(args: js.Array[_]): Unit = js.native
  def endpoint(args: js.Array[_], kwargs: js.UndefOr[scala.Nothing], details: IInvocation): Unit = js.native
  def endpoint(args: js.Array[_], kwargs: js.Any): Unit = js.native
  def endpoint(args: js.Array[_], kwargs: js.Any, details: IInvocation): Unit = js.native
  @JSName("endpoint")
  var endpoint_Original: RegisterEndpoint = js.native
  
  var id: Double = js.native
  
  var options: IRegisterOptions = js.native
  
  var procedure: String = js.native
  
  var session: Session = js.native
  
  def unregister(): Promise[_] = js.native
}
