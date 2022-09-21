package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.tinyAreaTypesMod.TinyAreaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tinyAreaAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-area/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TinyAreaOptions]): Params[TinyAreaOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyAreaOptions]]
  
  inline def meta(params: Params[TinyAreaOptions]): Params[TinyAreaOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyAreaOptions]]
}
