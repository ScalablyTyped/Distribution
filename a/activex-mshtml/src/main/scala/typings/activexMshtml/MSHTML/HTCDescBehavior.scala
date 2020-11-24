package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTCDescBehavior extends js.Object {
  
  @JSName("MSHTML.HTCDescBehavior_typekey")
  var MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior = js.native
  
  val name: String = js.native
  
  val urn: String = js.native
}
object HTCDescBehavior {
  
  @scala.inline
  def apply(MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior, name: String, urn: String): HTCDescBehavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDescBehavior_typekey")(MSHTMLDotHTCDescBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDescBehavior]
  }
  
  @scala.inline
  implicit class HTCDescBehaviorOps[Self <: HTCDescBehavior] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTCDescBehavior_typekey(value: HTCDescBehavior): Self = this.set("MSHTML.HTCDescBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrn(value: String): Self = this.set("urn", value.asInstanceOf[js.Any])
  }
}
