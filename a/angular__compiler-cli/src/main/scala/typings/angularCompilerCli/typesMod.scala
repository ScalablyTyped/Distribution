package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompilerCli.reexportMod.Reexport
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.angularCompilerCli.transformSrcApiMod.CompileResult
import typings.std.Map
import typings.std.MapConstructor
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/types", "DecorationAnalyses")
  @js.native
  val DecorationAnalyses: MapConstructor = js.native
  type DecorationAnalyses = Map[SourceFile, CompiledFile]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/types", "DecorationAnalyses")
  @js.native
  /* standard es2015.collection */
  open class DecorationAnalysesCls[K, V] ()
    extends StObject
       with Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  trait CompiledClass extends StObject {
    
    var compilation: js.Array[CompileResult]
    
    var declaration: ClassDeclaration[DeclarationNode]
    
    var decorators: js.Array[Decorator] | Null
    
    var name: String
  }
  object CompiledClass {
    
    inline def apply(compilation: js.Array[CompileResult], declaration: ClassDeclaration[DeclarationNode], name: String): CompiledClass = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], decorators = null)
      __obj.asInstanceOf[CompiledClass]
    }
    
    extension [Self <: CompiledClass](x: Self) {
      
      inline def setCompilation(value: js.Array[CompileResult]): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setCompilationVarargs(value: CompileResult*): Self = StObject.set(x, "compilation", js.Array(value*))
      
      inline def setDeclaration(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
      
      inline def setDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompiledFile extends StObject {
    
    var compiledClasses: js.Array[CompiledClass]
    
    var constantPool: ConstantPool
    
    /**
      * Any re-exports which should be added next to this class, both in .js and (if possible) .d.ts.
      */
    var reexports: js.Array[Reexport]
    
    var sourceFile: SourceFile
  }
  object CompiledFile {
    
    inline def apply(
      compiledClasses: js.Array[CompiledClass],
      constantPool: ConstantPool,
      reexports: js.Array[Reexport],
      sourceFile: SourceFile
    ): CompiledFile = {
      val __obj = js.Dynamic.literal(compiledClasses = compiledClasses.asInstanceOf[js.Any], constantPool = constantPool.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledFile]
    }
    
    extension [Self <: CompiledFile](x: Self) {
      
      inline def setCompiledClasses(value: js.Array[CompiledClass]): Self = StObject.set(x, "compiledClasses", value.asInstanceOf[js.Any])
      
      inline def setCompiledClassesVarargs(value: CompiledClass*): Self = StObject.set(x, "compiledClasses", js.Array(value*))
      
      inline def setConstantPool(value: ConstantPool): Self = StObject.set(x, "constantPool", value.asInstanceOf[js.Any])
      
      inline def setReexports(value: js.Array[Reexport]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsVarargs(value: Reexport*): Self = StObject.set(x, "reexports", js.Array(value*))
      
      inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}
