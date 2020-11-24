package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes what and how to search within a container. */
@js.native
trait SearchDescriptor extends XSearchDescriptor {
  
  /** If `TRUE` , the search is done backwards in the document. */
  var SearchBackwards: Boolean = js.native
  
  /** If `TRUE` , the case of the letters is important for the match. */
  var SearchCaseSensitive: Boolean = js.native
  
  /**
    * If `TRUE` , the search string is evaluated as a regular expression.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchRegularExpression: Boolean = js.native
  
  /**
    * If `TRUE` , a "similarity search" is performed.
    *
    * In the case of a similarity search, the following properties specify the kind of similarity:
    *
    * SearchSimilarityRelaxSearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchSimilarity: Boolean = js.native
  
  /** specifies the number of characters that must be added to match the search pattern. */
  var SearchSimilarityAdd: Double = js.native
  
  /** This property specifies the number of characters that must be replaced to match the search pattern. */
  var SearchSimilarityExchange: Double = js.native
  
  /**
    * If `TRUE` , all similarity rules are applied together.
    *
    * In the case of a relaxed similarity search, the following properties are applied together:
    *
    * SearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    */
  var SearchSimilarityRelax: Boolean = js.native
  
  /** This property specifies the number of characters that may be ignored to match the search pattern. */
  var SearchSimilarityRemove: Double = js.native
  
  /** If `TRUE` , it is searched for positions where the paragraph style with the name of the search pattern is applied. */
  var SearchStyles: Boolean = js.native
  
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
  var SearchWildcard: Boolean = js.native
  
  /** If `TRUE` , only complete words will be found. */
  var SearchWords: Boolean = js.native
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
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SearchBackwards = SearchBackwards.asInstanceOf[js.Any], SearchCaseSensitive = SearchCaseSensitive.asInstanceOf[js.Any], SearchRegularExpression = SearchRegularExpression.asInstanceOf[js.Any], SearchSimilarity = SearchSimilarity.asInstanceOf[js.Any], SearchSimilarityAdd = SearchSimilarityAdd.asInstanceOf[js.Any], SearchSimilarityExchange = SearchSimilarityExchange.asInstanceOf[js.Any], SearchSimilarityRelax = SearchSimilarityRelax.asInstanceOf[js.Any], SearchSimilarityRemove = SearchSimilarityRemove.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], SearchStyles = SearchStyles.asInstanceOf[js.Any], SearchWildcard = SearchWildcard.asInstanceOf[js.Any], SearchWords = SearchWords.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSearchString = js.Any.fromFunction1(setSearchString))
    __obj.asInstanceOf[SearchDescriptor]
  }
  
  @scala.inline
  implicit class SearchDescriptorOps[Self <: SearchDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSearchBackwards(value: Boolean): Self = this.set("SearchBackwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCaseSensitive(value: Boolean): Self = this.set("SearchCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchRegularExpression(value: Boolean): Self = this.set("SearchRegularExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSimilarity(value: Boolean): Self = this.set("SearchSimilarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSimilarityAdd(value: Double): Self = this.set("SearchSimilarityAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSimilarityExchange(value: Double): Self = this.set("SearchSimilarityExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSimilarityRelax(value: Boolean): Self = this.set("SearchSimilarityRelax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSimilarityRemove(value: Double): Self = this.set("SearchSimilarityRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStyles(value: Boolean): Self = this.set("SearchStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchWildcard(value: Boolean): Self = this.set("SearchWildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchWords(value: Boolean): Self = this.set("SearchWords", value.asInstanceOf[js.Any])
  }
}
