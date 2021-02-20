package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSymbol3DProperties extends Symbol3DProperties {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: js.UndefOr[Callout3DProperties] = js.native
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[LabelSymbol3DVerticalOffsetProperties] = js.native
}
object LabelSymbol3DProperties {
  
  @scala.inline
  def apply(): LabelSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSymbol3DProperties]
  }
  
  @scala.inline
  implicit class LabelSymbol3DPropertiesMutableBuilder[Self <: LabelSymbol3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallout(value: Callout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: LabelSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
