package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecord extends StObject {
  
  /**
    * The name of the DNS record to create in your domain. This is supplied by ACM.
    */
  var Name: String = js.native
  
  /**
    * The type of DNS record. Currently this can be CNAME.
    */
  var Type: RecordType = js.native
  
  /**
    * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
    */
  var Value: String = js.native
}
object ResourceRecord {
  
  @scala.inline
  def apply(Name: String, Type: RecordType, Value: String): ResourceRecord = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRecord]
  }
  
  @scala.inline
  implicit class ResourceRecordMutableBuilder[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RecordType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
