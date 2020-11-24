package typings.angularCore

import typings.inquirer.anon.BottomBar
import typings.inquirer.anon.TypeofSeparator
import typings.inquirer.anon.Ui
import typings.inquirer.mod.PromptModule
import typings.inquirer.mod.QuestionCollection
import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptConstructor
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/schematics_prompt", JSImport.Namespace)
@js.native
object schematicsPromptMod extends js.Object {
  
  def getInquirer(): Inquirer = js.native
  
  def supportsPrompt(): Boolean = js.native
  
  /* Inlined inquirer.inquirer.Inquirer & { readonly prompts,  readonly ui} */
  @js.native
  trait Inquirer extends js.Object {
    
    /**
      * Represents a choice-item separator.
      */
    var Separator: TypeofSeparator = js.native
    
    /**
      * Creates a prompt-module.
      *
      * @param opt
      * The streams for the prompt-module.
      *
      * @returns
      * The new prompt-module.
      */
    def createPromptModule(): PromptModule = js.native
    def createPromptModule(opt: StreamOptions): PromptModule = js.native
    
    /**
      * Prompts the questions to the user.
      */
    /**
      * The default prompt-module.
      */
    def prompt[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
    def prompt[T](questions: QuestionCollection[T], initialAnswers: Partial[T]): js.Promise[T] with Ui = js.native
    /**
      * The default prompt-module.
      */
    @JSName("prompt")
    var prompt_Original: PromptModule = js.native
    
    /**
      * Registers a new prompt-type.
      *
      * @param name
      * The name of the prompt.
      *
      * @param prompt
      * The constructor of the prompt.
      */
    def registerPrompt(name: String, prompt: PromptConstructor): Unit = js.native
    
    /**
      * Registers the default prompts.
      */
    def restoreDefaultPrompts(): Unit = js.native
    
    /**
      * Provides ui-components.
      */
    /**
      * Provides components for the ui.
      */
    var ui: BottomBar = js.native
  }
}
