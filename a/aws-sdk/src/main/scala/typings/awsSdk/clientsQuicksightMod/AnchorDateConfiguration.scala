package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorDateConfiguration extends StObject {
  
  /**
    * The options for the date configuration. Choose one of the options below:    NOW   
    */
  var AnchorOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AnchorOption] = js.undefined
  
  /**
    * The name of the parameter that is used for the anchor date configuration.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
}
object AnchorDateConfiguration {
  
  inline def apply(): AnchorDateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorDateConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnchorDateConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAnchorOption(value: AnchorOption): Self = StObject.set(x, "AnchorOption", value.asInstanceOf[js.Any])
    
    inline def setAnchorOptionUndefined: Self = StObject.set(x, "AnchorOption", js.undefined)
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
  }
}
