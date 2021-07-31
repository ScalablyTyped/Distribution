package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontEncoding extends StObject
@JSGlobal("__esri.CIM.FontEncoding")
@js.native
object FontEncoding extends StObject {
  
  /**
    * Symbol encoding.
    */
  @js.native
  sealed trait MSSymbol
    extends StObject
       with FontEncoding
  
  /**
    * Unicode.
    */
  @js.native
  sealed trait Unicode
    extends StObject
       with FontEncoding
}
