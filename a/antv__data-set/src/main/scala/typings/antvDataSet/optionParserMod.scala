package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionParserMod {
  
  @JSImport("@antv/data-set/lib/util/option-parser", "getField")
  @js.native
  def getField(options: Options): String = js.native
  @JSImport("@antv/data-set/lib/util/option-parser", "getField")
  @js.native
  def getField(options: Options, defaultField: String): String = js.native
  
  @JSImport("@antv/data-set/lib/util/option-parser", "getFields")
  @js.native
  def getFields(options: Options): js.Array[String] = js.native
  @JSImport("@antv/data-set/lib/util/option-parser", "getFields")
  @js.native
  def getFields(options: Options, defaultFields: js.Array[String]): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var field: js.UndefOr[String | js.Array[String]] = js.native
    
    var fields: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
}
