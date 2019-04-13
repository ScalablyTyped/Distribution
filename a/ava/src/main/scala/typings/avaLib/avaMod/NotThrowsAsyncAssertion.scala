package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotThrowsAsyncAssertion extends js.Object {
  /** Assert that the async function does not throw. You must await the result. */
  def apply(fn: js.Function0[js.Thenable[_]]): js.Promise[scala.Unit] = js.native
  def apply(fn: js.Function0[js.Thenable[_]], message: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Assert that the promise does not reject. You must await the result. */
  def apply(promise: js.Thenable[_]): js.Promise[scala.Unit] = js.native
  def apply(promise: js.Thenable[_], message: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Skip this assertion. */
  def skip(nonThrower: js.Any): scala.Unit = js.native
  def skip(nonThrower: js.Any, message: java.lang.String): scala.Unit = js.native
}

