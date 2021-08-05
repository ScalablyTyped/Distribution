package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables a {@link SpreadsheetView} to split the view.
  * @deprecated Deprecated
  */
trait XViewSplitable
  extends StObject
     with XInterface {
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  val IsWindowSplit: Boolean
  
  /** returns the column before which the view is split. */
  val SplitColumn: Double
  
  /** returns the horizontal position in pixels where the view is split. */
  val SplitHorizontal: Double
  
  /** returns the row before which the view is split. */
  val SplitRow: Double
  
  /** returns the vertical position in pixels where the view is split. */
  val SplitVertical: Double
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def getIsWindowSplit(): Boolean
  
  /** returns the column before which the view is split. */
  def getSplitColumn(): Double
  
  /** returns the horizontal position in pixels where the view is split. */
  def getSplitHorizontal(): Double
  
  /** returns the row before which the view is split. */
  def getSplitRow(): Double
  
  /** returns the vertical position in pixels where the view is split. */
  def getSplitVertical(): Double
  
  /**
    * splits the view at the specified position.
    *
    * To split only horizontally, specify **nPixelY** as 0. To split only vertically, specify **nPixelX** as 0.
    */
  def splitAtPosition(nPixelX: Double, nPixelY: Double): Unit
}
object XViewSplitable {
  
  inline def apply(
    IsWindowSplit: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    acquire: () => Unit,
    getIsWindowSplit: () => Boolean,
    getSplitColumn: () => Double,
    getSplitHorizontal: () => Double,
    getSplitRow: () => Double,
    getSplitVertical: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    splitAtPosition: (Double, Double) => Unit
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal(IsWindowSplit = IsWindowSplit.asInstanceOf[js.Any], SplitColumn = SplitColumn.asInstanceOf[js.Any], SplitHorizontal = SplitHorizontal.asInstanceOf[js.Any], SplitRow = SplitRow.asInstanceOf[js.Any], SplitVertical = SplitVertical.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitAtPosition = js.Any.fromFunction2(splitAtPosition))
    __obj.asInstanceOf[XViewSplitable]
  }
  
  extension [Self <: XViewSplitable](x: Self) {
    
    inline def setGetIsWindowSplit(value: () => Boolean): Self = StObject.set(x, "getIsWindowSplit", js.Any.fromFunction0(value))
    
    inline def setGetSplitColumn(value: () => Double): Self = StObject.set(x, "getSplitColumn", js.Any.fromFunction0(value))
    
    inline def setGetSplitHorizontal(value: () => Double): Self = StObject.set(x, "getSplitHorizontal", js.Any.fromFunction0(value))
    
    inline def setGetSplitRow(value: () => Double): Self = StObject.set(x, "getSplitRow", js.Any.fromFunction0(value))
    
    inline def setGetSplitVertical(value: () => Double): Self = StObject.set(x, "getSplitVertical", js.Any.fromFunction0(value))
    
    inline def setIsWindowSplit(value: Boolean): Self = StObject.set(x, "IsWindowSplit", value.asInstanceOf[js.Any])
    
    inline def setSplitAtPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "splitAtPosition", js.Any.fromFunction2(value))
    
    inline def setSplitColumn(value: Double): Self = StObject.set(x, "SplitColumn", value.asInstanceOf[js.Any])
    
    inline def setSplitHorizontal(value: Double): Self = StObject.set(x, "SplitHorizontal", value.asInstanceOf[js.Any])
    
    inline def setSplitRow(value: Double): Self = StObject.set(x, "SplitRow", value.asInstanceOf[js.Any])
    
    inline def setSplitVertical(value: Double): Self = StObject.set(x, "SplitVertical", value.asInstanceOf[js.Any])
  }
}
