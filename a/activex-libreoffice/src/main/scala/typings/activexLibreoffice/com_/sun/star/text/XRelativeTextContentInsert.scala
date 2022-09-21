package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to insert new text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentInsert
  extends StObject
     with XInterface {
  
  /**
    * inserts text the new text content after the predecessor argument.
    *
    * This is helpful to insert paragraphs after text tables especially in headers, footers or text frames.
    */
  def insertTextContentAfter(xNewContent: XTextContent, xPredecessor: XTextContent): Unit
  
  /**
    * inserts text the new text content before of the successor argument.
    *
    * This is helpful to insert paragraphs before of text tables.
    */
  def insertTextContentBefore(xNewContent: XTextContent, xSuccessor: XTextContent): Unit
}
object XRelativeTextContentInsert {
  
  inline def apply(
    acquire: () => Unit,
    insertTextContentAfter: (XTextContent, XTextContent) => Unit,
    insertTextContentBefore: (XTextContent, XTextContent) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRelativeTextContentInsert = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertTextContentAfter = js.Any.fromFunction2(insertTextContentAfter), insertTextContentBefore = js.Any.fromFunction2(insertTextContentBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRelativeTextContentInsert]
  }
  
  extension [Self <: XRelativeTextContentInsert](x: Self) {
    
    inline def setInsertTextContentAfter(value: (XTextContent, XTextContent) => Unit): Self = StObject.set(x, "insertTextContentAfter", js.Any.fromFunction2(value))
    
    inline def setInsertTextContentBefore(value: (XTextContent, XTextContent) => Unit): Self = StObject.set(x, "insertTextContentBefore", js.Any.fromFunction2(value))
  }
}
