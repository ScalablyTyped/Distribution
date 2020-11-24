package typings.antd.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageType extends js.Object {
  
  def apply(): Unit = js.native
  
  var promise: js.Promise[Unit] = js.native
  
  def `then`(fill: ThenableArgument, reject: ThenableArgument): js.Promise[Unit] = js.native
}
