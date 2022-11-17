package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.HorizontalSize
import typings.antd.libConfigProviderSizeContextMod.SizeType
import typings.antd.libSpaceCompactMod.SpaceCompactProps
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpaceMod extends Shortcut {
  
  @JSImport("antd/lib/space", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/space", "SpaceContext")
  @js.native
  val SpaceContext: Context[HorizontalSize] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[SpaceProps] {
    
    var Compact: FC[SpaceCompactProps] = js.native
  }
  
  trait SpaceProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr["start" | "end" | "center" | "baseline"] = js.undefined
    
    var direction: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])] = js.undefined
    
    var split: js.UndefOr[ReactNode] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object SpaceProps {
    
    inline def apply(): SpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceProps]
    }
    
    extension [Self <: SpaceProps](x: Self) {
      
      inline def setAlign(value: "start" | "end" | "center" | "baseline"): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDirection(value: "horizontal" | "vertical"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: ReactNode): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type SpaceSize = SizeType | Double
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libSpaceMod.foo` */
  override def _to: CompoundedComponent = default
}
