package typings.atom.mod

import typings.atom.anon.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard extends StObject {
  
  /** Read the text from the clipboard. */
  def read(): String = js.native
  
  /**
    *  Read the text from the clipboard and return both the text and the associated
    *  metadata.
    */
  def readWithMetadata(): Metadata = js.native
  
  /** Write the given text to the clipboard. */
  def write(text: String): Unit = js.native
  def write(text: String, metadata: js.Object): Unit = js.native
}
