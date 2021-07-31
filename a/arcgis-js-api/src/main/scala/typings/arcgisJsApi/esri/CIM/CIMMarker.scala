package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarker
  extends StObject
     with CIMSymbolLayerBase {
  
  /**
    * The specified location where all transformation property operations originate.
    */
  var anchorPoint: js.UndefOr[ExternalReferencePoint] = js.undefined
  
  /**
    * A value which specifies if the anchor point location is considered a percentage of the size or as an absolute distance.
    */
  var anchorPointUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.undefined
  
  /**
    * The angle the marker is rotated around the X axis. This type of rotation is also referred to as tilt and is only applied in 3D. The order of how this is applied with respect to other rotations depends on the RotationOrder3D. The name in the user interface is Tilt.
    */
  var angleX: js.UndefOr[Double] = js.undefined
  
  /**
    * The angle the marker is rotated around the Y axis. This type of rotation is also referred to as roll and is only applied in 3D. The order of how this is applied with respect to other rotations depends on the RotationOrder3D. The name in the user interface is Roll.
    */
  var angleY: js.UndefOr[Double] = js.undefined
  
  /**
    * The billboard mode of the marker.
    */
  var billboardMode3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
  ] = js.undefined
  
  /**
    * Which axis is considered as the Size in 3D. Only applicable when the marker layer is a 3DShapeMarker.
    */
  var dominantSizeAxis3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
  ] = js.undefined
  
  /**
    * Marker placements which determine how markers are placed along a line or within a polygon.
    */
  var markerPlacement: js.UndefOr[CIMMarkerPlacementType] = js.undefined
  
  /**
    * The value the marker is moved along the X axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The value the marker is moved along the Y axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The value the marker is moved along the Z axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetZ: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether the rotation is applied clockwise or counterclockwise to the marker layer.
    */
  var rotateClockwise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The angle that the marker is rotated around the anchor point, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the marker. Modifying Size changes the marker's height to the specified size and the width is updated proportionally.
    */
  var size: js.UndefOr[Double] = js.undefined
}
object CIMMarker {
  
  @scala.inline
  def apply(`type`: String): CIMMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarker]
  }
  
  @scala.inline
  implicit class CIMMarkerMutableBuilder[Self <: CIMMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorPoint(value: ExternalReferencePoint): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    @scala.inline
    def setAnchorPointUnits(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
    ): Self = StObject.set(x, "anchorPointUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPointUnitsUndefined: Self = StObject.set(x, "anchorPointUnits", js.undefined)
    
    @scala.inline
    def setAngleX(value: Double): Self = StObject.set(x, "angleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleXUndefined: Self = StObject.set(x, "angleX", js.undefined)
    
    @scala.inline
    def setAngleY(value: Double): Self = StObject.set(x, "angleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleYUndefined: Self = StObject.set(x, "angleY", js.undefined)
    
    @scala.inline
    def setBillboardMode3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
    ): Self = StObject.set(x, "billboardMode3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillboardMode3DUndefined: Self = StObject.set(x, "billboardMode3D", js.undefined)
    
    @scala.inline
    def setDominantSizeAxis3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
    ): Self = StObject.set(x, "dominantSizeAxis3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantSizeAxis3DUndefined: Self = StObject.set(x, "dominantSizeAxis3D", js.undefined)
    
    @scala.inline
    def setMarkerPlacement(value: CIMMarkerPlacementType): Self = StObject.set(x, "markerPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerPlacementUndefined: Self = StObject.set(x, "markerPlacement", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setOffsetZ(value: Double): Self = StObject.set(x, "offsetZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetZUndefined: Self = StObject.set(x, "offsetZ", js.undefined)
    
    @scala.inline
    def setRotateClockwise(value: Boolean): Self = StObject.set(x, "rotateClockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateClockwiseUndefined: Self = StObject.set(x, "rotateClockwise", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
