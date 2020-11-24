package typings.atomically.anon

import typings.atomically.atomicallyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined atomically.atomically/dist/types.ReadOptions & {  encoding :string} */
@js.native
trait ReadOptionsencodingstring extends js.Object {
  
  var encoding: (js.UndefOr[String | Null]) with String = js.native
  
  var mode: js.UndefOr[String | Double | `false`] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ReadOptionsencodingstring {
  
  @scala.inline
  def apply(encoding: (js.UndefOr[String | Null]) with String): ReadOptionsencodingstring = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptionsencodingstring]
  }
  
  @scala.inline
  implicit class ReadOptionsencodingstringOps[Self <: ReadOptionsencodingstring] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: (js.UndefOr[String | Null]) with String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String | Double | `false`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
