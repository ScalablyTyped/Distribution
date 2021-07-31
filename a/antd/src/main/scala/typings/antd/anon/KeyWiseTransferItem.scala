package typings.antd.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/transfer.KeyWise<antd.antd/lib/transfer.TransferItem> */
trait KeyWiseTransferItem
  extends StObject
     with /* customProp */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] & String
  
  var title: js.UndefOr[String] = js.undefined
}
object KeyWiseTransferItem {
  
  @scala.inline
  def apply(key: js.UndefOr[String] & String): KeyWiseTransferItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyWiseTransferItem]
  }
  
  @scala.inline
  implicit class KeyWiseTransferItemMutableBuilder[Self <: KeyWiseTransferItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setKey(value: js.UndefOr[String] & String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
