package typings.antvGLite

import typings.glMatrix.mod.mat3
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.quat
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.glMatrix.mod.vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@antv/g-lite/dist/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createVec3(x: vec2 | vec3 | vec4): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  
  inline def decompose(mat: mat3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompose")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def decomposeMat4(matrix: mat4, translation: vec3, scale: vec3, skew: vec3, perspective: vec4, quaternion: vec4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeMat4")(matrix.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deg2rad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2rad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def deg2turn(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2turn")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromRotationTranslationScale(rotation: Double, x: Double, y: Double, scaleX: Double, scaleY: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslationScale")(rotation.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[mat3]
  
  inline def getAngle(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")().asInstanceOf[Double]
  inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getEuler(out: vec3, quat: mat4 | quat): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEuler")(out.asInstanceOf[js.Any], quat.asInstanceOf[js.Any])).asInstanceOf[vec3]
  
  inline def getRotationInRadians(mat: mat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRotationInRadians")(mat.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScaling(out: vec2, mat: mat3): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaling")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec2]
  
  inline def getTranslation(out: vec2, mat: mat3): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec2]
  
  inline def grad2deg(grads: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("grad2deg")(grads.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def makePerspective(out: mat4, left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("makePerspective")(out.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], top.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
  
  inline def rad2deg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad2deg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def turn2deg(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turn2deg")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
}
