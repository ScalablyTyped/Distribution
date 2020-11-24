package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a container for (binary) data.
  *
  * A data container may contain data and/or other data containers. A typical container with children is a MIME message with attachments.
  * @author Kai Sommerfeld
  * @deprecated Deprecated
  * @version 1.0
  */
@js.native
trait XDataContainer extends XIndexContainer {
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  var ContentType: String = js.native
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  var Data: SafeArray[Double] = js.native
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  var DataURL: String = js.native
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  def getContentType(): String = js.native
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  def getData(): SafeArray[Double] = js.native
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def getDataURL(): String = js.native
  
  /**
    * sets the content type (MIME Type) of the data container.
    * @param aType the content type
    */
  def setContentType(aType: String): Unit = js.native
  
  /**
    * sets the data of the data container.
    * @param aData the data
    */
  def setData(aData: SeqEquiv[Double]): Unit = js.native
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def setDataURL(aURL: String): Unit = js.native
}
object XDataContainer {
  
  @scala.inline
  def apply(
    ContentType: String,
    Count: Double,
    Data: SafeArray[Double],
    DataURL: String,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getContentType: () => String,
    getCount: () => Double,
    getData: () => SafeArray[Double],
    getDataURL: () => String,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setContentType: String => Unit,
    setData: SeqEquiv[Double] => Unit,
    setDataURL: String => Unit
  ): XDataContainer = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DataURL = DataURL.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getContentType = js.Any.fromFunction0(getContentType), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getDataURL = js.Any.fromFunction0(getDataURL), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setContentType = js.Any.fromFunction1(setContentType), setData = js.Any.fromFunction1(setData), setDataURL = js.Any.fromFunction1(setDataURL))
    __obj.asInstanceOf[XDataContainer]
  }
  
  @scala.inline
  implicit class XDataContainerOps[Self <: XDataContainer] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: SafeArray[Double]): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataURL(value: String): Self = this.set("DataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContentType(value: () => String): Self = this.set("getContentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => SafeArray[Double]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataURL(value: () => String): Self = this.set("getDataURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContentType(value: String => Unit): Self = this.set("setContentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetData(value: SeqEquiv[Double] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataURL(value: String => Unit): Self = this.set("setDataURL", js.Any.fromFunction1(value))
  }
}
