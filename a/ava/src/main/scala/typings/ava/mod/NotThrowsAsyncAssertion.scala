package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotThrowsAsyncAssertion extends StObject {
  
  /** Assert that the async function does not throw. You must await the result. */
  def apply(fn: js.Function0[js.Thenable[_]]): js.Promise[Unit] = js.native
  def apply(fn: js.Function0[js.Thenable[_]], message: String): js.Promise[Unit] = js.native
  /** Assert that the promise does not reject. You must await the result. */
  def apply(promise: js.Thenable[_]): js.Promise[Unit] = js.native
  def apply(promise: js.Thenable[_], message: String): js.Promise[Unit] = js.native
  
  /** Skip this assertion. */
  def skip(nonThrower: js.Any): Unit = js.native
  def skip(nonThrower: js.Any, message: String): Unit = js.native
}
