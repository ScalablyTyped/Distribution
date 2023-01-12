package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResult extends StObject {
  
  var Application: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Application] = js.undefined
}
object UpdateApplicationResult {
  
  inline def apply(): UpdateApplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationResult] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
  }
}
