package typings.adone

import typings.adone.adoneNs.mathNs.matrixNs.INs.mat3
import typings.adone.adoneNs.mathNs.matrixNs.INs.mat4
import typings.adone.adoneNs.mathNs.matrixNs.INs.quat
import typings.adone.adoneNs.mathNs.matrixNs.INs.vec3
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofvec3 extends js.Object {
  def add(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def add(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def add(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Adds two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def angle(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def angle(a: js.Array[Double], b: vec3): Double = js.native
  def angle(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Get the angle between two 3D vectors
    * @param a The first operand
    * @param b The second operand
    * @returns The angle in radians
    */
  def angle(a: vec3, b: vec3): Double = js.native
  def bezier(
    out: vec3,
    a: js.Array[Double],
    b: js.Array[Double],
    c: js.Array[Double],
    d: js.Array[Double],
    t: Double
  ): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def bezier(out: vec3, a: vec3, b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  /**
    * Performs a bezier interpolation with two control points
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param c the third operand
    * @param d the fourth operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def bezier(out: vec3, a: vec3, b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
  def ceil(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Math.ceil the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to ceil
    * @returns out
    */
  def ceil(out: vec3, a: vec3): vec3 = js.native
  def clone(a: js.Array[Double]): vec3 = js.native
  /**
    * Creates a new vec3 initialized with values from an existing vector
    *
    * @param a vector to clone
    * @returns a new 3D vector
    */
  def clone(a: vec3): vec3 = js.native
  def copy(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Copy the values from one vec3 to another
    *
    * @param out the receiving vector
    * @param a the source vector
    * @returns out
    */
  def copy(out: vec3, a: vec3): vec3 = js.native
  /**
    * Creates a new, empty vec3
    *
    * @returns a new 3D vector
    */
  def create(): vec3 = js.native
  def cross(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def cross(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def cross(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Computes the cross product of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def cross(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def dist(a: js.Array[Double], b: vec3): Double = js.native
  def dist(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def dist(a: vec3, b: vec3): Double = js.native
  def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def distance(a: js.Array[Double], b: vec3): Double = js.native
  def distance(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def distance(a: vec3, b: vec3): Double = js.native
  def div(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def div(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def div(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Divides two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def div(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def divide(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def divide(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def divide(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Divides two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def divide(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def dot(a: js.Array[Double], b: vec3): Double = js.native
  def dot(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the dot product of two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: vec3, b: vec3): Double = js.native
  def equals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def equals(a: js.Array[Double], b: vec3): Boolean = js.native
  def equals(a: vec3, b: js.Array[Double]): Boolean = js.native
  /**
    * Returns whether or not the vectors have approximately the same elements in the same position.
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the vectors are equal, false otherwise.
    */
  def equals(a: vec3, b: vec3): Boolean = js.native
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def exactEquals(a: js.Array[Double], b: vec3): Boolean = js.native
  def exactEquals(a: vec3, b: js.Array[Double]): Boolean = js.native
  /**
    * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the vectors are equal, false otherwise.
    */
  def exactEquals(a: vec3, b: vec3): Boolean = js.native
  def floor(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Math.floor the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to floor
    * @returns out
    */
  def floor(out: vec3, a: vec3): vec3 = js.native
  /**
    * Perform some operation over an array of vec3s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec3. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec3s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @returns a
    */
  def forEach(
    a: Float32Array,
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function2[/* a */ vec3 | js.Array[Double], /* b */ vec3 | js.Array[Double], Unit]
  ): Float32Array = js.native
  /**
    * Perform some operation over an array of vec3s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec3. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec3s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @param arg additional argument to pass to fn
    * @returns a
    */
  def forEach(
    a: Float32Array,
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function3[
      /* a */ vec3 | js.Array[Double], 
      /* b */ vec3 | js.Array[Double], 
      /* arg */ js.Any, 
      Unit
    ],
    arg: js.Any
  ): Float32Array = js.native
  /**
    * Creates a new vec3 initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @returns a new 3D vector
    */
  def fromValues(x: Double, y: Double, z: Double): vec3 = js.native
  def hermite(
    out: vec3,
    a: js.Array[Double],
    b: js.Array[Double],
    c: js.Array[Double],
    d: js.Array[Double],
    t: Double
  ): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
  def hermite(out: vec3, a: vec3, b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
  /**
    * Performs a hermite interpolation with two control points
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param c the third operand
    * @param d the fourth operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def hermite(out: vec3, a: vec3, b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
  def inverse(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Returns the inverse of the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to invert
    * @returns out
    */
  def inverse(out: vec3, a: vec3): vec3 = js.native
  def len(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the length of a vec3
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: vec3): Double = js.native
  def length(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the length of a vec3
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: vec3): Double = js.native
  def lerp(out: vec3, a: js.Array[Double], b: js.Array[Double], t: Double): vec3 = js.native
  def lerp(out: vec3, a: js.Array[Double], b: vec3, t: Double): vec3 = js.native
  def lerp(out: vec3, a: vec3, b: js.Array[Double], t: Double): vec3 = js.native
  /**
    * Performs a linear interpolation between two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(out: vec3, a: vec3, b: vec3, t: Double): vec3 = js.native
  def max(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def max(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def max(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Returns the maximum of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def max(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def min(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def min(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def min(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Returns the minimum of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def min(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def mul(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def mul(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def mul(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Multiplies two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def multiply(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def multiply(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def multiply(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Multiplies two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def negate(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Negates the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to negate
    * @returns out
    */
  def negate(out: vec3, a: vec3): vec3 = js.native
  def normalize(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Normalize a vec3
    *
    * @param out the receiving vector
    * @param a vector to normalize
    * @returns out
    */
  def normalize(out: vec3, a: vec3): vec3 = js.native
  /**
    * Generates a random unit vector
    *
    * @param out the receiving vector
    * @returns out
    */
  def random(out: vec3): vec3 = js.native
  /**
    * Generates a random vector with the given scale
    *
    * @param out the receiving vector
    * @param [scale] Length of the resulting vector. If omitted, a unit vector will be returned
    * @returns out
    */
  def random(out: vec3, scale: Double): vec3 = js.native
  def rotateX(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
  def rotateX(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
  def rotateX(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
  /**
    * Rotate a 3D vector around the x-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateX(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
  def rotateY(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
  def rotateY(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
  def rotateY(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
  /**
    * Rotate a 3D vector around the y-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateY(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
  def rotateZ(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
  def rotateZ(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
  def rotateZ(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
  /**
    * Rotate a 3D vector around the z-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateZ(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
  def round(out: vec3, a: js.Array[Double]): vec3 = js.native
  /**
    * Math.round the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to round
    * @returns out
    */
  def round(out: vec3, a: vec3): vec3 = js.native
  def scale(out: vec3, a: js.Array[Double], b: Double): vec3 = js.native
  /**
    * Scales a vec3 by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(out: vec3, a: vec3, b: Double): vec3 = js.native
  def scaleAndAdd(out: vec3, a: js.Array[Double], b: js.Array[Double], scale: Double): vec3 = js.native
  def scaleAndAdd(out: vec3, a: js.Array[Double], b: vec3, scale: Double): vec3 = js.native
  def scaleAndAdd(out: vec3, a: vec3, b: js.Array[Double], scale: Double): vec3 = js.native
  /**
    * Adds two vec3's after scaling the second operand by a scalar value
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b by before adding
    * @returns out
    */
  def scaleAndAdd(out: vec3, a: vec3, b: vec3, scale: Double): vec3 = js.native
  /**
    * Set the components of a vec3 to the given values
    *
    * @param out the receiving vector
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @returns out
    */
  def set(out: vec3, x: Double, y: Double, z: Double): vec3 = js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def sqrDist(a: js.Array[Double], b: vec3): Double = js.native
  def sqrDist(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def sqrDist(a: vec3, b: vec3): Double = js.native
  def sqrLen(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared length of a vec3
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: vec3): Double = js.native
  def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def squaredDistance(a: js.Array[Double], b: vec3): Double = js.native
  def squaredDistance(a: vec3, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def squaredDistance(a: vec3, b: vec3): Double = js.native
  def squaredLength(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared length of a vec3
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: vec3): Double = js.native
  def str(a: js.Array[Double]): String = js.native
  /**
    * Returns a string representation of a vector
    *
    * @param a vector to represent as a string
    * @returns string representation of the vector
    */
  def str(a: vec3): String = js.native
  def sub(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def sub(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def sub(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def subtract(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def subtract(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
  def subtract(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(out: vec3, a: vec3, b: vec3): vec3 = js.native
  def transformMat3(out: vec3, a: js.Array[Double], m: mat3): vec3 = js.native
  /**
    * Transforms the vec3 with a mat3.
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m the 3x3 matrix to transform with
    * @returns out
    */
  def transformMat3(out: vec3, a: vec3, m: mat3): vec3 = js.native
  def transformMat4(out: vec3, a: js.Array[Double], m: mat4): vec3 = js.native
  /**
    * Transforms the vec3 with a mat4.
    * 4th vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat4(out: vec3, a: vec3, m: mat4): vec3 = js.native
  def transformQuat(out: vec3, a: js.Array[Double], q: quat): vec3 = js.native
  /**
    * Transforms the vec3 with a quat
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param q quaternion to transform with
    * @returns out
    */
  def transformQuat(out: vec3, a: vec3, q: quat): vec3 = js.native
}

