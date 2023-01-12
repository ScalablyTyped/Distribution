package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilOptionParserMod {
  
  @JSImport("@antv/data-set/lib/util/option-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getField(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getField")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getField(options: Options, defaultField: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(options.asInstanceOf[js.Any], defaultField.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFields(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFields")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getFields(options: Options, defaultFields: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFields")(options.asInstanceOf[js.Any], defaultFields.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    var field: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
}
