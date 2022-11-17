package typings.antd

import typings.antd.anon.CompactDirection
import typings.antd.anon.PropsWithChildren
import typings.antd.libConfigProviderContextMod.DirectionType
import typings.antd.libConfigProviderSizeContextMod.SizeType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpaceCompactMod {
  
  @JSImport("antd/lib/space/Compact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/space/Compact", JSImport.Default)
  @js.native
  val default: FC[SpaceCompactProps] = js.native
  
  @JSImport("antd/lib/space/Compact", "NoCompactStyle")
  @js.native
  val NoCompactStyle: FC[PropsWithChildren] = js.native
  
  @JSImport("antd/lib/space/Compact", "SpaceCompactItemContext")
  @js.native
  val SpaceCompactItemContext: Context[SpaceCompactItemContextType | Null] = js.native
  
  inline def useCompactItemContext(prefixCls: String, direction: DirectionType): CompactDirection = (^.asInstanceOf[js.Dynamic].applyDynamic("useCompactItemContext")(prefixCls.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[CompactDirection]
  
  trait SpaceCompactItemContextType extends StObject {
    
    var compactDirection: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var compactSize: js.UndefOr[SizeType] = js.undefined
    
    var isFirstItem: js.UndefOr[Boolean] = js.undefined
    
    var isLastItem: js.UndefOr[Boolean] = js.undefined
  }
  object SpaceCompactItemContextType {
    
    inline def apply(): SpaceCompactItemContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceCompactItemContextType]
    }
    
    extension [Self <: SpaceCompactItemContextType](x: Self) {
      
      inline def setCompactDirection(value: "horizontal" | "vertical"): Self = StObject.set(x, "compactDirection", value.asInstanceOf[js.Any])
      
      inline def setCompactDirectionUndefined: Self = StObject.set(x, "compactDirection", js.undefined)
      
      inline def setCompactSize(value: SizeType): Self = StObject.set(x, "compactSize", value.asInstanceOf[js.Any])
      
      inline def setCompactSizeUndefined: Self = StObject.set(x, "compactSize", js.undefined)
      
      inline def setIsFirstItem(value: Boolean): Self = StObject.set(x, "isFirstItem", value.asInstanceOf[js.Any])
      
      inline def setIsFirstItemUndefined: Self = StObject.set(x, "isFirstItem", js.undefined)
      
      inline def setIsLastItem(value: Boolean): Self = StObject.set(x, "isLastItem", value.asInstanceOf[js.Any])
      
      inline def setIsLastItemUndefined: Self = StObject.set(x, "isLastItem", js.undefined)
    }
  }
  
  trait SpaceCompactProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
  }
  object SpaceCompactProps {
    
    inline def apply(): SpaceCompactProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceCompactProps]
    }
    
    extension [Self <: SpaceCompactProps](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setDirection(value: "horizontal" | "vertical"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
