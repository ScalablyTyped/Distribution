package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarker extends CIMSymbolLayerBase {
  
  /**
    * The specified location where all transformation property operations originate.
    */
  var anchorPoint: js.UndefOr[ExternalReferencePoint] = js.native
  
  /**
    * A value which specifies if the anchor point location is considered a percentage of the size or as an absolute distance.
    */
  var anchorPointUnits: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
  ] = js.native
  
  /**
    * The angle the marker is rotated around the X axis. This type of rotation is also referred to as tilt and is only applied in 3D. The order of how this is applied with respect to other rotations depends on the RotationOrder3D. The name in the user interface is Tilt.
    */
  var angleX: js.UndefOr[Double] = js.native
  
  /**
    * The angle the marker is rotated around the Y axis. This type of rotation is also referred to as roll and is only applied in 3D. The order of how this is applied with respect to other rotations depends on the RotationOrder3D. The name in the user interface is Roll.
    */
  var angleY: js.UndefOr[Double] = js.native
  
  /**
    * The billboard mode of the marker.
    */
  var billboardMode3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
  ] = js.native
  
  /**
    * Which axis is considered as the Size in 3D. Only applicable when the marker layer is a 3DShapeMarker.
    */
  var dominantSizeAxis3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
  ] = js.native
  
  /**
    * Marker placements which determine how markers are placed along a line or within a polygon.
    */
  var markerPlacement: js.UndefOr[CIMMarkerPlacementType] = js.native
  
  /**
    * The value the marker is moved along the X axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The value the marker is moved along the Y axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * The value the marker is moved along the Z axis from the anchor point. This is applied after all rotation, as opposed to anchor point which is applied before the rotation.
    */
  var offsetZ: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the rotation is applied clockwise or counterclockwise to the marker layer.
    */
  var rotateClockwise: js.UndefOr[Boolean] = js.native
  
  /**
    * The angle that the marker is rotated around the anchor point, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The height of the marker. Modifying Size changes the marker's height to the specified size and the width is updated proportionally.
    */
  var size: js.UndefOr[Double] = js.native
}
object CIMMarker {
  
  @scala.inline
  def apply(`type`: String): CIMMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarker]
  }
  
  @scala.inline
  implicit class CIMMarkerOps[Self <: CIMMarker] (val x: Self) extends AnyVal {
    
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
    def setAnchorPoint(value: ExternalReferencePoint): Self = this.set("anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPoint: Self = this.set("anchorPoint", js.undefined)
    
    @scala.inline
    def setAnchorPointUnits(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SymbolUnits * / any */ String
    ): Self = this.set("anchorPointUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPointUnits: Self = this.set("anchorPointUnits", js.undefined)
    
    @scala.inline
    def setAngleX(value: Double): Self = this.set("angleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleX: Self = this.set("angleX", js.undefined)
    
    @scala.inline
    def setAngleY(value: Double): Self = this.set("angleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleY: Self = this.set("angleY", js.undefined)
    
    @scala.inline
    def setBillboardMode3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
    ): Self = this.set("billboardMode3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillboardMode3D: Self = this.set("billboardMode3D", js.undefined)
    
    @scala.inline
    def setDominantSizeAxis3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DominantSizeAxis * / any */ String
    ): Self = this.set("dominantSizeAxis3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantSizeAxis3D: Self = this.set("dominantSizeAxis3D", js.undefined)
    
    @scala.inline
    def setMarkerPlacement(value: CIMMarkerPlacementType): Self = this.set("markerPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerPlacement: Self = this.set("markerPlacement", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setOffsetZ(value: Double): Self = this.set("offsetZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetZ: Self = this.set("offsetZ", js.undefined)
    
    @scala.inline
    def setRotateClockwise(value: Boolean): Self = this.set("rotateClockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateClockwise: Self = this.set("rotateClockwise", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
