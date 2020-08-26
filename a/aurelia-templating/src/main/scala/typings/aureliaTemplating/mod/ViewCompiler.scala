package typings.aureliaTemplating.mod

import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ViewCompiler")
@js.native
class ViewCompiler protected () extends js.Object {
  /**
    * Creates an instance of ViewCompiler.
    * @param bindingLanguage The default data binding language and syntax used during view compilation.
    * @param resources The global resources used during compilation when none are provided for compilation.
    */
  def this(bindingLanguage: BindingLanguage, resources: ViewResources_) = this()
  def compile(source: String): ViewFactory = js.native
  def compile(source: String, resources: js.UndefOr[scala.Nothing], compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: String, resources: ViewResources_): ViewFactory = js.native
  def compile(source: String, resources: ViewResources_, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: DocumentFragment): ViewFactory = js.native
  def compile(
    source: DocumentFragment,
    resources: js.UndefOr[scala.Nothing],
    compileInstruction: ViewCompileInstruction
  ): ViewFactory = js.native
  def compile(source: DocumentFragment, resources: ViewResources_): ViewFactory = js.native
  def compile(source: DocumentFragment, resources: ViewResources_, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  /**
    * Compiles an html template, dom fragment or string into ViewFactory instances, capable of instantiating Views.
    * @param source The template, fragment or string to compile.
    * @param resources The view resources used during compilation.
    * @param compileInstruction A set of instructions that customize how compilation occurs.
    * @return The compiled ViewFactory.
    */
  def compile(source: Element): ViewFactory = js.native
  def compile(source: Element, resources: js.UndefOr[scala.Nothing], compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: Element, resources: ViewResources_): ViewFactory = js.native
  def compile(source: Element, resources: ViewResources_, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
}

/* static members */
@JSImport("aurelia-templating", "ViewCompiler")
@js.native
object ViewCompiler extends js.Object {
  def inject(): js.Any = js.native
}

