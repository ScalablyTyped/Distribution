package typings.antvMatrixUtil

import typings.glMatrix.mod.ReadonlyMat2
import typings.glMatrix.mod.ReadonlyMat2d
import typings.glMatrix.mod.ReadonlyMat3
import typings.glMatrix.mod.ReadonlyMat4
import typings.glMatrix.mod.ReadonlyQuat
import typings.glMatrix.mod.ReadonlyVec2
import typings.glMatrix.mod.ReadonlyVec3
import typings.glMatrix.mod.mat3
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ext {
    
    @JSImport("@antv/matrix-util", "ext.angleTo")
    @js.native
    def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = js.native
    
    @JSImport("@antv/matrix-util", "ext.direction")
    @js.native
    def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = js.native
    
    @JSImport("@antv/matrix-util", "ext.leftRotate")
    @js.native
    def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = js.native
    
    @JSImport("@antv/matrix-util", "ext.leftScale")
    @js.native
    def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
    
    @JSImport("@antv/matrix-util", "ext.leftTranslate")
    @js.native
    def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
    
    @JSImport("@antv/matrix-util", "ext.transform")
    @js.native
    def transform(m: js.Array[Double], actions: js.Array[js.Array[_]]): js.Array[_] = js.native
    
    @JSImport("@antv/matrix-util", "ext.vertical")
    @js.native
    def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = js.native
  }
  
  object mat3 {
    
    @JSImport("@antv/matrix-util", "mat3.add")
    @js.native
    def add(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.adjoint")
    @js.native
    def adjoint(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.clone")
    @js.native
    def clone_(a: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.copy")
    @js.native
    def copy(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.create")
    @js.native
    def create(): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.determinant")
    @js.native
    def determinant(a: ReadonlyMat3): Double = js.native
    
    @JSImport("@antv/matrix-util", "mat3.equals")
    @js.native
    def equals_(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "mat3.exactEquals")
    @js.native
    def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "mat3.frob")
    @js.native
    def frob(a: ReadonlyMat3): Double = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromMat2d")
    @js.native
    def fromMat2d(out: typings.glMatrix.mod.mat3, a: ReadonlyMat2d): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromMat4")
    @js.native
    def fromMat4(out: typings.glMatrix.mod.mat3, a: ReadonlyMat4): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromQuat")
    @js.native
    def fromQuat(out: typings.glMatrix.mod.mat3, q: ReadonlyQuat): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromRotation")
    @js.native
    def fromRotation(out: typings.glMatrix.mod.mat3, rad: Double): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromScaling")
    @js.native
    def fromScaling(out: typings.glMatrix.mod.mat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromTranslation")
    @js.native
    def fromTranslation(out: typings.glMatrix.mod.mat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.fromValues")
    @js.native
    def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.identity")
    @js.native
    def identity(out: typings.glMatrix.mod.mat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.invert")
    @js.native
    def invert(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.mul")
    @js.native
    def mul(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.multiply")
    @js.native
    def multiply(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.multiplyScalar")
    @js.native
    def multiplyScalar(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: Double): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.multiplyScalarAndAdd")
    @js.native
    def multiplyScalarAndAdd(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.normalFromMat4")
    @js.native
    def normalFromMat4(out: typings.glMatrix.mod.mat3, a: ReadonlyMat4): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.projection")
    @js.native
    def projection(out: typings.glMatrix.mod.mat3, width: Double, height: Double): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.rotate")
    @js.native
    def rotate(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, rad: Double): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.scale")
    @js.native
    def scale(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.set")
    @js.native
    def set(
      out: typings.glMatrix.mod.mat3,
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.str")
    @js.native
    def str(a: ReadonlyMat3): String = js.native
    
    @JSImport("@antv/matrix-util", "mat3.sub")
    @js.native
    def sub(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.subtract")
    @js.native
    def subtract(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.translate")
    @js.native
    def translate(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = js.native
    
    @JSImport("@antv/matrix-util", "mat3.transpose")
    @js.native
    def transpose(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = js.native
  }
  
  object vec2 {
    
    @JSImport("@antv/matrix-util", "vec2.add")
    @js.native
    def add(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.angle")
    @js.native
    def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.ceil")
    @js.native
    def ceil(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.clone")
    @js.native
    def clone_(a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.copy")
    @js.native
    def copy(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.create")
    @js.native
    def create(): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.cross")
    @js.native
    def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.dist")
    @js.native
    def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.distance")
    @js.native
    def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.div")
    @js.native
    def div(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.divide")
    @js.native
    def divide(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.dot")
    @js.native
    def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.equals")
    @js.native
    def equals_(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "vec2.exactEquals")
    @js.native
    def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "vec2.floor")
    @js.native
    def floor(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.forEach")
    @js.native
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    @JSImport("@antv/matrix-util", "vec2.fromValues")
    @js.native
    def fromValues(x: Double, y: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.inverse")
    @js.native
    def inverse(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.len")
    @js.native
    def len(a: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.length")
    @js.native
    def length(a: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.lerp")
    @js.native
    def lerp(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.max")
    @js.native
    def max(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.min")
    @js.native
    def min(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.mul")
    @js.native
    def mul(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.multiply")
    @js.native
    def multiply(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.negate")
    @js.native
    def negate(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.normalize")
    @js.native
    def normalize(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.random")
    @js.native
    def random(out: typings.glMatrix.mod.vec2): typings.glMatrix.mod.vec2 = js.native
    @JSImport("@antv/matrix-util", "vec2.random")
    @js.native
    def random(out: typings.glMatrix.mod.vec2, scale: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.rotate")
    @js.native
    def rotate(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.round")
    @js.native
    def round(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.scale")
    @js.native
    def scale(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.scaleAndAdd")
    @js.native
    def scaleAndAdd(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.set")
    @js.native
    def set(out: typings.glMatrix.mod.vec2, x: Double, y: Double): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.sqrDist")
    @js.native
    def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.sqrLen")
    @js.native
    def sqrLen(a: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.squaredDistance")
    @js.native
    def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.squaredLength")
    @js.native
    def squaredLength(a: ReadonlyVec2): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec2.str")
    @js.native
    def str(a: ReadonlyVec2): String = js.native
    
    @JSImport("@antv/matrix-util", "vec2.sub")
    @js.native
    def sub(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.subtract")
    @js.native
    def subtract(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.transformMat2")
    @js.native
    def transformMat2(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.transformMat2d")
    @js.native
    def transformMat2d(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2d): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.transformMat3")
    @js.native
    def transformMat3(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat3): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.transformMat4")
    @js.native
    def transformMat4(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat4): typings.glMatrix.mod.vec2 = js.native
    
    @JSImport("@antv/matrix-util", "vec2.zero")
    @js.native
    def zero(out: typings.glMatrix.mod.vec2): typings.glMatrix.mod.vec2 = js.native
  }
  
  object vec3 {
    
    @JSImport("@antv/matrix-util", "vec3.add")
    @js.native
    def add(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.angle")
    @js.native
    def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.bezier")
    @js.native
    def bezier(
      out: typings.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.ceil")
    @js.native
    def ceil(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.clone")
    @js.native
    def clone_(a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.copy")
    @js.native
    def copy(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.create")
    @js.native
    def create(): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.cross")
    @js.native
    def cross(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.dist")
    @js.native
    def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.distance")
    @js.native
    def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.div")
    @js.native
    def div(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.divide")
    @js.native
    def divide(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.dot")
    @js.native
    def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.equals")
    @js.native
    def equals_(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "vec3.exactEquals")
    @js.native
    def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    @JSImport("@antv/matrix-util", "vec3.floor")
    @js.native
    def floor(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.forEach")
    @js.native
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    @JSImport("@antv/matrix-util", "vec3.fromValues")
    @js.native
    def fromValues(x: Double, y: Double, z: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.hermite")
    @js.native
    def hermite(
      out: typings.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.inverse")
    @js.native
    def inverse(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.len")
    @js.native
    def len(a: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.length")
    @js.native
    def length(a: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.lerp")
    @js.native
    def lerp(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.max")
    @js.native
    def max(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.min")
    @js.native
    def min(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.mul")
    @js.native
    def mul(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.multiply")
    @js.native
    def multiply(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.negate")
    @js.native
    def negate(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.normalize")
    @js.native
    def normalize(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.random")
    @js.native
    def random(out: typings.glMatrix.mod.vec3): typings.glMatrix.mod.vec3 = js.native
    @JSImport("@antv/matrix-util", "vec3.random")
    @js.native
    def random(out: typings.glMatrix.mod.vec3, scale: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.rotateX")
    @js.native
    def rotateX(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.rotateY")
    @js.native
    def rotateY(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.rotateZ")
    @js.native
    def rotateZ(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.round")
    @js.native
    def round(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.scale")
    @js.native
    def scale(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.scaleAndAdd")
    @js.native
    def scaleAndAdd(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.set")
    @js.native
    def set(out: typings.glMatrix.mod.vec3, x: Double, y: Double, z: Double): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.sqrDist")
    @js.native
    def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.sqrLen")
    @js.native
    def sqrLen(a: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.squaredDistance")
    @js.native
    def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.squaredLength")
    @js.native
    def squaredLength(a: ReadonlyVec3): Double = js.native
    
    @JSImport("@antv/matrix-util", "vec3.str")
    @js.native
    def str(a: ReadonlyVec3): String = js.native
    
    @JSImport("@antv/matrix-util", "vec3.sub")
    @js.native
    def sub(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.subtract")
    @js.native
    def subtract(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.transformMat3")
    @js.native
    def transformMat3(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat3): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.transformMat4")
    @js.native
    def transformMat4(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat4): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.transformQuat")
    @js.native
    def transformQuat(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, q: ReadonlyQuat): typings.glMatrix.mod.vec3 = js.native
    
    @JSImport("@antv/matrix-util", "vec3.zero")
    @js.native
    def zero(out: typings.glMatrix.mod.vec3): typings.glMatrix.mod.vec3 = js.native
  }
}
