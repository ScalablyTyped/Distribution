package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldCustomIconContent extends StObject {
  
  /**
    * The icon set type (link) of the custom icon content for table URL link content.
    */
  var Icon: js.UndefOr[TableFieldIconSetType] = js.undefined
}
object TableFieldCustomIconContent {
  
  inline def apply(): TableFieldCustomIconContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldCustomIconContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldCustomIconContent] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: TableFieldIconSetType): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
  }
}
