package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionStatus extends StObject {
  
  /**
    * The expression that is evaluated for sorting while processing a search request.
    */
  var Options: Expression
  
  var Status: OptionStatus
}
object ExpressionStatus {
  
  inline def apply(Options: Expression, Status: OptionStatus): ExpressionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatus]
  }
  
  extension [Self <: ExpressionStatus](x: Self) {
    
    inline def setOptions(value: Expression): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
