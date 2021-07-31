package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nAstMod {
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "CloneVisitor")
  @js.native
  class CloneVisitor ()
    extends StObject
       with Visitor
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "Container")
  @js.native
  class Container protected ()
    extends StObject
       with Node {
    def this(children: js.Array[Node], sourceSpan: ParseSourceSpan) = this()
    
    var children: js.Array[Node] = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "Icu")
  @js.native
  class Icu protected ()
    extends StObject
       with Node {
    def this(expression: String, `type`: String, cases: StringDictionary[Node], sourceSpan: ParseSourceSpan) = this()
    
    var cases: StringDictionary[Node] = js.native
    
    var expression: String = js.native
    
    var expressionPlaceholder: String = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "IcuPlaceholder")
  @js.native
  class IcuPlaceholder protected ()
    extends StObject
       with Node {
    def this(value: Icu, name: String, sourceSpan: ParseSourceSpan) = this()
    
    var name: String = js.native
    
    /** Used to capture a message computed from a previous processing pass (see `setI18nRefs()`). */
    var previousMessage: js.UndefOr[Message] = js.native
    
    var value: Icu = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "Message")
  @js.native
  class Message protected ()
    extends StObject
       with I18nMeta {
    /**
      * @param nodes message AST
      * @param placeholders maps placeholder names to static content and their source spans
      * @param placeholderToMessage maps placeholder names to messages (used for nested ICU messages)
      * @param meaning
      * @param description
      * @param customId
      */
    def this(
      nodes: js.Array[Node],
      placeholders: StringDictionary[MessagePlaceholder],
      placeholderToMessage: StringDictionary[Message],
      meaning: String,
      description: String,
      customId: String
    ) = this()
    
    var customId: String = js.native
    
    var description: String = js.native
    
    var id: String = js.native
    
    /** The ids to use if there are no custom id and if `i18nLegacyMessageIdFormat` is not empty */
    var legacyIds: js.Array[String] = js.native
    
    var meaning: String = js.native
    
    var nodes: js.Array[Node] = js.native
    
    var placeholderToMessage: StringDictionary[Message] = js.native
    
    var placeholders: StringDictionary[MessagePlaceholder] = js.native
    
    var sources: js.Array[MessageSpan] = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "Placeholder")
  @js.native
  class Placeholder protected ()
    extends StObject
       with Node {
    def this(value: String, name: String, sourceSpan: ParseSourceSpan) = this()
    
    var name: String = js.native
    
    var value: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "RecurseVisitor")
  @js.native
  class RecurseVisitor ()
    extends StObject
       with Visitor
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "TagPlaceholder")
  @js.native
  class TagPlaceholder protected ()
    extends StObject
       with Node {
    def this(
      tag: String,
      attrs: StringDictionary[String],
      startName: String,
      closeName: String,
      children: js.Array[Node],
      isVoid: Boolean,
      sourceSpan: ParseSourceSpan
    ) = this()
    def this(
      tag: String,
      attrs: StringDictionary[String],
      startName: String,
      closeName: String,
      children: js.Array[Node],
      isVoid: Boolean,
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      tag: String,
      attrs: StringDictionary[String],
      startName: String,
      closeName: String,
      children: js.Array[Node],
      isVoid: Boolean,
      sourceSpan: ParseSourceSpan,
      startSourceSpan: Null,
      endSourceSpan: ParseSourceSpan
    ) = this()
    def this(
      tag: String,
      attrs: StringDictionary[String],
      startName: String,
      closeName: String,
      children: js.Array[Node],
      isVoid: Boolean,
      sourceSpan: ParseSourceSpan,
      startSourceSpan: ParseSourceSpan,
      endSourceSpan: ParseSourceSpan
    ) = this()
    
    var attrs: StringDictionary[String] = js.native
    
    var children: js.Array[Node] = js.native
    
    var closeName: String = js.native
    
    var endSourceSpan: ParseSourceSpan | Null = js.native
    
    var isVoid: Boolean = js.native
    
    var startName: String = js.native
    
    var startSourceSpan: ParseSourceSpan | Null = js.native
    
    var tag: String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/i18n_ast", "Text")
  @js.native
  class Text protected ()
    extends StObject
       with Node {
    def this(value: String, sourceSpan: ParseSourceSpan) = this()
    
    var value: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompiler.i18nAstMod.Message
    - typings.angularCompiler.i18nAstMod.Node
  */
  trait I18nMeta extends StObject
  
  trait MessagePlaceholder extends StObject {
    
    /** The source span of the placeholder */
    var sourceSpan: ParseSourceSpan
    
    /** The text contents of the placeholder */
    var text: String
  }
  object MessagePlaceholder {
    
    @scala.inline
    def apply(sourceSpan: ParseSourceSpan, text: String): MessagePlaceholder = {
      val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePlaceholder]
    }
    
    @scala.inline
    implicit class MessagePlaceholderMutableBuilder[Self <: MessagePlaceholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageSpan extends StObject {
    
    var endCol: Double
    
    var endLine: Double
    
    var filePath: String
    
    var startCol: Double
    
    var startLine: Double
  }
  object MessageSpan {
    
    @scala.inline
    def apply(endCol: Double, endLine: Double, filePath: String, startCol: Double, startLine: Double): MessageSpan = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageSpan]
    }
    
    @scala.inline
    implicit class MessageSpanMutableBuilder[Self <: MessageSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node
    extends StObject
       with I18nMeta {
    
    var sourceSpan: ParseSourceSpan = js.native
    
    def visit(visitor: Visitor): js.Any = js.native
    def visit(visitor: Visitor, context: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Visitor extends StObject {
    
    def visitContainer(container: Container): js.Any = js.native
    def visitContainer(container: Container, context: js.Any): js.Any = js.native
    
    def visitIcu(icu: Icu): js.Any = js.native
    def visitIcu(icu: Icu, context: js.Any): js.Any = js.native
    
    def visitIcuPlaceholder(ph: IcuPlaceholder): js.Any = js.native
    def visitIcuPlaceholder(ph: IcuPlaceholder, context: js.Any): js.Any = js.native
    
    def visitPlaceholder(ph: Placeholder): js.Any = js.native
    def visitPlaceholder(ph: Placeholder, context: js.Any): js.Any = js.native
    
    def visitTagPlaceholder(ph: TagPlaceholder): js.Any = js.native
    def visitTagPlaceholder(ph: TagPlaceholder, context: js.Any): js.Any = js.native
    
    def visitText(text: Text): js.Any = js.native
    def visitText(text: Text, context: js.Any): js.Any = js.native
  }
}
