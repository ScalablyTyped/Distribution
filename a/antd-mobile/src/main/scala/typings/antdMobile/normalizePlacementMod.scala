package typings.antdMobile

import typings.antdMobile.popoverMod.DeprecatedPlacement
import typings.antdMobile.popoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizePlacementMod {
  
  @JSImport("antd-mobile/es/components/popover/normalize-placement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizePlacement(placement: DeprecatedPlacement): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[Placement]
  inline def normalizePlacement(placement: Placement): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
