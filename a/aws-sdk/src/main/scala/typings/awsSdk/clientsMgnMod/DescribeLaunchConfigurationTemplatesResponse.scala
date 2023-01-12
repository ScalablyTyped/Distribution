package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchConfigurationTemplatesResponse extends StObject {
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var items: js.UndefOr[LaunchConfigurationTemplates] = js.undefined
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeLaunchConfigurationTemplatesResponse {
  
  inline def apply(): DescribeLaunchConfigurationTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLaunchConfigurationTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: LaunchConfigurationTemplates): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LaunchConfigurationTemplate*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
