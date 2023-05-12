package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ShapeSchemaValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width[RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */] extends StObject {
  
  var radius: Record[RadiusScaleValues, ShapeSchemaValue]
  
  var width: Record[SizeScaleValues, ShapeSchemaValue]
}
object Width {
  
  inline def apply[RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */](
    radius: Record[RadiusScaleValues, ShapeSchemaValue],
    width: Record[SizeScaleValues, ShapeSchemaValue]
  ): Width[RadiusScaleValues, SizeScaleValues] = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[RadiusScaleValues, SizeScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Width[?, ?], RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */] (val x: Self & (Width[RadiusScaleValues, SizeScaleValues])) extends AnyVal {
    
    inline def setRadius(value: Record[RadiusScaleValues, ShapeSchemaValue]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Record[SizeScaleValues, ShapeSchemaValue]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
