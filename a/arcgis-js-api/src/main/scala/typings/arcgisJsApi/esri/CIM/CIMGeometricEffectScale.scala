package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectScale
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of change in size of a symbol in the x-axis. The value is expressed in terms of a ratio/percentage.
    */
  var XScaleFactor: js.UndefOr[Double] = js.native
  
  /**
    * The amount of change in size of a symbol in the y-axis. The value is expressed in terms of a ratio/percentage.
    */
  var YScaleFactor: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectScale: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale = js.native
}
object CIMGeometricEffectScale {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale): CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectScale]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectScaleMutableBuilder[Self <: CIMGeometricEffectScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXScaleFactor(value: Double): Self = StObject.set(x, "XScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXScaleFactorUndefined: Self = StObject.set(x, "XScaleFactor", js.undefined)
    
    @scala.inline
    def setYScaleFactor(value: Double): Self = StObject.set(x, "YScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYScaleFactorUndefined: Self = StObject.set(x, "YScaleFactor", js.undefined)
  }
}
