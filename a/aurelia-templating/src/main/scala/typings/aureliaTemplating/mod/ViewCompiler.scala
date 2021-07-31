package typings.aureliaTemplating.mod

import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewCompiler")
@js.native
class ViewCompiler protected () extends StObject {
  /**
    * Creates an instance of ViewCompiler.
    * @param bindingLanguage The default data binding language and syntax used during view compilation.
    * @param resources The global resources used during compilation when none are provided for compilation.
    */
  def this(bindingLanguage: BindingLanguage, resources: ViewResources_) = this()
  
  def compile(source: String): ViewFactory = js.native
  def compile(source: String, resources: Unit, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: String, resources: ViewResources_): ViewFactory = js.native
  def compile(source: String, resources: ViewResources_, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: DocumentFragment): ViewFactory = js.native
  def compile(source: DocumentFragment, resources: Unit, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
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
  def compile(source: Element, resources: Unit, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
  def compile(source: Element, resources: ViewResources_): ViewFactory = js.native
  def compile(source: Element, resources: ViewResources_, compileInstruction: ViewCompileInstruction): ViewFactory = js.native
}
/* static members */
object ViewCompiler {
  
  @JSImport("aurelia-templating", "ViewCompiler")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inject(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")().asInstanceOf[js.Any]
}
