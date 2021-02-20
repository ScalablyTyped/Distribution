package typings.ardatanAggregateError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentStringMod {
  
  @JSImport("@ardatan/aggregate-error/indentString", "indentString")
  @js.native
  def indentString(string: String): String = js.native
  @JSImport("@ardatan/aggregate-error/indentString", "indentString")
  @js.native
  def indentString(string: String, count: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("@ardatan/aggregate-error/indentString", "indentString")
  @js.native
  def indentString(string: String, count: Double): String = js.native
  @JSImport("@ardatan/aggregate-error/indentString", "indentString")
  @js.native
  def indentString(string: String, count: Double, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      Also indent empty lines.
      @default false
      */
    val includeEmptyLines: js.UndefOr[Boolean] = js.native
    
    /**
      The string to use for the indent.
      @default ' '
      */
    val indent: js.UndefOr[String] = js.native
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
