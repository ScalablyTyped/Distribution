package typings.allureJsCommons

import typings.allureJsCommons.mod.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Allure {
    
    @JSGlobal("Allure")
    @js.native
    class ^ ()
      extends typings.allureJsCommons.mod.^
    
    @JSGlobal("Allure.Attachment")
    @js.native
    class Attachment protected ()
      extends typings.allureJsCommons.mod.Attachment {
      def this(title: String, source: js.Any, size: Double, mime: String) = this()
    }
    
    @JSGlobal("Allure.Description")
    @js.native
    class Description protected ()
      extends typings.allureJsCommons.mod.Description {
      def this(value: String, `type`: TYPE) = this()
    }
    
    @JSGlobal("Allure.Step")
    @js.native
    class Step protected ()
      extends typings.allureJsCommons.mod.Step {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
    
    @JSGlobal("Allure.Suite")
    @js.native
    class Suite protected ()
      extends typings.allureJsCommons.mod.Suite {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
    
    @JSGlobal("Allure.TYPE")
    @js.native
    object TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.allureJsCommons.mod.TYPE & String] = js.native
      
      /* "html" */ val HTML: typings.allureJsCommons.mod.TYPE.HTML & String = js.native
      
      /* "markdown" */ val MARKDOWN: typings.allureJsCommons.mod.TYPE.MARKDOWN & String = js.native
      
      /* "text" */ val TEXT: typings.allureJsCommons.mod.TYPE.TEXT & String = js.native
    }
    
    @JSGlobal("Allure.Test")
    @js.native
    class Test protected ()
      extends typings.allureJsCommons.mod.Test {
      def this(name: String) = this()
      def this(name: String, timestamp: Double) = this()
    }
  }
}
