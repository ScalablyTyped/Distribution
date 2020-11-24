package typings.antDesignProLayout.siderMenuSiderMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateSiderMenuProps extends js.Object {
  
  var matchMenuKeys: js.Array[String] = js.native
}
object PrivateSiderMenuProps {
  
  @scala.inline
  def apply(matchMenuKeys: js.Array[String]): PrivateSiderMenuProps = {
    val __obj = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateSiderMenuProps]
  }
  
  @scala.inline
  implicit class PrivateSiderMenuPropsOps[Self <: PrivateSiderMenuProps] (val x: Self) extends AnyVal {
    
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
    def setMatchMenuKeysVarargs(value: String*): Self = this.set("matchMenuKeys", js.Array(value :_*))
    
    @scala.inline
    def setMatchMenuKeys(value: js.Array[String]): Self = this.set("matchMenuKeys", value.asInstanceOf[js.Any])
  }
}
