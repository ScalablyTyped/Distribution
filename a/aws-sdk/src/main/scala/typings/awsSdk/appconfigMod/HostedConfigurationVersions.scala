package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedConfigurationVersions extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[HostedConfigurationVersionSummaryList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.undefined
}
object HostedConfigurationVersions {
  
  @scala.inline
  def apply(): HostedConfigurationVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersions]
  }
  
  @scala.inline
  implicit class HostedConfigurationVersionsMutableBuilder[Self <: HostedConfigurationVersions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: HostedConfigurationVersionSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: HostedConfigurationVersionSummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
