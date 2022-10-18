package typings.airtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRecordDataMod {
  
  trait RecordData[TFields] extends StObject {
    
    var fields: TFields
    
    var id: String
  }
  object RecordData {
    
    inline def apply[TFields](fields: TFields, id: String): RecordData[TFields] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordData[TFields]]
    }
    
    extension [Self <: RecordData[?], TFields](x: Self & RecordData[TFields]) {
      
      inline def setFields(value: TFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
