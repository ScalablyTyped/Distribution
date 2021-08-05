package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by documents that can expand the contents of a summary on a {@link DrawPage} into a collection of {@link DrawPages} .
  * @deprecated Deprecated
  * @see XDrawPageSummarizer
  */
trait XDrawPageExpander
  extends StObject
     with XInterface {
  
  /**
    * creates a collection of {@link DrawPages} from the summary inside the given {@link DrawPage} and adds them to the same model as the source {@link
    * DrawPage} .
    */
  def expand(xPage: XDrawPage): XDrawPages
}
object XDrawPageExpander {
  
  inline def apply(
    acquire: () => Unit,
    expand: XDrawPage => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), expand = js.Any.fromFunction1(expand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPageExpander]
  }
  
  extension [Self <: XDrawPageExpander](x: Self) {
    
    inline def setExpand(value: XDrawPage => XDrawPages): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
  }
}
