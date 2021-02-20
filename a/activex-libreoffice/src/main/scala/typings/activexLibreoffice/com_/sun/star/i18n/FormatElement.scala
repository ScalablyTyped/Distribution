package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One number format code and its attributes, returned in a sequence by {@link XLocaleData.getAllFormats()} .
  *
  * Contains raw data defined in the XML locale data files.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait FormatElement extends StObject {
  
  /** The format code, for example, "YYYY-MM-DD". */
  var formatCode: String = js.native
  
  /** The index used by the number formatter, predefined values corresponding with {@link NumberFormatIndex} values. */
  var formatIndex: Double = js.native
  
  /** A unique (within one locale) identifier. */
  var formatKey: String = js.native
  
  /** A name or description that is displayed in the number formatter dialog. */
  var formatName: String = js.native
  
  /** Type may be one of "short", "medium", "long". */
  var formatType: String = js.native
  
  /** Usage category, for example, "DATE" or "FIXED_NUMBER", corresponding with {@link KNumberFormatUsage} values. */
  var formatUsage: String = js.native
  
  /** If a format code is the default code of a **formatType** group. */
  var isDefault: Boolean = js.native
}
object FormatElement {
  
  @scala.inline
  def apply(
    formatCode: String,
    formatIndex: Double,
    formatKey: String,
    formatName: String,
    formatType: String,
    formatUsage: String,
    isDefault: Boolean
  ): FormatElement = {
    val __obj = js.Dynamic.literal(formatCode = formatCode.asInstanceOf[js.Any], formatIndex = formatIndex.asInstanceOf[js.Any], formatKey = formatKey.asInstanceOf[js.Any], formatName = formatName.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], formatUsage = formatUsage.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatElement]
  }
  
  @scala.inline
  implicit class FormatElementMutableBuilder[Self <: FormatElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatCode(value: String): Self = StObject.set(x, "formatCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatIndex(value: Double): Self = StObject.set(x, "formatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatKey(value: String): Self = StObject.set(x, "formatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = StObject.set(x, "formatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUsage(value: String): Self = StObject.set(x, "formatUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
  }
}
