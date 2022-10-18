package typings.antvGLite

import typings.antvGLite.anon.AbsolutePath
import typings.antvGLite.anon.Curve
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.IElement
import typings.antvUtil.libPathTypesMod.CurveArray
import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssPropertiesCsspropertypathMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.anon.AbsolutePath, @antv/g-lite.anon.AbsolutePath> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.anon.AbsolutePath, @antv/g-lite.anon.AbsolutePath>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyPath", "CSSPropertyPath")
  @js.native
  open class CSSPropertyPath () extends StObject {
    
    def calculator(name: String, oldParsed: AbsolutePath, parsed: AbsolutePath): Curve = js.native
    
    def mixer(left: AbsolutePath, right: AbsolutePath, `object`: IElement[Any, Any]): js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]] = js.native
    @JSName("mixer")
    var mixer_Original: js.Function3[
        /* left */ AbsolutePath, 
        /* right */ AbsolutePath, 
        /* object */ IElement[Any, Any], 
        js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]]
      ] = js.native
    
    /**
      * path2Curve
      */
    def parser(path: String, `object`: DisplayObject[Any, Any]): AbsolutePath = js.native
    def parser(path: PathArray, `object`: DisplayObject[Any, Any]): AbsolutePath = js.native
    /**
      * path2Curve
      */
    @JSName("parser")
    var parser_Original: js.Function2[/* path */ String | PathArray, /* object */ DisplayObject[Any, Any], AbsolutePath] = js.native
    
    /**
      * update local position
      */
    def postProcessor(`object`: DisplayObject[Any, Any]): Unit = js.native
  }
}
