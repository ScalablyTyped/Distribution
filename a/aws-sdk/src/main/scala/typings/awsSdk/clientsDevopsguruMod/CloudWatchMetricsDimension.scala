package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchMetricsDimension extends StObject {
  
  /**
    *  The name of the CloudWatch dimension. 
    */
  var Name: js.UndefOr[CloudWatchMetricsDimensionName] = js.undefined
  
  /**
    *  The value of the CloudWatch dimension. 
    */
  var Value: js.UndefOr[CloudWatchMetricsDimensionValue] = js.undefined
}
object CloudWatchMetricsDimension {
  
  inline def apply(): CloudWatchMetricsDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchMetricsDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchMetricsDimension] (val x: Self) extends AnyVal {
    
    inline def setName(value: CloudWatchMetricsDimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: CloudWatchMetricsDimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
