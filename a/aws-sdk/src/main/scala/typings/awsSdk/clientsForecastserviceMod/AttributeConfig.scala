package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeConfig extends StObject {
  
  /**
    * The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the target time series and the related time series datasets. For example, for the RETAIL domain, the target is demand.
    */
  var AttributeName: Name
  
  /**
    * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to override the default values. Related Time Series attributes do not accept aggregation parameters. The following list shows the parameters and their valid values for the "filling" featurization method for a Target Time Series dataset. Default values are bolded.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number), value, median, mean, min, max     backfill: zero, nan, value, median, mean, min, max    The following list shows the parameters and their valid values for a Related Time Series featurization method (there are no defaults):    middlefill: zero, value, median, mean, min, max     backfill: zero, value, median, mean, min, max     futurefill: zero, value, median, mean, min, max    To set a filling method to a specific value, set the fill parameter to value and define the value in a corresponding _value parameter. For example, to set backfilling to a value of 2, include the following: "backfill": "value" and "backfill_value":"2". 
    */
  var Transformations: typings.awsSdk.clientsForecastserviceMod.Transformations
}
object AttributeConfig {
  
  inline def apply(AttributeName: Name, Transformations: Transformations): AttributeConfig = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Transformations = Transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeConfig] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setTransformations(value: Transformations): Self = StObject.set(x, "Transformations", value.asInstanceOf[js.Any])
  }
}
