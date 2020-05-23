package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.NamedSlideShows")
@js.native
class NamedSlideShows protected ()
  extends typings.activexPowerpoint.PowerPoint.NamedSlideShows {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.NamedSlideShows_typekey")
  override var PowerPointDotNamedSlideShows_typekey: typings.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  /* CompleteClass */
  override def Add(Name: String, safeArrayOfSlideIDs: js.Any): typings.activexPowerpoint.PowerPoint.NamedSlideShow = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexPowerpoint.PowerPoint.NamedSlideShow = js.native
}

