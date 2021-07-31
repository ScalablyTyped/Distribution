package typings.ardatanAggregateError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentStringMod {
  
  @JSImport("@ardatan/aggregate-error/indentString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def indentString(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def indentString(string: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def indentString(string: String, count: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def indentString(string: String, count: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(string.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeEmptyLines(value: Boolean): Self = StObject.set(x, "includeEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEmptyLinesUndefined: Self = StObject.set(x, "includeEmptyLines", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
}
