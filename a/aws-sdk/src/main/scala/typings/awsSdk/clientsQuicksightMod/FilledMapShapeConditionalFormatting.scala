package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapShapeConditionalFormatting extends StObject {
  
  /**
    * The field ID of the filled map shape.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The conditional formatting that determines the background color of a filled map's shape.
    */
  var Format: js.UndefOr[ShapeConditionalFormat] = js.undefined
}
object FilledMapShapeConditionalFormatting {
  
  inline def apply(FieldId: FieldId): FilledMapShapeConditionalFormatting = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilledMapShapeConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapShapeConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ShapeConditionalFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
  }
}
