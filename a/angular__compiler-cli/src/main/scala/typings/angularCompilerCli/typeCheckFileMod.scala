package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.apiApiMod.TypeCheckBlockMetadata
import typings.angularCompilerCli.apiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.domMod.DomSchemaChecker
import typings.angularCompilerCli.environmentMod.Environment
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.oobMod.OutOfBandDiagnosticRecorder
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.typeCheckBlockMod.TcbGenericContextBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeCheckFileMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_check_file", "TypeCheckFile")
  @js.native
  open class TypeCheckFile protected () extends Environment {
    def this(
      fileName: AbsoluteFsPath,
      config: TypeCheckingConfig,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      compilerHost: PickCompilerHostgetCanoni
    ) = this()
    
    def addTypeCheckBlock(
      ref: Reference[ClassDeclarationClassDecl],
      meta: TypeCheckBlockMetadata,
      domSchemaChecker: DomSchemaChecker,
      oobRecorder: OutOfBandDiagnosticRecorder,
      genericContextBehavior: TcbGenericContextBehavior
    ): Unit = js.native
    
    val fileName: AbsoluteFsPath = js.native
    
    /* private */ var nextTcbId: Any = js.native
    
    def render(removeComments: Boolean): String = js.native
    
    /* private */ var tcbStatements: Any = js.native
  }
  
  inline def typeCheckFilePath(rootDirs: js.Array[AbsoluteFsPath]): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("typeCheckFilePath")(rootDirs.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
