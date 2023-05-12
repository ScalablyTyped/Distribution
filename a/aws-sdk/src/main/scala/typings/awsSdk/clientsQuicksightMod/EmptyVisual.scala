package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyVisual extends StObject {
  
  /**
    * The list of custom actions that are configured for a visual.
    */
  var Actions: js.UndefOr[VisualCustomActionList] = js.undefined
  
  /**
    * The data set that is used in the empty visual. Every visual requires a dataset to render.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
  
  /**
    * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
    */
  var VisualId: ShortRestrictiveResourceId
}
object EmptyVisual {
  
  inline def apply(DataSetIdentifier: DataSetIdentifier, VisualId: ShortRestrictiveResourceId): EmptyVisual = {
    val __obj = js.Dynamic.literal(DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any], VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyVisual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyVisual] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VisualCustomActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VisualCustomAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVisualId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
