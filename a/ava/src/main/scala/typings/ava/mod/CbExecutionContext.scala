package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CbExecutionContext[Context]
  extends StObject
     with ExecutionContext[Context] {
  
  /**
  	 * End the test. If `error` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy) the test or hook
  	 * will fail.
  	 */
  def end(): Unit = js.native
  def end(error: js.Any): Unit = js.native
}
