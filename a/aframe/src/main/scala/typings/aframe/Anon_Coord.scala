package typings.aframe

import typings.aframe.aframeMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coord extends js.Object {
  def isCoordinate(value: String): Boolean
  def parse(value: String): Coordinate
  def stringify(coord: Coordinate): String
}

object Anon_Coord {
  @scala.inline
  def apply(isCoordinate: String => Boolean, parse: String => Coordinate, stringify: Coordinate => String): Anon_Coord = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Anon_Coord]
  }
}

