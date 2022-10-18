package typings.atom

import typings.atom.anon.File
import typings.atom.anon.Position
import typings.atom.atomStrings.error
import typings.atom.atomStrings.file
import typings.atom.atomStrings.info
import typings.atom.atomStrings.project
import typings.atom.atomStrings.warning
import typings.atom.mod.Disposable
import typings.atom.mod.Range
import typings.atom.mod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linterMod {
  
  trait CallbackSolution extends StObject {
    
    @JSName("apply")
    def apply(): Any
    
    var position: Range
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object CallbackSolution {
    
    inline def apply(apply: () => Any, position: Range): CallbackSolution = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackSolution]
    }
    
    extension [Self <: CallbackSolution](x: Self) {
      
      inline def setApply(value: () => Any): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
      
      inline def setPosition(value: Range): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var name: String
  }
  object Config {
    
    inline def apply(name: String): Config = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndieDelegate extends StObject {
    
    def clearMessages(): Unit
    
    def dispose(): Unit
    
    def getMessages(): js.Array[Message]
    
    var name: String
    
    def onDidDestroy(callback: js.Function0[Unit]): Disposable
    
    def onDidUpdate(callback: js.Function0[Unit]): Disposable
    
    def setAllMessages(messages: js.Array[Message]): Unit
    
    def setMessages(filePath: String, messages: js.Array[Message]): Unit
  }
  object IndieDelegate {
    
    inline def apply(
      clearMessages: () => Unit,
      dispose: () => Unit,
      getMessages: () => js.Array[Message],
      name: String,
      onDidDestroy: js.Function0[Unit] => Disposable,
      onDidUpdate: js.Function0[Unit] => Disposable,
      setAllMessages: js.Array[Message] => Unit,
      setMessages: (String, js.Array[Message]) => Unit
    ): IndieDelegate = {
      val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), dispose = js.Any.fromFunction0(dispose), getMessages = js.Any.fromFunction0(getMessages), name = name.asInstanceOf[js.Any], onDidDestroy = js.Any.fromFunction1(onDidDestroy), onDidUpdate = js.Any.fromFunction1(onDidUpdate), setAllMessages = js.Any.fromFunction1(setAllMessages), setMessages = js.Any.fromFunction2(setMessages))
      __obj.asInstanceOf[IndieDelegate]
    }
    
    extension [Self <: IndieDelegate](x: Self) {
      
      inline def setClearMessages(value: () => Unit): Self = StObject.set(x, "clearMessages", js.Any.fromFunction0(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetMessages(value: () => js.Array[Message]): Self = StObject.set(x, "getMessages", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDidDestroy(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDestroy", js.Any.fromFunction1(value))
      
      inline def setOnDidUpdate(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidUpdate", js.Any.fromFunction1(value))
      
      inline def setSetAllMessages(value: js.Array[Message] => Unit): Self = StObject.set(x, "setAllMessages", js.Any.fromFunction1(value))
      
      inline def setSetMessages(value: (String, js.Array[Message]) => Unit): Self = StObject.set(x, "setMessages", js.Any.fromFunction2(value))
    }
  }
  
  type IndieProvider = js.Function1[/* register */ js.Function1[/* config */ Config, IndieDelegate], Unit]
  
  type LintResult = js.Array[Message] | Null
  
  trait LinterProvider extends StObject {
    
    var grammarScopes: js.Array[String]
    
    def lint(editor: TextEditor): LintResult | js.Promise[LintResult]
    
    var lintsOnChange: Boolean
    
    var name: String
    
    var scope: file | project
  }
  object LinterProvider {
    
    inline def apply(
      grammarScopes: js.Array[String],
      lint: TextEditor => LintResult | js.Promise[LintResult],
      lintsOnChange: Boolean,
      name: String,
      scope: file | project
    ): LinterProvider = {
      val __obj = js.Dynamic.literal(grammarScopes = grammarScopes.asInstanceOf[js.Any], lint = js.Any.fromFunction1(lint), lintsOnChange = lintsOnChange.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinterProvider]
    }
    
    extension [Self <: LinterProvider](x: Self) {
      
      inline def setGrammarScopes(value: js.Array[String]): Self = StObject.set(x, "grammarScopes", value.asInstanceOf[js.Any])
      
      inline def setGrammarScopesVarargs(value: String*): Self = StObject.set(x, "grammarScopes", js.Array(value*))
      
      inline def setLint(value: TextEditor => LintResult | js.Promise[LintResult]): Self = StObject.set(x, "lint", js.Any.fromFunction1(value))
      
      inline def setLintsOnChange(value: Boolean): Self = StObject.set(x, "lintsOnChange", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: file | project): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    /**
      *  Markdown long description of the error. Accepts a callback so that you can
      *  do things like HTTP requests.
      */
    var description: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.undefined
    
    /** The text for the message. */
    var excerpt: String
    
    /** The name of the octicon to show in the gutter. */
    var icon: js.UndefOr[String] = js.undefined
    
    /** Optionally override the displayed linter name. Defaults to provider name. */
    var linterName: js.UndefOr[String] = js.undefined
    
    /** The location of the issue (aka where to highlight). */
    var location: File
    
    /** A reference to a different location in the editor. */
    var reference: js.UndefOr[Position] = js.undefined
    
    /** The severity level for the message. */
    var severity: error | warning | info
    
    /** Possible solutions (which the user can invoke at will). */
    var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.undefined
    
    /** An HTTP link to a resource explaining the issue. Default is a google search. */
    var url: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    inline def apply(excerpt: String, location: File, severity: error | warning | info): Message = {
      val __obj = js.Dynamic.literal(excerpt = excerpt.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setDescription(value: String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLinterName(value: String): Self = StObject.set(x, "linterName", value.asInstanceOf[js.Any])
      
      inline def setLinterNameUndefined: Self = StObject.set(x, "linterName", js.undefined)
      
      inline def setLocation(value: File): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Position): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setSeverity(value: error | warning | info): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSolutions(value: js.Array[ReplacementSolution | CallbackSolution]): Self = StObject.set(x, "solutions", value.asInstanceOf[js.Any])
      
      inline def setSolutionsUndefined: Self = StObject.set(x, "solutions", js.undefined)
      
      inline def setSolutionsVarargs(value: (ReplacementSolution | CallbackSolution)*): Self = StObject.set(x, "solutions", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ReplacementSolution extends StObject {
    
    var currentText: js.UndefOr[String] = js.undefined
    
    var position: Range
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var replaceWith: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ReplacementSolution {
    
    inline def apply(position: Range, replaceWith: String): ReplacementSolution = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacementSolution]
    }
    
    extension [Self <: ReplacementSolution](x: Self) {
      
      inline def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
      
      inline def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
      
      inline def setPosition(value: Range): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
