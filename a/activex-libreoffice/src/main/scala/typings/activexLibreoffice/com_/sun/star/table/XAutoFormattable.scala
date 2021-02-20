package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to apply TableAutoFormats to a cell range. */
@js.native
trait XAutoFormattable extends XInterface {
  
  /**
    * applies an AutoFormat to the cell range of the current context.
    * @param aName is the name of the AutoFormat to apply.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified AutoFormat does not exist.
    */
  def autoFormat(aName: String): Unit = js.native
}
object XAutoFormattable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    autoFormat: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoFormattable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoFormat = js.Any.fromFunction1(autoFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoFormattable]
  }
  
  @scala.inline
  implicit class XAutoFormattableMutableBuilder[Self <: XAutoFormattable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFormat(value: String => Unit): Self = StObject.set(x, "autoFormat", js.Any.fromFunction1(value))
  }
}
