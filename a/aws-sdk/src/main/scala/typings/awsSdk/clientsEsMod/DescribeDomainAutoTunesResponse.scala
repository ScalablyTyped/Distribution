package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainAutoTunesResponse extends StObject {
  
  /**
    * Specifies the list of setting adjustments that Auto-Tune has made to the domain. See the Developer Guide for more information.
    */
  var AutoTunes: js.UndefOr[AutoTuneList] = js.undefined
  
  /**
    * Specifies an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
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
