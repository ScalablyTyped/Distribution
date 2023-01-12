package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchDestination extends StObject {
  
  /**
    * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations
}
object CloudWatchDestination {
  
  inline def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchDestination] (val x: Self) extends AnyVal {
    
    inline def setDimensionConfigurations(value: CloudWatchDimensionConfigurations): Self = StObject.set(x, "DimensionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDimensionConfigurationsVarargs(value: CloudWatchDimensionConfiguration*): Self = StObject.set(x, "DimensionConfigurations", js.Array(value*))
  }
}
