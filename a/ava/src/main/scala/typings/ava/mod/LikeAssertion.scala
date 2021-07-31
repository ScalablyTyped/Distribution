package typings.ava.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LikeAssertion extends StObject {
  
  /** Assert that `value` is like `selector`. */
  def apply(value: js.Any, selector: Record[String, js.Any]): Unit = js.native
  def apply(value: js.Any, selector: Record[String, js.Any], message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(value: js.Any, selector: js.Any): Unit = js.native
  def skip(value: js.Any, selector: js.Any, message: String): Unit = js.native
}
