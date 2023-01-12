package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsOutput extends StObject {
  
  /**
    * 
    */
  var Components: js.UndefOr[ComponentSummaryList] = js.undefined
  
  /**
    * 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmsapMod.NextToken] = js.undefined
}
object ListComponentsOutput {
  
  inline def apply(): ListComponentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComponentsOutput] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: ComponentSummaryList): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "Components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentSummary*): Self = StObject.set(x, "Components", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
