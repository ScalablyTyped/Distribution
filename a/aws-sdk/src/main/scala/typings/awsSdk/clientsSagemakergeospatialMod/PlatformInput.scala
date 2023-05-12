package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformInput extends StObject {
  
  /**
    * The ComparisonOperator to use with PlatformInput.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ComparisonOperator] = js.undefined
  
  /**
    * The value of the platform.
    */
  var Value: String
}
object PlatformInput {
  
  inline def apply(Value: String): PlatformInput = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformInput] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
