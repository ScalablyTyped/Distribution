package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailAssertion extends js.Object {
  
  /** Fail the test. */
  def apply(): Unit = js.native
  def apply(message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(): Unit = js.native
  def skip(message: String): Unit = js.native
}
