package typings
package adoneLib.adoneNs.mathNs.matrixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 4x4 Matrix
  */
@JSGlobal("adone.math.matrix.mat4")
@js.native
object mat4Ns extends js.Object {
  /**
    * Adds two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Calculates the adjugate of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a new mat4 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 4x4 matrix
    */
  def clone(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Copy the values from one mat4 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a new identity mat4
    *
    * @returns a new 4x4 matrix
    */
  def create(): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Calculates the determinant of a mat4
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): scala.Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): scala.Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): scala.Boolean = js.native
  /**
    * Returns Frobenius norm of a mat4
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): scala.Double = js.native
  /**
    * Calculates a 4x4 matrix from the given quaternion
    *
    * @param out mat4 receiving operation result
    * @param q Quaternion to create matrix from
    *
    * @returns out
    */
  def fromQuat(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a given angle around a given axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotate(dest, dest, rad, axis);
    *
    * @param out mat4 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @param axis the axis to rotate around
    * @returns out
    */
  def fromRotation(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double,
    axis: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, rad: scala.Double, axis: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation and vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *
    * @param out mat4 receiving operation result
    * @param q Rotation quaternion
    * @param v Translation vector
    * @returns out
    */
  def fromRotationTranslation(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslation(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation, vector translation and vector scale
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *     mat4.scale(dest, scale)
    *
    * @param out mat4 receiving operation result
    * @param q Rotation quaternion
    * @param v Translation vector
    * @param s Scaling vector
    * @returns out
    */
  def fromRotationTranslationScale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation, vector translation and vector scale, rotating and scaling around the given origin
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     mat4.translate(dest, origin);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *     mat4.scale(dest, scale)
    *     mat4.translate(dest, negativeOrigin);
    *
    * @param out mat4 receiving operation result
    * @param q Rotation quaternion
    * @param v Translation vector
    * @param s Scaling vector
    * @param o The origin vector around which to scale and rotate
    * @returns out
    */
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    o: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    o: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: js.Array[scala.Double],
    o: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    s: js.Array[scala.Double],
    o: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    o: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    o: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double],
    o: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double],
    o: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.scale(dest, dest, vec);
    *
    * @param out mat4 receiving operation result
    * @param v Scaling vector
    * @returns out
    */
  def fromScaling(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromScaling(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, v: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from a vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, dest, vec);
    *
    * @param out mat4 receiving operation result
    * @param v Translation vector
    * @returns out
    */
  def fromTranslation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def fromTranslation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, v: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Create a new mat4 with the given values
    *
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m02 Component in column 0, row 2 position (index 2)
    * @param m03 Component in column 0, row 3 position (index 3)
    * @param m10 Component in column 1, row 0 position (index 4)
    * @param m11 Component in column 1, row 1 position (index 5)
    * @param m12 Component in column 1, row 2 position (index 6)
    * @param m13 Component in column 1, row 3 position (index 7)
    * @param m20 Component in column 2, row 0 position (index 8)
    * @param m21 Component in column 2, row 1 position (index 9)
    * @param m22 Component in column 2, row 2 position (index 10)
    * @param m23 Component in column 2, row 3 position (index 11)
    * @param m30 Component in column 3, row 0 position (index 12)
    * @param m31 Component in column 3, row 1 position (index 13)
    * @param m32 Component in column 3, row 2 position (index 14)
    * @param m33 Component in column 3, row 3 position (index 15)
    * @returns A new mat4
    */
  def fromValues(
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m03: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m20: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m30: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the X axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateX(dest, dest, rad);
    *
    * @param out mat4 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromXRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, rad: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the Y axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateY(dest, dest, rad);
    *
    * @param out mat4 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromYRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, rad: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the Z axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateZ(dest, dest, rad);
    *
    * @param out mat4 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromZRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, rad: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Generates a frustum matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param left Left bound of the frustum
    * @param right Right bound of the frustum
    * @param bottom Bottom bound of the frustum
    * @param top Top bound of the frustum
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def frustum(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Returns a quaternion representing the rotational component
    *  of a transformation matrix. If a matrix is built with
    *  fromRotationTranslation, the returned quaternion will be the
    *  same as the quaternion originally supplied.
    * @param out Quaternion to receive the rotation component
    * @param mat Matrix to be decomposed (input)
    * @return out
    */
  def getRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.quat, mat: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.quat = js.native
  /**
    * Returns the scaling factor component of a transformation matrix.
    * If a matrix is built with fromRotationTranslationScale with a
    * normalized Quaternion parameter, the returned vector will be
    * the same as the scaling vector originally supplied.
    * @param out Vector to receive scaling factor component
    * @param mat Matrix to be decomposed (input)
    * @return out
    */
  def getScaling(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, mat: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
    * Returns the translation vector component of a transformation
    *  matrix. If a matrix is built with fromRotationTranslation,
    *  the returned vector will be the same as the translation vector
    *  originally supplied.
    * @param  out Vector to receive translation component
    * @param  mat Matrix to be decomposed (input)
    * @return out
    */
  def getTranslation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, mat: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
    * Set a mat4 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Inverts a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 | scala.Null = js.native
  /**
    * Generates a look-at matrix with the given eye position, focal point, and up axis
    *
    * @param out mat4 frustum matrix will be written into
    * @param eye Position of the viewer
    * @param center Point the viewer is looking at
    * @param up vec3 pointing up
    * @returns out
    */
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    center: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    center: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    center: js.Array[scala.Double],
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    center: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: js.Array[scala.Double],
    center: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: js.Array[scala.Double],
    center: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: js.Array[scala.Double],
    center: js.Array[scala.Double],
    up: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def lookAt(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    eye: js.Array[scala.Double],
    center: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param b amount to scale the matrix's elements by
    * @returns out
    */
  def multiplyScalar(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Adds two mat4's after multiplying each element of the second operand by a scalar value.
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b's elements by before adding
    * @returns out
    */
  def multiplyScalarAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Generates a orthogonal projection matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param left Left bound of the frustum
    * @param right Right bound of the frustum
    * @param bottom Bottom bound of the frustum
    * @param top Top bound of the frustum
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def ortho(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Generates a perspective projection matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param fovy Vertical field of view in radians
    * @param aspect Aspect ratio. typically viewport width/height
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def perspective(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    fovy: scala.Double,
    aspect: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Generates a perspective projection matrix with the given field of view.
    * This is primarily useful for generating projection matrices to be used
    * with the still experimental WebVR API.
    *
    * @param out mat4 frustum matrix will be written into
    * @param fov Object containing the following values: upDegrees, downDegrees, leftDegrees, rightDegrees
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def perspectiveFromFieldOfView(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    fov: adoneLib.Anon_DownDegrees,
    near: scala.Double,
    far: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Rotates a mat4 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @param axis the axis to rotate around
    * @returns out
    */
  def rotate(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double,
    axis: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def rotate(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double,
    axis: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the X axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Y axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Z axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Scales the mat4 by the dimensions in the given vec3
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param v the vec3 to scale the matrix by
    * @returns out
    */
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    v: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Set the components of a mat4 to the given values
    *
    * @param out the receiving matrix
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m02 Component in column 0, row 2 position (index 2)
    * @param m03 Component in column 0, row 3 position (index 3)
    * @param m10 Component in column 1, row 0 position (index 4)
    * @param m11 Component in column 1, row 1 position (index 5)
    * @param m12 Component in column 1, row 2 position (index 6)
    * @param m13 Component in column 1, row 3 position (index 7)
    * @param m20 Component in column 2, row 0 position (index 8)
    * @param m21 Component in column 2, row 1 position (index 9)
    * @param m22 Component in column 2, row 2 position (index 10)
    * @param m23 Component in column 2, row 3 position (index 11)
    * @param m30 Component in column 3, row 0 position (index 12)
    * @param m31 Component in column 3, row 1 position (index 13)
    * @param m32 Component in column 3, row 2 position (index 14)
    * @param m33 Component in column 3, row 3 position (index 15)
    * @returns out
    */
  def set(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m03: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m20: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m30: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Returns a string representation of a mat4
    *
    * @param mat matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(mat: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): java.lang.String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Translate a mat4 by the given vector
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v vector to translate by
    * @returns out
    */
  def translate(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  def translate(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4,
    v: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
  /**
    * Transpose the values of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4): adoneLib.adoneNs.mathNs.matrixNs.INs.mat4 = js.native
}

