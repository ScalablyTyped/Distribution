package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMStroke extends CIMSymbolLayerBase {
  
  /**
    * How the stroke should draw at the ends of the geometries.
    */
  var capStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCapStyle * / any */ String
  ] = js.native
  
  /**
    * A value indicating whether to close caps when drawing them in 3D. When set to false, the caps are hollow.
    */
  var closeCaps3D: js.UndefOr[Boolean] = js.native
  
  /**
    * How the symbol is drawn at the stroke segment connections.
    */
  var joinStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineJoinStyle * / any */ String
  ] = js.native
  
  /**
    * How strokes will be rendered in 3D.
    */
  var lineStyle3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Simple3DLineStyle * / any */ String
  ] = js.native
  
  /**
    * The maximum 'sharpness' that is allowed for Miter joins. If the spike created by the miter join exceeds the miter limit times the width of the stroke, the sharp angle will be clipped and rendered with a bevel join. This property is only applied to the symbol layer when the JoinType is set to Miter.
    */
  var miterLimit: js.UndefOr[Double] = js.native
  
  /**
    * The width of the stroke.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMStroke {
  
  @scala.inline
  def apply(`type`: String): CIMStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMStroke]
  }
  
  @scala.inline
  implicit class CIMStrokeOps[Self <: CIMStroke] (val x: Self) extends AnyVal {
    
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
    def setCapStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCapStyle * / any */ String
    ): Self = this.set("capStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapStyle: Self = this.set("capStyle", js.undefined)
    
    @scala.inline
    def setCloseCaps3D(value: Boolean): Self = this.set("closeCaps3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseCaps3D: Self = this.set("closeCaps3D", js.undefined)
    
    @scala.inline
    def setJoinStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineJoinStyle * / any */ String
    ): Self = this.set("joinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinStyle: Self = this.set("joinStyle", js.undefined)
    
    @scala.inline
    def setLineStyle3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Simple3DLineStyle * / any */ String
    ): Self = this.set("lineStyle3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle3D: Self = this.set("lineStyle3D", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
