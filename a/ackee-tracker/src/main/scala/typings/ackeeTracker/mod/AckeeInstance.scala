package typings.ackeeTracker.mod

import typings.ackeeTracker.anon.FnCall
import typings.ackeeTracker.anon.Stop
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AckeeInstance extends js.Object {
  
  def record(): Stop = js.native
  def record(attrs: ReturnType[FnCall]): Stop = js.native
}
