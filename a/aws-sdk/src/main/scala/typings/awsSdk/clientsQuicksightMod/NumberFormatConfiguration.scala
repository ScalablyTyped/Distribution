package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatConfiguration extends StObject {
  
  /**
    * The options that determine the numeric format configuration.
    */
  var FormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined
}
object NumberFormatConfiguration {
  
  inline def apply(): NumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFormatConfiguration(value: NumericFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
  }
}
