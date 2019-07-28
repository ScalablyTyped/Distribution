package typings.adone.adoneNs.prettyNs

import typings.adone.adoneNs.prettyNs.INs.JSONOptions
import typings.adone.adoneNs.prettyNs.INs.TableData
import typings.adone.adoneNs.prettyNs.INs.TableOptions
import typings.adone.adoneNs.prettyNs.INs.TimeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.pretty")
@js.native
object ^ extends js.Object {
  def json(data: js.Any): String = js.native
  def json(data: js.Any, options: JSONOptions): String = js.native
  def json(data: js.Any, options: JSONOptions, indentation: Double): String = js.native
  def size(num: Double): String = js.native
  def size(num: Double, space: String): String = js.native
  def table(data: TableData, options: TableOptions): String = js.native
  def time(ms: Double): String = js.native
  def time(ms: Double, options: TimeOptions): String = js.native
}

