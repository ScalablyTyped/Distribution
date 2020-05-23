package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConverters extends js.Object {
  val Count: Double
  @JSName("PowerPoint.FileConverters_typekey")
  var PowerPointDotFileConverters_typekey: FileConverters
  def Item(Index: js.Any): FileConverter
}

object FileConverters {
  @scala.inline
  def apply(Count: Double, Item: js.Any => FileConverter, PowerPointDotFileConverters_typekey: FileConverters): FileConverters = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.FileConverters_typekey")(PowerPointDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
}

