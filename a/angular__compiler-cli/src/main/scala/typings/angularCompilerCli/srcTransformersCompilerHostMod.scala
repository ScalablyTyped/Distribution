package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Options
import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersCompilerHostMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/compiler_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompilerHost(hasOptionsTsHost: Options): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(hasOptionsTsHost.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
  
  inline def setWrapHostForTest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWrapHostForTest")().asInstanceOf[Unit]
  inline def setWrapHostForTest(
    wrapFn: js.Function1[
      /* host */ typings.typescript.mod.CompilerHost, 
      typings.typescript.mod.CompilerHost
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWrapHostForTest")(wrapFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
