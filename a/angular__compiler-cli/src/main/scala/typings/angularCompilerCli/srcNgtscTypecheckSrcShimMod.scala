package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.PerFileShimGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcShimMod {
  
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
