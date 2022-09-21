package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.tinyAreaTypesMod.TinyAreaOptions
import typings.antvG2plot.tinyColumnTypesMod.TinyColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tinyColumnAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-column/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TinyColumnOptions]): Params[TinyColumnOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyColumnOptions]]
  
  inline def meta(params: Params[TinyAreaOptions]): Params[TinyAreaOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TinyAreaOptions]]
}
