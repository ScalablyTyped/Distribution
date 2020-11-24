package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachingConfig extends js.Object {
  
  /**
    * The caching keys for a resolver that has caching enabled. Valid values are entries from the $context.arguments, $context.source, and $context.identity maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.native
  
  /**
    * The TTL in seconds for a resolver that has caching enabled. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
}
object CachingConfig {
  
  @scala.inline
  def apply(): CachingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachingConfig]
  }
  
  @scala.inline
  implicit class CachingConfigOps[Self <: CachingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCachingKeysVarargs(value: String*): Self = this.set("cachingKeys", js.Array(value :_*))
    
    @scala.inline
    def setCachingKeys(value: CachingKeys): Self = this.set("cachingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachingKeys: Self = this.set("cachingKeys", js.undefined)
    
    @scala.inline
    def setTtl(value: Long): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
