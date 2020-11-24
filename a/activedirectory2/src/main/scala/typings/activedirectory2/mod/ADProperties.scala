package typings.activedirectory2.mod

import typings.activedirectory2.activedirectory2Numbers.`1000`
import typings.activedirectory2.anon.Enabled
import typings.activedirectory2.anon.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADProperties extends js.Object {
  
  var attributes: js.UndefOr[Group] = js.native
  
  var baseDN: String = js.native
  
  var entryParser: js.UndefOr[
    js.Function3[
      /* entry */ js.Object, 
      /* raw */ String, 
      /* cb */ js.Function1[/* entry */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  
  var pageSize: js.UndefOr[`1000`] = js.native
  
  var password: String = js.native
  
  var referrals: js.UndefOr[Enabled] = js.native
  
  var url: String = js.native
  
  var username: String = js.native
}
object ADProperties {
  
  @scala.inline
  def apply(baseDN: String, password: String, url: String, username: String): ADProperties = {
    val __obj = js.Dynamic.literal(baseDN = baseDN.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADProperties]
  }
  
  @scala.inline
  implicit class ADPropertiesOps[Self <: ADProperties] (val x: Self) extends AnyVal {
    
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
    def setBaseDN(value: String): Self = this.set("baseDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Group): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setEntryParser(
      value: (/* entry */ js.Object, /* raw */ String, /* cb */ js.Function1[/* entry */ js.Object, Unit]) => Unit
    ): Self = this.set("entryParser", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEntryParser: Self = this.set("entryParser", js.undefined)
    
    @scala.inline
    def setPageSize(value: `1000`): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setReferrals(value: Enabled): Self = this.set("referrals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrals: Self = this.set("referrals", js.undefined)
  }
}
