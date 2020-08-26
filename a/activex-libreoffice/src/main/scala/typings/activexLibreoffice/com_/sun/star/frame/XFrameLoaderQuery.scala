package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use service {@link FrameLoaderFactory} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XFrameLoaderQuery extends XInterface {
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  val AvailableFilterNames: SafeArray[String] = js.native
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getAvailableFilterNames(): SafeArray[String] = js.native
  /**
    * use member {@link com.sun.star.container.XNameAccess.getByName()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getLoaderProperties(sFilterName: String): SafeArray[PropertyValue] = js.native
  /**
    * use member {@link com.sun.star.container.XContainerQuery} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def searchFilter(sURL: String, seqArguments: SeqEquiv[PropertyValue]): String = js.native
}

object XFrameLoaderQuery {
  @scala.inline
  def apply(
    AvailableFilterNames: SafeArray[String],
    acquire: () => Unit,
    getAvailableFilterNames: () => SafeArray[String],
    getLoaderProperties: String => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchFilter: (String, SeqEquiv[PropertyValue]) => String
  ): XFrameLoaderQuery = {
    val __obj = js.Dynamic.literal(AvailableFilterNames = AvailableFilterNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAvailableFilterNames = js.Any.fromFunction0(getAvailableFilterNames), getLoaderProperties = js.Any.fromFunction1(getLoaderProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchFilter = js.Any.fromFunction2(searchFilter))
    __obj.asInstanceOf[XFrameLoaderQuery]
  }
  @scala.inline
  implicit class XFrameLoaderQueryOps[Self <: XFrameLoaderQuery] (val x: Self) extends AnyVal {
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
    def setAvailableFilterNames(value: SafeArray[String]): Self = this.set("AvailableFilterNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAvailableFilterNames(value: () => SafeArray[String]): Self = this.set("getAvailableFilterNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLoaderProperties(value: String => SafeArray[PropertyValue]): Self = this.set("getLoaderProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setSearchFilter(value: (String, SeqEquiv[PropertyValue]) => String): Self = this.set("searchFilter", js.Any.fromFunction2(value))
  }
  
}

