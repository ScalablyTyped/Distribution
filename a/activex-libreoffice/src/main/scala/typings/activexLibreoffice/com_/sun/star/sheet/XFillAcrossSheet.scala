package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XFillAcrossSheet extends XInterface {
  
  /** copies data between ranges onto different sheets in the document. */
  def fillAcrossSheets(nContentFlags: Double): Unit = js.native
}
object XFillAcrossSheet {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    fillAcrossSheets: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fillAcrossSheets = js.Any.fromFunction1(fillAcrossSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFillAcrossSheet]
  }
  
  @scala.inline
  implicit class XFillAcrossSheetOps[Self <: XFillAcrossSheet] (val x: Self) extends AnyVal {
    
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
    def setFillAcrossSheets(value: Double => Unit): Self = this.set("fillAcrossSheets", js.Any.fromFunction1(value))
  }
}
