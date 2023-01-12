package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcReferencesMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/references", "Reference")
  @js.native
  open class Reference[T /* <: Node */] protected () extends StObject {
    def this(node: T) = this()
    def this(node: T, bestGuessOwningModule: OwningModule) = this()
    
    /* private */ var _alias: Any = js.native
    
    /**
      * Record a `ts.Identifier` by which it's valid to refer to this node, within the context of this
      * `Reference`.
      */
    def addIdentifier(identifier: Identifier): Unit = js.native
    
    def alias: Expression | Null = js.native
    
    /**
      * The compiler's best guess at an absolute module specifier which owns this `Reference`.
      *
      * This is usually determined by tracking the import statements which led the compiler to a given
      * node. If any of these imports are absolute, it's an indication that the node being imported
      * might come from that module.
      *
      * It is not _guaranteed_ that the node in question is exported from its `bestGuessOwningModule` -
      * that is mostly a convention that applies in certain package formats.
      *
      * If `bestGuessOwningModule` is `null`, then it's likely the node came from the current program.
      */
    val bestGuessOwningModule: OwningModule | Null = js.native
    
    def cloneWithAlias(alias: Expression): Reference[T] = js.native
    
    def cloneWithNoIdentifiers(): Reference[T] = js.native
    
    /**
      * A name for the node, if one is available.
      *
      * This is only suited for debugging. Any actual references to this node should be made with
      * `ts.Identifier`s (see `getIdentityIn`).
      */
    def debugName: String | Null = js.native
    
    /**
      * Get a `ts.Identifier` within this `Reference` that can be used to refer within the context of a
      * given `ts.SourceFile`, if any.
      */
    def getIdentityIn(context: SourceFile): Identifier | Null = js.native
    
    /**
      * Get a `ts.Identifier` for this `Reference` that exists within the given expression.
      *
      * This is very useful for producing `ts.Diagnostic`s that reference `Reference`s that were
      * extracted from some larger expression, as it can be used to pinpoint the `ts.Identifier` within
      * the expression from which the `Reference` originated.
      */
    def getIdentityInExpression(expr: typings.typescript.mod.Expression): Identifier | Null = js.native
    
    /**
      * Given the 'container' expression from which this `Reference` was extracted, produce a
      * `ts.Expression` to use in a diagnostic which best indicates the position within the container
      * expression that generated the `Reference`.
      *
      * For example, given a `Reference` to the class 'Bar' and the containing expression:
      * `[Foo, Bar, Baz]`, this function would attempt to return the `ts.Identifier` for `Bar` within
      * the array. This could be used to produce a nice diagnostic context:
      *
      * ```text
      * [Foo, Bar, Baz]
      *       ~~~
      * ```
      *
      * If no specific node can be found, then the `fallback` expression is used, which defaults to the
      * entire containing expression.
      */
    def getOriginForDiagnostics(container: typings.typescript.mod.Expression): typings.typescript.mod.Expression = js.native
    def getOriginForDiagnostics(container: typings.typescript.mod.Expression, fallback: typings.typescript.mod.Expression): typings.typescript.mod.Expression = js.native
    
    /**
      * Whether this reference has a potential owning module or not.
      *
      * See `bestGuessOwningModule`.
      */
    def hasOwningModuleGuess: Boolean = js.native
    
    /* private */ var identifiers: Any = js.native
    
    val node: T = js.native
    
    /**
      * The best guess at which module specifier owns this particular reference, or `null` if there
      * isn't one.
      */
    def ownedByModuleGuess: String | Null = js.native
    
    /**
      * Indicates that the Reference was created synthetically, not as a result of natural value
      * resolution.
      *
      * This is used to avoid misinterpreting the Reference in certain contexts.
      */
    var synthetic: Boolean = js.native
  }
  
  trait OwningModule extends StObject {
    
    var resolutionContext: String
    
    var specifier: String
  }
  object OwningModule {
    
    inline def apply(resolutionContext: String, specifier: String): OwningModule = {
      val __obj = js.Dynamic.literal(resolutionContext = resolutionContext.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[OwningModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OwningModule] (val x: Self) extends AnyVal {
      
      inline def setResolutionContext(value: String): Self = StObject.set(x, "resolutionContext", value.asInstanceOf[js.Any])
      
      inline def setSpecifier(value: String): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    }
  }
}
