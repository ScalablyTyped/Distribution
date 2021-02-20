package typings.angularCompiler

import typings.angularCompiler.anon.I18nNodesByMsgId
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.RecurseVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("@angular/compiler/src/i18n/serializers/serializer", "Serializer")
  @js.native
  abstract class Serializer () extends StObject {
    
    def createNameMapper(message: Message): PlaceholderMapper | Null = js.native
    
    def digest(message: Message): String = js.native
    
    def load(content: String, url: String): I18nNodesByMsgId = js.native
    
    def write(messages: js.Array[Message]): String = js.native
    def write(messages: js.Array[Message], locale: String): String = js.native
  }
  
  @JSImport("@angular/compiler/src/i18n/serializers/serializer", "SimplePlaceholderMapper")
  @js.native
  class SimplePlaceholderMapper protected ()
    extends RecurseVisitor
       with PlaceholderMapper {
    def this(message: Message, mapName: js.Function1[/* name */ String, String]) = this()
    
    var internalToPublic: js.Any = js.native
    
    var mapName: js.Any = js.native
    
    var publicToInternal: js.Any = js.native
    
    var publicToNextId: js.Any = js.native
    
    var visitPlaceholderName: js.Any = js.native
  }
  
  @js.native
  trait PlaceholderMapper extends StObject {
    
    def toInternalName(publicName: String): String | Null = js.native
    
    def toPublicName(internalName: String): String | Null = js.native
  }
  object PlaceholderMapper {
    
    @scala.inline
    def apply(toInternalName: String => String | Null, toPublicName: String => String | Null): PlaceholderMapper = {
      val __obj = js.Dynamic.literal(toInternalName = js.Any.fromFunction1(toInternalName), toPublicName = js.Any.fromFunction1(toPublicName))
      __obj.asInstanceOf[PlaceholderMapper]
    }
    
    @scala.inline
    implicit class PlaceholderMapperMutableBuilder[Self <: PlaceholderMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToInternalName(value: String => String | Null): Self = StObject.set(x, "toInternalName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToPublicName(value: String => String | Null): Self = StObject.set(x, "toPublicName", js.Any.fromFunction1(value))
    }
  }
}
