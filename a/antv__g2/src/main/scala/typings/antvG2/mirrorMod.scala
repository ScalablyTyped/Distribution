package typings.antvG2

import typings.antvG2.facetFacetMod.Facet
import typings.antvG2.libInterfaceMod.MirrorCfg
import typings.antvG2.libInterfaceMod.MirrorData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorMod {
  
  @JSImport("@antv/g2/lib/facet/mirror", JSImport.Default)
  @js.native
  open class default () extends Mirror
  
  @js.native
  trait Mirror extends Facet[MirrorCfg, MirrorData] {
    
    /* private */ var renderTitle: Any = js.native
  }
}
