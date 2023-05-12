package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldURLConfiguration extends StObject {
  
  /**
    * The image configuration of a table field URL.
    */
  var ImageConfiguration: js.UndefOr[TableFieldImageConfiguration] = js.undefined
  
  /**
    * The link configuration of a table field URL.
    */
  var LinkConfiguration: js.UndefOr[TableFieldLinkConfiguration] = js.undefined
}
object TableFieldURLConfiguration {
  
  inline def apply(): TableFieldURLConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldURLConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldURLConfiguration] (val x: Self) extends AnyVal {
    
    inline def setImageConfiguration(value: TableFieldImageConfiguration): Self = StObject.set(x, "ImageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageConfigurationUndefined: Self = StObject.set(x, "ImageConfiguration", js.undefined)
    
    inline def setLinkConfiguration(value: TableFieldLinkConfiguration): Self = StObject.set(x, "LinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLinkConfigurationUndefined: Self = StObject.set(x, "LinkConfiguration", js.undefined)
  }
}
