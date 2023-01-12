package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCount extends StObject {
  
  /**
    * The total number of findings in the group of query results.
    */
  var count: js.UndefOr[long] = js.undefined
  
  /**
    * The name of the property that defines the group in the query results, as specified by the groupBy property in the query request.
    */
  var groupKey: js.UndefOr[string] = js.undefined
}
object GroupCount {
  
  inline def apply(): GroupCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupCount] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setGroupKey(value: string): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
  }
}
