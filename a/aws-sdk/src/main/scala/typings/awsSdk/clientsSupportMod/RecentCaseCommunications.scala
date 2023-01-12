package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecentCaseCommunications extends StObject {
  
  /**
    * The five most recent communications associated with the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object RecentCaseCommunications {
  
  inline def apply(): RecentCaseCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentCaseCommunications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecentCaseCommunications] (val x: Self) extends AnyVal {
    
    inline def setCommunications(value: CommunicationList): Self = StObject.set(x, "communications", value.asInstanceOf[js.Any])
    
    inline def setCommunicationsUndefined: Self = StObject.set(x, "communications", js.undefined)
    
    inline def setCommunicationsVarargs(value: Communication*): Self = StObject.set(x, "communications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
