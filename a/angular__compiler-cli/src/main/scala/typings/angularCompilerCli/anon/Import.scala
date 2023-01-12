package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  var `import`: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
}
object Import {
  
  inline def apply(`import`: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import): Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
    
    inline def setImport(value: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
  }
}
