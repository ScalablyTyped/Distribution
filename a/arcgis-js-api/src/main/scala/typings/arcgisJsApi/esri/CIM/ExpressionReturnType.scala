package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpressionReturnType extends js.Object
@JSGlobal("__esri.CIM.ExpressionReturnType")
@js.native
object ExpressionReturnType extends js.Object {
  
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
