package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentStrategies extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[DeploymentStrategyList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.native
}
object DeploymentStrategies {
  
  @scala.inline
  def apply(): DeploymentStrategies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategies]
  }
  
  @scala.inline
  implicit class DeploymentStrategiesMutableBuilder[Self <: DeploymentStrategies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DeploymentStrategyList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DeploymentStrategy*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
