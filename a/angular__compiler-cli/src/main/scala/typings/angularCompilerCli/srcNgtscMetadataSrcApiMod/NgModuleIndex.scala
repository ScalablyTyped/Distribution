package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgModuleIndex extends StObject {
  
  def getNgModulesExporting(directiveOrPipe: ClassDeclarationDeclarati): js.Array[Reference[ClassDeclarationDeclarati]]
}
object NgModuleIndex {
  
  inline def apply(getNgModulesExporting: ClassDeclarationDeclarati => js.Array[Reference[ClassDeclarationDeclarati]]): NgModuleIndex = {
    val __obj = js.Dynamic.literal(getNgModulesExporting = js.Any.fromFunction1(getNgModulesExporting))
    __obj.asInstanceOf[NgModuleIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgModuleIndex] (val x: Self) extends AnyVal {
    
    inline def setGetNgModulesExporting(value: ClassDeclarationDeclarati => js.Array[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "getNgModulesExporting", js.Any.fromFunction1(value))
  }
}
