package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An application that provides data for a chart must implement this interface. */
@js.native
trait XRangeXMLConversion extends XInterface {
  
  /** converts an XML-style range into the internal {@link DataProvider} 's format. */
  def convertRangeFromXML(aXMLRange: String): String = js.native
  
  /**
    * converts the range to a valid XML syntax.
    *
    * For example spreadsheet ranges consisting of more than one consecutive region are usually separated by a semicolon whereas in XML you separate
    * multiple regions by a space.
    */
  def convertRangeToXML(aRangeRepresentation: String): String = js.native
}
object XRangeXMLConversion {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertRangeFromXML: String => String,
    convertRangeToXML: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRangeXMLConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeXMLConversion]
  }
  
  @scala.inline
  implicit class XRangeXMLConversionOps[Self <: XRangeXMLConversion] (val x: Self) extends AnyVal {
    
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
    def setConvertRangeFromXML(value: String => String): Self = this.set("convertRangeFromXML", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertRangeToXML(value: String => String): Self = this.set("convertRangeToXML", js.Any.fromFunction1(value))
  }
}
