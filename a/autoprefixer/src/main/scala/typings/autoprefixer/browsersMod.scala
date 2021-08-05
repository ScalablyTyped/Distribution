package typings.autoprefixer

import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browsersMod {
  
  @JSImport("autoprefixer/lib/browsers", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with BrowsersImpl {
    def this(data: StringDictionary[js.Any]) = this()
    def this(data: StringDictionary[js.Any], options: js.Any) = this()
    def this(data: StringDictionary[js.Any], options: js.Any, browserslistOpts: Options) = this()
    def this(data: StringDictionary[js.Any], options: Unit, browserslistOpts: Options) = this()
    
    /* CompleteClass */
    override def isSelected(browser: String): Boolean = js.native
    
    /* CompleteClass */
    override def parse(queries: Queries): js.Array[String] = js.native
    
    /* CompleteClass */
    override def prefix(browser: String): String = js.native
  }
  
  trait Browsers extends StObject {
    
    def isSelected(browser: String): Boolean
    
    def parse(queries: Queries): js.Array[String]
    
    def prefix(browser: String): String
  }
  object Browsers {
    
    inline def apply(isSelected: String => Boolean, parse: Queries => js.Array[String], prefix: String => String): Browsers = {
      val __obj = js.Dynamic.literal(isSelected = js.Any.fromFunction1(isSelected), parse = js.Any.fromFunction1(parse), prefix = js.Any.fromFunction1(prefix))
      __obj.asInstanceOf[Browsers]
    }
    
    extension [Self <: Browsers](x: Self) {
      
      inline def setIsSelected(value: String => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
      
      inline def setParse(value: Queries => js.Array[String]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setPrefix(value: String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BrowsersImpl
    extends StObject
       with Browsers {
    
    def parse(queries: String): js.Array[String] = js.native
    def parse(queries: js.Array[String]): js.Array[String] = js.native
    
    def prefixes(): js.Array[String] = js.native
    
    def withPrefix(value: String): Boolean = js.native
  }
  
  type Queries = String | js.Array[String]
}
