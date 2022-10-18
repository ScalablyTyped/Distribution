package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ConstantScope
import typings.angularCompilerCli.linkerSrcFileLinkerDeclarationScopeMod.DeclarationScope
import typings.angularCompilerCli.linkerSrcFileLinkerLinkerEnvironmentMod.LinkerEnvironment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerFileLinkerMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/file_linker", "FileLinker")
  @js.native
  open class FileLinker[TConstantScope, TStatement, TExpression] protected () extends StObject {
    def this(
      linkerEnvironment: LinkerEnvironment[TStatement, TExpression],
      sourceUrl: AbsoluteFsPath,
      code: String
    ) = this()
    
    /* private */ var emitScopes: Any = js.native
    
    /**
      * Return all the shared constant statements and their associated constant scope references, so
      * that they can be inserted into the source code.
      */
    def getConstantStatements(): js.Array[ConstantScope[TConstantScope, TStatement]] = js.native
    
    /* private */ var getEmitScope: Any = js.native
    
    /**
      * Return true if the given callee name matches a partial declaration that can be linked.
      */
    def isPartialDeclaration(calleeName: String): Boolean = js.native
    
    /**
      * Link the metadata extracted from the args of a call to a partial declaration function.
      *
      * The `declarationScope` is used to determine the scope and strategy of emission of the linked
      * definition and any shared constant statements.
      *
      * @param declarationFn the name of the function used to declare the partial declaration - e.g.
      *     `ɵɵngDeclareDirective`.
      * @param args the arguments passed to the declaration function, should be a single object that
      *     corresponds to the `R3DeclareDirectiveMetadata` or `R3DeclareComponentMetadata` interfaces.
      * @param declarationScope the scope that contains this call to the declaration function.
      */
    def linkPartialDeclaration(
      declarationFn: String,
      args: js.Array[TExpression],
      declarationScope: DeclarationScope[TConstantScope, TExpression]
    ): TExpression = js.native
    
    /* private */ var linkerEnvironment: Any = js.native
    
    /* private */ var linkerSelector: Any = js.native
  }
  
  /* Inlined std.Readonly<std.Array<any>> */
  object NO_STATEMENTS {
    
    @JSImport("@angular/compiler-cli/linker/src/file_linker/file_linker", "NO_STATEMENTS")
    @js.native
    val ^ : js.Any = js.native
    
    inline def at(index: Double): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(index.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
    
    inline def concat(items: js.Array[Any]*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
    
    inline def copyWithin(target: Double, start: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    inline def entries(): IterableIterator[js.Tuple2[Double, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, Any]]]
    
    inline def every[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
    
    inline def fill(value: Any): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    inline def filter[S /* <: Any */](
      predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is S */ Boolean]
    ): js.Array[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S]]
    
    inline def find[S /* <: Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
    
    inline def findIndex(predicate: js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[js.Array[FlatArray[A, D]]]
    
    inline def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          U | js.Array[U]
        ]
    ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    
    inline def forEach(callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def includes(searchElement: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def indexOf(searchElement: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
    
    inline def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
    
    inline def lastIndexOf(searchElement: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@angular/compiler-cli/linker/src/file_linker/file_linker", "NO_STATEMENTS.length")
    @js.native
    val length: Double = js.native
    
    inline def map[U](callbackfn: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
    
    inline def pop(): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[Any]]
    
    inline def push(items: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def reverse(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[Any]]
    
    inline def shift(): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[Any]]
    
    inline def slice(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[Any]]
    
    inline def some(predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def sort(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[this.type]
    
    inline def splice(start: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
    
    inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
    
    inline def unshift(items: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def values(): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[Any]]
  }
}
