package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jql extends js.Object {
  
  var jql: String = js.native
}
object Jql {
  
  @scala.inline
  def apply(jql: String): Jql = {
    val __obj = js.Dynamic.literal(jql = jql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jql]
  }
  
  @scala.inline
  implicit class JqlOps[Self <: Jql] (val x: Self) extends AnyVal {
    
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
    def setJql(value: String): Self = this.set("jql", value.asInstanceOf[js.Any])
  }
}
