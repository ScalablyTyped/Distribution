package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMaterialSymbolLayer
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The material color.
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The mode in which the material is applied.
    */
  var materialMode: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMMaterialSymbolLayer: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer = js.native
}
object CIMMaterialSymbolLayer {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer): CIMMaterialSymbolLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMaterialSymbolLayer]
  }
  
  @scala.inline
  implicit class CIMMaterialSymbolLayerOps[Self <: CIMMaterialSymbolLayer] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setMaterialMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
    ): Self = this.set("materialMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterialMode: Self = this.set("materialMode", js.undefined)
  }
}
