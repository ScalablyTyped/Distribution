package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Appends code to the function's body or finishes generation.
  * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
  * @param [formatParams] Format parameters
  * @returns Itself or the generated function if finished
  * @throws {Error} If format parameter counts do not match
  */
@js.native
trait Codegen extends StObject {
  
  def apply(formatStringOrScope: String, formatParams: js.Any*): Codegen | js.Function = js.native
  def apply(formatStringOrScope: StringDictionary[js.UndefOr[js.Any]], formatParams: js.Any*): Codegen | js.Function = js.native
  def apply(formatStringOrScope: Unit, formatParams: js.Any*): Codegen | js.Function = js.native
}
