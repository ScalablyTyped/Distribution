package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMColorSubstitution extends StObject {
  
  /**
    * The new color that will replace the old color.
    */
  var newColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The old color (the color that will be substituted).
    */
  var oldColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMColorSubstitution
}
object CIMColorSubstitution {
  
  @scala.inline
  def apply(): CIMColorSubstitution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMColorSubstitution")
    __obj.asInstanceOf[CIMColorSubstitution]
  }
  
  @scala.inline
  implicit class CIMColorSubstitutionMutableBuilder[Self <: CIMColorSubstitution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewColor(value: js.Array[Double]): Self = StObject.set(x, "newColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColorUndefined: Self = StObject.set(x, "newColor", js.undefined)
    
    @scala.inline
    def setNewColorVarargs(value: Double*): Self = StObject.set(x, "newColor", js.Array(value :_*))
    
    @scala.inline
    def setOldColor(value: js.Array[Double]): Self = StObject.set(x, "oldColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldColorUndefined: Self = StObject.set(x, "oldColor", js.undefined)
    
    @scala.inline
    def setOldColorVarargs(value: Double*): Self = StObject.set(x, "oldColor", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMColorSubstitution): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
