package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Macro[Args /* <: js.Array[js.Any] */, Context] extends UntitledMacro[Args, Context] {
  
  /**
  	 * Implement this function to generate a test (or hook) title whenever this macro is used. `providedTitle` contains
  	 * the title provided when the test or hook was declared. Also receives the remaining test arguments.
  	 */
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.native
}
