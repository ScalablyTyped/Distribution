package typings.atom.anon

import typings.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<atom.atom/dependencies/text-buffer/src/point.Point> */
@js.native
trait ReadonlyPoint extends StObject {
  
  val column: Double = js.native
  
  def compare(other: PointCompatible): Double = js.native
  
  def copy(): this.type = js.native
  
  def freeze(): this.type = js.native
  
  val fromObject: js.UndefOr[Any] = js.native
  
  def isEqual(other: PointCompatible): Boolean = js.native
  
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  
  def isLessThan(other: PointCompatible): Boolean = js.native
  
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  
  val min: js.UndefOr[Any] = js.native
  
  def negate(): this.type = js.native
  
  val row: Double = js.native
  
  def serialize(): js.Tuple2[Double, Double] = js.native
  
  def toArray(): js.Tuple2[Double, Double] = js.native
  
  def translate(other: PointCompatible): this.type = js.native
  
  def traverse(other: PointCompatible): this.type = js.native
}
