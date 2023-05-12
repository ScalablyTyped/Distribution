package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullValueFormatConfiguration extends StObject {
  
  /**
    * Determines the null string of null values.
    */
  var NullString: typings.awsSdk.clientsQuicksightMod.NullString
}
object NullValueFormatConfiguration {
  
  inline def apply(NullString: NullString): NullValueFormatConfiguration = {
    val __obj = js.Dynamic.literal(NullString = NullString.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullValueFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullValueFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNullString(value: NullString): Self = StObject.set(x, "NullString", value.asInstanceOf[js.Any])
  }
}
