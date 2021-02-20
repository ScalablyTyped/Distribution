package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of subtotal fields in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalDescriptor extends XInterface {
  
  /**
    * adds a subtotal field definition to the descriptor.
    * @param aSubTotalColumns a sequence of all columns used to calculate subtotal values.
    * @param nGroupColumn specifies which column of the source range is used to group the contents of the source data.
    */
  def addNew(aSubTotalColumns: SeqEquiv[SubTotalColumn], nGroupColumn: Double): Unit = js.native
  
  /** removes all subtotal field definitions from the descriptor. */
  def clear(): Unit = js.native
}
object XSubTotalDescriptor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Unit,
    clear: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSubTotalDescriptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), clear = js.Any.fromFunction0(clear), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSubTotalDescriptor]
  }
  
  @scala.inline
  implicit class XSubTotalDescriptorMutableBuilder[Self <: XSubTotalDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNew(value: (SeqEquiv[SubTotalColumn], Double) => Unit): Self = StObject.set(x, "addNew", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
