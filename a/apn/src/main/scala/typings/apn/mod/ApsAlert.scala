package typings.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApsAlert extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var `action-loc-key`: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var `loc-args`: js.UndefOr[js.Array[_]] = js.native
  
  var `loc-key`: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `title-loc-args`: js.UndefOr[js.Array[_]] = js.native
  
  var `title-loc-key`: js.UndefOr[String] = js.native
}
object ApsAlert {
  
  @scala.inline
  def apply(): ApsAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApsAlert]
  }
  
  @scala.inline
  implicit class ApsAlertOps[Self <: ApsAlert] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def `setAction-loc-key`(value: String): Self = this.set("action-loc-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAction-loc-key`: Self = this.set("action-loc-key", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def `setLoc-argsVarargs`(value: js.Any*): Self = this.set("loc-args", js.Array(value :_*))
    
    @scala.inline
    def `setLoc-args`(value: js.Array[_]): Self = this.set("loc-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoc-args`: Self = this.set("loc-args", js.undefined)
    
    @scala.inline
    def `setLoc-key`(value: String): Self = this.set("loc-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoc-key`: Self = this.set("loc-key", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def `setTitle-loc-argsVarargs`(value: js.Any*): Self = this.set("title-loc-args", js.Array(value :_*))
    
    @scala.inline
    def `setTitle-loc-args`(value: js.Array[_]): Self = this.set("title-loc-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTitle-loc-args`: Self = this.set("title-loc-args", js.undefined)
    
    @scala.inline
    def `setTitle-loc-key`(value: String): Self = this.set("title-loc-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTitle-loc-key`: Self = this.set("title-loc-key", js.undefined)
  }
}
