package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use service {@link FrameLoaderFactory} instead of this
  * @deprecated Deprecated
  */
trait XFrameLoaderQuery
  extends StObject
     with XInterface {
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  val AvailableFilterNames: SafeArray[String]
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getAvailableFilterNames(): SafeArray[String]
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getByName()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getLoaderProperties(sFilterName: String): SafeArray[PropertyValue]
  
  /**
    * use member {@link com.sun.star.container.XContainerQuery} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def searchFilter(sURL: String, seqArguments: SeqEquiv[PropertyValue]): String
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
  implicit class XFrameLoaderQueryMutableBuilder[Self <: XFrameLoaderQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableFilterNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableFilterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAvailableFilterNames(value: () => SafeArray[String]): Self = StObject.set(x, "getAvailableFilterNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoaderProperties(value: String => SafeArray[PropertyValue]): Self = StObject.set(x, "getLoaderProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchFilter(value: (String, SeqEquiv[PropertyValue]) => String): Self = StObject.set(x, "searchFilter", js.Any.fromFunction2(value))
  }
}
