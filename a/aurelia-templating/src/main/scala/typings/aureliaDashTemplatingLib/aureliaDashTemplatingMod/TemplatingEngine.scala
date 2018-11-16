package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "TemplatingEngine")
@js.native
class TemplatingEngine protected () extends js.Object {
  /**
      * Creates an instance of TemplatingEngine.
      * @param container The root DI container.
      * @param moduleAnalyzer The module analyzer for discovering view resources.
      * @param viewCompiler The view compiler for compiling views.
      * @param compositionEngine The composition engine used during dynamic component composition.
      */
  def this(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, moduleAnalyzer: ModuleAnalyzer, viewCompiler: ViewCompiler, compositionEngine: CompositionEngine) = this()
  /**
       * Dynamically composes components and views.
       * @param context The composition context to use.
       * @return A promise for the resulting Controller or View. Consumers of this API
       * are responsible for enforcing the Controller/View lifecycle.
       */
  def compose(context: CompositionContext): stdLib.Promise[View | Controller] = js.native
  /**
       * Configures the default animator.
       * @param animator The animator instance.
       */
  def configureAnimator(animator: Animator): scala.Unit = js.native
  /**
       * Enhances existing DOM with behaviors and bindings.
       * @param instruction The element to enhance or a set of instructions for the enhancement process.
       * @return A View representing the enhanced UI. Consumers of this API
       * are responsible for enforcing the View lifecycle.
       */
  def enhance(instruction: EnhanceInstruction): View = js.native
  /**
       * Enhances existing DOM with behaviors and bindings.
       * @param instruction The element to enhance or a set of instructions for the enhancement process.
       * @return A View representing the enhanced UI. Consumers of this API
       * are responsible for enforcing the View lifecycle.
       */
  def enhance(instruction: stdLib.Element): View = js.native
}

