package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCellResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the cell.
    */
  var CellArn: js.UndefOr[stringMax256] = js.undefined
  
  /**
    * The name of the cell.
    */
  var CellName: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  /**
    * A list of cell ARNs.
    */
  var Cells: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
    */
  var ParentReadinessScopes: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Tags on the resources.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object UpdateCellResponse {
  
  inline def apply(): UpdateCellResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCellResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCellResponse] (val x: Self) extends AnyVal {
    
    inline def setCellArn(value: stringMax256): Self = StObject.set(x, "CellArn", value.asInstanceOf[js.Any])
    
    inline def setCellArnUndefined: Self = StObject.set(x, "CellArn", js.undefined)
    
    inline def setCellName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
    
    inline def setCellNameUndefined: Self = StObject.set(x, "CellName", js.undefined)
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setParentReadinessScopes(value: listOfString): Self = StObject.set(x, "ParentReadinessScopes", value.asInstanceOf[js.Any])
    
    inline def setParentReadinessScopesUndefined: Self = StObject.set(x, "ParentReadinessScopes", js.undefined)
    
    inline def setParentReadinessScopesVarargs(value: string*): Self = StObject.set(x, "ParentReadinessScopes", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
