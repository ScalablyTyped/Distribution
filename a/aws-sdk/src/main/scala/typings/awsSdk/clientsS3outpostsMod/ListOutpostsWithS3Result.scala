package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsWithS3Result extends StObject {
  
  /**
    * Returns a token that you can use to call ListOutpostsWithS3 again and receive additional results, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
  
  /**
    * Returns the list of Outposts that have the following characteristics:   outposts that have S3 provisioned   outposts that are Active (not pending any provisioning nor decommissioned)   outposts to which the the calling Amazon Web Services account has access  
    */
  var Outposts: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.Outposts] = js.undefined
}
object ListOutpostsWithS3Result {
  
  inline def apply(): ListOutpostsWithS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsWithS3Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOutpostsWithS3Result] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutposts(value: Outposts): Self = StObject.set(x, "Outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "Outposts", js.undefined)
    
    inline def setOutpostsVarargs(value: Outpost*): Self = StObject.set(x, "Outposts", js.Array(value*))
  }
}
