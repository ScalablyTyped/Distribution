package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderMatchMethod extends StObject {
  
  /**
    * The value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * The value sent by the client must begin with the specified characters.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * An object that represents the range of values to match on.
    */
  var range: js.UndefOr[MatchRange] = js.native
  
  /**
    * The value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * The value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.native
}
object HeaderMatchMethod {
  
  @scala.inline
  def apply(): HeaderMatchMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderMatchMethod]
  }
  
  @scala.inline
  implicit class HeaderMatchMethodMutableBuilder[Self <: HeaderMatchMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: HeaderMatch): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setPrefix(value: HeaderMatch): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRange(value: MatchRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRegex(value: HeaderMatch): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setSuffix(value: HeaderMatch): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
