package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
trait XFlatParagraphIteratorProvider
  extends StObject
     with XInterface {
  
  /**
    * get {@link XFlatParagraphIterator}
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param bAutomatic Automatic or interactive checking.
    * @returns the iterator.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getFlatParagraphIterator(nType: Double, bAutomatic: Boolean): XFlatParagraphIterator
}
object XFlatParagraphIteratorProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getFlatParagraphIterator: (Double, Boolean) => XFlatParagraphIterator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlatParagraphIteratorProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFlatParagraphIterator = js.Any.fromFunction2(getFlatParagraphIterator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlatParagraphIteratorProvider]
  }
  
  @scala.inline
  implicit class XFlatParagraphIteratorProviderMutableBuilder[Self <: XFlatParagraphIteratorProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFlatParagraphIterator(value: (Double, Boolean) => XFlatParagraphIterator): Self = StObject.set(x, "getFlatParagraphIterator", js.Any.fromFunction2(value))
  }
}
