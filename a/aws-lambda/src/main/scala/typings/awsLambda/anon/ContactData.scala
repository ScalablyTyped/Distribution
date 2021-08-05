package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactData extends StObject {
  
  var ContactData: Attributes
  
  var Parameters: StringDictionary[String]
}
object ContactData {
  
  inline def apply(ContactData: Attributes, Parameters: StringDictionary[String]): ContactData = {
    val __obj = js.Dynamic.literal(ContactData = ContactData.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactData]
  }
  
  extension [Self <: ContactData](x: Self) {
    
    inline def setContactData(value: Attributes): Self = StObject.set(x, "ContactData", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
