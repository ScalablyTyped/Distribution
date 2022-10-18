package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceInformationResult extends StObject {
  
  /**
    * The managed node information list.
    */
  var InstanceInformationList: js.UndefOr[typings.awsSdk.clientsSsmMod.InstanceInformationList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeInstanceInformationResult {
  
  inline def apply(): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
  
  extension [Self <: DescribeInstanceInformationResult](x: Self) {
    
    inline def setInstanceInformationList(value: InstanceInformationList): Self = StObject.set(x, "InstanceInformationList", value.asInstanceOf[js.Any])
    
    inline def setInstanceInformationListUndefined: Self = StObject.set(x, "InstanceInformationList", js.undefined)
    
    inline def setInstanceInformationListVarargs(value: InstanceInformation*): Self = StObject.set(x, "InstanceInformationList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
