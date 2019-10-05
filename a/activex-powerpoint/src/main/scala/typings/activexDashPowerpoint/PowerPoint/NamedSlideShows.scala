package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.NamedSlideShows")
@js.native
class NamedSlideShows protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.NamedSlideShows_typekey`: NamedSlideShows = js.native
  def Add(Name: String, safeArrayOfSlideIDs: js.Any): NamedSlideShow = js.native
  def Item(Index: js.Any): NamedSlideShow = js.native
}

