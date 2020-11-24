package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogFn extends js.Object {
  
  /** Log one or more values. */
  def apply(values: js.Any*): Unit = js.native
  
  /** Skip logging. */
  def skip(values: js.Any*): Unit = js.native
}
