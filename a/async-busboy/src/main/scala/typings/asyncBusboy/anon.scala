package typings.asyncBusboy

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fields extends StObject {
    
    var fields: StringDictionary[js.Any] = js.native
    
    var files: js.UndefOr[js.Array[ReadStream]] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(fields: StringDictionary[js.Any]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[ReadStream]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: ReadStream*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
