package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PartialLinkerOptions
import typings.angularCompilerCli.astFactoryMod.AstFactory
import typings.angularCompilerCli.astHostMod.AstHost
import typings.angularCompilerCli.linkerOptionsMod.LinkerOptions
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerMod {
  
  @JSImport("@angular/compiler-cli/linker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker", "DEFAULT_LINKER_OPTIONS")
  @js.native
  val DEFAULT_LINKER_OPTIONS: LinkerOptions = js.native
  
  @JSImport("@angular/compiler-cli/linker", "FatalLinkerError")
  @js.native
  open class FatalLinkerError protected ()
    extends typings.angularCompilerCli.fatalLinkerErrorMod.FatalLinkerError {
    /**
      * Create a new FatalLinkerError.
      *
      * @param node The AST node where the error occurred.
      * @param message A description of the error.
      */
    def this(node: Any, message: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/linker", "FileLinker")
  @js.native
  open class FileLinker[TConstantScope, TStatement, TExpression] protected ()
    extends typings.angularCompilerCli.fileLinkerMod.FileLinker[TConstantScope, TStatement, TExpression] {
    def this(
      linkerEnvironment: typings.angularCompilerCli.linkerEnvironmentMod.LinkerEnvironment[TStatement, TExpression],
      sourceUrl: AbsoluteFsPath,
      code: String
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/linker", "LinkerEnvironment")
  @js.native
  /* private */ open class LinkerEnvironment[TStatement, TExpression] ()
    extends typings.angularCompilerCli.linkerEnvironmentMod.LinkerEnvironment[TStatement, TExpression]
  /* static members */
  object LinkerEnvironment {
    
    @JSImport("@angular/compiler-cli/linker", "LinkerEnvironment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[TStatement, TExpression](
      fileSystem: ReadonlyFileSystem,
      logger: Logger,
      host: AstHost[TExpression],
      factory: AstFactory[TStatement, TExpression],
      options: PartialLinkerOptions
    ): typings.angularCompilerCli.linkerEnvironmentMod.LinkerEnvironment[TStatement, TExpression] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], host.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.linkerEnvironmentMod.LinkerEnvironment[TStatement, TExpression]]
  }
  
  inline def assert[T, K /* <: T */](node: T, predicate: js.Function1[/* node */ T, /* is K */ Boolean], expected: String): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(K))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(K))),IArray())*/ Boolean]
  
  inline def isFatalLinkerError(e: Any): /* is @angular/compiler-cli.@angular/compiler-cli/linker/src/fatal_linker_error.FatalLinkerError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFatalLinkerError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/linker/src/fatal_linker_error.FatalLinkerError */ Boolean]
  
  inline def needsLinking(path: String, source: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsLinking")(path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
