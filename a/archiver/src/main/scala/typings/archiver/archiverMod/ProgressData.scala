package typings.archiver.archiverMod

import typings.archiver.Anon_Processed
import typings.archiver.Anon_ProcessedBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var entries: Anon_Processed
  var fs: Anon_ProcessedBytes
}

object ProgressData {
  @scala.inline
  def apply(entries: Anon_Processed, fs: Anon_ProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries, fs = fs)
  
    __obj.asInstanceOf[ProgressData]
  }
}

