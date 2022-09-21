package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("@antv/g2plot/lib/utils/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flow[P](flows: FlowFunction[P]*): FlowFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(flows.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FlowFunction[P]]
  
  type FlowFunction[P] = js.Function1[/* param */ P, P]
}
