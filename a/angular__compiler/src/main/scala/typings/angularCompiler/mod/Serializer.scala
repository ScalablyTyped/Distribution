package typings.angularCompiler.mod

import typings.angularCompiler.anon.I18nNodesByMsgId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "Serializer")
@js.native
open class Serializer () extends StObject {
  
  def createNameMapper(message: Message): PlaceholderMapper | Null = js.native
  
  def digest(message: Message): String = js.native
  
  def load(content: String, url: String): I18nNodesByMsgId = js.native
  
  def write(messages: js.Array[Message]): String = js.native
  def write(messages: js.Array[Message], locale: String): String = js.native
}
