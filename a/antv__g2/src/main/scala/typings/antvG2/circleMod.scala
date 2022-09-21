package typings.antvG2

import typings.antvG2.anon.End
import typings.antvG2.facetFacetMod.Facet
import typings.antvG2.libInterfaceMod.CircleCfg
import typings.antvG2.libInterfaceMod.CircleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("@antv/g2/lib/facet/circle", JSImport.Default)
  @js.native
  open class default () extends Circle
  
  @js.native
  trait Circle extends Facet[CircleCfg, CircleData] {
    
    /**
      * 根据总数和当前索引，计算分面的 region
      * @param count
      * @param index
      */
    /* protected */ def getRegion(count: Double, index: Double): End = js.native
    
    /**
      * facet title
      */
    /* private */ var renderTitle: Any = js.native
  }
}
