package typings.antDesignPro.anon

import typings.antDesignPro.antDesignProStrings.x
import typings.antDesignPro.antDesignProStrings.y
import typings.bizcharts.mod.CoordType
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.CoordProps> */
trait ReadonlyCoordProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val endAngle: js.UndefOr[Double] = js.undefined
  
  val innerRadius: js.UndefOr[Double] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val radius: js.UndefOr[Double] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val reflect: js.UndefOr[x | y] = js.undefined
  
  val rotate: js.UndefOr[Double] = js.undefined
  
  val scale: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  val startAngle: js.UndefOr[Double] = js.undefined
  
  val transpose: js.UndefOr[Boolean] = js.undefined
  
  val `type`: js.UndefOr[CoordType] = js.undefined
}
object ReadonlyCoordProps {
  
  inline def apply(): ReadonlyCoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCoordProps]
  }
  
  extension [Self <: ReadonlyCoordProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setReflect(value: typings.antDesignPro.antDesignProStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    
    inline def setType(value: CoordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
