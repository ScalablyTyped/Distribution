package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the cell.
    */
  var CellArn: stringMax256
  
  /**
    * The name of the cell.
    */
  var CellName: stringMax64PatternAAZAZ09Z
  
  /**
    * A list of cell ARNs.
    */
  var Cells: listOfString
  
  /**
    * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
    */
  var ParentReadinessScopes: listOfString
  
  /**
    * Tags on the resources.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object CellOutput {
  
  inline def apply(
    CellArn: stringMax256,
    CellName: stringMax64PatternAAZAZ09Z,
    Cells: listOfString,
    ParentReadinessScopes: listOfString
  ): CellOutput = {
    val __obj = js.Dynamic.literal(CellArn = CellArn.asInstanceOf[js.Any], CellName = CellName.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], ParentReadinessScopes = ParentReadinessScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellOutput] (val x: Self) extends AnyVal {
    
    inline def setCellArn(value: stringMax256): Self = StObject.set(x, "CellArn", value.asInstanceOf[js.Any])
    
    inline def setCellName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setParentReadinessScopes(value: listOfString): Self = StObject.set(x, "ParentReadinessScopes", value.asInstanceOf[js.Any])
    
    inline def setParentReadinessScopesVarargs(value: string*): Self = StObject.set(x, "ParentReadinessScopes", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
