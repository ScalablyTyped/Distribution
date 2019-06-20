package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Point")
@js.native
/** Construct a Point object */
class Point () extends js.Object {
  def this(row: scala.Double) = this()
  def this(row: scala.Double, column: scala.Double) = this()
  /** A zero-indexed number representing the column of the Point. */
  var column: scala.Double = js.native
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: scala.Double = js.native
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): scala.Double = js.native
  /** Returns a new Point with the same row and column. */
  def copy(): Point = js.native
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): Point = js.native
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): scala.Boolean = js.native
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): scala.Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): scala.Boolean = js.native
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): scala.Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): scala.Boolean = js.native
  /** Returns a new Point with the row and column negated. */
  def negate(): Point = js.native
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[scala.Double, scala.Double] = js.native
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  def translate(other: PointCompatible): Point = js.native
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  def traverse(other: PointCompatible): Point = js.native
}

/* static members */
@JSImport("atom", "Point")
@js.native
object Point extends js.Object {
  // Construction
  /**
    *  Create a Point from an array containing two numbers representing the
    *  row and column.
    */
  def fromObject(`object`: atomLib.atomMod.PointCompatible): atomLib.atomMod.Point = js.native
  def fromObject(`object`: atomLib.atomMod.PointCompatible, copy: scala.Boolean): atomLib.atomMod.Point = js.native
  // Comparison
  /** Returns the given Point that is earlier in the buffer. */
  def min(point1: atomLib.atomMod.PointCompatible, point2: atomLib.atomMod.PointCompatible): atomLib.atomMod.Point = js.native
}

