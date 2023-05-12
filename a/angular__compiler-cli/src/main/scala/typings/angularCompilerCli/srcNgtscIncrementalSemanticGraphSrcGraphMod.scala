package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcApiMod.SemanticReference
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcApiMod.SemanticSymbol
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSemanticGraphSrcGraphMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph/src/graph", "SemanticDepGraph")
  @js.native
  open class SemanticDepGraph () extends StObject {
    
    val files: Map[AbsoluteFsPath, Map[String, SemanticSymbol]] = js.native
    
    /**
      * Attempts to resolve a symbol in this graph that represents the given symbol from another graph.
      * If no matching symbol could be found, null is returned.
      *
      * @param symbol The symbol from another graph for which its equivalent in this graph should be
      * found.
      */
    def getEquivalentSymbol(symbol: SemanticSymbol): SemanticSymbol | Null = js.native
    
    /**
      * Attempts to resolve the declaration to its semantic symbol.
      */
    def getSymbolByDecl(decl: ClassDeclarationDeclarati): SemanticSymbol | Null = js.native
    
    /**
      * Attempts to find the symbol by its identifier.
      */
    /* private */ var getSymbolByName: Any = js.native
    
    /**
      * Registers a symbol in the graph. The symbol is given a unique identifier if possible, such that
      * its equivalent symbol can be obtained from a prior graph even if its declaration node has
      * changed across rebuilds. Symbols without an identifier are only able to find themselves in a
      * prior graph if their declaration node is identical.
      */
    def registerSymbol(symbol: SemanticSymbol): Unit = js.native
    
    val symbolByDecl: Map[ClassDeclarationDeclarati, SemanticSymbol] = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph/src/graph", "SemanticDepGraphUpdater")
  @js.native
  open class SemanticDepGraphUpdater () extends StObject {
    def this(/**
      * The semantic dependency graph of the most recently succeeded compilation, or null if this
      * is the initial build.
      */
    priorGraph: SemanticDepGraph) = this()
    
    /* private */ var determineInvalidatedFiles: Any = js.native
    
    /* private */ var determineInvalidatedTypeCheckFiles: Any = js.native
    
    /**
      * Gets or creates an `OpaqueSymbol` for the provided class declaration.
      */
    /* private */ var getOpaqueSymbol: Any = js.native
    
    /**
      * Creates a `SemanticReference` for the reference to `decl` using the expression `expr`. See
      * the documentation of `SemanticReference` for details.
      */
    def getSemanticReference(decl: ClassDeclarationDeclarati, expr: Expression): SemanticReference = js.native
    
    /**
      * Gets the `SemanticSymbol` that was registered for `decl` during the current compilation, or
      * returns an opaque symbol that represents `decl`.
      */
    def getSymbol(decl: ClassDeclarationDeclarati): SemanticSymbol = js.native
    
    /* private */ val newGraph: Any = js.native
    
    /**
      * Contains opaque symbols that were created for declarations for which there was no symbol
      * registered, which happens for e.g. external declarations.
      */
    /* private */ val opaqueSymbols: Any = js.native
    
    /**
      * The semantic dependency graph of the most recently succeeded compilation, or null if this
      * is the initial build.
      */
    /* private */ var priorGraph: Any = js.native
    
    /**
      * Registers the symbol in the new graph that is being created.
      */
    def registerSymbol(symbol: SemanticSymbol): Unit = js.native
  }
  
  trait SemanticDependencyResult extends StObject {
    
    /**
      * The files that need to be re-emitted.
      */
    var needsEmit: Set[AbsoluteFsPath]
    
    /**
      * The files for which the type-check block should be regenerated.
      */
    var needsTypeCheckEmit: Set[AbsoluteFsPath]
    
    /**
      * The newly built graph that represents the current compilation.
      */
    var newGraph: SemanticDepGraph
  }
  object SemanticDependencyResult {
    
    inline def apply(
      needsEmit: Set[AbsoluteFsPath],
      needsTypeCheckEmit: Set[AbsoluteFsPath],
      newGraph: SemanticDepGraph
    ): SemanticDependencyResult = {
      val __obj = js.Dynamic.literal(needsEmit = needsEmit.asInstanceOf[js.Any], needsTypeCheckEmit = needsTypeCheckEmit.asInstanceOf[js.Any], newGraph = newGraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticDependencyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticDependencyResult] (val x: Self) extends AnyVal {
      
      inline def setNeedsEmit(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "needsEmit", value.asInstanceOf[js.Any])
      
      inline def setNeedsTypeCheckEmit(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "needsTypeCheckEmit", value.asInstanceOf[js.Any])
      
      inline def setNewGraph(value: SemanticDepGraph): Self = StObject.set(x, "newGraph", value.asInstanceOf[js.Any])
    }
  }
}
