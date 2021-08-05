package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a container for (binary) data.
  *
  * A data container may contain data and/or other data containers. A typical container with children is a MIME message with attachments.
  * @author Kai Sommerfeld
  * @deprecated Deprecated
  * @version 1.0
  */
trait XDataContainer
  extends StObject
     with XIndexContainer {
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  var ContentType: String
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  var Data: SafeArray[Double]
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  var DataURL: String
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  def getContentType(): String
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  def getData(): SafeArray[Double]
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def getDataURL(): String
  
  /**
    * sets the content type (MIME Type) of the data container.
    * @param aType the content type
    */
  def setContentType(aType: String): Unit
  
  /**
    * sets the data of the data container.
    * @param aData the data
    */
  def setData(aData: SeqEquiv[Double]): Unit
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def setDataURL(aURL: String): Unit
}
object XDataContainer {
  
  inline def apply(
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
  
  extension [Self <: XDataContainer](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: SafeArray[Double]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataURL(value: String): Self = StObject.set(x, "DataURL", value.asInstanceOf[js.Any])
    
    inline def setGetContentType(value: () => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => SafeArray[Double]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDataURL(value: () => String): Self = StObject.set(x, "getDataURL", js.Any.fromFunction0(value))
    
    inline def setSetContentType(value: String => Unit): Self = StObject.set(x, "setContentType", js.Any.fromFunction1(value))
    
    inline def setSetData(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetDataURL(value: String => Unit): Self = StObject.set(x, "setDataURL", js.Any.fromFunction1(value))
  }
}
