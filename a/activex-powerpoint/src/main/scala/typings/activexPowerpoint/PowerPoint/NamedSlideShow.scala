package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSlideShow extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Name: String
  val Parent: js.Any
  @JSName("PowerPoint.NamedSlideShow_typekey")
  var PowerPointDotNamedSlideShow_typekey: NamedSlideShow
  val SlideIDs: js.Any
  def Delete(): Unit
}

object NamedSlideShow {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Delete: () => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotNamedSlideShow_typekey: NamedSlideShow,
    SlideIDs: js.Any
  ): NamedSlideShow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideIDs = SlideIDs.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.NamedSlideShow_typekey")(PowerPointDotNamedSlideShow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedSlideShow]
  }
}

