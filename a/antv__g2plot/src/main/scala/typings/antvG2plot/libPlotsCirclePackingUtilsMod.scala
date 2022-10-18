package typings.antvG2plot

import typings.antvG2.libInterfaceMod.ViewAppendPadding
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.antvG2plot.anon.FinalPadding
import typings.antvG2plot.anon.Height
import typings.antvG2plot.anon.OmitHierarchyOptionastype
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsCirclePackingUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/circle-packing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolvePaddingForCircle(padding: ViewPadding, appendPadding: ViewAppendPadding, containerSize: Height): FinalPadding = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePaddingForCircle")(padding.asInstanceOf[js.Any], appendPadding.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any])).asInstanceOf[FinalPadding]
  
  inline def transformData(options: TransformDataOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  trait TransformDataOptions extends StObject {
    
    var data: js.UndefOr[Record[String, Any]] = js.undefined
    
    var enableDrillDown: Boolean
    
    var hierarchyConfig: js.UndefOr[OmitHierarchyOptionastype] = js.undefined
    
    var rawFields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TransformDataOptions {
    
    inline def apply(enableDrillDown: Boolean): TransformDataOptions = {
      val __obj = js.Dynamic.literal(enableDrillDown = enableDrillDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformDataOptions]
    }
    
    extension [Self <: TransformDataOptions](x: Self) {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnableDrillDown(value: Boolean): Self = StObject.set(x, "enableDrillDown", value.asInstanceOf[js.Any])
      
      inline def setHierarchyConfig(value: OmitHierarchyOptionastype): Self = StObject.set(x, "hierarchyConfig", value.asInstanceOf[js.Any])
      
      inline def setHierarchyConfigUndefined: Self = StObject.set(x, "hierarchyConfig", js.undefined)
      
      inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
      
      inline def setRawFieldsUndefined: Self = StObject.set(x, "rawFields", js.undefined)
      
      inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
    }
  }
}
