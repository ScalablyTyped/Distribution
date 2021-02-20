package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNamedQueryOutput extends StObject {
  
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.native
}
object CreateNamedQueryOutput {
  
  @scala.inline
  def apply(): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
  
  @scala.inline
  implicit class CreateNamedQueryOutputMutableBuilder[Self <: CreateNamedQueryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
  }
}
