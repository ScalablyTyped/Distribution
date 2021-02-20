package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolUnits extends StObject
@JSGlobal("__esri.CIM.SymbolUnits")
@js.native
object SymbolUnits extends StObject {
  
  /**
    * Absolute units.
    */
  @js.native
  sealed trait Absolute extends SymbolUnits
  
  /**
    * Relative units.
    */
  @js.native
  sealed trait Relative extends SymbolUnits
}
