package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to be implemented by objects that support having a title of type {@link XTitle} . */
trait XTitled
  extends StObject
     with XInterface {
  
  /** get the object holding the title's content and formatting */
  var TitleObject: XTitle
  
  /** get the object holding the title's content and formatting */
  def getTitleObject(): XTitle
  
  /** set a new title object replacing the former one */
  def setTitleObject(Title: XTitle): Unit
}
object XTitled {
  
  inline def apply(
    TitleObject: XTitle,
    acquire: () => Unit,
    getTitleObject: () => XTitle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitleObject: XTitle => Unit
  ): XTitled = {
    val __obj = js.Dynamic.literal(TitleObject = TitleObject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTitleObject = js.Any.fromFunction0(getTitleObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitleObject = js.Any.fromFunction1(setTitleObject))
    __obj.asInstanceOf[XTitled]
  }
  
  extension [Self <: XTitled](x: Self) {
    
    inline def setGetTitleObject(value: () => XTitle): Self = StObject.set(x, "getTitleObject", js.Any.fromFunction0(value))
    
    inline def setSetTitleObject(value: XTitle => Unit): Self = StObject.set(x, "setTitleObject", js.Any.fromFunction1(value))
    
    inline def setTitleObject(value: XTitle): Self = StObject.set(x, "TitleObject", value.asInstanceOf[js.Any])
  }
}
