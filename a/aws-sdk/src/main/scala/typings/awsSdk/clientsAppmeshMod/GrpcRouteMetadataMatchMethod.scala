package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRouteMetadataMatchMethod extends StObject {
  
  /**
    * The value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[HeaderMatch] = js.undefined
  
  /**
    * The value sent by the client must begin with the specified characters.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.undefined
  
  /**
    * An object that represents the range of values to match on.
    */
  var range: js.UndefOr[MatchRange] = js.undefined
  
  /**
    * The value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[HeaderMatch] = js.undefined
  
  /**
    * The value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.undefined
}
object GrpcRouteMetadataMatchMethod {
  
  inline def apply(): GrpcRouteMetadataMatchMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcRouteMetadataMatchMethod]
  }
  
  extension [Self <: GrpcRouteMetadataMatchMethod](x: Self) {
    
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
