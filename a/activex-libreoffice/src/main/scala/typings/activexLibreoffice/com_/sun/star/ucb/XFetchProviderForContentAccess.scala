package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility to load information offered by a {@link XContentAccess} for several rows of a {@link ContentResultSet} with a single function
  * call.
  */
@js.native
trait XFetchProviderForContentAccess extends XInterface {
  /**
    * returns the content identifier strings of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains a string.
    */
  def fetchContentIdentifierStrings(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult = js.native
  /**
    * returns the XContentIdentifiers of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains an {@link XContentIdentifier} .
    */
  def fetchContentIdentifiers(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult = js.native
  /**
    * returns the {@link XContent} s of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains an {@link XContent} .
    */
  def fetchContents(nRowStartPosition: Double, nRowCount: Double, bDirection: Boolean): FetchResult = js.native
}

object XFetchProviderForContentAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    fetchContentIdentifierStrings: (Double, Double, Boolean) => FetchResult,
    fetchContentIdentifiers: (Double, Double, Boolean) => FetchResult,
    fetchContents: (Double, Double, Boolean) => FetchResult,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFetchProviderForContentAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fetchContentIdentifierStrings = js.Any.fromFunction3(fetchContentIdentifierStrings), fetchContentIdentifiers = js.Any.fromFunction3(fetchContentIdentifiers), fetchContents = js.Any.fromFunction3(fetchContents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFetchProviderForContentAccess]
  }
  @scala.inline
  implicit class XFetchProviderForContentAccessOps[Self <: XFetchProviderForContentAccess] (val x: Self) extends AnyVal {
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
    def setFetchContentIdentifierStrings(value: (Double, Double, Boolean) => FetchResult): Self = this.set("fetchContentIdentifierStrings", js.Any.fromFunction3(value))
    @scala.inline
    def setFetchContentIdentifiers(value: (Double, Double, Boolean) => FetchResult): Self = this.set("fetchContentIdentifiers", js.Any.fromFunction3(value))
    @scala.inline
    def setFetchContents(value: (Double, Double, Boolean) => FetchResult): Self = this.set("fetchContents", js.Any.fromFunction3(value))
  }
  
}

