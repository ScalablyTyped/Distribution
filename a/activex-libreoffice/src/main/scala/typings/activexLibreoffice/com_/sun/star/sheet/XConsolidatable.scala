package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to consolidate ranges in a spreadsheet document.
  *
  * Consolidation combines the cells of multiple cell ranges, using a specific function.
  * @deprecated Deprecated
  */
trait XConsolidatable
  extends StObject
     with XInterface {
  
  /**
    * consolidates data from several cell ranges, using the settings in the passed descriptor.
    * @param xDescriptor the descriptor used to perform the consolidation.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def consolidate(xDescriptor: XConsolidationDescriptor): Unit
  
  /**
    * creates a consolidation descriptor.
    * @param bEmpty `TRUE` leaves the descriptor empty, `FALSE` fills it with the settings from the last consolidation action.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def createConsolidationDescriptor(bEmpty: Boolean): XConsolidationDescriptor
}
object XConsolidatable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    consolidate: XConsolidationDescriptor => Unit,
    createConsolidationDescriptor: Boolean => XConsolidationDescriptor,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConsolidatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), consolidate = js.Any.fromFunction1(consolidate), createConsolidationDescriptor = js.Any.fromFunction1(createConsolidationDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConsolidatable]
  }
  
  @scala.inline
  implicit class XConsolidatableMutableBuilder[Self <: XConsolidatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsolidate(value: XConsolidationDescriptor => Unit): Self = StObject.set(x, "consolidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateConsolidationDescriptor(value: Boolean => XConsolidationDescriptor): Self = StObject.set(x, "createConsolidationDescriptor", js.Any.fromFunction1(value))
  }
}
