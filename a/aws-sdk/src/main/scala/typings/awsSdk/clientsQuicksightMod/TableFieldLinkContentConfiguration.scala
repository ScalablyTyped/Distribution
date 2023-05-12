package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldLinkContentConfiguration extends StObject {
  
  /**
    * The custom icon content for the table link content configuration.
    */
  var CustomIconContent: js.UndefOr[TableFieldCustomIconContent] = js.undefined
  
  /**
    * The custom text content (value, font configuration) for the table link content configuration.
    */
  var CustomTextContent: js.UndefOr[TableFieldCustomTextContent] = js.undefined
}
object TableFieldLinkContentConfiguration {
  
  inline def apply(): TableFieldLinkContentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldLinkContentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldLinkContentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomIconContent(value: TableFieldCustomIconContent): Self = StObject.set(x, "CustomIconContent", value.asInstanceOf[js.Any])
    
    inline def setCustomIconContentUndefined: Self = StObject.set(x, "CustomIconContent", js.undefined)
    
    inline def setCustomTextContent(value: TableFieldCustomTextContent): Self = StObject.set(x, "CustomTextContent", value.asInstanceOf[js.Any])
    
    inline def setCustomTextContentUndefined: Self = StObject.set(x, "CustomTextContent", js.undefined)
  }
}
