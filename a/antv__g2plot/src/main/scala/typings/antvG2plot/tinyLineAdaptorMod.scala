package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.tinyAreaTypesMod.TinyAreaOptions
import typings.antvG2plot.tinyLineTypesMod.TinyLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tinyLineAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-line/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TinyLineOptions]): Params[TinyLineOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyLineOptions]]
  
  inline def meta(params: Params[TinyAreaOptions]): Params[TinyAreaOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyAreaOptions]]
}
