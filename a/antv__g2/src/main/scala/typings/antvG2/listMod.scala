package typings.antvG2

import typings.antvG2.facetFacetMod.Facet
import typings.antvG2.libInterfaceMod.ListCfg
import typings.antvG2.libInterfaceMod.ListData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@antv/g2/lib/facet/list", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antvG2.listMod.List
  
  @js.native
  trait List extends Facet[ListCfg, ListData] {
    
    /**
      * 计算分页数
      * @param total
      * @param pageSize
      */
    /* private */ var getPageCount: Any = js.native
    
    /**
      * 索引值在哪一页
      * @param index
      * @param pageSize
      */
    /* private */ var getRowCol: Any = js.native
    
    /**
      * facet title
      */
    /* private */ var renderTitle: Any = js.native
  }
}
