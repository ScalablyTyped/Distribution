package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUserKeys extends js.Object {
  
  var allowUserKeys: js.UndefOr[Boolean] = js.native
  
  var increment: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[KeyGeneratorType] = js.native
}
object AllowUserKeys {
  
  @scala.inline
  def apply(): AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUserKeys]
  }
  
  @scala.inline
  implicit class AllowUserKeysOps[Self <: AllowUserKeys] (val x: Self) extends AnyVal {
    
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
    def setAllowUserKeys(value: Boolean): Self = this.set("allowUserKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUserKeys: Self = this.set("allowUserKeys", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setType(value: KeyGeneratorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
