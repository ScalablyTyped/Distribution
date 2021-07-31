package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FalsyAssertion extends StObject {
  
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  def apply(actual: js.Any): Unit = js.native
  def apply(actual: js.Any, message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(actual: js.Any): Unit = js.native
  def skip(actual: js.Any, message: String): Unit = js.native
}
