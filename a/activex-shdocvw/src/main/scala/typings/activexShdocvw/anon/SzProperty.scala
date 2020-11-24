package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SzProperty extends js.Object {
  
  val szProperty: String = js.native
}
object SzProperty {
  
  @scala.inline
  def apply(szProperty: String): SzProperty = {
    val __obj = js.Dynamic.literal(szProperty = szProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SzProperty]
  }
  
  @scala.inline
  implicit class SzPropertyOps[Self <: SzProperty] (val x: Self) extends AnyVal {
    
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
    def setSzProperty(value: String): Self = this.set("szProperty", value.asInstanceOf[js.Any])
  }
}
