package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpressionReturnType extends StObject
@JSGlobal("__esri.CIM.ExpressionReturnType")
@js.native
object ExpressionReturnType extends StObject {
  
  /**
    * The return type of the expression is determined by the consumer using the expression.
    */
  @js.native
  sealed trait Default extends ExpressionReturnType
  
  /**
    * The return type of the expression is treated as a numeric value by all consumers.
    */
  @js.native
  sealed trait Numeric extends ExpressionReturnType
  
  /**
    * The return type of the expression is treated as a string by all consumers.
    */
  @js.native
  sealed trait String extends ExpressionReturnType
}
