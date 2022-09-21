package typings.antvGLite

import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object landmarkMod {
  
  trait Landmark extends StObject {
    
    var azimuth: Double
    
    var distance: Double
    
    var distanceVector: vec3
    
    var dollyingStep: Double
    
    var elevation: Double
    
    var focalPoint: vec3
    
    var forward: vec3
    
    var matrix: mat4
    
    var name: String
    
    var position: vec3
    
    var relAzimuth: Double
    
    var relElevation: Double
    
    var relRoll: Double
    
    var right: vec3
    
    var roll: Double
    
    var up: vec3
    
    var zoom: Double
  }
  object Landmark {
    
    inline def apply(
      azimuth: Double,
      distance: Double,
      distanceVector: vec3,
      dollyingStep: Double,
      elevation: Double,
      focalPoint: vec3,
      forward: vec3,
      matrix: mat4,
      name: String,
      position: vec3,
      relAzimuth: Double,
      relElevation: Double,
      relRoll: Double,
      right: vec3,
      roll: Double,
      up: vec3,
      zoom: Double
    ): Landmark = {
      val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], distanceVector = distanceVector.asInstanceOf[js.Any], dollyingStep = dollyingStep.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], focalPoint = focalPoint.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], relAzimuth = relAzimuth.asInstanceOf[js.Any], relElevation = relElevation.asInstanceOf[js.Any], relRoll = relRoll.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Landmark]
    }
    
    extension [Self <: Landmark](x: Self) {
      
      inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceVector(value: vec3): Self = StObject.set(x, "distanceVector", value.asInstanceOf[js.Any])
      
      inline def setDollyingStep(value: Double): Self = StObject.set(x, "dollyingStep", value.asInstanceOf[js.Any])
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setFocalPoint(value: vec3): Self = StObject.set(x, "focalPoint", value.asInstanceOf[js.Any])
      
      inline def setForward(value: vec3): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setMatrix(value: mat4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRelAzimuth(value: Double): Self = StObject.set(x, "relAzimuth", value.asInstanceOf[js.Any])
      
      inline def setRelElevation(value: Double): Self = StObject.set(x, "relElevation", value.asInstanceOf[js.Any])
      
      inline def setRelRoll(value: Double): Self = StObject.set(x, "relRoll", value.asInstanceOf[js.Any])
      
      inline def setRight(value: vec3): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setUp(value: vec3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
