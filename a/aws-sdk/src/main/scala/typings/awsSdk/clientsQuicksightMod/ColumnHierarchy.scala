package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHierarchy extends StObject {
  
  /**
    * The option that determines the hierarchy of any DateTime fields.
    */
  var DateTimeHierarchy: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeHierarchy] = js.undefined
  
  /**
    * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields can't be duplicated to other visuals.
    */
  var ExplicitHierarchy: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExplicitHierarchy] = js.undefined
  
  /**
    * The option that determines the hierarchy of the fields that are defined during data preparation. These fields are available to use in any analysis that uses the data source.
    */
  var PredefinedHierarchy: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PredefinedHierarchy] = js.undefined
}
object ColumnHierarchy {
  
  inline def apply(): ColumnHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnHierarchy] (val x: Self) extends AnyVal {
    
    inline def setDateTimeHierarchy(value: DateTimeHierarchy): Self = StObject.set(x, "DateTimeHierarchy", value.asInstanceOf[js.Any])
    
    inline def setDateTimeHierarchyUndefined: Self = StObject.set(x, "DateTimeHierarchy", js.undefined)
    
    inline def setExplicitHierarchy(value: ExplicitHierarchy): Self = StObject.set(x, "ExplicitHierarchy", value.asInstanceOf[js.Any])
    
    inline def setExplicitHierarchyUndefined: Self = StObject.set(x, "ExplicitHierarchy", js.undefined)
    
    inline def setPredefinedHierarchy(value: PredefinedHierarchy): Self = StObject.set(x, "PredefinedHierarchy", value.asInstanceOf[js.Any])
    
    inline def setPredefinedHierarchyUndefined: Self = StObject.set(x, "PredefinedHierarchy", js.undefined)
  }
}
