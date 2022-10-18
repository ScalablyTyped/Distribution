package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var key: SessionFilterKey
  
  /**
    * The filter value. Valid values for each filter key are as follows:   InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.   InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.   Target: Specify a managed node to which session connections have been made.   Owner: Specify an Amazon Web Services user account to see a list of sessions started by that user.   Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:   Connected   Connecting   Disconnected   Terminated   Terminating   Failed     SessionId: Specify a session ID to return details about the session.  
    */
  var value: SessionFilterValue
}
object SessionFilter {
  
  inline def apply(key: SessionFilterKey, value: SessionFilterValue): SessionFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionFilter]
  }
  
  extension [Self <: SessionFilter](x: Self) {
    
    inline def setKey(value: SessionFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SessionFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
