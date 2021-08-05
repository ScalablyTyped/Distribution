package typings.asyncBusboy

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fields extends StObject {
    
    var fields: StringDictionary[js.Any]
    
    var files: js.UndefOr[js.Array[ReadStream]] = js.undefined
  }
  object Fields {
    
    inline def apply(fields: StringDictionary[js.Any]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[ReadStream]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: ReadStream*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
