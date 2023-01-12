package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchFilterGroup extends StObject {
  
  /**
    * The set of patch filters that make up the group.
    */
  var PatchFilters: PatchFilterList
}
object PatchFilterGroup {
  
  inline def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchFilterGroup] (val x: Self) extends AnyVal {
    
    inline def setPatchFilters(value: PatchFilterList): Self = StObject.set(x, "PatchFilters", value.asInstanceOf[js.Any])
    
    inline def setPatchFiltersVarargs(value: PatchFilter*): Self = StObject.set(x, "PatchFilters", js.Array(value*))
  }
}
