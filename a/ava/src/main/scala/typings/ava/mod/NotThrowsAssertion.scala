package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotThrowsAssertion extends StObject {
  
  /** Assert that the function does not throw. */
  def apply(fn: js.Function0[_]): Unit = js.native
  def apply(fn: js.Function0[_], message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(fn: js.Function0[_]): Unit = js.native
  def skip(fn: js.Function0[_], message: String): Unit = js.native
}
