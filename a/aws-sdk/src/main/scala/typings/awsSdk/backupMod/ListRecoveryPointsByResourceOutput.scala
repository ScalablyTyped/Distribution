package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecoveryPointsByResourceOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of objects that contain detailed information about recovery points of the specified resource type.
    */
  var RecoveryPoints: js.UndefOr[RecoveryPointByResourceList] = js.native
}
object ListRecoveryPointsByResourceOutput {
  
  @scala.inline
  def apply(): ListRecoveryPointsByResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsByResourceOutput]
  }
  
  @scala.inline
  implicit class ListRecoveryPointsByResourceOutputMutableBuilder[Self <: ListRecoveryPointsByResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecoveryPoints(value: RecoveryPointByResourceList): Self = StObject.set(x, "RecoveryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointsUndefined: Self = StObject.set(x, "RecoveryPoints", js.undefined)
    
    @scala.inline
    def setRecoveryPointsVarargs(value: RecoveryPointByResource*): Self = StObject.set(x, "RecoveryPoints", js.Array(value :_*))
  }
}
