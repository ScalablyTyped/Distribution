package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XAutoFormattableOps[Self <: XAutoFormattable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFormat(value: String => Unit): Self = this.set("autoFormat", js.Any.fromFunction1(value))
  }
}
