package typings.aframe.anon

import typings.aframe.mod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCoordinate extends js.Object {
  def isCoordinate(value: String): Boolean
  def parse(value: String): Coordinate
  def stringify(coord: Coordinate): String
}

object IsCoordinate {
  @scala.inline
  def apply(isCoordinate: String => Boolean, parse: String => Coordinate, stringify: Coordinate => String): IsCoordinate = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[IsCoordinate]
  }
}

