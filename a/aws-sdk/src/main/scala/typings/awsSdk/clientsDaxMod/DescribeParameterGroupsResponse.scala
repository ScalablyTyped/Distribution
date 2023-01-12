package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeParameterGroupsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of parameter groups. Each element in the array represents one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
}
object DescribeParameterGroupsResponse {
  
  inline def apply(): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeParameterGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameterGroups(value: ParameterGroupList): Self = StObject.set(x, "ParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupsUndefined: Self = StObject.set(x, "ParameterGroups", js.undefined)
    
    inline def setParameterGroupsVarargs(value: ParameterGroup*): Self = StObject.set(x, "ParameterGroups", js.Array(value*))
  }
}
