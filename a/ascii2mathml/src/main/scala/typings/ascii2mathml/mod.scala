package typings.ascii2mathml

import org.scalablytyped.runtime.Shortcut
import typings.ascii2mathml.ascii2mathmlStrings.`inline`
import typings.ascii2mathml.ascii2mathmlStrings.block
import typings.ascii2mathml.ascii2mathmlStrings.ltr
import typings.ascii2mathml.ascii2mathmlStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ascii2mathml", JSImport.Namespace)
  @js.native
  val ^ : typings.ascii2mathml.mod.ascii2mathml = js.native
  
  @js.native
  trait Options extends StObject {
    
    var annotate: js.UndefOr[Boolean] = js.native
    
    var bare: js.UndefOr[Boolean] = js.native
    
    var colSep: js.UndefOr[String] = js.native
    
    var decimalMark: js.UndefOr[String] = js.native
    
    var dir: js.UndefOr[ltr | rtl] = js.native
    
    var display: js.UndefOr[`inline` | block] = js.native
    
    var rowSep: js.UndefOr[String] = js.native
    
    var standalone: js.UndefOr[Boolean] = js.native
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
      def setAnnotate(value: Boolean): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
      
      @scala.inline
      def setBare(value: Boolean): Self = StObject.set(x, "bare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBareUndefined: Self = StObject.set(x, "bare", js.undefined)
      
      @scala.inline
      def setColSep(value: String): Self = StObject.set(x, "colSep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSepUndefined: Self = StObject.set(x, "colSep", js.undefined)
      
      @scala.inline
      def setDecimalMark(value: String): Self = StObject.set(x, "decimalMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalMarkUndefined: Self = StObject.set(x, "decimalMark", js.undefined)
      
      @scala.inline
      def setDir(value: ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisplay(value: `inline` | block): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setRowSep(value: String): Self = StObject.set(x, "rowSep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSepUndefined: Self = StObject.set(x, "rowSep", js.undefined)
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
  
  type _To = typings.ascii2mathml.mod.ascii2mathml
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.ascii2mathml.mod.ascii2mathml = ^
  
  @js.native
  trait ascii2mathml extends StObject {
    
    /**
      * Converts ASCIIMath expression to MathML markup.
      * @param asciimath ASCIIMath expression
      * @param options Options
      */
    def apply(asciimath: String): String = js.native
    def apply(asciimath: String, options: Options): String = js.native
    /**
      * Generates a function with default options set to convert
      * ASCIIMath expression to MathML markup.
      * @param options Options
      */
    def apply(options: Options): typings.ascii2mathml.mod.ascii2mathml = js.native
  }
}
