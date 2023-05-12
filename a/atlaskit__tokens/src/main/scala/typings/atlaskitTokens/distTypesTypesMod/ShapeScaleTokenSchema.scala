package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeScaleTokenSchema[RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */] extends StObject {
  
  var border: Width[RadiusScaleValues, SizeScaleValues]
}
object ShapeScaleTokenSchema {
  
  inline def apply[RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */](border: Width[RadiusScaleValues, SizeScaleValues]): ShapeScaleTokenSchema[RadiusScaleValues, SizeScaleValues] = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeScaleTokenSchema[RadiusScaleValues, SizeScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeScaleTokenSchema[?, ?], RadiusScaleValues /* <: String */, SizeScaleValues /* <: String */] (val x: Self & (ShapeScaleTokenSchema[RadiusScaleValues, SizeScaleValues])) extends AnyVal {
    
    inline def setBorder(value: Width[RadiusScaleValues, SizeScaleValues]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
