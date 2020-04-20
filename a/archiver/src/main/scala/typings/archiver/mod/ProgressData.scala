package typings.archiver.mod

import typings.archiver.AnonProcessed
import typings.archiver.AnonProcessedBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var entries: AnonProcessed
  var fs: AnonProcessedBytes
}

object ProgressData {
  @scala.inline
  def apply(entries: AnonProcessed, fs: AnonProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
}

