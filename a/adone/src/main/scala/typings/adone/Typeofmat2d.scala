package typings.adone

import typings.adone.adoneNs.mathNs.matrixNs.INs.mat2d
import typings.adone.adoneNs.mathNs.matrixNs.INs.vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmat2d extends js.Object {
  /**
    * Adds two mat2d's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
  /**
    * Creates a new mat2d initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 2x3 matrix
    */
  def clone(a: mat2d): mat2d = js.native
  /**
    * Copy the values from one mat2d to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: mat2d, a: mat2d): mat2d = js.native
  /**
    * Creates a new identity mat2d
    *
    * @returns a new 2x3 matrix
    */
  def create(): mat2d = js.native
  /**
    * Calculates the determinant of a mat2d
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: mat2d): Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def equals(a: mat2d, b: mat2d): Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: mat2d, b: mat2d): Boolean = js.native
  /**
    * Returns Frobenius norm of a mat2d
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: mat2d): Double = js.native
  /**
    * Creates a matrix from a given angle
    * This is equivalent to (but much faster than):
    *
    *     mat2d.identity(dest);
    *     mat2d.rotate(dest, dest, rad);
    *
    * @param out mat2d receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromRotation(out: mat2d, rad: Double): mat2d = js.native
  def fromScaling(out: mat2d, v: js.Array[Double]): mat2d = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat2d.identity(dest);
    *     mat2d.scale(dest, dest, vec);
    *
    * @param out mat2d receiving operation result
    * @param v Scaling vector
    * @returns out
    */
  def fromScaling(out: mat2d, v: vec2): mat2d = js.native
  def fromTranslation(out: mat2d, v: js.Array[Double]): mat2d = js.native
  /**
    * Creates a matrix from a vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat2d.identity(dest);
    *     mat2d.translate(dest, dest, vec);
    *
    * @param out mat2d receiving operation result
    * @param v Translation vector
    * @returns out
    */
  def fromTranslation(out: mat2d, v: vec2): mat2d = js.native
  /**
    * Create a new mat2d with the given values
    *
    * @param a Component A (index 0)
    * @param b Component B (index 1)
    * @param c Component C (index 2)
    * @param d Component D (index 3)
    * @param tx Component TX (index 4)
    * @param ty Component TY (index 5)
    * @returns A new mat2d
    */
  def fromValues(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
  /**
    * Set a mat2d to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: mat2d): mat2d = js.native
  /**
    * Inverts a mat2d
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: mat2d, a: mat2d): mat2d | Null = js.native
  /**
    * Multiplies two mat2d's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
  /**
    * Multiplies two mat2d's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param b amount to scale the matrix's elements by
    * @returns out
    */
  def multiplyScalar(out: mat2d, a: mat2d, b: Double): mat2d = js.native
  /**
    * Adds two mat2d's after multiplying each element of the second operand by a scalar value.
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b's elements by before adding
    * @returns out
    */
  def multiplyScalarAndAdd(out: mat2d, a: mat2d, b: mat2d, scale: Double): mat2d = js.native
  /**
    * Rotates a mat2d by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotate(out: mat2d, a: mat2d, rad: Double): mat2d = js.native
  def scale(out: mat2d, a: mat2d, v: js.Array[Double]): mat2d = js.native
  /**
    * Scales the mat2d by the dimensions in the given vec2
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v the vec2 to scale the matrix by
    * @returns out
    */
  def scale(out: mat2d, a: mat2d, v: vec2): mat2d = js.native
  /**
    * Set the components of a mat2d to the given values
    *
    * @param out the receiving matrix
    * @param a Component A (index 0)
    * @param b Component B (index 1)
    * @param c Component C (index 2)
    * @param d Component D (index 3)
    * @param tx Component TX (index 4)
    * @param ty Component TY (index 5)
    * @returns out
    */
  def set(out: mat2d, a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
  /**
    * Returns a string representation of a mat2d
    *
    * @param a matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(a: mat2d): String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
  def translate(out: mat2d, a: mat2d, v: js.Array[Double]): mat2d = js.native
  /**
    * Translates the mat2d by the dimensions in the given vec2
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v the vec2 to translate the matrix by
    * @returns out
    */
  def translate(out: mat2d, a: mat2d, v: vec2): mat2d = js.native
}

