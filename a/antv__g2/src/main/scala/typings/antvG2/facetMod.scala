package typings.antvG2

import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetCtor
import typings.antvG2.libInterfaceMod.FacetData
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetMod {
  
  @JSImport("@antv/g2/lib/facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/facet", "Facet")
  @js.native
  abstract class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
    extends typings.antvG2.facetFacetMod.Facet[C, F] {
    def this(view: View, cfg: C) = this()
  }
  
  inline def getFacet(`type`: String): FacetCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacet")(`type`.asInstanceOf[js.Any]).asInstanceOf[FacetCtor]
  
  inline def registerFacet(`type`: String, ctor: FacetCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFacet")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
