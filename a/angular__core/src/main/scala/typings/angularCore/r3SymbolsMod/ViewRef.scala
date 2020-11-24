package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Angular [view](guide/glossary#view "Definition").
  *
  * @see {@link ChangeDetectorRef#usage-notes Change detection usage}
  *
  * @publicApi
  */
@js.native
trait ViewRef extends ChangeDetectorRef {
  
  /**
    * Destroys this view and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  
  /**
    * Reports whether this view has been destroyed.
    * @returns True after the `destroy()` method has been called, false otherwise.
    */
  def destroyed: Boolean = js.native
  
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for views.
    * @param callback A handler function that cleans up developer-defined data
    * associated with a view. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): js.Any = js.native
}
