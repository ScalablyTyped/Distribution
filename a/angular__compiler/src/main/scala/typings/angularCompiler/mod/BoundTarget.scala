package typings.angularCompiler.mod

import typings.angularCompiler.anon.Directive
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundTarget[DirectiveT /* <: DirectiveMeta */] extends StObject {
  
  /**
    * For a given binding, get the entity to which the binding is being made.
    *
    * This will either be a directive or the node itself.
    */
  def getConsumerOfBinding(binding: TmplAstBoundAttribute): DirectiveT | TmplAstElement | TmplAstTemplate | Null = js.native
  def getConsumerOfBinding(binding: TmplAstBoundEvent): DirectiveT | TmplAstElement | TmplAstTemplate | Null = js.native
  def getConsumerOfBinding(binding: TmplAstTextAttribute): DirectiveT | TmplAstElement | TmplAstTemplate | Null = js.native
  
  /**
    * For a given template node (either an `Element` or a `Template`), get the set of directives
    * which matched the node, if any.
    */
  def getDirectivesOfNode(node: TmplAstElement): js.Array[DirectiveT] | Null = js.native
  def getDirectivesOfNode(node: TmplAstTemplate): js.Array[DirectiveT] | Null = js.native
  
  /**
    * Get all `Reference`s and `Variables` visible within the given `Template` (or at the top level,
    * if `null` is passed).
    */
  def getEntitiesInTemplateScope(): ReadonlySet[TmplAstReference | TmplAstVariable] = js.native
  def getEntitiesInTemplateScope(template: TmplAstTemplate): ReadonlySet[TmplAstReference | TmplAstVariable] = js.native
  
  /**
    * If the given `AST` expression refers to a `Reference` or `Variable` within the `Target`, then
    * return that.
    *
    * Otherwise, returns `null`.
    *
    * This is only defined for `AST` expressions that read or write to a property of an
    * `ImplicitReceiver`.
    */
  def getExpressionTarget(expr: AST): TmplAstReference | TmplAstVariable | Null = js.native
  
  /**
    * Get the nesting level of a particular `Template`.
    *
    * This starts at 1 for top-level `Template`s within the `Target` and increases for `Template`s
    * nested at deeper levels.
    */
  def getNestingLevel(template: TmplAstTemplate): Double = js.native
  
  /**
    * For a given `Reference`, get the reference's target - either an `Element`, a `Template`, or
    * a directive on a particular node.
    */
  def getReferenceTarget(ref: TmplAstReference): Directive[DirectiveT] | TmplAstElement | TmplAstTemplate | Null = js.native
  
  /**
    * Given a particular `Reference` or `Variable`, get the `Template` which created it.
    *
    * All `Variable`s are defined on templates, so this will always return a value for a `Variable`
    * from the `Target`. For `Reference`s this only returns a value if the `Reference` points to a
    * `Template`. Returns `null` otherwise.
    */
  def getTemplateOfSymbol(symbol: TmplAstReference): TmplAstTemplate | Null = js.native
  def getTemplateOfSymbol(symbol: TmplAstVariable): TmplAstTemplate | Null = js.native
  
  /**
    * Get a list of all the directives used by the target.
    */
  def getUsedDirectives(): js.Array[DirectiveT] = js.native
  
  /**
    * Get a list of all the pipes used by the target.
    */
  def getUsedPipes(): js.Array[String] = js.native
  
  /**
    * Get the original `Target` that was bound.
    */
  val target: Target = js.native
}
