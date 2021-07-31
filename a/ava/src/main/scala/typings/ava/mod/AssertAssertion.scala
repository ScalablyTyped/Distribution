package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertAssertion extends StObject {
  
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  def apply(actual: js.Any): Unit = js.native
  def apply(actual: js.Any, message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(actual: js.Any): Unit = js.native
  def skip(actual: js.Any, message: String): Unit = js.native
}
