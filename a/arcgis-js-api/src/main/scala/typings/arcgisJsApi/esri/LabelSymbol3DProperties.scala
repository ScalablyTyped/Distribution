package typings.arcgisJsApi.esri

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
  implicit class LabelSymbol3DPropertiesOps[Self <: LabelSymbol3DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallout(value: Callout3DProperties): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: LabelSymbol3DVerticalOffsetProperties): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
  }
}
