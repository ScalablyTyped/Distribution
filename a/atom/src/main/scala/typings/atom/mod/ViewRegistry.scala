package typings.atom.mod

import typings.atom.anon.Instantiable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewRegistry extends StObject {
  
  /**
    *  Add a provider that will be used to construct views in the workspace's view
    *  layer based on model objects in its model layer.
    */
  def addViewProvider(createView: js.Function1[/* model */ js.Object, js.UndefOr[HTMLElement]]): Disposable = js.native
  /**
    *  Add a provider that will be used to construct views in the workspace's view
    *  layer based on model objects in its model layer.
    */
  // tslint:disable-next-line:no-any
  def addViewProvider[T](
    modelConstructor: Instantiable[T],
    createView: js.Function1[/* instance */ T, js.UndefOr[HTMLElement]]
  ): Disposable = js.native
  
  def getView(obj: js.Object): HTMLElement = js.native
  /** Get the view associated with an object in the workspace. */
  def getView(obj: TextEditor): TextEditorElement = js.native
}
