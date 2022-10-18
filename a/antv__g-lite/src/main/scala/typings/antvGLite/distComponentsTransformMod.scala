package typings.antvGLite

import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.quat
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTransformMod {
  
  trait Transform extends StObject {
    
    var dirtyFlag: Boolean
    
    var frozen: Boolean
    
    var localDirtyFlag: Boolean
    
    /**
      * local space RTS
      */
    var localPosition: vec3
    
    var localRotation: quat
    
    var localScale: vec3
    
    /**
      * @see https://www.w3.org/TR/css-transforms-1/#SkewDefined
      */
    var localSkew: vec2
    
    var localTransform: mat4
    
    /**
      * the origin of scaling and rotation
      */
    var origin: vec3
    
    /**
      * world space RTS
      */
    var position: vec3
    
    var rotation: quat
    
    var scaling: vec3
    
    var worldTransform: mat4
  }
  object Transform {
    
    inline def apply(
      dirtyFlag: Boolean,
      frozen: Boolean,
      localDirtyFlag: Boolean,
      localPosition: vec3,
      localRotation: quat,
      localScale: vec3,
      localSkew: vec2,
      localTransform: mat4,
      origin: vec3,
      position: vec3,
      rotation: quat,
      scaling: vec3,
      worldTransform: mat4
    ): Transform = {
      val __obj = js.Dynamic.literal(dirtyFlag = dirtyFlag.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], localDirtyFlag = localDirtyFlag.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], localRotation = localRotation.asInstanceOf[js.Any], localScale = localScale.asInstanceOf[js.Any], localSkew = localSkew.asInstanceOf[js.Any], localTransform = localTransform.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], worldTransform = worldTransform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setDirtyFlag(value: Boolean): Self = StObject.set(x, "dirtyFlag", value.asInstanceOf[js.Any])
      
      inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      inline def setLocalDirtyFlag(value: Boolean): Self = StObject.set(x, "localDirtyFlag", value.asInstanceOf[js.Any])
      
      inline def setLocalPosition(value: vec3): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
      
      inline def setLocalRotation(value: quat): Self = StObject.set(x, "localRotation", value.asInstanceOf[js.Any])
      
      inline def setLocalScale(value: vec3): Self = StObject.set(x, "localScale", value.asInstanceOf[js.Any])
      
      inline def setLocalSkew(value: vec2): Self = StObject.set(x, "localSkew", value.asInstanceOf[js.Any])
      
      inline def setLocalTransform(value: mat4): Self = StObject.set(x, "localTransform", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: vec3): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: quat): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScaling(value: vec3): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      inline def setWorldTransform(value: mat4): Self = StObject.set(x, "worldTransform", value.asInstanceOf[js.Any])
    }
  }
}
