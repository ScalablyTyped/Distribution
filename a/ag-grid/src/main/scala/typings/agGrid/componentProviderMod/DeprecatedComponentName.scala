package typings.agGrid.componentProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecatedComponentName extends js.Object {
  
  var newComponentName: String = js.native
  
  var propertyHolder: String = js.native
}
object DeprecatedComponentName {
  
  @scala.inline
  def apply(newComponentName: String, propertyHolder: String): DeprecatedComponentName = {
    val __obj = js.Dynamic.literal(newComponentName = newComponentName.asInstanceOf[js.Any], propertyHolder = propertyHolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedComponentName]
  }
  
  @scala.inline
  implicit class DeprecatedComponentNameOps[Self <: DeprecatedComponentName] (val x: Self) extends AnyVal {
    
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
    def setNewComponentName(value: String): Self = this.set("newComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyHolder(value: String): Self = this.set("propertyHolder", value.asInstanceOf[js.Any])
  }
}
