package typings.angularCli

import typings.angularCli.anon.OptionsDocCommandArgs
import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docCliMod {
  
  @JSImport("@angular/cli/src/commands/doc/cli", "DocCommandModule")
  @js.native
  open class DocCommandModule protected () extends CommandModule[DocCommandArgs] {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_DocCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_DocCommandModule: String = js.native
    
    def run(options: OptionsDocCommandArgs): js.Promise[Double | Unit] = js.native
  }
  
  trait DocCommandArgs extends StObject {
    
    var keyword: String
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object DocCommandArgs {
    
    inline def apply(keyword: String): DocCommandArgs = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocCommandArgs]
    }
    
    extension [Self <: DocCommandArgs](x: Self) {
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
