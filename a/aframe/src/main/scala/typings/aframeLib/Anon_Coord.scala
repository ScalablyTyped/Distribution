package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coord extends js.Object {
  def isCoordinate(value: java.lang.String): scala.Boolean
  def parse(value: java.lang.String): aframeLib.aframeMod.Coordinate
  def stringify(coord: aframeLib.aframeMod.Coordinate): java.lang.String
}

object Anon_Coord {
  @scala.inline
  def apply(
    isCoordinate: java.lang.String => scala.Boolean,
    parse: java.lang.String => aframeLib.aframeMod.Coordinate,
    stringify: aframeLib.aframeMod.Coordinate => java.lang.String
  ): Anon_Coord = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Anon_Coord]
  }
}

