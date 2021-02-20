package typings.autoprefixer

import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browsersMod {
  
  @JSImport("autoprefixer/lib/browsers", JSImport.Namespace)
  @js.native
  class ^ protected () extends BrowsersImpl {
    def this(data: StringDictionary[js.Any]) = this()
    def this(data: StringDictionary[js.Any], options: js.Any) = this()
    def this(data: StringDictionary[js.Any], options: js.UndefOr[scala.Nothing], browserslistOpts: Options) = this()
    def this(data: StringDictionary[js.Any], options: js.Any, browserslistOpts: Options) = this()
  }
  
  @js.native
  trait Browsers extends StObject {
    
    def isSelected(browser: String): Boolean = js.native
    
    def parse(queries: Queries): js.Array[String] = js.native
    
    def prefix(browser: String): String = js.native
  }
  object Browsers {
    
    @scala.inline
    def apply(isSelected: String => Boolean, parse: Queries => js.Array[String], prefix: String => String): Browsers = {
      val __obj = js.Dynamic.literal(isSelected = js.Any.fromFunction1(isSelected), parse = js.Any.fromFunction1(parse), prefix = js.Any.fromFunction1(prefix))
      __obj.asInstanceOf[Browsers]
    }
    
    @scala.inline
    implicit class BrowsersMutableBuilder[Self <: Browsers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: String => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParse(value: Queries => js.Array[String]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefix(value: String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BrowsersImpl extends Browsers {
    
    def parse(queries: String): js.Array[String] = js.native
    def parse(queries: js.Array[String]): js.Array[String] = js.native
    
    def prefixes(): js.Array[String] = js.native
    
    def withPrefix(value: String): Boolean = js.native
  }
  
  type Queries = String | js.Array[String]
}
