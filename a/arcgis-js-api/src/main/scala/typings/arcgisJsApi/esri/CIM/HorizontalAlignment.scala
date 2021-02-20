package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends StObject
@JSGlobal("__esri.CIM.HorizontalAlignment")
@js.native
object HorizontalAlignment extends StObject {
  
  /**
    * Centered.
    */
  @js.native
  sealed trait Center extends HorizontalAlignment
  
  /**
    * Justified alignment.
    */
  @js.native
  sealed trait Justify extends HorizontalAlignment
  
  /**
    * Left aligned.
    */
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  /**
    * Right aligned.
    */
  @js.native
  sealed trait Right extends HorizontalAlignment
}
