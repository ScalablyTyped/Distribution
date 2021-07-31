package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var cascade: Boolean
  
  var cols: Double
  
  def format(values: js.Array[String]): String
  
  var pickerPrefixCls: String
  
  var popupPrefixCls: String
  
  var prefixCls: String
  
  var title: String
  
  var triggerType: String
}
object Format {
  
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    title: String,
    triggerType: String
  ): Format = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Array[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
