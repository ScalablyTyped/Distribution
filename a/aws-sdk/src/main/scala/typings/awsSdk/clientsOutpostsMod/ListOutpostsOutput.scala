package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsOutput extends StObject {
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  var Outposts: js.UndefOr[outpostListDefinition] = js.undefined
}
object ListOutpostsOutput {
  
  inline def apply(): ListOutpostsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOutpostsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutposts(value: outpostListDefinition): Self = StObject.set(x, "Outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "Outposts", js.undefined)
    
    inline def setOutpostsVarargs(value: Outpost*): Self = StObject.set(x, "Outposts", js.Array(value*))
  }
}
