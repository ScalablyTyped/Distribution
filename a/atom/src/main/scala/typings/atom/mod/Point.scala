package typings.atom.mod

import typings.atom.anon.ReadonlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Point")
@js.native
/** Construct a Point object */
class Point () extends js.Object {
  def this(row: Double) = this()
  def this(row: Double, column: Double) = this()
  /** A zero-indexed number representing the column of the Point. */
  var column: Double = js.native
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: Double = js.native
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): Double = js.native
  /** Returns a new Point with the same row and column. */
  def copy(): Point = js.native
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): ReadonlyPoint = js.native
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): Boolean = js.native
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  /** Returns a new Point with the row and column negated. */
  def negate(): Point = js.native
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[Double, Double] = js.native
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[Double, Double] = js.native
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
  def fromObject(`object`: PointCompatible): Point = js.native
  def fromObject(`object`: PointCompatible, copy: Boolean): Point = js.native
  // Comparison
  /** Returns the given Point that is earlier in the buffer. */
  def min(point1: PointCompatible, point2: PointCompatible): Point = js.native
}

