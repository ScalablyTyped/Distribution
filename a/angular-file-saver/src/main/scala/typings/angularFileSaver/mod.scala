package typings.angularFileSaver

import org.scalablytyped.runtime.Shortcut
import typings.angularFileSaver.angularFileSaverStrings.ngFileSaver
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-file-saver", JSImport.Namespace)
  @js.native
  val ^ : ngFileSaver = js.native
  
  type _To = ngFileSaver
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ngFileSaver = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    @js.native
    trait FileSaver extends StObject {
      
      /**
        * Immediately starts saving a file
        * @param data: a Blob instance;
        * @param filename: a String custom filename (an extension is optional);
        * @param disableAutoBOM : (optional) Boolean Disable automatically provided Unicode text encoding hints;
        */
      def saveAs(blob: Blob, fileName: String): Unit = js.native
      def saveAs(blob: Blob, fileName: String, disableBOM: Boolean): Unit = js.native
    }
  }
}
