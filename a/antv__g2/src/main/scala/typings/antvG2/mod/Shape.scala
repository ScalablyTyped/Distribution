package typings.antvG2.mod

import typings.antvG2.anon.Draw
import typings.antvG2.anon.DrawShape
import typings.antvG2.anon.ParsePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends StObject {
  
  var getLinearValue: js.UndefOr[js.Function1[/* percent */ js.Any, _]] = js.native
  
  var registerShape: js.UndefOr[
    js.Function3[
      /* chartType */ String, 
      /* shapeName */ String, 
      /* config */ Draw | DrawShape, 
      ParsePath
    ]
  ] = js.native
}
object Shape {
  
  @JSImport("@antv/g2", "Shape")
  @js.native
  val ^ : Shape = js.native
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLinearValue(value: /* percent */ js.Any => _): Self = StObject.set(x, "getLinearValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLinearValueUndefined: Self = StObject.set(x, "getLinearValue", js.undefined)
    
    @scala.inline
    def setRegisterShape(
      value: (/* chartType */ String, /* shapeName */ String, /* config */ Draw | DrawShape) => ParsePath
    ): Self = StObject.set(x, "registerShape", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegisterShapeUndefined: Self = StObject.set(x, "registerShape", js.undefined)
  }
}
