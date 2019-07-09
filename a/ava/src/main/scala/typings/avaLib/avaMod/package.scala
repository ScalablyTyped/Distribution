package typings
package avaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object avaMod {
  type CbImplementation[Context] = js.Function1[/* t */ CbExecutionContext[Context], ImplementationResult]
  type CbMacro[Args /* <: js.Array[_] */, Context] = (UntitledCbMacro[Args, Context]) with avaLib.Anon_Args[Args]
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type EitherCbMacro[Args /* <: js.Array[_] */, Context] = (CbMacro[Args, Context]) | (UntitledCbMacro[Args, Context])
  type EitherMacro[Args /* <: js.Array[_] */, Context] = (Macro[Args, Context]) | (UntitledMacro[Args, Context])
  type Implementation[Context] = js.Function1[/* t */ ExecutionContext[Context], ImplementationResult]
  type ImplementationResult = js.Thenable[scala.Unit] | ObservableLike | scala.Unit
  type Macro[Args /* <: js.Array[_] */, Context] = (UntitledMacro[Args, Context]) with avaLib.Anon_Args[Args]
  type OneOrMoreCbMacros[Args /* <: js.Array[_] */, Context] = (EitherCbMacro[Args, Context]) | (js.Array[EitherCbMacro[Args, Context]])
  type OneOrMoreMacros[Args /* <: js.Array[_] */, Context] = (EitherMacro[Args, Context]) | (js.Array[EitherMacro[Args, Context]])
  type TimeoutFn = js.Function1[/* ms */ scala.Double, scala.Unit]
  type TodoDeclaration = js.Function1[/* title */ java.lang.String, scala.Unit]
  type UntitledCbMacro[Args /* <: js.Array[_] */, Context] = js.Function2[/* t */ CbExecutionContext[Context], /* args */ Args, ImplementationResult]
  type UntitledMacro[Args /* <: js.Array[_] */, Context] = js.Function2[/* t */ ExecutionContext[Context], /* args */ Args, ImplementationResult]
}
