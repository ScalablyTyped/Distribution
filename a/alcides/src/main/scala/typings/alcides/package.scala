package typings.alcides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SetUpHook = js.Function1[/* cb */ js.Function0[Any], Unit]

type SuiteFunction = js.Function2[/* description */ String, /* cb */ js.Function0[Unit], Unit]

type TearDownHook = js.Function1[/* cb */ js.Function1[/* state */ Any, Unit], Unit]

type TestFunction = js.Function2[/* description */ String, /* cb */ js.Function1[/* state */ Any, Unit], Unit]
