package typings.archiver.mod

import typings.archiver.anon.Processed
import typings.archiver.anon.ProcessedBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressData extends js.Object {
  
  var entries: Processed = js.native
  
  var fs: ProcessedBytes = js.native
}
object ProgressData {
  
  @scala.inline
  def apply(entries: Processed, fs: ProcessedBytes): ProgressData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
  
  @scala.inline
  implicit class ProgressDataOps[Self <: ProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntries(value: Processed): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFs(value: ProcessedBytes): Self = this.set("fs", value.asInstanceOf[js.Any])
  }
}
