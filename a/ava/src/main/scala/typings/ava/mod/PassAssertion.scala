package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassAssertion extends StObject {
  
  /** Count a passing assertion. */
  def apply(): Unit = js.native
  def apply(message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(): Unit = js.native
  def skip(message: String): Unit = js.native
}
