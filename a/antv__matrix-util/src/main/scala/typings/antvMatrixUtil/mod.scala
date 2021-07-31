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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ext {
    
    @JSImport("@antv/matrix-util", "ext")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftRotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    @scala.inline
    def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftScale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    @scala.inline
    def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftTranslate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    @scala.inline
    def transform(m: js.Array[Double], actions: js.Array[js.Array[js.Any]]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("vertical")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  object mat3 {
    
    @JSImport("@antv/matrix-util", "mat3")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def adjoint(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("adjoint")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def clone_(a: ReadonlyMat3): typings.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def copy(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def create(): typings.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def determinant(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def equals_(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def frob(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromMat2d(out: typings.glMatrix.mod.mat3, a: ReadonlyMat2d): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def fromMat4(out: typings.glMatrix.mod.mat3, a: ReadonlyMat4): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def fromQuat(out: typings.glMatrix.mod.mat3, q: ReadonlyQuat): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuat")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def fromRotation(out: typings.glMatrix.mod.mat3, rad: Double): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def fromScaling(out: typings.glMatrix.mod.mat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def fromTranslation(out: typings.glMatrix.mod.mat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
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
    ): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def identity(out: typings.glMatrix.mod.mat3): typings.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def invert(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def mul(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def multiply(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def multiplyScalar(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: Double): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def multiplyScalarAndAdd(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def normalFromMat4(out: typings.glMatrix.mod.mat3, a: ReadonlyMat4): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalFromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def projection(out: typings.glMatrix.mod.mat3, width: Double, height: Double): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(out.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def rotate(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, rad: Double): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def scale(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
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
    ): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def str(a: ReadonlyMat3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def sub(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def subtract(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def translate(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
    
    @scala.inline
    def transpose(out: typings.glMatrix.mod.mat3, a: ReadonlyMat3): typings.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.mat3]
  }
  
  object vec2 {
    
    @JSImport("@antv/matrix-util", "vec2")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def ceil(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def clone_(a: ReadonlyVec2): typings.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def copy(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def create(): typings.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    @scala.inline
    def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def div(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def divide(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def equals_(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def floor(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def fromValues(x: Double, y: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def inverse(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def len(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def length(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def lerp(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def max(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def min(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def mul(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def multiply(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def negate(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def normalize(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def random(out: typings.glMatrix.mod.vec2): typings.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec2]
    @scala.inline
    def random(out: typings.glMatrix.mod.vec2, scale: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def rotate(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def round(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def scale(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def scaleAndAdd(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def set(out: typings.glMatrix.mod.vec2, x: Double, y: Double): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def sqrLen(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def squaredLength(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def str(a: ReadonlyVec2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def sub(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def subtract(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def transformMat2(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def transformMat2d(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2d): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def transformMat3(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat3): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def transformMat4(out: typings.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat4): typings.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec2]
    
    @scala.inline
    def zero(out: typings.glMatrix.mod.vec2): typings.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec2]
  }
  
  object vec3 {
    
    @JSImport("@antv/matrix-util", "vec3")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def bezier(
      out: typings.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def ceil(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def clone_(a: ReadonlyVec3): typings.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def copy(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def create(): typings.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def cross(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def div(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def divide(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def equals_(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def floor(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def fromValues(x: Double, y: Double, z: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def hermite(
      out: typings.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hermite")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def inverse(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def len(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def length(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def lerp(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def max(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def min(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def mul(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def multiply(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def negate(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def normalize(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def random(out: typings.glMatrix.mod.vec3): typings.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec3]
    @scala.inline
    def random(out: typings.glMatrix.mod.vec3, scale: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def rotateX(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def rotateY(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def rotateZ(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def round(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def scale(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def scaleAndAdd(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def set(out: typings.glMatrix.mod.vec3, x: Double, y: Double, z: Double): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def sqrLen(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def squaredLength(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def str(a: ReadonlyVec3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def sub(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def subtract(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def transformMat3(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat3): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def transformMat4(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat4): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def transformQuat(out: typings.glMatrix.mod.vec3, a: ReadonlyVec3, q: ReadonlyQuat): typings.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typings.glMatrix.mod.vec3]
    
    @scala.inline
    def zero(out: typings.glMatrix.mod.vec3): typings.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[typings.glMatrix.mod.vec3]
  }
}
