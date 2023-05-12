package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshConfiguration extends StObject {
  
  /**
    * The incremental refresh for the dataset.
    */
  var IncrementalRefresh: typings.awsSdk.clientsQuicksightMod.IncrementalRefresh
}
object RefreshConfiguration {
  
  inline def apply(IncrementalRefresh: IncrementalRefresh): RefreshConfiguration = {
    val __obj = js.Dynamic.literal(IncrementalRefresh = IncrementalRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIncrementalRefresh(value: IncrementalRefresh): Self = StObject.set(x, "IncrementalRefresh", value.asInstanceOf[js.Any])
  }
}
