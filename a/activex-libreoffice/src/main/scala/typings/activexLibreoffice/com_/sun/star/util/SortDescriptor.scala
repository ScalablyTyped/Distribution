package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the properties which can be used to describe a sort order applied to an {@link XSortable} .
  * @deprecated Deprecated
  * @see XSortable
  */
trait SortDescriptor
  extends StObject
     with XPropertySet {
  
  /**
    * specifies the algorithm for the compare operator (collator).
    *
    * The collator algorithm may be defined for separate keys in specific implementations. For those this property may not need to be set.
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorAlgorithm: String
  
  /** specifies the locale for the compare operator (collator). */
  var CollatorLocale: Locale
  
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
  
  /**
    * specifies the sorting order.
    *
    * The sorting order may be defined for separate keys in specific implementations. For those this property may not need to be set.
    * @see com.sun.star.text.TextSortDescriptor
    */
  var SortAscending: Boolean
  
  /**
    * specifies if the columns are sorted.
    *
    * **TRUE**: The columns are sorted.;
    *
    * **FALSE**: The rows are sorted.
    */
  var SortColumns: Boolean
}
object SortDescriptor {
  
  inline def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    IsCaseSensitive: Boolean,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): SortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], SortColumns = SortColumns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SortDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCollatorAlgorithm(value: String): Self = StObject.set(x, "CollatorAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setCollatorLocale(value: Locale): Self = StObject.set(x, "CollatorLocale", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "IsCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortColumns(value: Boolean): Self = StObject.set(x, "SortColumns", value.asInstanceOf[js.Any])
  }
}
