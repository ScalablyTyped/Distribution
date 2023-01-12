package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRule extends StObject {
  
  /**
    * The comparison operator.
    */
  var comparisonOperator: ComparisonOperator
  
  /**
    * The value on the left side of the comparison operator. You can specify an AWS IoT Events input attribute as an input property.
    */
  var inputProperty: InputProperty
  
  /**
    * The value on the right side of the comparison operator. You can enter a number or specify an AWS IoT Events input attribute.
    */
  var threshold: Threshold
}
object SimpleRule {
  
  inline def apply(comparisonOperator: ComparisonOperator, inputProperty: InputProperty, threshold: Threshold): SimpleRule = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], inputProperty = inputProperty.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleRule] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setInputProperty(value: InputProperty): Self = StObject.set(x, "inputProperty", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Threshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
