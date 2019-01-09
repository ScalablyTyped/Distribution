package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AAddAxis extends js.Object {
  /**
    * Adds two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the W component of a quat from the X, Y, and Z components.
    * Assumes that quaternion is 1 unit in length.
    * Any existing W component will be ignored.
    *
    * @param out the receiving quaternion
    * @param a quat to calculate W component of
    * @returns out
    */
  def calculateW(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Creates a new quat initialized with values from an existing quaternion
    *
    * @param a quaternion to clone
    * @returns a new quaternion
    */
  def clone(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the conjugate of a quat
    * If the quaternion is normalized, this function is faster than quat.inverse and produces the same result.
    *
    * @param out the receiving quaternion
    * @param a quat to calculate conjugate of
    * @returns out
    */
  def conjugate(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Copy the values from one quat to another
    *
    * @param out the receiving quaternion
    * @param a the source quaternion
    * @returns out
    */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Creates a new identity quat
    *
    * @returns a new quaternion
    */
  def create(): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the dot product of two quat's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Returns whether or not the quaternions have approximately the same elements in the same position.
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the quaternions are equal, false otherwise.
    */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Boolean = js.native
  /**
    * Returns whether or not the quaternions have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the quaternions are equal, false otherwise.
    */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Boolean = js.native
  /**
    * Creates a quaternion from the given 3x3 rotation matrix.
    *
    * NOTE: The resultant quaternion is not normalized, so you should be sure
    * to renormalize the quaternion yourself where necessary.
    *
    * @param out the receiving quaternion
    * @param m rotation matrix
    * @returns out
    */
  def fromMat3(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat3): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Creates a new quat initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns a new quaternion
    */
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Gets the rotation axis and angle for a given
    *  quaternion. If a quaternion is created with
    *  setAxisAngle, this method will return the same
    *  values as providied in the original parameter list
    *  OR functionally equivalent values.
    * Example: The quaternion formed by axis [0, 0, 1] and
    *  angle -90 is the same as the quaternion formed by
    *  [0, 0, 1] and 270. This method favors the latter.
    * @param  out_axis  Vector receiving the axis of rotation
    * @param  q     Quaternion to be decomposed
    * @return     Angle, in radians, of the rotation
    */
  def getAxisAngle(out_axis: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  def getAxisAngle(out_axis: js.Array[scala.Double], q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Set a quat to the identity quaternion
    *
    * @param out the receiving quaternion
    * @returns out
    */
  def identity(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the inverse of a quat
    *
    * @param out the receiving quaternion
    * @param a quat to calculate inverse of
    * @returns out
    */
  def invert(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the length of a quat
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Calculates the length of a quat
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Performs a linear interpolation between two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Multiplies two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Multiplies two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Normalize a quat
    *
    * @param out the receiving quaternion
    * @param a quaternion to normalize
    * @returns out
    */
  def normalize(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the X axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the Y axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the Z axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Sets a quaternion to represent the shortest rotation from one
    * vector to another.
    *
    * Both vectors are assumed to be unit length.
    *
    * @param out the receiving quaternion.
    * @param a the initial vector
    * @param b the destination vector
    * @returns out
    */
  def rotationTo(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def rotationTo(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def rotationTo(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def rotationTo(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Scales a quat by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Set the components of a quat to the given values
    *
    * @param out the receiving quaternion
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns out
    */
  def set(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Sets the specified quaternion with values corresponding to the given
    * axes. Each axis is a vec3 and is expected to be unit length and
    * perpendicular to all other specified axes.
    *
    * @param view  the vector representing the viewing direction
    * @param right the vector representing the local "right" direction
    * @param up    the vector representing the local "up" direction
    * @returns out
    */
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    right: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    right: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    right: js.Array[scala.Double],
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    right: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: js.Array[scala.Double],
    right: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: js.Array[scala.Double],
    right: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: js.Array[scala.Double],
    right: js.Array[scala.Double],
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxes(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    view: js.Array[scala.Double],
    right: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Sets a quat from the given angle and rotation axis,
    * then returns it.
    *
    * @param out the receiving quaternion
    * @param axis the axis around which to rotate
    * @param rad the angle in radians
    * @returns out
    */
  def setAxisAngle(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    axis: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  def setAxisAngle(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, axis: js.Array[scala.Double], rad: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Performs a spherical linear interpolation between two quat
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def slerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Performs a spherical linear interpolation with two control points
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @param c the third operand
    * @param d the fourth operand
    * @param t interpolation amount
    * @returns out
    */
  def sqlerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Calculates the squared length of a quat
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Calculates the squared length of a quat
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): scala.Double = js.native
  /**
    * Returns a string representation of a quaternion
    *
    * @param a quat to represent as a string
    * @returns string representation of the quat
    */
  def str(a: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): java.lang.String = js.native
}

