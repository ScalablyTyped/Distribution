package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSlideShows extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.NamedSlideShows_typekey")
  var PowerPointDotNamedSlideShows_typekey: NamedSlideShows
  def Add(Name: String, safeArrayOfSlideIDs: js.Any): NamedSlideShow
  def Item(Index: js.Any): NamedSlideShow
}

object NamedSlideShows {
  @scala.inline
  def apply(
    Add: (String, js.Any) => NamedSlideShow,
    Application: Application,
    Count: Double,
    Item: js.Any => NamedSlideShow,
    Parent: js.Any,
    PowerPointDotNamedSlideShows_typekey: NamedSlideShows
  ): NamedSlideShows = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShows_typekey")(PowerPointDotNamedSlideShows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShows]
  }
}

