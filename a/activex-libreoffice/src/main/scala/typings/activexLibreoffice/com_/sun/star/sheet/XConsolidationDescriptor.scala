package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
trait XConsolidationDescriptor
  extends StObject
     with XInterface {
  
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: Boolean
  
  /** returns the cell ranges which are consolidated. */
  var Sources: SafeArray[CellRangeAddress]
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: CellAddress
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: Boolean
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: Boolean
  
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): Boolean
  
  /** returns the cell ranges which are consolidated. */
  def getSources(): SafeArray[CellRangeAddress]
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): CellAddress
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): Boolean
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): Boolean
  
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): Unit
  
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: Boolean): Unit
  
  /** sets the cell ranges which are consolidated. */
  def setSources(aSources: SeqEquiv[CellRangeAddress]): Unit
  
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: CellAddress): Unit
  
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: Boolean): Unit
  
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: Boolean): Unit
}
object XConsolidationDescriptor {
  
  inline def apply(
    Function: GeneralFunction,
    InsertLinks: Boolean,
    Sources: SafeArray[CellRangeAddress],
    StartOutputPosition: CellAddress,
    UseColumnHeaders: Boolean,
    UseRowHeaders: Boolean,
    acquire: () => Unit,
    getFunction: () => GeneralFunction,
    getInsertLinks: () => Boolean,
    getSources: () => SafeArray[CellRangeAddress],
    getStartOutputPosition: () => CellAddress,
    getUseColumnHeaders: () => Boolean,
    getUseRowHeaders: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFunction: GeneralFunction => Unit,
    setInsertLinks: Boolean => Unit,
    setSources: SeqEquiv[CellRangeAddress] => Unit,
    setStartOutputPosition: CellAddress => Unit,
    setUseColumnHeaders: Boolean => Unit,
    setUseRowHeaders: Boolean => Unit
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function.asInstanceOf[js.Any], InsertLinks = InsertLinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any], StartOutputPosition = StartOutputPosition.asInstanceOf[js.Any], UseColumnHeaders = UseColumnHeaders.asInstanceOf[js.Any], UseRowHeaders = UseRowHeaders.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFunction = js.Any.fromFunction0(getFunction), getInsertLinks = js.Any.fromFunction0(getInsertLinks), getSources = js.Any.fromFunction0(getSources), getStartOutputPosition = js.Any.fromFunction0(getStartOutputPosition), getUseColumnHeaders = js.Any.fromFunction0(getUseColumnHeaders), getUseRowHeaders = js.Any.fromFunction0(getUseRowHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFunction = js.Any.fromFunction1(setFunction), setInsertLinks = js.Any.fromFunction1(setInsertLinks), setSources = js.Any.fromFunction1(setSources), setStartOutputPosition = js.Any.fromFunction1(setStartOutputPosition), setUseColumnHeaders = js.Any.fromFunction1(setUseColumnHeaders), setUseRowHeaders = js.Any.fromFunction1(setUseRowHeaders))
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
  
  extension [Self <: XConsolidationDescriptor](x: Self) {
    
    inline def setFunction(value: GeneralFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setGetFunction(value: () => GeneralFunction): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
    
    inline def setGetInsertLinks(value: () => Boolean): Self = StObject.set(x, "getInsertLinks", js.Any.fromFunction0(value))
    
    inline def setGetSources(value: () => SafeArray[CellRangeAddress]): Self = StObject.set(x, "getSources", js.Any.fromFunction0(value))
    
    inline def setGetStartOutputPosition(value: () => CellAddress): Self = StObject.set(x, "getStartOutputPosition", js.Any.fromFunction0(value))
    
    inline def setGetUseColumnHeaders(value: () => Boolean): Self = StObject.set(x, "getUseColumnHeaders", js.Any.fromFunction0(value))
    
    inline def setGetUseRowHeaders(value: () => Boolean): Self = StObject.set(x, "getUseRowHeaders", js.Any.fromFunction0(value))
    
    inline def setInsertLinks(value: Boolean): Self = StObject.set(x, "InsertLinks", value.asInstanceOf[js.Any])
    
    inline def setSetFunction(value: GeneralFunction => Unit): Self = StObject.set(x, "setFunction", js.Any.fromFunction1(value))
    
    inline def setSetInsertLinks(value: Boolean => Unit): Self = StObject.set(x, "setInsertLinks", js.Any.fromFunction1(value))
    
    inline def setSetSources(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "setSources", js.Any.fromFunction1(value))
    
    inline def setSetStartOutputPosition(value: CellAddress => Unit): Self = StObject.set(x, "setStartOutputPosition", js.Any.fromFunction1(value))
    
    inline def setSetUseColumnHeaders(value: Boolean => Unit): Self = StObject.set(x, "setUseColumnHeaders", js.Any.fromFunction1(value))
    
    inline def setSetUseRowHeaders(value: Boolean => Unit): Self = StObject.set(x, "setUseRowHeaders", js.Any.fromFunction1(value))
    
    inline def setSources(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setStartOutputPosition(value: CellAddress): Self = StObject.set(x, "StartOutputPosition", value.asInstanceOf[js.Any])
    
    inline def setUseColumnHeaders(value: Boolean): Self = StObject.set(x, "UseColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setUseRowHeaders(value: Boolean): Self = StObject.set(x, "UseRowHeaders", value.asInstanceOf[js.Any])
  }
}
