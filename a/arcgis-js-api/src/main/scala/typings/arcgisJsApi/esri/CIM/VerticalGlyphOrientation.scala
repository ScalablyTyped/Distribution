package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalGlyphOrientation extends StObject
@JSGlobal("__esri.CIM.VerticalGlyphOrientation")
@js.native
object VerticalGlyphOrientation extends StObject {
  
  /**
    * Align right.
    */
  @js.native
  sealed trait Right
    extends StObject
       with VerticalGlyphOrientation
  
  /**
    * Align upright.
    */
  @js.native
  sealed trait Upright
    extends StObject
       with VerticalGlyphOrientation
}
