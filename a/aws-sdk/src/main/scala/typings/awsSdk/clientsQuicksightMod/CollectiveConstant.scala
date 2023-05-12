package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectiveConstant extends StObject {
  
  /**
    * A list of values for the collective constant.
    */
  var ValueList: js.UndefOr[StringList] = js.undefined
}
object CollectiveConstant {
  
  inline def apply(): CollectiveConstant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectiveConstant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectiveConstant] (val x: Self) extends AnyVal {
    
    inline def setValueList(value: StringList): Self = StObject.set(x, "ValueList", value.asInstanceOf[js.Any])
    
    inline def setValueListUndefined: Self = StObject.set(x, "ValueList", js.undefined)
    
    inline def setValueListVarargs(value: String*): Self = StObject.set(x, "ValueList", js.Array(value*))
  }
}
