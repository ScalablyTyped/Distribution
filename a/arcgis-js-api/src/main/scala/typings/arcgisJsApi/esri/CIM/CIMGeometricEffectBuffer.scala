package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectBuffer
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance from the feature. This distance is either from the edge of the marker, the edge of the stroke or the edge of the polygon outline.
    */
  var size: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectBuffer: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer = js.native
}
object CIMGeometricEffectBuffer {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectBuffer]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectBufferMutableBuilder[Self <: CIMGeometricEffectBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
