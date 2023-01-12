package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to remove text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentRemove
  extends StObject
     with XInterface {
  
  /**
    * removes the text content that follows the argument.
    *
    * This is helpful to remove empty paragraphs following text tables especially in headers, footers or text frames.
    */
  def removeTextContentAfter(xPredecessor: XTextContent): Unit
  
  /**
    * removes the text content that precedes the argument.
    *
    * This is helpful to remove empty paragraphs before text tables.
    */
  def removeTextContentBefore(xSuccessor: XTextContent): Unit
}
object XRelativeTextContentRemove {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeTextContentAfter: XTextContent => Unit,
    removeTextContentBefore: XTextContent => Unit
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContentAfter = js.Any.fromFunction1(removeTextContentAfter), removeTextContentBefore = js.Any.fromFunction1(removeTextContentBefore))
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRelativeTextContentRemove] (val x: Self) extends AnyVal {
    
    inline def setRemoveTextContentAfter(value: XTextContent => Unit): Self = StObject.set(x, "removeTextContentAfter", js.Any.fromFunction1(value))
    
    inline def setRemoveTextContentBefore(value: XTextContent => Unit): Self = StObject.set(x, "removeTextContentBefore", js.Any.fromFunction1(value))
  }
}
