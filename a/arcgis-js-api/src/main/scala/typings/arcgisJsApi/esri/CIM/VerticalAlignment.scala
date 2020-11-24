package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlignment extends js.Object
@JSGlobal("__esri.CIM.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  
  /**
    * Text is aligned so that the geometry lines up with the baseline of the text symbol. Descenders will go past the baseline.
    */
  @js.native
  sealed trait Baseline extends VerticalAlignment
  
  /**
    * Bottom of the lowest descender is used to align the text.
    */
  @js.native
  sealed trait Bottom extends VerticalAlignment
  
  /**
    * Text is centered on the geometry.
    */
  @js.native
  sealed trait Center extends VerticalAlignment
  
  /**
    * Top of the highest ascender in the text symbol is used to align the text.
    */
  @js.native
  sealed trait Top extends VerticalAlignment
}
