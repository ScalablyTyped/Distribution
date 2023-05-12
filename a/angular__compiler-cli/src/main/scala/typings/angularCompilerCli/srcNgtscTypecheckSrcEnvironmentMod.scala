package typings.angularCompilerCli

import typings.angularCompiler.mod.TransplantedType
import typings.angularCompiler.mod.Type
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckableDirectiveMeta
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.ReferenceEmitEnvironment
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcEnvironmentMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/environment", "Environment")
  @js.native
  open class Environment protected ()
    extends StObject
       with ReferenceEmitEnvironment {
    def this(
      config: TypeCheckingConfig,
      importManager: ImportManager,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      contextFile: SourceFile
    ) = this()
    
    /* CompleteClass */
    override def canReferenceType(ref: Reference[Node]): Boolean = js.native
    
    val config: TypeCheckingConfig = js.native
    
    /* protected */ var contextFile: SourceFile = js.native
    
    /* private */ var emitTypeParameters: Any = js.native
    
    def getPreludeStatements(): js.Array[Statement] = js.native
    
    /* protected */ var importManager: ImportManager = js.native
    
    /* private */ var nextIds: Any = js.native
    
    def pipeInst(ref: Reference[ClassDeclarationClassDecl]): Expression = js.native
    
    /* protected */ var pipeInstStatements: js.Array[Statement] = js.native
    
    /* private */ var pipeInsts: Any = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /**
      * Generate a `ts.Expression` that references the given node.
      *
      * This may involve importing the node into the file if it's not declared there already.
      */
    def reference(ref: Reference[ClassDeclarationClassDecl]): Expression = js.native
    
    /**
      * Generate a `ts.TypeNode` that references a given type from the provided module.
      *
      * This will involve importing the type into the file, and will also add type parameters if
      * provided.
      */
    def referenceExternalType(moduleName: String, name: String): TypeNode = js.native
    def referenceExternalType(moduleName: String, name: String, typeParams: js.Array[Type]): TypeNode = js.native
    
    /**
      * Generates a `ts.TypeNode` representing a type that is being referenced from a different place
      * in the program. Any type references inside the transplanted type will be rewritten so that
      * they can be imported in the context fiel.
      */
    def referenceTransplantedType(`type`: TransplantedType[TypeNode]): TypeNode = js.native
    
    /**
      * Generate a `ts.TypeNode` that references the given node as a type.
      *
      * This may involve importing the node into the file if it's not declared there already.
      */
    def referenceType(ref: Reference[Node]): TypeNode = js.native
    
    val reflector: ReflectionHost = js.native
    
    /**
      * Get an expression referring to a type constructor for the given directive.
      *
      * Depending on the shape of the directive itself, this could be either a reference to a declared
      * type constructor, or to an inline type constructor.
      */
    def typeCtorFor(dir: TypeCheckableDirectiveMeta): Expression = js.native
    
    /* protected */ var typeCtorStatements: js.Array[Statement] = js.native
    
    /* private */ var typeCtors: Any = js.native
  }
}
