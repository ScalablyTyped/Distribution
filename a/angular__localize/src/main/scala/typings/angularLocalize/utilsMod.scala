package typings.angularLocalize

import typings.angularLocalize.mod.ɵParsedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareLocations(hasLocation1: ɵParsedMessage, hasLocation2: ɵParsedMessage): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLocations")(hasLocation1.asInstanceOf[js.Any], hasLocation2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def consolidateMessages(
    messages: js.Array[ɵParsedMessage],
    getMessageId: js.Function1[/* message */ ɵParsedMessage, String]
  ): js.Array[js.Array[ɵParsedMessage]] = (^.asInstanceOf[js.Dynamic].applyDynamic("consolidateMessages")(messages.asInstanceOf[js.Any], getMessageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ɵParsedMessage]]]
  
  inline def hasLocation(message: ɵParsedMessage): /* is @angular/localize.anon.ɵParsedMessagelocationɵSo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLocation")(message.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/localize.anon.ɵParsedMessagelocationɵSo */ Boolean]
}
