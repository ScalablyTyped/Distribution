package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes what and how to replace strings. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XReplaceDescriptor because var conflicts: SearchString. Inlined getReplaceString, ReplaceString, setReplaceString */ trait ReplaceDescriptor extends SearchDescriptor {
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: String
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): String
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: String): Unit
}

object ReplaceDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceString: String,
    SearchBackwards: Boolean,
    SearchCaseSensitive: Boolean,
    SearchRegularExpression: Boolean,
    SearchSimilarity: Boolean,
    SearchSimilarityAdd: Double,
    SearchSimilarityExchange: Double,
    SearchSimilarityRelax: Boolean,
    SearchSimilarityRemove: Double,
    SearchString: String,
    SearchStyles: Boolean,
    SearchWildcard: Boolean,
    SearchWords: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReplaceString: () => String,
    getSearchString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setReplaceString: String => Unit,
    setSearchString: String => Unit
  ): ReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ReplaceString = ReplaceString, SearchBackwards = SearchBackwards, SearchCaseSensitive = SearchCaseSensitive, SearchRegularExpression = SearchRegularExpression, SearchSimilarity = SearchSimilarity, SearchSimilarityAdd = SearchSimilarityAdd, SearchSimilarityExchange = SearchSimilarityExchange, SearchSimilarityRelax = SearchSimilarityRelax, SearchSimilarityRemove = SearchSimilarityRemove, SearchString = SearchString, SearchStyles = SearchStyles, SearchWildcard = SearchWildcard, SearchWords = SearchWords, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchString = js.Any.fromFunction1(setSearchString))
  
    __obj.asInstanceOf[ReplaceDescriptor]
  }
}

