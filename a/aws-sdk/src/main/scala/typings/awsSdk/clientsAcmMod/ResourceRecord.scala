package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRecord extends StObject {
  
  /**
    * The name of the DNS record to create in your domain. This is supplied by ACM.
    */
  var Name: String
  
  /**
    * The type of DNS record. Currently this can be CNAME.
    */
  var Type: RecordType
  
  /**
    * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
    */
  var Value: String
}
object ResourceRecord {
  
  inline def apply(Name: String, Type: RecordType, Value: String): ResourceRecord = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: RecordType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
