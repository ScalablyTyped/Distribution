package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.small
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod extends Shortcut {
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.top
    - typings.antd.antdStrings.bottom
    - typings.antd.antdStrings.both
  */
  trait PaginationPosition extends StObject
  object PaginationPosition {
    
    inline def both: typings.antd.antdStrings.both = "both".asInstanceOf[typings.antd.antdStrings.both]
    
    inline def bottom: typings.antd.antdStrings.bottom = "bottom".asInstanceOf[typings.antd.antdStrings.bottom]
    
    inline def top: typings.antd.antdStrings.top = "top".asInstanceOf[typings.antd.antdStrings.top]
  }
  
  trait PaginationProps
    extends StObject
       with typings.rcPagination.mod.PaginationProps {
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
    
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
      
      inline def setSize(value: typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
    }
  }
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `paginationPaginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
