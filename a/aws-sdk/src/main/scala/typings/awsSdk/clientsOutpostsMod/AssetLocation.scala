package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetLocation extends StObject {
  
  /**
    *  The position of an asset in a rack measured in rack units. 
    */
  var RackElevation: js.UndefOr[typings.awsSdk.clientsOutpostsMod.RackElevation] = js.undefined
}
object AssetLocation {
  
  inline def apply(): AssetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetLocation] (val x: Self) extends AnyVal {
    
    inline def setRackElevation(value: RackElevation): Self = StObject.set(x, "RackElevation", value.asInstanceOf[js.Any])
    
    inline def setRackElevationUndefined: Self = StObject.set(x, "RackElevation", js.undefined)
  }
}
