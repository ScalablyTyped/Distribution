package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamedQueryOutput extends StObject {
  
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[typings.awsSdk.athenaMod.NamedQuery] = js.native
}
object GetNamedQueryOutput {
  
  @scala.inline
  def apply(): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
  
  @scala.inline
  implicit class GetNamedQueryOutputMutableBuilder[Self <: GetNamedQueryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedQuery(value: NamedQuery): Self = StObject.set(x, "NamedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryUndefined: Self = StObject.set(x, "NamedQuery", js.undefined)
  }
}
