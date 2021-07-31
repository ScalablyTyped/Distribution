package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminationHealth extends StObject {
  
  /**
    * The source IP address.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
}
object TerminationHealth {
  
  @scala.inline
  def apply(): TerminationHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminationHealth]
  }
  
  @scala.inline
  implicit class TerminationHealthMutableBuilder[Self <: TerminationHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
