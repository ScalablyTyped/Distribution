package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Granttype extends js.Object {
  
  var grant_type: js.UndefOr[String] = js.native
}
object Granttype {
  
  @scala.inline
  def apply(): Granttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granttype]
  }
  
  @scala.inline
  implicit class GranttypeOps[Self <: Granttype] (val x: Self) extends AnyVal {
    
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
    def setGrant_type(value: String): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrant_type: Self = this.set("grant_type", js.undefined)
  }
}
