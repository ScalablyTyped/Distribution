package typings
package archiverLib.archiverMod.archiverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var entries: archiverLib.Anon_Processed
  var fs: archiverLib.Anon_ProcessedBytes
}

object ProgressData {
  @scala.inline
  def apply(entries: archiverLib.Anon_Processed, fs: archiverLib.Anon_ProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries, fs = fs)
  
    __obj.asInstanceOf[ProgressData]
  }
}

