package typings.activexLibreoffice.com_.sun.star.i18n

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
trait FormatElement extends js.Object {
  
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
  implicit class FormatElementOps[Self <: FormatElement] (val x: Self) extends AnyVal {
    
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
    def setFormatCode(value: String): Self = this.set("formatCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatIndex(value: Double): Self = this.set("formatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatKey(value: String): Self = this.set("formatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = this.set("formatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: String): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUsage(value: String): Self = this.set("formatUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
  }
}
