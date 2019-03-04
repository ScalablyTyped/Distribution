package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes what and how to replace strings. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceDescriptor because var conflicts: SearchString. Inlined getReplaceString, ReplaceString, setReplaceString */ trait ReplaceDescriptor extends SearchDescriptor {
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: java.lang.String
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): java.lang.String
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: java.lang.String): scala.Unit
}

object ReplaceDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReplaceString: java.lang.String,
    SearchBackwards: scala.Boolean,
    SearchCaseSensitive: scala.Boolean,
    SearchRegularExpression: scala.Boolean,
    SearchSimilarity: scala.Boolean,
    SearchSimilarityAdd: scala.Double,
    SearchSimilarityExchange: scala.Double,
    SearchSimilarityRelax: scala.Boolean,
    SearchSimilarityRemove: scala.Double,
    SearchString: java.lang.String,
    SearchStyles: scala.Boolean,
    SearchWildcard: scala.Boolean,
    SearchWords: scala.Boolean,
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
  ): ReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ReplaceString = ReplaceString, SearchBackwards = SearchBackwards, SearchCaseSensitive = SearchCaseSensitive, SearchRegularExpression = SearchRegularExpression, SearchSimilarity = SearchSimilarity, SearchSimilarityAdd = SearchSimilarityAdd, SearchSimilarityExchange = SearchSimilarityExchange, SearchSimilarityRelax = SearchSimilarityRelax, SearchSimilarityRemove = SearchSimilarityRemove, SearchString = SearchString, SearchStyles = SearchStyles, SearchWildcard = SearchWildcard, SearchWords = SearchWords, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getReplaceString = getReplaceString, getSearchString = getSearchString, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setReplaceString = setReplaceString, setSearchString = setSearchString)
  
    __obj.asInstanceOf[ReplaceDescriptor]
  }
}

