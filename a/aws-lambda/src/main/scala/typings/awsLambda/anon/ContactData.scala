package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactData extends js.Object {
  
  var ContactData: Attributes = js.native
  
  var Parameters: StringDictionary[String] = js.native
}
object ContactData {
  
  @scala.inline
  def apply(ContactData: Attributes, Parameters: StringDictionary[String]): ContactData = {
    val __obj = js.Dynamic.literal(ContactData = ContactData.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactData]
  }
  
  @scala.inline
  implicit class ContactDataOps[Self <: ContactData] (val x: Self) extends AnyVal {
    
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
    def setContactData(value: Attributes): Self = this.set("ContactData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("Parameters", value.asInstanceOf[js.Any])
  }
}
