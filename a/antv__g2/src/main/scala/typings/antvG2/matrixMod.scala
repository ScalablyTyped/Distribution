package typings.antvG2

import typings.antvG2.facetFacetMod.Facet
import typings.antvG2.libInterfaceMod.MatrixCfg
import typings.antvG2.libInterfaceMod.MatrixData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("@antv/g2/lib/facet/matrix", JSImport.Default)
  @js.native
  open class default () extends Matrix
  
  @js.native
  trait Matrix extends Facet[MatrixCfg, MatrixData] {
    
    /**
      * facet title
      */
    /* private */ var renderTitle: Any = js.native
  }
}
