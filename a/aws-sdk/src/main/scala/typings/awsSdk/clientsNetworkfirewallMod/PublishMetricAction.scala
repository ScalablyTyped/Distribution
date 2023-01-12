package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishMetricAction extends StObject {
  
  /**
    * 
    */
  var Dimensions: typings.awsSdk.clientsNetworkfirewallMod.Dimensions
}
object PublishMetricAction {
  
  inline def apply(Dimensions: Dimensions): PublishMetricAction = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMetricAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishMetricAction] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
  }
}
