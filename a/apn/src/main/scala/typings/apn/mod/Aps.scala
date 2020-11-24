package typings.apn.mod

import typings.apn.apnNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aps extends js.Object {
  
  var alert: js.UndefOr[String | ApsAlert] = js.native
  
  var badge: js.UndefOr[Double] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var `content-available`: js.UndefOr[`1`] = js.native
  
  var `launch-image`: js.UndefOr[String] = js.native
  
  var `mutable-content`: js.UndefOr[`1`] = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var `url-args`: js.UndefOr[js.Array[String]] = js.native
}
object Aps {
  
  @scala.inline
  def apply(): Aps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aps]
  }
  
  @scala.inline
  implicit class ApsOps[Self <: Aps] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: String | ApsAlert): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def `setContent-available`(value: `1`): Self = this.set("content-available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContent-available`: Self = this.set("content-available", js.undefined)
    
    @scala.inline
    def `setLaunch-image`(value: String): Self = this.set("launch-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLaunch-image`: Self = this.set("launch-image", js.undefined)
    
    @scala.inline
    def `setMutable-content`(value: `1`): Self = this.set("mutable-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMutable-content`: Self = this.set("mutable-content", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def `setUrl-argsVarargs`(value: String*): Self = this.set("url-args", js.Array(value :_*))
    
    @scala.inline
    def `setUrl-args`(value: js.Array[String]): Self = this.set("url-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUrl-args`: Self = this.set("url-args", js.undefined)
  }
}
