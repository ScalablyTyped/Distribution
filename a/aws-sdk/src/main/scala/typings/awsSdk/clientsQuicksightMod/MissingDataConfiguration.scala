package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingDataConfiguration extends StObject {
  
  /**
    * The treatment option that determines how missing data should be rendered. Choose from the following options:    INTERPOLATE: Interpolate missing values between the prior and the next known value.    SHOW_AS_ZERO: Show missing values as the value 0.    SHOW_AS_BLANK: Display a blank space when rendering missing data.  
    */
  var TreatmentOption: js.UndefOr[MissingDataTreatmentOption] = js.undefined
}
object MissingDataConfiguration {
  
  inline def apply(): MissingDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissingDataConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingDataConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTreatmentOption(value: MissingDataTreatmentOption): Self = StObject.set(x, "TreatmentOption", value.asInstanceOf[js.Any])
    
    inline def setTreatmentOptionUndefined: Self = StObject.set(x, "TreatmentOption", js.undefined)
  }
}
