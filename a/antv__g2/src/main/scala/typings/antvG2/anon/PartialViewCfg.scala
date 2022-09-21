package typings.antvG2.anon

import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.Options
import typings.antvG2.libInterfaceMod.Region
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2.libInterfaceMod.ViewAppendPadding
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.ICanvas
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2.@antv/g2/lib/interface.ViewCfg> */
trait PartialViewCfg extends StObject {
  
  var appendPadding: js.UndefOr[ViewAppendPadding] = js.undefined
  
  var backgroundGroup: js.UndefOr[IGroup] = js.undefined
  
  var canvas: js.UndefOr[ICanvas] = js.undefined
  
  var foregroundGroup: js.UndefOr[IGroup] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var limitInPlot: js.UndefOr[Boolean] = js.undefined
  
  var middleGroup: js.UndefOr[IGroup] = js.undefined
  
  var options: js.UndefOr[Options] = js.undefined
  
  var padding: js.UndefOr[ViewPadding] = js.undefined
  
  var parent: js.UndefOr[View] = js.undefined
  
  var region: js.UndefOr[Region] = js.undefined
  
  var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
  
  var theme: js.UndefOr[LooseObject | String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialViewCfg {
  
  inline def apply(): PartialViewCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewCfg]
  }
  
  extension [Self <: PartialViewCfg](x: Self) {
    
    inline def setAppendPadding(value: ViewAppendPadding): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setBackgroundGroup(value: IGroup): Self = StObject.set(x, "backgroundGroup", value.asInstanceOf[js.Any])
    
    inline def setBackgroundGroupUndefined: Self = StObject.set(x, "backgroundGroup", js.undefined)
    
    inline def setCanvas(value: ICanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setForegroundGroup(value: IGroup): Self = StObject.set(x, "foregroundGroup", value.asInstanceOf[js.Any])
    
    inline def setForegroundGroupUndefined: Self = StObject.set(x, "foregroundGroup", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
    
    inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
    
    inline def setMiddleGroup(value: IGroup): Self = StObject.set(x, "middleGroup", value.asInstanceOf[js.Any])
    
    inline def setMiddleGroupUndefined: Self = StObject.set(x, "middleGroup", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setParent(value: View): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
    
    inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
    
    inline def setTheme(value: LooseObject | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
