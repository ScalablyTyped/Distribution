package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: js.Array[_]
  var depth: scala.Double
  var initialized: scala.Boolean
  var stack: js.Array[_]
  def cancelTopModal(): scala.Unit
  def closeTopModal(): scala.Unit
  def getLatestModal(): scala.Null | java.lang.String
  def getTopModalOrBody(): java.lang.String
}

