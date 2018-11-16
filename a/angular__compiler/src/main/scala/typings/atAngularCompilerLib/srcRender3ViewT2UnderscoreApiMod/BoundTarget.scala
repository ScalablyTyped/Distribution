package typings
package atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundTarget[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  /**
       * Get the original `Target` that was bound.
       */
  val target: Target = js.native
  /**
       * For a given binding, get the entity to which the binding is being made.
       *
       * This will either be a directive or the node itself.
       */
  def getConsumerOfBinding(binding: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute): DirectiveT | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * For a given binding, get the entity to which the binding is being made.
       *
       * This will either be a directive or the node itself.
       */
  def getConsumerOfBinding(binding: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent): DirectiveT | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * For a given binding, get the entity to which the binding is being made.
       *
       * This will either be a directive or the node itself.
       */
  def getConsumerOfBinding(binding: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.TextAttribute): DirectiveT | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * For a given template node (either an `Element` or a `Template`), get the set of directives
       * which matched the node, if any.
       */
  def getDirectivesOfNode(node: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element): js.Array[DirectiveT] | scala.Null = js.native
  /**
       * For a given template node (either an `Element` or a `Template`), get the set of directives
       * which matched the node, if any.
       */
  def getDirectivesOfNode(node: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template): js.Array[DirectiveT] | scala.Null = js.native
  /**
       * If the given `AST` expression refers to a `Reference` or `Variable` within the `Target`, then
       * return that.
       *
       * Otherwise, returns `null`.
       *
       * This is only defined for `AST` expressions that read or write to a property of an
       * `ImplicitReceiver`.
       */
  def getExpressionTarget(expr: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable | scala.Null = js.native
  /**
       * Get the nesting level of a particular `Template`.
       *
       * This starts at 1 for top-level `Template`s within the `Target` and increases for `Template`s
       * nested at deeper levels.
       */
  def getNestingLevel(template: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template): scala.Double = js.native
  /**
       * For a given `Reference`, get the reference's target - either an `Element`, a `Template`, or
       * a directive on a particular node.
       */
  def getReferenceTarget(ref: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference): atAngularCompilerLib.Anon_Node[DirectiveT] | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * Given a particular `Reference` or `Variable`, get the `Template` which created it.
       *
       * All `Variable`s are defined on templates, so this will always return a value for a `Variable`
       * from the `Target`. For `Reference`s this only returns a value if the `Reference` points to a
       * `Template`. Returns `null` otherwise.
       */
  def getTemplateOfSymbol(symbol: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * Given a particular `Reference` or `Variable`, get the `Template` which created it.
       *
       * All `Variable`s are defined on templates, so this will always return a value for a `Variable`
       * from the `Target`. For `Reference`s this only returns a value if the `Reference` points to a
       * `Template`. Returns `null` otherwise.
       */
  def getTemplateOfSymbol(symbol: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template | scala.Null = js.native
  /**
       * Get a list of all the directives used by the target.
       */
  def getUsedDirectives(): js.Array[DirectiveT] = js.native
}

