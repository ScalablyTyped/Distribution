package typings.angularLocalforage.mod.localForage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageConfig extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var driver: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String | Double] = js.native
  
  var storeName: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object LocalForageConfig {
  
  @scala.inline
  def apply(): LocalForageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageConfig]
  }
  
  @scala.inline
  implicit class LocalForageConfigOps[Self <: LocalForageConfig] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
