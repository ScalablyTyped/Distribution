package typings
package adoneLib.adoneNs.fakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fake.date")
@js.native
object dateNs extends js.Object {
  def between(from: java.lang.String, to: java.lang.String): stdLib.Date = js.native
  def between(from: java.lang.String, to: stdLib.Date): stdLib.Date = js.native
  def between(from: scala.Double, to: java.lang.String): stdLib.Date = js.native
  def between(from: scala.Double, to: stdLib.Date): stdLib.Date = js.native
  def between(from: stdLib.Date, to: java.lang.String): stdLib.Date = js.native
  def between(from: stdLib.Date, to: stdLib.Date): stdLib.Date = js.native
  def future(): stdLib.Date = js.native
  def future(years: scala.Double): stdLib.Date = js.native
  def future(years: scala.Double, refDate: java.lang.String): stdLib.Date = js.native
  def future(years: scala.Double, refDate: stdLib.Date): stdLib.Date = js.native
  def month(): java.lang.String = js.native
  def month(options: adoneLib.Anon_Abbr): java.lang.String = js.native
  def past(): stdLib.Date = js.native
  def past(years: scala.Double): stdLib.Date = js.native
  def past(years: scala.Double, refDate: java.lang.String): stdLib.Date = js.native
  def past(years: scala.Double, refDate: stdLib.Date): stdLib.Date = js.native
  def recent(): stdLib.Date = js.native
  def recent(days: scala.Double): stdLib.Date = js.native
  def soon(): stdLib.Date = js.native
  def soon(days: scala.Double): stdLib.Date = js.native
  def weekday(): java.lang.String = js.native
  def weekday(options: adoneLib.Anon_Abbr): java.lang.String = js.native
}

