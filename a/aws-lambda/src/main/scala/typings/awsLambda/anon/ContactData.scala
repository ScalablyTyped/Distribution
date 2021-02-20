package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactData extends StObject {
  
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
  implicit class ContactDataMutableBuilder[Self <: ContactData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactData(value: Attributes): Self = StObject.set(x, "ContactData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
