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
    isCoordinate: js.Function1[java.lang.String, scala.Boolean],
    parse: js.Function1[java.lang.String, aframeLib.aframeMod.Coordinate],
    stringify: js.Function1[aframeLib.aframeMod.Coordinate, java.lang.String]
  ): Anon_Coord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCoordinate")(isCoordinate)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[Anon_Coord]
  }
}

