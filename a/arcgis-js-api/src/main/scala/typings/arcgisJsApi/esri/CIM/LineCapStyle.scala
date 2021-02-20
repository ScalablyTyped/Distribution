package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineCapStyle extends StObject
@JSGlobal("__esri.CIM.LineCapStyle")
@js.native
object LineCapStyle extends StObject {
  
  /**
    * Stroke ends in butt caps.
    */
  @js.native
  sealed trait Butt extends LineCapStyle
  
  /**
    * Stroke ends in round caps.
    */
  @js.native
  sealed trait Round extends LineCapStyle
  
  /**
    * Stroke ends in square caps.
    */
  @js.native
  sealed trait Square extends LineCapStyle
}
