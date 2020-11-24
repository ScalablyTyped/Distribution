package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIM3DSymbolProperties extends js.Object {
  
  /**
    * The dominant size axis.
    */
  var dominantSizeAxis3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
  ] = js.native
  
  /**
    * The rotation order 3D.
    */
  var rotationOrder3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
  ] = js.native
  
  /**
    * The scale Y.
    */
  var scaleY: js.UndefOr[Double] = js.native
  
  /**
    * The scale Z.
    */
  var scaleZ: js.UndefOr[Double] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties = js.native
}
object CIM3DSymbolProperties {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties): CIM3DSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIM3DSymbolProperties]
  }
  
  @scala.inline
  implicit class CIM3DSymbolPropertiesOps[Self <: CIM3DSymbolProperties] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIM3DSymbolProperties): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantSizeAxis3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
    ): Self = this.set("dominantSizeAxis3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantSizeAxis3D: Self = this.set("dominantSizeAxis3D", js.undefined)
    
    @scala.inline
    def setRotationOrder3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RotationOrder * / any */ String
    ): Self = this.set("rotationOrder3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationOrder3D: Self = this.set("rotationOrder3D", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setScaleZ(value: Double): Self = this.set("scaleZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleZ: Self = this.set("scaleZ", js.undefined)
  }
}
