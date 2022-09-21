package typings.angularCompilerCli

import typings.angularCompilerCli.shimsApiMod.PerFileShimGenerator
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/shim", "TypeCheckShimGenerator")
  @js.native
  open class TypeCheckShimGenerator ()
    extends StObject
       with PerFileShimGenerator
  /* static members */
  object TypeCheckShimGenerator {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/shim", "TypeCheckShimGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shimFor(fileName: AbsoluteFsPath): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("shimFor")(fileName.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  }
}
