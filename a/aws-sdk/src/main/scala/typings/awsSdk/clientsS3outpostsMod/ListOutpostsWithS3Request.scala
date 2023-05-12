package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsWithS3Request extends StObject {
  
  /**
    * The maximum number of Outposts to return. The limit is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.MaxResults] = js.undefined
  
  /**
    * When you can get additional results from the ListOutpostsWithS3 call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional Outposts.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
}
object ListOutpostsWithS3Request {
  
  inline def apply(): ListOutpostsWithS3Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsWithS3Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOutpostsWithS3Request] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
