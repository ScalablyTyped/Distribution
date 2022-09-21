package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive status change events from an {@link XDataEditor} . */
trait XDataEditorListener
  extends StObject
     with XInterface {
  
  /** is called when the state of a connected {@link XDataEditor} changes. */
  def updateDataEditorState(event: DataEditorEvent): Unit
}
object XDataEditorListener {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    updateDataEditorState: DataEditorEvent => Unit
  ): XDataEditorListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateDataEditorState = js.Any.fromFunction1(updateDataEditorState))
    __obj.asInstanceOf[XDataEditorListener]
  }
  
  extension [Self <: XDataEditorListener](x: Self) {
    
    inline def setUpdateDataEditorState(value: DataEditorEvent => Unit): Self = StObject.set(x, "updateDataEditorState", js.Any.fromFunction1(value))
  }
}
