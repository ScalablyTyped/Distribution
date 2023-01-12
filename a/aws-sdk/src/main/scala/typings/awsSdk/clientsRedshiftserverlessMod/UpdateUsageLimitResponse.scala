package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUsageLimitResponse extends StObject {
  
  /**
    * The updated usage limit object.
    */
  var usageLimit: js.UndefOr[UsageLimit] = js.undefined
}
object UpdateUsageLimitResponse {
  
  inline def apply(): UpdateUsageLimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUsageLimitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUsageLimitResponse] (val x: Self) extends AnyVal {
    
    inline def setUsageLimit(value: UsageLimit): Self = StObject.set(x, "usageLimit", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitUndefined: Self = StObject.set(x, "usageLimit", js.undefined)
  }
}
