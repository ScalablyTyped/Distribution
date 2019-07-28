package typings.adone.adoneNs.fakeNs

import typings.adone.Anon_Abbr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fake.date")
@js.native
object dateNs extends js.Object {
  def between(from: String, to: String): typings.std.Date = js.native
  def between(from: String, to: typings.std.Date): typings.std.Date = js.native
  def between(from: Double, to: String): typings.std.Date = js.native
  def between(from: Double, to: typings.std.Date): typings.std.Date = js.native
  def between(from: typings.std.Date, to: String): typings.std.Date = js.native
  def between(from: typings.std.Date, to: typings.std.Date): typings.std.Date = js.native
  def future(): typings.std.Date = js.native
  def future(years: Double): typings.std.Date = js.native
  def future(years: Double, refDate: String): typings.std.Date = js.native
  def future(years: Double, refDate: typings.std.Date): typings.std.Date = js.native
  def month(): String = js.native
  def month(options: Anon_Abbr): String = js.native
  def past(): typings.std.Date = js.native
  def past(years: Double): typings.std.Date = js.native
  def past(years: Double, refDate: String): typings.std.Date = js.native
  def past(years: Double, refDate: typings.std.Date): typings.std.Date = js.native
  def recent(): typings.std.Date = js.native
  def recent(days: Double): typings.std.Date = js.native
  def soon(): typings.std.Date = js.native
  def soon(days: Double): typings.std.Date = js.native
  def weekday(): String = js.native
  def weekday(options: Anon_Abbr): String = js.native
}

