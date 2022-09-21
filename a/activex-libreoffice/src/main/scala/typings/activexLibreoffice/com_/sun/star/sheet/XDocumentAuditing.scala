package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides auditing functions of a document. */
trait XDocumentAuditing
  extends StObject
     with XInterface {
  
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): Unit
}
object XDocumentAuditing {
  
  inline def apply(acquire: () => Unit, queryInterface: `type` => Any, refreshArrows: () => Unit, release: () => Unit): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = js.Any.fromFunction0(refreshArrows), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentAuditing]
  }
  
  extension [Self <: XDocumentAuditing](x: Self) {
    
    inline def setRefreshArrows(value: () => Unit): Self = StObject.set(x, "refreshArrows", js.Any.fromFunction0(value))
  }
}
