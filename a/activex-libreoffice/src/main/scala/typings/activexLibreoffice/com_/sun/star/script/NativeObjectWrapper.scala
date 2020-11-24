package typings.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeObjectWrapper extends js.Object {
  
  var ObjectId: js.Any = js.native
}
object NativeObjectWrapper {
  
  @scala.inline
  def apply(ObjectId: js.Any): NativeObjectWrapper = {
    val __obj = js.Dynamic.literal(ObjectId = ObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeObjectWrapper]
  }
  
  @scala.inline
  implicit class NativeObjectWrapperOps[Self <: NativeObjectWrapper] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: js.Any): Self = this.set("ObjectId", value.asInstanceOf[js.Any])
  }
}
