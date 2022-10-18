package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcMetadataMatchMethod extends StObject {
  
  /**
    * The exact method header to be matched on.
    */
  var exact: js.UndefOr[HeaderMatch] = js.undefined
  
  /**
    * The specified beginning characters of the method header to be matched on.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.undefined
  
  var range: js.UndefOr[MatchRange] = js.undefined
  
  /**
    * The regex used to match the method header.
    */
  var regex: js.UndefOr[HeaderMatch] = js.undefined
  
  /**
    * The specified ending characters of the method header to match on.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.undefined
}
object GrpcMetadataMatchMethod {
  
  inline def apply(): GrpcMetadataMatchMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcMetadataMatchMethod]
  }
  
  extension [Self <: GrpcMetadataMatchMethod](x: Self) {
    
    inline def setExact(value: HeaderMatch): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setPrefix(value: HeaderMatch): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRange(value: MatchRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRegex(value: HeaderMatch): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setSuffix(value: HeaderMatch): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
