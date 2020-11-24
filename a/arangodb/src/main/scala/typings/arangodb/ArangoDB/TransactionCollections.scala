package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Global
@js.native
trait TransactionCollections extends js.Object {
  
  var allowImplicit: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[String | js.Array[String]] = js.native
  
  var write: js.UndefOr[String | js.Array[String]] = js.native
}
object TransactionCollections {
  
  @scala.inline
  def apply(): TransactionCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionCollections]
  }
  
  @scala.inline
  implicit class TransactionCollectionsOps[Self <: TransactionCollections] (val x: Self) extends AnyVal {
    
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
    def setAllowImplicit(value: Boolean): Self = this.set("allowImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowImplicit: Self = this.set("allowImplicit", js.undefined)
    
    @scala.inline
    def setReadVarargs(value: String*): Self = this.set("read", js.Array(value :_*))
    
    @scala.inline
    def setRead(value: String | js.Array[String]): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setWriteVarargs(value: String*): Self = this.set("write", js.Array(value :_*))
    
    @scala.inline
    def setWrite(value: String | js.Array[String]): Self = this.set("write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
