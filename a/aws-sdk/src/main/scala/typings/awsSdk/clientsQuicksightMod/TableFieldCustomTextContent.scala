package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldCustomTextContent extends StObject {
  
  /**
    * The font configuration of the custom text content for the table URL link content.
    */
  var FontConfiguration: typings.awsSdk.clientsQuicksightMod.FontConfiguration
  
  /**
    * The string value of the custom text content for the table URL link content.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object TableFieldCustomTextContent {
  
  inline def apply(FontConfiguration: FontConfiguration): TableFieldCustomTextContent = {
    val __obj = js.Dynamic.literal(FontConfiguration = FontConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFieldCustomTextContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldCustomTextContent] (val x: Self) extends AnyVal {
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
