package typings.angularCli

import typings.angularCli.anon.Default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsCommandConfigMod {
  
  @JSImport("@angular/cli/src/commands/command-config", "RootCommands")
  @js.native
  val RootCommands: Record[CommandNames & String, CommandConfig] = js.native
  
  @JSImport("@angular/cli/src/commands/command-config", "RootCommandsAliases")
  @js.native
  val RootCommandsAliases: Record[String, CommandConfig] = js.native
  
  trait CommandConfig extends StObject {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    def factory(): js.Promise[Default]
  }
  object CommandConfig {
    
    inline def apply(factory: () => js.Promise[Default]): CommandConfig = {
      val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
      __obj.asInstanceOf[CommandConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandConfig] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setFactory(value: () => js.Promise[Default]): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCli.angularCliStrings.add
    - typings.angularCli.angularCliStrings.analytics
    - typings.angularCli.angularCliStrings.build
    - typings.angularCli.angularCliStrings.cache
    - typings.angularCli.angularCliStrings.completion
    - typings.angularCli.angularCliStrings.config
    - typings.angularCli.angularCliStrings.deploy
    - typings.angularCli.angularCliStrings.doc
    - typings.angularCli.angularCliStrings.e2e
    - typings.angularCli.angularCliStrings.`extract-i18n`
    - typings.angularCli.angularCliStrings.generate
    - typings.angularCli.angularCliStrings.lint
    - typings.angularCli.angularCliStrings.`make-this-awesome`
    - typings.angularCli.angularCliStrings.`new`
    - typings.angularCli.angularCliStrings.run
    - typings.angularCli.angularCliStrings.serve
    - typings.angularCli.angularCliStrings.test
    - typings.angularCli.angularCliStrings.update
    - typings.angularCli.angularCliStrings.version
  */
  trait CommandNames extends StObject
  object CommandNames {
    
    inline def add: typings.angularCli.angularCliStrings.add = "add".asInstanceOf[typings.angularCli.angularCliStrings.add]
    
    inline def analytics: typings.angularCli.angularCliStrings.analytics = "analytics".asInstanceOf[typings.angularCli.angularCliStrings.analytics]
    
    inline def build: typings.angularCli.angularCliStrings.build = "build".asInstanceOf[typings.angularCli.angularCliStrings.build]
    
    inline def cache: typings.angularCli.angularCliStrings.cache = "cache".asInstanceOf[typings.angularCli.angularCliStrings.cache]
    
    inline def completion: typings.angularCli.angularCliStrings.completion = "completion".asInstanceOf[typings.angularCli.angularCliStrings.completion]
    
    inline def config: typings.angularCli.angularCliStrings.config = "config".asInstanceOf[typings.angularCli.angularCliStrings.config]
    
    inline def deploy: typings.angularCli.angularCliStrings.deploy = "deploy".asInstanceOf[typings.angularCli.angularCliStrings.deploy]
    
    inline def doc: typings.angularCli.angularCliStrings.doc = "doc".asInstanceOf[typings.angularCli.angularCliStrings.doc]
    
    inline def e2e: typings.angularCli.angularCliStrings.e2e = "e2e".asInstanceOf[typings.angularCli.angularCliStrings.e2e]
    
    inline def `extract-i18n`: typings.angularCli.angularCliStrings.`extract-i18n` = "extract-i18n".asInstanceOf[typings.angularCli.angularCliStrings.`extract-i18n`]
    
    inline def generate: typings.angularCli.angularCliStrings.generate = "generate".asInstanceOf[typings.angularCli.angularCliStrings.generate]
    
    inline def lint: typings.angularCli.angularCliStrings.lint = "lint".asInstanceOf[typings.angularCli.angularCliStrings.lint]
    
    inline def `make-this-awesome`: typings.angularCli.angularCliStrings.`make-this-awesome` = "make-this-awesome".asInstanceOf[typings.angularCli.angularCliStrings.`make-this-awesome`]
    
    inline def `new`: typings.angularCli.angularCliStrings.`new` = "new".asInstanceOf[typings.angularCli.angularCliStrings.`new`]
    
    inline def run: typings.angularCli.angularCliStrings.run = "run".asInstanceOf[typings.angularCli.angularCliStrings.run]
    
    inline def serve: typings.angularCli.angularCliStrings.serve = "serve".asInstanceOf[typings.angularCli.angularCliStrings.serve]
    
    inline def test: typings.angularCli.angularCliStrings.test = "test".asInstanceOf[typings.angularCli.angularCliStrings.test]
    
    inline def update: typings.angularCli.angularCliStrings.update = "update".asInstanceOf[typings.angularCli.angularCliStrings.update]
    
    inline def version: typings.angularCli.angularCliStrings.version = "version".asInstanceOf[typings.angularCli.angularCliStrings.version]
  }
}
