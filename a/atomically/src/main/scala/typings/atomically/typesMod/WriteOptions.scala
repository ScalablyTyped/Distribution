package typings.atomically.typesMod

import typings.atomically.anon.Gid
import typings.atomically.atomicallyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends js.Object {
  
  var chown: js.UndefOr[Gid | `false`] = js.native
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var fsync: js.UndefOr[Boolean] = js.native
  
  var fsyncWait: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String | Double | `false`] = js.native
  
  var schedule: js.UndefOr[js.Function1[/* filePath */ String, js.Promise[Disposer]]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var tmpCreate: js.UndefOr[js.Function1[/* filePath */ String, String]] = js.native
  
  var tmpCreated: js.UndefOr[js.Function1[/* filePath */ String, _]] = js.native
  
  var tmpPurge: js.UndefOr[Boolean] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
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
    def setChown(value: Gid | `false`): Self = this.set("chown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChown: Self = this.set("chown", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsync: Self = this.set("fsync", js.undefined)
    
    @scala.inline
    def setFsyncWait(value: Boolean): Self = this.set("fsyncWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsyncWait: Self = this.set("fsyncWait", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double | `false`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSchedule(value: /* filePath */ String => js.Promise[Disposer]): Self = this.set("schedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTmpCreate(value: /* filePath */ String => String): Self = this.set("tmpCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTmpCreate: Self = this.set("tmpCreate", js.undefined)
    
    @scala.inline
    def setTmpCreated(value: /* filePath */ String => _): Self = this.set("tmpCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTmpCreated: Self = this.set("tmpCreated", js.undefined)
    
    @scala.inline
    def setTmpPurge(value: Boolean): Self = this.set("tmpPurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpPurge: Self = this.set("tmpPurge", js.undefined)
  }
}
