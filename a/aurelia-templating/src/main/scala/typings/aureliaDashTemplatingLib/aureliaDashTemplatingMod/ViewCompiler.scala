package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

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
  def this(bindingLanguage: BindingLanguage, resources: ViewResources) = this()
  def compile(source: java.lang.String): ViewFactory = js.native
  def compile(source: java.lang.String, resources: ViewResources): ViewFactory = js.native
  def compile(source: java.lang.String, resources: ViewResources, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: stdLib.DocumentFragment): ViewFactory = js.native
  def compile(source: stdLib.DocumentFragment, resources: ViewResources): ViewFactory = js.native
  def compile(
    source: stdLib.DocumentFragment,
    resources: ViewResources,
    compileInstruction: ViewCompileInstruction
  ): ViewFactory = js.native
  /**
    * Compiles an html template, dom fragment or string into ViewFactory instances, capable of instantiating Views.
    * @param source The template, fragment or string to compile.
    * @param resources The view resources used during compilation.
    * @param compileInstruction A set of instructions that customize how compilation occurs.
    * @return The compiled ViewFactory.
    */
  def compile(source: stdLib.Element): ViewFactory = js.native
  def compile(source: stdLib.Element, resources: ViewResources): ViewFactory = js.native
  def compile(source: stdLib.Element, resources: ViewResources, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
}

