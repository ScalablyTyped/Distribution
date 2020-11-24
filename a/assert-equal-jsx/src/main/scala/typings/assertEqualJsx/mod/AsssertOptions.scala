package typings.assertEqualJsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsssertOptions extends js.Object {
  
  var sanitize: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}
object AsssertOptions {
  
  @scala.inline
  def apply(): AsssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsssertOptions]
  }
  
  @scala.inline
  implicit class AsssertOptionsOps[Self <: AsssertOptions] (val x: Self) extends AnyVal {
    
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
    def setSanitize(value: /* str */ String => String): Self = this.set("sanitize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
  }
}
