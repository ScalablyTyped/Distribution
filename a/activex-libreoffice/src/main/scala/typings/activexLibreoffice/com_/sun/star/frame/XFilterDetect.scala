package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XFilterDetect
  extends StObject
     with XInterface {
  
  def getContentType(URL: String): String
  
  def useExternBrowser(URL: String): Boolean
}
object XFilterDetect {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getContentType: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    useExternBrowser: String => Boolean
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getContentType = js.Any.fromFunction1(getContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), useExternBrowser = js.Any.fromFunction1(useExternBrowser))
    __obj.asInstanceOf[XFilterDetect]
  }
  
  @scala.inline
  implicit class XFilterDetectMutableBuilder[Self <: XFilterDetect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContentType(value: String => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseExternBrowser(value: String => Boolean): Self = StObject.set(x, "useExternBrowser", js.Any.fromFunction1(value))
  }
}
