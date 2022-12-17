package typings.antvG2plot

import typings.antvG2plot.anon.OmitHierarchyOptionastypeIgnoreParentValue
import typings.antvG2plot.libPlotsTreemapTypesMod.TreemapOptions
import typings.antvG2plot.libTypesInteractionMod.Interaction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTreemapUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/treemap/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableDrillInteraction(options: TreemapOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDrillInteraction")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def enableInteraction(interactions: js.Array[Interaction], interactionType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enableInteraction")(interactions.asInstanceOf[js.Any], interactionType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def enableInteraction(interactions: Unit, interactionType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("enableInteraction")(interactions.asInstanceOf[js.Any], interactionType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findInteraction(interactions: js.Array[Interaction], interactionType: String): js.UndefOr[Interaction] = (^.asInstanceOf[js.Dynamic].applyDynamic("findInteraction")(interactions.asInstanceOf[js.Any], interactionType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Interaction]]
  inline def findInteraction(interactions: Unit, interactionType: String): js.UndefOr[Interaction] = (^.asInstanceOf[js.Dynamic].applyDynamic("findInteraction")(interactions.asInstanceOf[js.Any], interactionType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Interaction]]
  
  inline def resetDrillDown(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDrillDown")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def transformData(options: TransformDataOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  trait TransformDataOptions extends StObject {
    
    var colorField: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Record[String, Any]] = js.undefined
    
    var enableDrillDown: Boolean
    
    var hierarchyConfig: js.UndefOr[OmitHierarchyOptionastypeIgnoreParentValue] = js.undefined
  }
  object TransformDataOptions {
    
    inline def apply(enableDrillDown: Boolean): TransformDataOptions = {
      val __obj = js.Dynamic.literal(enableDrillDown = enableDrillDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformDataOptions]
    }
    
    extension [Self <: TransformDataOptions](x: Self) {
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnableDrillDown(value: Boolean): Self = StObject.set(x, "enableDrillDown", value.asInstanceOf[js.Any])
      
      inline def setHierarchyConfig(value: OmitHierarchyOptionastypeIgnoreParentValue): Self = StObject.set(x, "hierarchyConfig", value.asInstanceOf[js.Any])
      
      inline def setHierarchyConfigUndefined: Self = StObject.set(x, "hierarchyConfig", js.undefined)
    }
  }
}
