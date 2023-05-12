package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAliasesResponse extends StObject {
  
  /**
    * A token for getting the next set of aliases, if more aliases exist.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of SageMaker image version aliases.
    */
  var SageMakerImageVersionAliases: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SageMakerImageVersionAliases] = js.undefined
}
object ListAliasesResponse {
  
  inline def apply(): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAliasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAliasesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSageMakerImageVersionAliases(value: SageMakerImageVersionAliases): Self = StObject.set(x, "SageMakerImageVersionAliases", value.asInstanceOf[js.Any])
    
    inline def setSageMakerImageVersionAliasesUndefined: Self = StObject.set(x, "SageMakerImageVersionAliases", js.undefined)
    
    inline def setSageMakerImageVersionAliasesVarargs(value: SageMakerImageVersionAlias*): Self = StObject.set(x, "SageMakerImageVersionAliases", js.Array(value*))
  }
}
