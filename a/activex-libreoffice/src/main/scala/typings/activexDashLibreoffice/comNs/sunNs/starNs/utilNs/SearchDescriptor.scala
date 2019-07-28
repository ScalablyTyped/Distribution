package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes what and how to search within a container. */
trait SearchDescriptor extends XSearchDescriptor {
  /** If `TRUE` , the search is done backwards in the document. */
  var SearchBackwards: Boolean
  /** If `TRUE` , the case of the letters is important for the match. */
  var SearchCaseSensitive: Boolean
  /**
    * If `TRUE` , the search string is evaluated as a regular expression.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchRegularExpression: Boolean
  /**
    * If `TRUE` , a "similarity search" is performed.
    *
    * In the case of a similarity search, the following properties specify the kind of similarity:
    *
    * SearchSimilarityRelaxSearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchSimilarity: Boolean
  /** specifies the number of characters that must be added to match the search pattern. */
  var SearchSimilarityAdd: Double
  /** This property specifies the number of characters that must be replaced to match the search pattern. */
  var SearchSimilarityExchange: Double
  /**
    * If `TRUE` , all similarity rules are applied together.
    *
    * In the case of a relaxed similarity search, the following properties are applied together:
    *
    * SearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    */
  var SearchSimilarityRelax: Boolean
  /** This property specifies the number of characters that may be ignored to match the search pattern. */
  var SearchSimilarityRemove: Double
  /** If `TRUE` , it is searched for positions where the paragraph style with the name of the search pattern is applied. */
  var SearchStyles: Boolean
  /**
    * If `TRUE` , the search string is evaluated as a wildcard pattern.
    *
    * Wildcards are '*' (asterisk) for any sequence of characters, including an empty sequence, and '?' (question mark) for exactly one character. Escape
    * character is '\' (U+005C REVERSE SOLIDUS) aka backslash, it escapes the special meaning of a question mark, asterisk or escape character that follows
    * immediately after the escape character.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    * @since LibreOffice 5.2
    */
  var SearchWildcard: Boolean
  /** If `TRUE` , only complete words will be found. */
  var SearchWords: Boolean
}

object SearchDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
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
    getSearchString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSearchString: String => Unit
  ): SearchDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, SearchBackwards = SearchBackwards, SearchCaseSensitive = SearchCaseSensitive, SearchRegularExpression = SearchRegularExpression, SearchSimilarity = SearchSimilarity, SearchSimilarityAdd = SearchSimilarityAdd, SearchSimilarityExchange = SearchSimilarityExchange, SearchSimilarityRelax = SearchSimilarityRelax, SearchSimilarityRemove = SearchSimilarityRemove, SearchString = SearchString, SearchStyles = SearchStyles, SearchWildcard = SearchWildcard, SearchWords = SearchWords, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSearchString = js.Any.fromFunction1(setSearchString))
  
    __obj.asInstanceOf[SearchDescriptor]
  }
}

