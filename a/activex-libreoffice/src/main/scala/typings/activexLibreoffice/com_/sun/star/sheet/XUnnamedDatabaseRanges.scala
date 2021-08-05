package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
trait XUnnamedDatabaseRanges
  extends StObject
     with XInterface {
  
  def getByTable(nTab: Double): js.Any
  
  def hasByTable(nTab: Double): Boolean
  
  def setByTable(aRange: CellRangeAddress): Unit
}
object XUnnamedDatabaseRanges {
  
  inline def apply(
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
  
  extension [Self <: XUnnamedDatabaseRanges](x: Self) {
    
    inline def setGetByTable(value: Double => js.Any): Self = StObject.set(x, "getByTable", js.Any.fromFunction1(value))
    
    inline def setHasByTable(value: Double => Boolean): Self = StObject.set(x, "hasByTable", js.Any.fromFunction1(value))
    
    inline def setSetByTable(value: CellRangeAddress => Unit): Self = StObject.set(x, "setByTable", js.Any.fromFunction1(value))
  }
}
