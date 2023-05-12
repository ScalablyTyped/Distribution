package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldImageConfiguration extends StObject {
  
  /**
    * The sizing options for the table image configuration.
    */
  var SizingOptions: js.UndefOr[TableCellImageSizingConfiguration] = js.undefined
}
object TableFieldImageConfiguration {
  
  inline def apply(): TableFieldImageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldImageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldImageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSizingOptions(value: TableCellImageSizingConfiguration): Self = StObject.set(x, "SizingOptions", value.asInstanceOf[js.Any])
    
    inline def setSizingOptionsUndefined: Self = StObject.set(x, "SizingOptions", js.undefined)
  }
}
