package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticSymbolMod {
  
  @JSImport("@angular/compiler/src/aot/static_symbol", "StaticSymbol")
  @js.native
  class StaticSymbol protected () extends StObject {
    def this(filePath: String, name: String, members: js.Array[String]) = this()
    
    def assertNoMembers(): Unit = js.native
    
    var filePath: String = js.native
    
    var members: js.Array[String] = js.native
    
    var name: String = js.native
  }
  
  @JSImport("@angular/compiler/src/aot/static_symbol", "StaticSymbolCache")
  @js.native
  class StaticSymbolCache () extends StObject {
    
    /* private */ var cache: js.Any = js.native
    
    def get(declarationFile: String, name: String): StaticSymbol = js.native
    def get(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
  }
}
