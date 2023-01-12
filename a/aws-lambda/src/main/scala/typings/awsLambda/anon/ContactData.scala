package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactData extends StObject {
  
  var ContactData: Channel
  
  var Parameters: StringDictionary[String]
}
object ContactData {
  
  inline def apply(ContactData: Channel, Parameters: StringDictionary[String]): ContactData = {
    val __obj = js.Dynamic.literal(ContactData = ContactData.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactData] (val x: Self) extends AnyVal {
    
    inline def setContactData(value: Channel): Self = StObject.set(x, "ContactData", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
