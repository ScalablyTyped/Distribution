package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  /**
    * The name of the time zone, following the  IANA time zone standard. For example, America/Los_Angeles.
    */
  var Name: String
  
  /**
    * The time zone's offset, in seconds, from UTC.
    */
  var Offset: js.UndefOr[Integer] = js.undefined
}
object TimeZone {
  
  inline def apply(Name: String): TimeZone = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Integer): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
  }
}
