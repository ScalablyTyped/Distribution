package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointRoutesResult extends StObject {
  
  /**
    * The Multi-Region Access Point ARN.
    */
  var Mrap: js.UndefOr[MultiRegionAccessPointId] = js.undefined
  
  /**
    * The different routes that make up the route configuration. Active routes return a value of 100, and passive routes return a value of 0.
    */
  var Routes: js.UndefOr[RouteList] = js.undefined
}
object GetMultiRegionAccessPointRoutesResult {
  
  inline def apply(): GetMultiRegionAccessPointRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMultiRegionAccessPointRoutesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMultiRegionAccessPointRoutesResult] (val x: Self) extends AnyVal {
    
    inline def setMrap(value: MultiRegionAccessPointId): Self = StObject.set(x, "Mrap", value.asInstanceOf[js.Any])
    
    inline def setMrapUndefined: Self = StObject.set(x, "Mrap", js.undefined)
    
    inline def setRoutes(value: RouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    inline def setRoutesVarargs(value: MultiRegionAccessPointRoute*): Self = StObject.set(x, "Routes", js.Array(value*))
  }
}
