package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesInteractionMod.BrushCfg
import typings.antvG2plot.libTypesInteractionMod.Interaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorBrushMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/brush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def brushInteraction[O /* <: Options */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("brushInteraction")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  /* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'interactions'> & {  brush :@antv/g2plot.@antv/g2plot/lib/types.BrushCfg | undefined} */
  trait Options extends StObject {
    
    var brush: js.UndefOr[BrushCfg] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBrush(value: BrushCfg): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
      
      inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
    }
  }
}
