package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryResult extends js.Object {
  
  /**
  	 * Commit the attempt. Counts as one assertion for the plan count. If the
  	 * attempt failed, calling this will also cause your test to fail.
  	 */
  def commit(): Unit = js.native
  def commit(options: CommitDiscardOptions): Unit = js.native
  
  /**
  	 * Discard the attempt.
  	 */
  def discard(): Unit = js.native
  def discard(options: CommitDiscardOptions): Unit = js.native
  
  /**
  	* Errors raised for each failed assertion.
  	*/
  var errors: js.Array[AssertionError] = js.native
  
  /**
  	 * Logs created during the attempt using `t.log()`. Contains formatted values.
  	 */
  var logs: js.Array[String] = js.native
  
  /**
  	* Indicates whether all assertions passed, or at least one failed.
  	*/
  var passed: Boolean = js.native
  
  /**
  	* Title of the attempt, helping you tell attempts aparts.
  	*/
  var title: String = js.native
}
