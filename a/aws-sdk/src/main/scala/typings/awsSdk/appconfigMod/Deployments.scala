package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployments extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[DeploymentList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.undefined
}
object Deployments {
  
  @scala.inline
  def apply(): Deployments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployments]
  }
  
  @scala.inline
  implicit class DeploymentsMutableBuilder[Self <: Deployments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DeploymentList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DeploymentSummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
