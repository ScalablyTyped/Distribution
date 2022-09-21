package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResult extends StObject {
  
  var Application: js.UndefOr[typings.awsSdk.appstreamMod.Application] = js.undefined
}
object UpdateApplicationResult {
  
  inline def apply(): UpdateApplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResult]
  }
  
  extension [Self <: UpdateApplicationResult](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
  }
}
