package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineCustomLabelConfiguration extends StObject {
  
  /**
    * The string text of the custom label.
    */
  var CustomLabel: NonEmptyString
}
object ReferenceLineCustomLabelConfiguration {
  
  inline def apply(CustomLabel: NonEmptyString): ReferenceLineCustomLabelConfiguration = {
    val __obj = js.Dynamic.literal(CustomLabel = CustomLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLineCustomLabelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineCustomLabelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: NonEmptyString): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
  }
}
