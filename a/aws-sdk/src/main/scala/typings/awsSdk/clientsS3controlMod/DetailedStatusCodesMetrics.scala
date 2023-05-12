package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedStatusCodesMetrics extends StObject {
  
  /**
    * A container that indicates whether detailed status code metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.clientsS3controlMod.IsEnabled] = js.undefined
}
object DetailedStatusCodesMetrics {
  
  inline def apply(): DetailedStatusCodesMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailedStatusCodesMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailedStatusCodesMetrics] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
  }
}
