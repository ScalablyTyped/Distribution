package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtigData extends StObject {
  
  /**
    * The date and time this vulnerability was first observed.
    */
  var firstSeen: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time this vulnerability was last observed.
    */
  var lastSeen: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The commercial sectors this vulnerability targets.
    */
  var targets: js.UndefOr[Targets] = js.undefined
  
  /**
    * The MITRE ATT&amp;CK tactics, techniques, and procedures (TTPs) associated with vulnerability.
    */
  var ttps: js.UndefOr[Ttps] = js.undefined
}
object AtigData {
  
  inline def apply(): AtigData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtigData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtigData] (val x: Self) extends AnyVal {
    
    inline def setFirstSeen(value: js.Date): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
    
    inline def setFirstSeenUndefined: Self = StObject.set(x, "firstSeen", js.undefined)
    
    inline def setLastSeen(value: js.Date): Self = StObject.set(x, "lastSeen", value.asInstanceOf[js.Any])
    
    inline def setLastSeenUndefined: Self = StObject.set(x, "lastSeen", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTtps(value: Ttps): Self = StObject.set(x, "ttps", value.asInstanceOf[js.Any])
    
    inline def setTtpsUndefined: Self = StObject.set(x, "ttps", js.undefined)
    
    inline def setTtpsVarargs(value: Ttp*): Self = StObject.set(x, "ttps", js.Array(value*))
  }
}
