package typings.ajv

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Copy extends StObject {
    
    def copy(obj: js.Any): js.Any = js.native
    def copy(obj: js.Any, target: js.Any): js.Any = js.native
    
    def equal(obj: js.Any, target: js.Any): Boolean = js.native
    
    def escapeFragment(str: String): String = js.native
    
    def escapeJsonPointer(str: String): String = js.native
    
    def escapeQuotes(str: String): String = js.native
    
    def getData(jsonPointer: String, dataLevel: Double, paths: js.Array[String]): String = js.native
    
    def getProperty(str: String): String = js.native
    
    def schemaHasRules(schema: js.Object, rules: js.Any): String = js.native
    
    def toHash(source: js.Array[String]): StringDictionary[js.UndefOr[`true`]] = js.native
    
    def toQuotedString(str: String): String = js.native
    
    def unescapeFragment(str: String): String = js.native
    
    def unescapeJsonPointer(str: String): String = js.native
  }
  
  trait TypeofMissingRefError extends StObject {
    
    /* static member */
    def message(baseId: String, ref: String): String
    /* static member */
    @JSName("message")
    var message_Original: js.Function2[/* baseId */ String, /* ref */ String, String]
  }
  object TypeofMissingRefError {
    
    @scala.inline
    def apply(message: (/* baseId */ String, /* ref */ String) => String): TypeofMissingRefError = {
      val __obj = js.Dynamic.literal(message = js.Any.fromFunction2(message))
      __obj.asInstanceOf[TypeofMissingRefError]
    }
    
    @scala.inline
    implicit class TypeofMissingRefErrorMutableBuilder[Self <: TypeofMissingRefError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: (/* baseId */ String, /* ref */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    }
  }
}
