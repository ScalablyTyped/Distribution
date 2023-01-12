package typings.angularCompilerCli.anon

import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.DependencyHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/entry_point.EntryPointFormat, @angular/compiler-cli.@angular/compiler-cli/ngcc/src/dependencies/dependency_host.DependencyHost>> */
trait PartialRecordEntryPointFo extends StObject {
  
  var commonjs: js.UndefOr[DependencyHost] = js.undefined
  
  var esm2015: js.UndefOr[DependencyHost] = js.undefined
  
  var esm5: js.UndefOr[DependencyHost] = js.undefined
  
  var umd: js.UndefOr[DependencyHost] = js.undefined
}
object PartialRecordEntryPointFo {
  
  inline def apply(): PartialRecordEntryPointFo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordEntryPointFo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordEntryPointFo] (val x: Self) extends AnyVal {
    
    inline def setCommonjs(value: DependencyHost): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    inline def setEsm2015(value: DependencyHost): Self = StObject.set(x, "esm2015", value.asInstanceOf[js.Any])
    
    inline def setEsm2015Undefined: Self = StObject.set(x, "esm2015", js.undefined)
    
    inline def setEsm5(value: DependencyHost): Self = StObject.set(x, "esm5", value.asInstanceOf[js.Any])
    
    inline def setEsm5Undefined: Self = StObject.set(x, "esm5", js.undefined)
    
    inline def setUmd(value: DependencyHost): Self = StObject.set(x, "umd", value.asInstanceOf[js.Any])
    
    inline def setUmdUndefined: Self = StObject.set(x, "umd", js.undefined)
  }
}
