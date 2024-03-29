package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParameterRange extends StObject {
  
  /**
    * The maximum tunable value of the hyperparameter.
    */
  var MaxValue: Integer
  
  /**
    * The minimum tunable value of the hyperparameter.
    */
  var MinValue: Integer
  
  /**
    * The name of the hyperparameter to tune.
    */
  var Name: typings.awsSdk.clientsForecastserviceMod.Name
  
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. Valid values:  Auto  Amazon Forecast hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have values greater than 0.  ReverseLogarithmic  Not supported for IntegerParameterRange. Reverse logarithmic scaling works only for ranges that are entirely within the range 0 &lt;= x &lt; 1.0.   For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:
    */
  var ScalingType: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ScalingType] = js.undefined
}
object IntegerParameterRange {
  
  inline def apply(MaxValue: Integer, MinValue: Integer, Name: Name): IntegerParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerParameterRange] (val x: Self) extends AnyVal {
    
    inline def setMaxValue(value: Integer): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Integer): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScalingType(value: ScalingType): Self = StObject.set(x, "ScalingType", value.asInstanceOf[js.Any])
    
    inline def setScalingTypeUndefined: Self = StObject.set(x, "ScalingType", js.undefined)
  }
}
