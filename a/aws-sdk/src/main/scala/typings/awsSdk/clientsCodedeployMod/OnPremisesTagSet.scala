package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesTagSet extends StObject {
  
  /**
    * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined
}
object OnPremisesTagSet {
  
  inline def apply(): OnPremisesTagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesTagSet]
  }
  
  extension [Self <: OnPremisesTagSet](x: Self) {
    
    inline def setOnPremisesTagSetList(value: OnPremisesTagSetList): Self = StObject.set(x, "onPremisesTagSetList", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesTagSetListUndefined: Self = StObject.set(x, "onPremisesTagSetList", js.undefined)
    
    inline def setOnPremisesTagSetListVarargs(value: TagFilterList*): Self = StObject.set(x, "onPremisesTagSetList", js.Array(value*))
  }
}
