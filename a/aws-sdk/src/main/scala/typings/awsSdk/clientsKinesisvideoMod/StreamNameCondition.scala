package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamNameCondition extends StObject {
  
  /**
    * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ComparisonOperator] = js.undefined
  
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[StreamName] = js.undefined
}
object StreamNameCondition {
  
  inline def apply(): StreamNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamNameCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamNameCondition] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setComparisonValue(value: StreamName): Self = StObject.set(x, "ComparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "ComparisonValue", js.undefined)
  }
}
