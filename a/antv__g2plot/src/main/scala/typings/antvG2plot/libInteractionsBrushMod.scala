package typings.antvG2plot

import typings.antvG2plot.anon.End
import typings.antvG2plot.anon.Processing
import typings.antvG2plot.anon.Rollback
import typings.antvG2plot.libTypesInteractionMod.BrushCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionsBrushMod {
  
  @JSImport("@antv/g2plot/lib/interactions/brush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInteractionCfg(interactionType: String): End | Processing | Rollback = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionCfg")(interactionType.asInstanceOf[js.Any]).asInstanceOf[End | Processing | Rollback]
  inline def getInteractionCfg(interactionType: String, brushType: String): End | Processing | Rollback = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionCfg")(interactionType.asInstanceOf[js.Any], brushType.asInstanceOf[js.Any])).asInstanceOf[End | Processing | Rollback]
  inline def getInteractionCfg(interactionType: String, brushType: String, options: BrushCfg): End | Processing | Rollback = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionCfg")(interactionType.asInstanceOf[js.Any], brushType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[End | Processing | Rollback]
  inline def getInteractionCfg(interactionType: String, brushType: Unit, options: BrushCfg): End | Processing | Rollback = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionCfg")(interactionType.asInstanceOf[js.Any], brushType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[End | Processing | Rollback]
}
