package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hyperlinks extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Hyperlinks_typekey")
  var PowerPointDotHyperlinks_typekey: Hyperlinks
  def Item(Index: Double): Hyperlink
}

object Hyperlinks {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => Hyperlink,
    Parent: js.Any,
    PowerPointDotHyperlinks_typekey: Hyperlinks
  ): Hyperlinks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlinks_typekey")(PowerPointDotHyperlinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlinks]
  }
}

