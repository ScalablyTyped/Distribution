package typings.angularLocalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesMessageSerializationMessageRendererMod {
  
  @js.native
  trait MessageRenderer[T] extends StObject {
    
    def closeContainer(): Unit = js.native
    
    def closePlaceholder(name: String): Unit = js.native
    
    def endIcu(): Unit = js.native
    
    def endRender(): Unit = js.native
    
    var message: T = js.native
    
    def placeholder(name: String): Unit = js.native
    def placeholder(name: String, body: String): Unit = js.native
    
    def startContainer(): Unit = js.native
    
    def startIcu(): Unit = js.native
    
    def startPlaceholder(name: String): Unit = js.native
    
    def startRender(): Unit = js.native
    
    def text(text: String): Unit = js.native
  }
}
