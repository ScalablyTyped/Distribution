package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainAutoTunesResponse extends StObject {
  
  /**
    * The list of setting adjustments that Auto-Tune has made to the domain.
    */
  var AutoTunes: js.UndefOr[AutoTuneList] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribeDomainAutoTunesResponse {
  
  inline def apply(): DescribeDomainAutoTunesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainAutoTunesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainAutoTunesResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoTunes(value: AutoTuneList): Self = StObject.set(x, "AutoTunes", value.asInstanceOf[js.Any])
    
    inline def setAutoTunesUndefined: Self = StObject.set(x, "AutoTunes", js.undefined)
    
    inline def setAutoTunesVarargs(value: AutoTune*): Self = StObject.set(x, "AutoTunes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
