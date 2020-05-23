package typings.archiver.mod

import typings.archiver.anon.Processed
import typings.archiver.anon.ProcessedBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var entries: Processed
  var fs: ProcessedBytes
}

object ProgressData {
  @scala.inline
  def apply(entries: Processed, fs: ProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
}

