package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaInterface extends js.Object {
  
  /** Path to the test file being executed. */
  var file: String = js.native
  
  /** Directory where snapshots are stored. */
  var snapshotDirectory: String = js.native
}
object MetaInterface {
  
  @scala.inline
  def apply(file: String, snapshotDirectory: String): MetaInterface = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], snapshotDirectory = snapshotDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInterface]
  }
  
  @scala.inline
  implicit class MetaInterfaceOps[Self <: MetaInterface] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDirectory(value: String): Self = this.set("snapshotDirectory", value.asInstanceOf[js.Any])
  }
}
