package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties which can be used to describe a sort order applied to an {@link XSortable} .
  * @deprecated Deprecated
  * @see XSortable
  */
trait SortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the algorithm for the compare operator (collator).
    *
    * The collator algorithm may be defined for separate keys in specific implementations. For those this property may not need to be set.
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorAlgorithm: java.lang.String
  /** specifies the locale for the compare operator (collator). */
  var CollatorLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: scala.Boolean
  /**
    * specifies the sorting order.
    *
    * The sorting order may be defined for separate keys in specific implementations. For those this property may not need to be set.
    * @see com.sun.star.text.TextSortDescriptor
    */
  var SortAscending: scala.Boolean
  /**
    * specifies if the columns are sorted.
    *
    * **TRUE**: The columns are sorted.;
    *
    * **FALSE**: The rows are sorted.
    */
  var SortColumns: scala.Boolean
}

object SortDescriptor {
  @scala.inline
  def apply(
    CollatorAlgorithm: java.lang.String,
    CollatorLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    IsCaseSensitive: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAscending: scala.Boolean,
    SortColumns: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SortDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CollatorAlgorithm")(CollatorAlgorithm)
    __obj.updateDynamic("CollatorLocale")(CollatorLocale)
    __obj.updateDynamic("IsCaseSensitive")(IsCaseSensitive)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SortAscending")(SortAscending)
    __obj.updateDynamic("SortColumns")(SortColumns)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[SortDescriptor]
  }
}

