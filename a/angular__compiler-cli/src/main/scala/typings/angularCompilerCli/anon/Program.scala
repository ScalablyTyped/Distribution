package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program extends StObject {
  
  var program: js.UndefOr[typings.angularCompilerCli.srcTransformersApiMod.Program] = js.undefined
}
object Program {
  
  inline def apply(): Program = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Program]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Program] (val x: Self) extends AnyVal {
    
    inline def setProgram(value: typings.angularCompilerCli.srcTransformersApiMod.Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
  }
}
