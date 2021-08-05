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
trait XFlatParagraphIterator
  extends StObject
     with XInterface {
  
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val FirstPara: XFlatParagraph
  
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  val LastPara: XFlatParagraph
  
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val NextPara: XFlatParagraph
  
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getFirstPara(): XFlatParagraph
  
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  def getLastPara(): XFlatParagraph
  
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getNextPara(): XFlatParagraph
  
  /**
    * get the flat paragraph just following this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaAfter(xPara: XFlatParagraph): XFlatParagraph
  
  /**
    * get the flat paragraph before this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaBefore(xPara: XFlatParagraph): XFlatParagraph
}
object XFlatParagraphIterator {
  
  inline def apply(
    FirstPara: XFlatParagraph,
    LastPara: XFlatParagraph,
    NextPara: XFlatParagraph,
    acquire: () => Unit,
    getFirstPara: () => XFlatParagraph,
    getLastPara: () => XFlatParagraph,
    getNextPara: () => XFlatParagraph,
    getParaAfter: XFlatParagraph => XFlatParagraph,
    getParaBefore: XFlatParagraph => XFlatParagraph,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlatParagraphIterator = {
    val __obj = js.Dynamic.literal(FirstPara = FirstPara.asInstanceOf[js.Any], LastPara = LastPara.asInstanceOf[js.Any], NextPara = NextPara.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirstPara = js.Any.fromFunction0(getFirstPara), getLastPara = js.Any.fromFunction0(getLastPara), getNextPara = js.Any.fromFunction0(getNextPara), getParaAfter = js.Any.fromFunction1(getParaAfter), getParaBefore = js.Any.fromFunction1(getParaBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlatParagraphIterator]
  }
  
  extension [Self <: XFlatParagraphIterator](x: Self) {
    
    inline def setFirstPara(value: XFlatParagraph): Self = StObject.set(x, "FirstPara", value.asInstanceOf[js.Any])
    
    inline def setGetFirstPara(value: () => XFlatParagraph): Self = StObject.set(x, "getFirstPara", js.Any.fromFunction0(value))
    
    inline def setGetLastPara(value: () => XFlatParagraph): Self = StObject.set(x, "getLastPara", js.Any.fromFunction0(value))
    
    inline def setGetNextPara(value: () => XFlatParagraph): Self = StObject.set(x, "getNextPara", js.Any.fromFunction0(value))
    
    inline def setGetParaAfter(value: XFlatParagraph => XFlatParagraph): Self = StObject.set(x, "getParaAfter", js.Any.fromFunction1(value))
    
    inline def setGetParaBefore(value: XFlatParagraph => XFlatParagraph): Self = StObject.set(x, "getParaBefore", js.Any.fromFunction1(value))
    
    inline def setLastPara(value: XFlatParagraph): Self = StObject.set(x, "LastPara", value.asInstanceOf[js.Any])
    
    inline def setNextPara(value: XFlatParagraph): Self = StObject.set(x, "NextPara", value.asInstanceOf[js.Any])
  }
}
