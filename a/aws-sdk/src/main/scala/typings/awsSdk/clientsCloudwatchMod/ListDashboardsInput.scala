package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDashboardsInput extends StObject {
  
  /**
    * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_". 
    */
  var DashboardNamePrefix: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.DashboardNamePrefix] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object ListDashboardsInput {
  
  inline def apply(): ListDashboardsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDashboardsInput] (val x: Self) extends AnyVal {
    
    inline def setDashboardNamePrefix(value: DashboardNamePrefix): Self = StObject.set(x, "DashboardNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setDashboardNamePrefixUndefined: Self = StObject.set(x, "DashboardNamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
