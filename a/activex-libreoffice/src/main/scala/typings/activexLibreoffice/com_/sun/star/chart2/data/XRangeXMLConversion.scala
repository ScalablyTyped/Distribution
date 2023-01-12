package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An application that provides data for a chart must implement this interface. */
trait XRangeXMLConversion
  extends StObject
     with XInterface {
  
  /** converts an XML-style range into the internal {@link DataProvider} 's format. */
  def convertRangeFromXML(aXMLRange: String): String
  
  /**
    * converts the range to a valid XML syntax.
    *
    * For example spreadsheet ranges consisting of more than one consecutive region are usually separated by a semicolon whereas in XML you separate
    * multiple regions by a space.
    */
  def convertRangeToXML(aRangeRepresentation: String): String
}
object XRangeXMLConversion {
  
  inline def apply(
    acquire: () => Unit,
    convertRangeFromXML: String => String,
    convertRangeToXML: String => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRangeXMLConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeXMLConversion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRangeXMLConversion] (val x: Self) extends AnyVal {
    
    inline def setConvertRangeFromXML(value: String => String): Self = StObject.set(x, "convertRangeFromXML", js.Any.fromFunction1(value))
    
    inline def setConvertRangeToXML(value: String => String): Self = StObject.set(x, "convertRangeToXML", js.Any.fromFunction1(value))
  }
}
