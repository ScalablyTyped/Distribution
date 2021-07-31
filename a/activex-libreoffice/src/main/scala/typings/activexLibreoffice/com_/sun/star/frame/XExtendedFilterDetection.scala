package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XExtendedFilterDetection
  extends StObject
     with XInterface {
  
  /**
    * use {@link com.sun.star.document.XExtendedFilterDetection.detect()} instead of this
    * @deprecated Deprecated
    */
  def detect(URL: String, Argumentlist: SeqEquiv[PropertyValue]): String
}
object XExtendedFilterDetection {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    detect: (String, SeqEquiv[PropertyValue]) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), detect = js.Any.fromFunction2(detect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
  
  @scala.inline
  implicit class XExtendedFilterDetectionMutableBuilder[Self <: XExtendedFilterDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetect(value: (String, SeqEquiv[PropertyValue]) => String): Self = StObject.set(x, "detect", js.Any.fromFunction2(value))
  }
}
