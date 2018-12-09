package typings
package adoneLib.adoneNs.mathNs.matrixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * 3 Dimensional Vector
         */
@JSGlobal("adone.math.matrix.vec3")
@js.native
object vec3Ns extends js.Object {
  /**
               * Adds two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Get the angle between two 3D vectors
               * @param a The first operand
               * @param b The second operand
               * @returns The angle in radians
               */
  def angle(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Get the angle between two 3D vectors
               * @param a The first operand
               * @param b The second operand
               * @returns The angle in radians
               */
  def angle(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Get the angle between two 3D vectors
               * @param a The first operand
               * @param b The second operand
               * @returns The angle in radians
               */
  def angle(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Get the angle between two 3D vectors
               * @param a The first operand
               * @param b The second operand
               * @returns The angle in radians
               */
  def angle(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def bezier(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Math.ceil the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to ceil
               * @returns out
               */
  def ceil(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Math.ceil the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to ceil
               * @returns out
               */
  def ceil(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Creates a new vec3 initialized with values from an existing vector
               *
               * @param a vector to clone
               * @returns a new 3D vector
               */
  def clone(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Creates a new vec3 initialized with values from an existing vector
               *
               * @param a vector to clone
               * @returns a new 3D vector
               */
  def clone(a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Copy the values from one vec3 to another
               *
               * @param out the receiving vector
               * @param a the source vector
               * @returns out
               */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Copy the values from one vec3 to another
               *
               * @param out the receiving vector
               * @param a the source vector
               * @returns out
               */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Creates a new, empty vec3
               *
               * @returns a new 3D vector
               */
  def create(): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Computes the cross product of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Computes the cross product of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Computes the cross product of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Computes the cross product of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def dist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def dist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def dist(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def distance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def distance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def distance(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns distance between a and b
               */
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Divides two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Calculates the dot product of two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns dot product of a and b
               */
  def dot(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the dot product of two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns dot product of a and b
               */
  def dot(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the dot product of two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns dot product of a and b
               */
  def dot(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the dot product of two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns dot product of a and b
               */
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Returns whether or not the vectors have approximately the same elements in the same position.
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have approximately the same elements in the same position.
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have approximately the same elements in the same position.
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def equals(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have approximately the same elements in the same position.
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def equals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def exactEquals(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Boolean = js.native
  /**
               * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
               *
               * @param a The first vector.
               * @param b The second vector.
               * @returns True if the vectors are equal, false otherwise.
               */
  def exactEquals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
               * Math.floor the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to floor
               * @returns out
               */
  def floor(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Math.floor the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to floor
               * @returns out
               */
  def floor(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function2[
      /* a */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 | js.Array[scala.Double], 
      /* b */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 | js.Array[scala.Double], 
      scala.Unit
    ]
  ): stdLib.Float32Array = js.native
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
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function3[
      /* a */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 | js.Array[scala.Double], 
      /* b */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 | js.Array[scala.Double], 
      /* arg */ js.Any, 
      scala.Unit
    ],
    arg: js.Any
  ): stdLib.Float32Array = js.native
  /**
               * Creates a new vec3 initialized with the given values
               *
               * @param x X component
               * @param y Y component
               * @param z Z component
               * @returns a new 3D vector
               */
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
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
  def hermite(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the inverse of the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to invert
               * @returns out
               */
  def inverse(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the inverse of the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to invert
               * @returns out
               */
  def inverse(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Calculates the length of a vec3
               *
               * @param a vector to calculate length of
               * @returns length of a
               */
  def len(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the length of a vec3
               *
               * @param a vector to calculate length of
               * @returns length of a
               */
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the length of a vec3
               *
               * @param a vector to calculate length of
               * @returns length of a
               */
  def length(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the length of a vec3
               *
               * @param a vector to calculate length of
               * @returns length of a
               */
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Performs a linear interpolation between two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param t interpolation amount between the two inputs
               * @returns out
               */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Performs a linear interpolation between two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param t interpolation amount between the two inputs
               * @returns out
               */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Performs a linear interpolation between two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param t interpolation amount between the two inputs
               * @returns out
               */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Performs a linear interpolation between two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param t interpolation amount between the two inputs
               * @returns out
               */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the maximum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the maximum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the maximum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the maximum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the minimum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the minimum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the minimum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Returns the minimum of two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Multiplies two vec3's
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Negates the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to negate
               * @returns out
               */
  def negate(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Negates the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to negate
               * @returns out
               */
  def negate(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Normalize a vec3
               *
               * @param out the receiving vector
               * @param a vector to normalize
               * @returns out
               */
  def normalize(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Normalize a vec3
               *
               * @param out the receiving vector
               * @param a vector to normalize
               * @returns out
               */
  def normalize(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Generates a random unit vector
               *
               * @param out the receiving vector
               * @returns out
               */
  def random(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Generates a random vector with the given scale
               *
               * @param out the receiving vector
               * @param [scale] Length of the resulting vector. If omitted, a unit vector will be returned
               * @returns out
               */
  def random(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, scale: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the x-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the x-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the x-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the x-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateX(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the y-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the y-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the y-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the y-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateY(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the z-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the z-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the z-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Rotate a 3D vector around the z-axis
               * @param out The receiving vec3
               * @param a The vec3 point to rotate
               * @param b The origin of the rotation
               * @param c The angle of rotation
               * @returns out
               */
  def rotateZ(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Math.round the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to round
               * @returns out
               */
  def round(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Math.round the components of a vec3
               *
               * @param out the receiving vector
               * @param a vector to round
               * @returns out
               */
  def round(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Scales a vec3 by a scalar number
               *
               * @param out the receiving vector
               * @param a the vector to scale
               * @param b amount to scale the vector by
               * @returns out
               */
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Scales a vec3 by a scalar number
               *
               * @param out the receiving vector
               * @param a the vector to scale
               * @param b amount to scale the vector by
               * @returns out
               */
  def scale(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, a: js.Array[scala.Double], b: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's after scaling the second operand by a scalar value
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param scale the amount to scale b by before adding
               * @returns out
               */
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's after scaling the second operand by a scalar value
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param scale the amount to scale b by before adding
               * @returns out
               */
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double],
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's after scaling the second operand by a scalar value
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param scale the amount to scale b by before adding
               * @returns out
               */
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Adds two vec3's after scaling the second operand by a scalar value
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @param scale the amount to scale b by before adding
               * @returns out
               */
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Set the components of a vec3 to the given values
               *
               * @param out the receiving vector
               * @param x X component
               * @param y Y component
               * @param z Z component
               * @returns out
               */
  def set(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, x: scala.Double, y: scala.Double, z: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def sqrDist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def sqrDist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def sqrDist(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the squared length of a vec3
               *
               * @param a vector to calculate squared length of
               * @returns squared length of a
               */
  def sqrLen(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared length of a vec3
               *
               * @param a vector to calculate squared length of
               * @returns squared length of a
               */
  def sqrLen(a: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def squaredDistance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def squaredDistance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def squaredDistance(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared euclidian distance between two vec3's
               *
               * @param a the first operand
               * @param b the second operand
               * @returns squared distance between a and b
               */
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Calculates the squared length of a vec3
               *
               * @param a vector to calculate squared length of
               * @returns squared length of a
               */
  def squaredLength(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): scala.Double = js.native
  /**
               * Calculates the squared length of a vec3
               *
               * @param a vector to calculate squared length of
               * @returns squared length of a
               */
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  /**
               * Returns a string representation of a vector
               *
               * @param a vector to represent as a string
               * @returns string representation of the vector
               */
  def str(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3): java.lang.String = js.native
  /**
               * Returns a string representation of a vector
               *
               * @param a vector to represent as a string
               * @returns string representation of the vector
               */
  def str(a: js.Array[scala.Double]): java.lang.String = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Subtracts vector b from vector a
               *
               * @param out the receiving vector
               * @param a the first operand
               * @param b the second operand
               * @returns out
               */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Transforms the vec3 with a mat3.
               *
               * @param out the receiving vector
               * @param a the vector to transform
               * @param m the 3x3 matrix to transform with
               * @returns out
               */
  def transformMat3(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Transforms the vec3 with a mat3.
               *
               * @param out the receiving vector
               * @param a the vector to transform
               * @param m the 3x3 matrix to transform with
               * @returns out
               */
  def transformMat3(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Transforms the vec3 with a mat4.
               * 4th vector component is implicitly '1'
               *
               * @param out the receiving vector
               * @param a the vector to transform
               * @param m matrix to transform with
               * @returns out
               */
  def transformMat4(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
               * Transforms the vec3 with a mat4.
               * 4th vector component is implicitly '1'
               *
               * @param out the receiving vector
               * @param a the vector to transform
               * @param m matrix to transform with
               * @returns out
               */
  def transformMat4(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
                * Transforms the vec3 with a quat
                *
                * @param out the receiving vector
                * @param a the vector to transform
                * @param q quaternion to transform with
                * @returns out
                */
  def transformQuat(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
  /**
                * Transforms the vec3 with a quat
                *
                * @param out the receiving vector
                * @param a the vector to transform
                * @param q quaternion to transform with
                * @returns out
                */
  def transformQuat(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec3,
    a: js.Array[scala.Double],
    q: adoneLib.adoneNs.mathNs.matrixNs.INs.quat
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec3 = js.native
}

