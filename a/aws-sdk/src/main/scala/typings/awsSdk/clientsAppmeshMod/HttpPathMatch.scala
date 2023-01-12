package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpPathMatch extends StObject {
  
  /**
    * The exact path to match on.
    */
  var exact: js.UndefOr[HttpPathExact] = js.undefined
  
  /**
    * The regex used to match the path.
    */
  var regex: js.UndefOr[HttpPathRegex] = js.undefined
}
object HttpPathMatch {
  
  inline def apply(): HttpPathMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpPathMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpPathMatch] (val x: Self) extends AnyVal {
    
    inline def setExact(value: HttpPathExact): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setRegex(value: HttpPathRegex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
