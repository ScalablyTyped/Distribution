package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
@js.native
trait XUnnamedDatabaseRanges extends XInterface {
  
  def getByTable(nTab: Double): js.Any = js.native
  
  def hasByTable(nTab: Double): Boolean = js.native
  
  def setByTable(aRange: CellRangeAddress): Unit = js.native
}
object XUnnamedDatabaseRanges {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByTable: Double => js.Any,
    hasByTable: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setByTable: CellRangeAddress => Unit
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByTable = js.Any.fromFunction1(getByTable), hasByTable = js.Any.fromFunction1(hasByTable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setByTable = js.Any.fromFunction1(setByTable))
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
  
  @scala.inline
  implicit class XUnnamedDatabaseRangesOps[Self <: XUnnamedDatabaseRanges] (val x: Self) extends AnyVal {
    
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
    def setGetByTable(value: Double => js.Any): Self = this.set("getByTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasByTable(value: Double => Boolean): Self = this.set("hasByTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetByTable(value: CellRangeAddress => Unit): Self = this.set("setByTable", js.Any.fromFunction1(value))
  }
}
