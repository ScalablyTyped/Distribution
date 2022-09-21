package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/doc/cli.DocCommandArgs> */
trait OptionsDocCommandArgs extends StObject {
  
  var keyword: String
  
  var search: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object OptionsDocCommandArgs {
  
  inline def apply(keyword: String): OptionsDocCommandArgs = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsDocCommandArgs]
  }
  
  extension [Self <: OptionsDocCommandArgs](x: Self) {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
