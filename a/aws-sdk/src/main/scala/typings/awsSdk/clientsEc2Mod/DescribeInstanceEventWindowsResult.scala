package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceEventWindowsResult extends StObject {
  
  /**
    * Information about the event windows.
    */
  var InstanceEventWindows: js.UndefOr[InstanceEventWindowSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInstanceEventWindowsResult {
  
  inline def apply(): DescribeInstanceEventWindowsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceEventWindowsResult]
  }
  
  extension [Self <: DescribeInstanceEventWindowsResult](x: Self) {
    
    inline def setInstanceEventWindows(value: InstanceEventWindowSet): Self = StObject.set(x, "InstanceEventWindows", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowsUndefined: Self = StObject.set(x, "InstanceEventWindows", js.undefined)
    
    inline def setInstanceEventWindowsVarargs(value: InstanceEventWindow*): Self = StObject.set(x, "InstanceEventWindows", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
