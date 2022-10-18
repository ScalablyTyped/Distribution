package typings.antvCoord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsComposeMod {
  
  @JSImport("@antv/coord/lib/utils/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose[T](fn: js.Function1[/* x */ T, T], rest: (js.Function1[/* x */ T, T])*): js.Function1[/* x */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(scala.List(fn.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* x */ T, T]]
  inline def compose[T](fn: Unit, rest: (js.Function1[/* x */ T, T])*): js.Function1[/* x */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(scala.List(fn.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* x */ T, T]]
}
