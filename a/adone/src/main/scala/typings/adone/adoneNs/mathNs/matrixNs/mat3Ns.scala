package typings.adone.adoneNs.mathNs.matrixNs

import typings.adone.adoneNs.mathNs.matrixNs.INs.mat2d
import typings.adone.adoneNs.mathNs.matrixNs.INs.mat3
import typings.adone.adoneNs.mathNs.matrixNs.INs.mat4
import typings.adone.adoneNs.mathNs.matrixNs.INs.quat
import typings.adone.adoneNs.mathNs.matrixNs.INs.vec2
import typings.adone.adoneNs.mathNs.matrixNs.INs.vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 3x3 Matrix
  */
@JSGlobal("adone.math.matrix.mat3")
@js.native
object mat3Ns extends js.Object {
  /**
    * Adds two mat3's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(out: mat3, a: mat3, b: mat3): mat3 = js.native
  /**
    * Calculates the adjugate of a mat3
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: mat3, a: mat3): mat3 = js.native
  /**
    * Creates a new mat3 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 3x3 matrix
    */
  def clone(a: mat3): mat3 = js.native
  /**
    * Copy the values from one mat3 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: mat3, a: mat3): mat3 = js.native
  /**
    * Creates a new identity mat3
    *
    * @returns a new 3x3 matrix
    */
  def create(): mat3 = js.native
  /**
    * Calculates the determinant of a mat3
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: mat3): Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def equals(a: mat3, b: mat3): Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: mat3, b: mat3): Boolean = js.native
  /**
    * Returns Frobenius norm of a mat3
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: mat3): Double = js.native
  /**
    * Copies the values from a mat2d into a mat3
    *
    * @param out the receiving matrix
    * @param a the matrix to copy
    * @returns out
    */
  def fromMat2d(out: mat3, a: mat2d): mat3 = js.native
  /**
    * Copies the upper-left 3x3 values into the given mat3.
    *
    * @param out the receiving 3x3 matrix
    * @param a   the source 4x4 matrix
    * @returns out
    */
  def fromMat4(out: mat3, a: mat4): mat3 = js.native
  /**
    * Calculates a 3x3 matrix from the given quaternion
    *
    * @param out mat3 receiving operation result
    * @param q Quaternion to create matrix from
    *
    * @returns out
    */
  def fromQuat(out: mat3, q: quat): mat3 = js.native
  /**
    * Creates a matrix from a given angle
    * This is equivalent to (but much faster than):
    *
    *     mat3.identity(dest);
    *     mat3.rotate(dest, dest, rad);
    *
    * @param out mat3 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromRotation(out: mat3, rad: Double): mat3 = js.native
  def fromScaling(out: mat3, v: js.Array[Double]): mat3 = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat3.identity(dest);
    *     mat3.scale(dest, dest, vec);
    *
    * @param out mat3 receiving operation result
    * @param v Scaling vector
    * @returns out
    */
  def fromScaling(out: mat3, v: vec2): mat3 = js.native
  def fromTranslation(out: mat3, v: js.Array[Double]): mat3 = js.native
  /**
    * Creates a matrix from a vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat3.identity(dest);
    *     mat3.translate(dest, dest, vec);
    *
    * @param out mat3 receiving operation result
    * @param v Translation vector
    * @returns out
    */
  def fromTranslation(out: mat3, v: vec2): mat3 = js.native
  /**
    * Create a new mat3 with the given values
    *
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m02 Component in column 0, row 2 position (index 2)
    * @param m10 Component in column 1, row 0 position (index 3)
    * @param m11 Component in column 1, row 1 position (index 4)
    * @param m12 Component in column 1, row 2 position (index 5)
    * @param m20 Component in column 2, row 0 position (index 6)
    * @param m21 Component in column 2, row 1 position (index 7)
    * @param m22 Component in column 2, row 2 position (index 8)
    * @returns A new mat3
    */
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
  ): mat3 = js.native
  /**
    * Set a mat3 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: mat3): mat3 = js.native
  /**
    * Inverts a mat3
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: mat3, a: mat3): mat3 | Null = js.native
  /**
    * Multiplies two mat3's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(out: mat3, a: mat3, b: mat3): mat3 = js.native
  /**
    * Multiplies two mat3's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(out: mat3, a: mat3, b: mat3): mat3 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param b amount to scale the matrix's elements by
    * @returns out
    */
  def multiplyScalar(out: mat3, a: mat3, b: Double): mat3 = js.native
  /**
    * Adds two mat3's after multiplying each element of the second operand by a scalar value.
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b's elements by before adding
    * @returns out
    */
  def multiplyScalarAndAdd(out: mat3, a: mat3, b: mat3, scale: Double): mat3 = js.native
  /**
    * Calculates a 3x3 normal matrix (transpose inverse) from the 4x4 matrix
    *
    * @param out mat3 receiving operation result
    * @param a Mat4 to derive the normal matrix from
    *
    * @returns out
    */
  def normalFromMat4(out: mat3, a: mat4): mat3 | Null = js.native
  /**
    * Rotates a mat3 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotate(out: mat3, a: mat3, rad: Double): mat3 = js.native
  def scale(out: mat3, a: mat3, v: js.Array[Double]): mat3 = js.native
  /**
    * Scales the mat3 by the dimensions in the given vec2
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param v the vec2 to scale the matrix by
    * @returns out
    */
  def scale(out: mat3, a: mat3, v: vec2): mat3 = js.native
  /**
    * Set the components of a mat3 to the given values
    *
    * @param out the receiving matrix
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m02 Component in column 0, row 2 position (index 2)
    * @param m10 Component in column 1, row 0 position (index 3)
    * @param m11 Component in column 1, row 1 position (index 4)
    * @param m12 Component in column 1, row 2 position (index 5)
    * @param m20 Component in column 2, row 0 position (index 6)
    * @param m21 Component in column 2, row 1 position (index 7)
    * @param m22 Component in column 2, row 2 position (index 8)
    * @returns out
    */
  def set(
    out: mat3,
    m00: Double,
    m01: Double,
    m02: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m20: Double,
    m21: Double,
    m22: Double
  ): mat3 = js.native
  /**
    * Returns a string representation of a mat3
    *
    * @param mat matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(mat: mat3): String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(out: mat3, a: mat3, b: mat3): mat3 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(out: mat3, a: mat3, b: mat3): mat3 = js.native
  def translate(out: mat3, a: mat3, v: js.Array[Double]): mat3 = js.native
  /**
    * Translate a mat3 by the given vector
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v vector to translate by
    * @returns out
    */
  def translate(out: mat3, a: mat3, v: vec3): mat3 = js.native
  /**
    * Transpose the values of a mat3
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: mat3, a: mat3): mat3 = js.native
}

