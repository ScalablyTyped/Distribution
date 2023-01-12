package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSUnitValue
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserTransformMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeMatrix(translate: Any, scale: Any, skew: Any, quat: Any, perspective: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeMatrix")(translate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def convertItemToMatrix(item: ParsedTransform): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertItemToMatrix")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform]): js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ]]
  inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform], target: DisplayObject[Any, Any]): js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[js.Array[Double]], 
    js.Array[js.Array[Double]], 
    js.Function1[/* d */ js.Array[js.Array[Double]], String]
  ]]
  
  inline def parseTransform(string: String): js.Array[ParsedTransform] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransform")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedTransform]]
  
  trait ParsedTransform extends StObject {
    
    var d: js.Array[CSSUnitValue]
    
    var t: String
  }
  object ParsedTransform {
    
    inline def apply(d: js.Array[CSSUnitValue], t: String): ParsedTransform = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedTransform] (val x: Self) extends AnyVal {
      
      inline def setD(value: js.Array[CSSUnitValue]): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDVarargs(value: CSSUnitValue*): Self = StObject.set(x, "d", js.Array(value*))
      
      inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
