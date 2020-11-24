package typings.activedirectory2.mod

import typings.activedirectory2.activedirectory2Numbers.`0`
import typings.activedirectory2.activedirectory2Numbers.`10`
import typings.activedirectory2.activedirectory2Strings.base
import typings.activedirectory2.activedirectory2Strings.one
import typings.activedirectory2.activedirectory2Strings.sub
import typings.activedirectory2.anon.Ca
import typings.ldapjs.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqProps extends LDAPjsReqProps {
  
  var attributes: AttributeSpec = js.native
  
  var baseDN: js.UndefOr[String] = js.native
  
  var bindCredentials: js.UndefOr[String] = js.native
  
  var bindDN: js.UndefOr[String] = js.native
  
  var filter: String | Filter = js.native
  
  var includeMembership: js.Array[MembershipType] = js.native
  
  var scope: js.UndefOr[base | one | sub] = js.native
  
  var sizeLimit: `0` = js.native
  
  var timeLimit: `10` = js.native
}
object ReqProps {
  
  @scala.inline
  def apply(
    attributes: AttributeSpec,
    filter: String | Filter,
    includeMembership: js.Array[MembershipType],
    sizeLimit: `0`,
    timeLimit: `10`,
    tlsOptions: Ca,
    url: String
  ): ReqProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], includeMembership = includeMembership.asInstanceOf[js.Any], sizeLimit = sizeLimit.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqProps]
  }
  
  @scala.inline
  implicit class ReqPropsOps[Self <: ReqProps] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: AttributeSpec): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String | Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMembershipVarargs(value: MembershipType*): Self = this.set("includeMembership", js.Array(value :_*))
    
    @scala.inline
    def setIncludeMembership(value: js.Array[MembershipType]): Self = this.set("includeMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLimit(value: `0`): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLimit(value: `10`): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDN(value: String): Self = this.set("baseDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDN: Self = this.set("baseDN", js.undefined)
    
    @scala.inline
    def setBindCredentials(value: String): Self = this.set("bindCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindCredentials: Self = this.set("bindCredentials", js.undefined)
    
    @scala.inline
    def setBindDN(value: String): Self = this.set("bindDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindDN: Self = this.set("bindDN", js.undefined)
    
    @scala.inline
    def setScope(value: base | one | sub): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
