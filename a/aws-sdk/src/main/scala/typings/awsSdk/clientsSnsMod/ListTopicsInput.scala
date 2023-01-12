package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicsInput extends StObject {
  
  /**
    * Token returned by the previous ListTopics request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}
object ListTopicsInput {
  
  inline def apply(): ListTopicsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTopicsInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
