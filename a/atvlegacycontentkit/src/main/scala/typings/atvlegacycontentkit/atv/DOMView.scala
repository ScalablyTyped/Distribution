package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A view that allows you to programatically build an Apple TV page, rather than simply just through loading a full document.
  */
@js.native
trait DOMView extends StObject {
  
  /**
    * Load the DOMView into the view stack.
    * @param document The document you wish to load.
    * @param callback A callback for whether the document was successfully loaded. The only parameter is a boolean that is true if the load was successful.
    */
  def load(document: Document): Unit = js.native
  def load(document: Document, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * A callback called whenever the DOMView is unloaded.
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Unload the DOMView (and return to the previous page).
    */
  def unload(): Unit = js.native
}
