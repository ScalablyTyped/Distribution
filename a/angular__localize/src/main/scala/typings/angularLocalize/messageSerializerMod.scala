package typings.angularLocalize

import typings.angularCompiler.mod.Element
import typings.angularCompiler.mod.Expansion
import typings.angularCompiler.mod.ExpansionCase
import typings.angularCompiler.mod.Node2
import typings.angularCompiler.mod.Text
import typings.angularLocalize.anon.BodyAttribute
import typings.angularLocalize.anon.ElementName
import typings.angularLocalize.baseVisitorMod.BaseVisitor
import typings.angularLocalize.messageRendererMod.MessageRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageSerializerMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/message_serialization/message_serializer", "MessageSerializer")
  @js.native
  open class MessageSerializer[T] protected () extends BaseVisitor {
    def this(renderer: MessageRenderer[T], config: MessageSerializerConfig) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ var isPlaceholderContainer: Any = js.native
    
    /* private */ var renderer: Any = js.native
    
    def serialize(nodes: js.Array[Node2]): T = js.native
    
    def visitContainedNodes(nodes: js.Array[Node2]): Unit = js.native
    
    def visitElement(element: Element): Unit = js.native
    
    def visitExpansion(expansion: Expansion): Unit = js.native
    
    def visitExpansionCase(expansionCase: ExpansionCase): Unit = js.native
    
    def visitPlaceholder(name: String): Unit = js.native
    def visitPlaceholder(name: String, body: String): Unit = js.native
    
    def visitPlaceholderContainer(startName: String, children: js.Array[Node2], closeName: String): Unit = js.native
    
    def visitText(text: Text): Unit = js.native
  }
  
  trait MessageSerializerConfig extends StObject {
    
    var inlineElements: js.Array[String]
    
    var placeholder: js.UndefOr[BodyAttribute] = js.undefined
    
    var placeholderContainer: js.UndefOr[ElementName] = js.undefined
  }
  object MessageSerializerConfig {
    
    inline def apply(inlineElements: js.Array[String]): MessageSerializerConfig = {
      val __obj = js.Dynamic.literal(inlineElements = inlineElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageSerializerConfig]
    }
    
    extension [Self <: MessageSerializerConfig](x: Self) {
      
      inline def setInlineElements(value: js.Array[String]): Self = StObject.set(x, "inlineElements", value.asInstanceOf[js.Any])
      
      inline def setInlineElementsVarargs(value: String*): Self = StObject.set(x, "inlineElements", js.Array(value*))
      
      inline def setPlaceholder(value: BodyAttribute): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderContainer(value: ElementName): Self = StObject.set(x, "placeholderContainer", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderContainerUndefined: Self = StObject.set(x, "placeholderContainer", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
