package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a linked cell range.
  *
  * A linked cell range is a range which is linked to an equal-sized range in an external document. The contents of the external range is copied into the
  * range of this document.
  * @see com.sun.star.sheet.CellAreaLinks
  */
trait CellAreaLink
  extends StObject
     with XAreaLink
     with XRefreshable
     with XPropertySet {
  
  /** specifies the name of the filter used to load the source document. */
  var Filter: String
  
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String
  
  /**
    * specifies the delay time between two refresh actions in seconds.
    * @deprecated Deprecated
    */
  var RefreshDelay: Double
  
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double
  
  /** specifies the URL of the source document. */
  var Url: String
}
object CellAreaLink {
  
  inline def apply(
    DestArea: CellRangeAddress,
    Filter: String,
    FilterOptions: String,
    PropertySetInfo: XPropertySetInfo,
    RefreshDelay: Double,
    RefreshPeriod: Double,
    SourceArea: String,
    Url: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDestArea: () => CellRangeAddress,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getSourceArea: () => String,
    queryInterface: `type` => Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDestArea: CellRangeAddress => Unit,
    setPropertyValue: (String, Any) => Unit,
    setSourceArea: String => Unit
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilterOptions = FilterOptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RefreshDelay = RefreshDelay.asInstanceOf[js.Any], RefreshPeriod = RefreshPeriod.asInstanceOf[js.Any], SourceArea = SourceArea.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDestArea = js.Any.fromFunction0(getDestArea), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDestArea = js.Any.fromFunction1(setDestArea), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceArea = js.Any.fromFunction1(setSourceArea))
    __obj.asInstanceOf[CellAreaLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellAreaLink] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterOptions(value: String): Self = StObject.set(x, "FilterOptions", value.asInstanceOf[js.Any])
    
    inline def setRefreshDelay(value: Double): Self = StObject.set(x, "RefreshDelay", value.asInstanceOf[js.Any])
    
    inline def setRefreshPeriod(value: Double): Self = StObject.set(x, "RefreshPeriod", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
