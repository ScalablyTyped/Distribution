package typings.antvComponent

import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridBaseMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/grid/base", JSImport.Default)
  @js.native
  open class default[T /* <: GroupComponentCfg */] () extends GridBase[T]
  
  @js.native
  trait GridBase[T /* <: GroupComponentCfg */]
    extends typings.antvComponent.libAbstractGroupComponentMod.default[T] {
    
    /* private */ var drawAlternateRegion: Any = js.native
    
    /* private */ var drawGrid: Any = js.native
    
    /* protected */ def getAlternatePath(prePoints: js.Array[Point], points: js.Array[Point]): js.Array[Any] = js.native
    
    /**
      * 获取栅格线的路径
      * @param  {Point[]} points   栅格线的点集合
      * @param  {boolean} reversed 顺序是否相反
      * @return {any[]}            路径
      */
    /* protected */ def getGridPath(points: js.Array[Point]): js.Array[Any] = js.native
    /* protected */ def getGridPath(points: js.Array[Point], reversed: Boolean): js.Array[Any] = js.native
    
    /**
      * 获取栅格线的类型
      * @return {string} 栅格线类型
      */
    /* protected */ def getLineType(): String = js.native
    
    /* private */ var getPathStyle: Any = js.native
  }
}
