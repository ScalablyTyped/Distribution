package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointResult extends StObject {
  
  /**
    * A container element containing the details of the requested Multi-Region Access Point.
    */
  var AccessPoint: js.UndefOr[MultiRegionAccessPointReport] = js.undefined
}
object GetMultiRegionAccessPointResult {
  
  inline def apply(): GetMultiRegionAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMultiRegionAccessPointResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMultiRegionAccessPointResult] (val x: Self) extends AnyVal {
    
    inline def setAccessPoint(value: MultiRegionAccessPointReport): Self = StObject.set(x, "AccessPoint", value.asInstanceOf[js.Any])
    
    inline def setAccessPointUndefined: Self = StObject.set(x, "AccessPoint", js.undefined)
  }
}
