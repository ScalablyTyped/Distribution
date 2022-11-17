package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationPaginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination/Pagination", JSImport.Default)
  @js.native
  val default: FC[PaginationProps] = js.native
  
  trait PaginationConfig
    extends StObject
       with PaginationProps {
    
    var position: js.UndefOr[PaginationPosition] = js.undefined
  }
  object PaginationConfig {
    
    inline def apply(): PaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationConfig]
    }
    
    extension [Self <: PaginationConfig](x: Self) {
      
      inline def setPosition(value: PaginationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  object PaginationPosition {
    
    inline def both: "both" = "both".asInstanceOf["both"]
    
    inline def bottom: "bottom" = "bottom".asInstanceOf["bottom"]
    
    inline def top: "top" = "top".asInstanceOf["top"]
  }
  type PaginationPosition = "top" | "bottom" | "both"
  
  trait PaginationProps
    extends StObject
       with typings.rcPagination.mod.PaginationProps {
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr["default" | "small"] = js.undefined
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: "default" | "small"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
    }
  }
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPaginationPaginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
