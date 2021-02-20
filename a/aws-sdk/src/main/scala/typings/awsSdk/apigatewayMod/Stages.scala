package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stages extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var item: js.UndefOr[ListOfStage] = js.native
}
object Stages {
  
  @scala.inline
  def apply(): Stages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stages]
  }
  
  @scala.inline
  implicit class StagesMutableBuilder[Self <: Stages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfStage): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: Stage*): Self = StObject.set(x, "item", js.Array(value :_*))
  }
}
