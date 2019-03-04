package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a string replace operation. */
trait XReplaceDescriptor extends XSearchDescriptor {
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: java.lang.String
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): java.lang.String
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: java.lang.String): scala.Unit
}

object XReplaceDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReplaceString: java.lang.String,
    SearchString: java.lang.String,
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
    getReplaceString: js.Function0[java.lang.String],
    getSearchString: js.Function0[java.lang.String],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setReplaceString: js.Function1[java.lang.String, scala.Unit],
    setSearchString: js.Function1[java.lang.String, scala.Unit]
  ): XReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ReplaceString = ReplaceString, SearchString = SearchString, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getReplaceString = getReplaceString, getSearchString = getSearchString, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setReplaceString = setReplaceString, setSearchString = setSearchString)
  
    __obj.asInstanceOf[XReplaceDescriptor]
  }
}

