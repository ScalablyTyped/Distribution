package typings.ardatanAggregateError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentStringMod {
  
  @JSImport("@ardatan/aggregate-error/indentString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentString(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indentString(string: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def indentString(string: String, count: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def indentString(string: String, count: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      Also indent empty lines.
      @default false
      */
    val includeEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      The string to use for the indent.
      @default ' '
      */
    val indent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIncludeEmptyLines(value: Boolean): Self = StObject.set(x, "includeEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyLinesUndefined: Self = StObject.set(x, "includeEmptyLines", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
}
