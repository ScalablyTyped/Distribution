package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationsResponse extends StObject {
  
  /**
    * A key in the response map. The value is an array of data.
    */
  var configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined
}
object DescribeConfigurationsResponse {
  
  inline def apply(): DescribeConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: DescribeConfigurationsAttributes): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: DescribeConfigurationsAttribute*): Self = StObject.set(x, "configurations", js.Array(value*))
  }
}
