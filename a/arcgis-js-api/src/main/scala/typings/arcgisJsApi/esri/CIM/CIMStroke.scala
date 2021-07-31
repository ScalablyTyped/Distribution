package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMStroke
  extends StObject
     with CIMSymbolLayerBase {
  
  /**
    * How the stroke should draw at the ends of the geometries.
    */
  var capStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCapStyle * / any */ String
  ] = js.undefined
  
  /**
    * A value indicating whether to close caps when drawing them in 3D. When set to false, the caps are hollow.
    */
  var closeCaps3D: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How the symbol is drawn at the stroke segment connections.
    */
  var joinStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineJoinStyle * / any */ String
  ] = js.undefined
  
  /**
    * How strokes will be rendered in 3D.
    */
  var lineStyle3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Simple3DLineStyle * / any */ String
  ] = js.undefined
  
  /**
    * The maximum 'sharpness' that is allowed for Miter joins. If the spike created by the miter join exceeds the miter limit times the width of the stroke, the sharp angle will be clipped and rendered with a bevel join. This property is only applied to the symbol layer when the JoinType is set to Miter.
    */
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the stroke.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CIMStroke {
  
  @scala.inline
  def apply(`type`: String): CIMStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMStroke]
  }
  
  @scala.inline
  implicit class CIMStrokeMutableBuilder[Self <: CIMStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCapStyle * / any */ String
    ): Self = StObject.set(x, "capStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapStyleUndefined: Self = StObject.set(x, "capStyle", js.undefined)
    
    @scala.inline
    def setCloseCaps3D(value: Boolean): Self = StObject.set(x, "closeCaps3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseCaps3DUndefined: Self = StObject.set(x, "closeCaps3D", js.undefined)
    
    @scala.inline
    def setJoinStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineJoinStyle * / any */ String
    ): Self = StObject.set(x, "joinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinStyleUndefined: Self = StObject.set(x, "joinStyle", js.undefined)
    
    @scala.inline
    def setLineStyle3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Simple3DLineStyle * / any */ String
    ): Self = StObject.set(x, "lineStyle3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle3DUndefined: Self = StObject.set(x, "lineStyle3D", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
