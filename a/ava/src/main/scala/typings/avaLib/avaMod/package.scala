package typings
package avaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object avaMod {
  type CbImplementation[Context] = js.Function1[/* t */ CbExecutionContext[Context], ImplementationResult]
  type CbMacroOrFirstArg[TitleOrMacro, Context] = (/* import warning: ImportType.apply Failed type conversion: ava.ava.InferArgs<TitleOrMacro>[0] */ js.Any) | (OneOrMoreCbMacros[js.Any, Context])
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type Implementation[Context] = js.Function1[/* t */ ExecutionContext[Context], ImplementationResult]
  type ImplementationResult = js.Thenable[scala.Unit] | ObservableLike | scala.Unit
  type InferArgs[OneOrMore] = js.Any
  type MacroOrFirstArg[TitleOrMacro, Context] = (/* import warning: ImportType.apply Failed type conversion: ava.ava.InferArgs<TitleOrMacro>[0] */ js.Any) | (OneOrMoreMacros[js.Any, Context])
  type OneOrMoreCbMacros[Args /* <: js.Array[_] */, Context] = (CbMacro[Args, Context]) | (js.Array[CbMacro[Args, Context]])
  type OneOrMoreMacros[Args /* <: js.Array[_] */, Context] = (Macro[Args, Context]) | (js.Array[Macro[Args, Context]])
  type RestArgs[TitleOrMacro, MacroOrFirstArg, Context] = Tail[InferArgs[TitleOrMacro]] | InferArgs[MacroOrFirstArg]
  type Tail[T /* <: js.Array[_] */] = js.Any
  type TimeoutFn = js.Function1[/* ms */ scala.Double, scala.Unit]
  type TitleOrCbMacro[Context] = java.lang.String | (OneOrMoreCbMacros[js.Any, Context])
  type TitleOrMacro[Context] = java.lang.String | (OneOrMoreMacros[js.Any, Context])
  type TodoDeclaration = js.Function1[/* title */ java.lang.String, scala.Unit]
}
