package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Call to declare a test, or chain to declare hooks or test modifiers */
@scala.inline
def default: typings.ava.mod.TestInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typings.ava.mod.TestInterface[js.Any]]

@scala.inline
def after: typings.ava.mod.AfterInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("after").asInstanceOf[typings.ava.mod.AfterInterface[js.Any]]

@scala.inline
def afterEach: typings.ava.mod.AfterInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typings.ava.mod.AfterInterface[js.Any]]

@scala.inline
def before: typings.ava.mod.BeforeInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("before").asInstanceOf[typings.ava.mod.BeforeInterface[js.Any]]

@scala.inline
def beforeEach: typings.ava.mod.BeforeInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typings.ava.mod.BeforeInterface[js.Any]]

@scala.inline
def cb: typings.ava.mod.CbInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cb").asInstanceOf[typings.ava.mod.CbInterface[js.Any]]

@scala.inline
def failing: typings.ava.mod.FailingInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("failing").asInstanceOf[typings.ava.mod.FailingInterface[js.Any]]

@scala.inline
def meta: typings.ava.mod.MetaInterface = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("meta").asInstanceOf[typings.ava.mod.MetaInterface]

@scala.inline
def only: typings.ava.mod.OnlyInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("only").asInstanceOf[typings.ava.mod.OnlyInterface[js.Any]]

@scala.inline
def serial: typings.ava.mod.SerialInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("serial").asInstanceOf[typings.ava.mod.SerialInterface[js.Any]]

@scala.inline
def skip: typings.ava.mod.SkipInterface[js.Any] = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("skip").asInstanceOf[typings.ava.mod.SkipInterface[js.Any]]

@scala.inline
def todo: typings.ava.mod.TodoDeclaration = typings.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("todo").asInstanceOf[typings.ava.mod.TodoDeclaration]

type AssertionError = typings.std.Error

type CbImplementation[Context] = js.Function1[
/* t */ typings.ava.mod.CbExecutionContext[Context], 
typings.ava.mod.ImplementationResult]

type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]

type EitherCbMacro[Args /* <: js.Array[js.Any] */, Context] = (typings.ava.mod.CbMacro[Args, Context]) | (typings.ava.mod.UntitledCbMacro[Args, Context])

type EitherMacro[Args /* <: js.Array[js.Any] */, Context] = (typings.ava.mod.Macro[Args, Context]) | (typings.ava.mod.UntitledMacro[Args, Context])

type Implementation[Context] = js.Function1[
/* t */ typings.ava.mod.ExecutionContext[Context], 
typings.ava.mod.ImplementationResult]

type ImplementationResult = js.Thenable[scala.Unit] | typings.ava.mod.Subscribable | scala.Unit

type OneOrMoreCbMacros[Args /* <: js.Array[js.Any] */, Context] = (typings.ava.mod.EitherCbMacro[Args, Context]) | (Array[typings.ava.mod.EitherCbMacro[Args, Context]])

type OneOrMoreMacros[Args /* <: js.Array[js.Any] */, Context] = (typings.ava.mod.EitherMacro[Args, Context]) | (Array[typings.ava.mod.EitherMacro[Args, Context]])

type TeardownFn = js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]

type TimeoutFn = js.Function2[/* ms */ scala.Double, /* message */ js.UndefOr[java.lang.String], scala.Unit]

type TodoDeclaration = js.Function1[/* title */ java.lang.String, scala.Unit]

type UntitledCbMacro[Args /* <: js.Array[js.Any] */, Context] = js.Function2[
/* t */ typings.ava.mod.CbExecutionContext[Context], 
/* args */ Args, 
typings.ava.mod.ImplementationResult]

type UntitledMacro[Args /* <: js.Array[js.Any] */, Context] = js.Function2[
/* t */ typings.ava.mod.ExecutionContext[Context], 
/* args */ Args, 
typings.ava.mod.ImplementationResult]
