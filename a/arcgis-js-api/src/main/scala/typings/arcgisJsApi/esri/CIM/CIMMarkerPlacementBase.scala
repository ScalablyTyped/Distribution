package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementBase extends StObject {
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object CIMMarkerPlacementBase {
  
  @scala.inline
  def apply(`type`: String): CIMMarkerPlacementBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementBase]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementBaseMutableBuilder[Self <: CIMMarkerPlacementBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
