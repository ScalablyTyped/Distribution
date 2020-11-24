package typings.apolloServerCaching.keyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueCacheSetOptions extends js.Object {
  
  var ttl: js.UndefOr[Double | Null] = js.native
}
object KeyValueCacheSetOptions {
  
  @scala.inline
  def apply(): KeyValueCacheSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueCacheSetOptions]
  }
  
  @scala.inline
  implicit class KeyValueCacheSetOptionsOps[Self <: KeyValueCacheSetOptions] (val x: Self) extends AnyVal {
    
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
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setTtlNull: Self = this.set("ttl", null)
  }
}
