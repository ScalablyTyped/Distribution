package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReferencePoint
  extends StObject
     with ExternalReferenceGeometry {
  
  var m: js.UndefOr[Double] = js.undefined
  
  var spatialReference: js.UndefOr[ExternalReferenceSpatialReference] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object ExternalReferencePoint {
  
  @scala.inline
  def apply(): ExternalReferencePoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferencePoint]
  }
  
  @scala.inline
  implicit class ExternalReferencePointMutableBuilder[Self <: ExternalReferencePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: ExternalReferenceSpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
