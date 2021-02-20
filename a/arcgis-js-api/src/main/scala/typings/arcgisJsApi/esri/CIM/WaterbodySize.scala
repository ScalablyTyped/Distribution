package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WaterbodySize extends StObject
@JSGlobal("__esri.CIM.WaterbodySize")
@js.native
object WaterbodySize extends StObject {
  
  /**
    * Large water body.
    */
  @js.native
  sealed trait Large extends WaterbodySize
  
  /**
    * Medium water body.
    */
  @js.native
  sealed trait Medium extends WaterbodySize
  
  /**
    * Small water body.
    */
  @js.native
  sealed trait Small extends WaterbodySize
}
