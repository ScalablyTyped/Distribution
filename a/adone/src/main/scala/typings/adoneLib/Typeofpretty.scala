package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpretty extends js.Object {
  val INs: js.Any = js.native
  def json(data: js.Any): java.lang.String = js.native
  def json(data: js.Any, options: adoneLib.adoneNs.prettyNs.INs.JSONOptions): java.lang.String = js.native
  def json(data: js.Any, options: adoneLib.adoneNs.prettyNs.INs.JSONOptions, indentation: scala.Double): java.lang.String = js.native
  def size(num: scala.Double): java.lang.String = js.native
  def size(num: scala.Double, space: java.lang.String): java.lang.String = js.native
  def table(data: adoneLib.adoneNs.prettyNs.INs.TableData, options: adoneLib.adoneNs.prettyNs.INs.TableOptions): java.lang.String = js.native
  def time(ms: scala.Double): java.lang.String = js.native
  def time(ms: scala.Double, options: adoneLib.adoneNs.prettyNs.INs.TimeOptions): java.lang.String = js.native
}

