package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.violinTypesMod.ViolinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object violinAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/violin/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[ViolinOptions]): Params[ViolinOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ViolinOptions]]
  
  inline def animation(params: Params[ViolinOptions]): Params[ViolinOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ViolinOptions]]
}
