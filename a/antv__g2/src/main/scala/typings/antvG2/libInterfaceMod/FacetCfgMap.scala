package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetCfgMap extends StObject {
  
  /**
    * @title circle 类型分面配置
    */
  val circle: CircleCfg
  
  /**
    * @title list 类型分面配置
    */
  val list: ListCfg
  
  /**
    * @title matrix 类型分面配置
    */
  val matrix: MatrixCfg
  
  /**
    * @title mirror 类型分面配置
    */
  val mirror: MirrorCfg
  
  /**
    * @title rect 类型分面配置
    */
  val rect: RectCfg
  
  /**
    * @title tree 类型分面配置
    */
  val tree: TreeCfg
}
object FacetCfgMap {
  
  inline def apply(
    circle: CircleCfg,
    list: ListCfg,
    matrix: MatrixCfg,
    mirror: MirrorCfg,
    rect: RectCfg,
    tree: TreeCfg
  ): FacetCfgMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetCfgMap]
  }
  
  extension [Self <: FacetCfgMap](x: Self) {
    
    inline def setCircle(value: CircleCfg): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setList(value: ListCfg): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: MatrixCfg): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: MirrorCfg): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setRect(value: RectCfg): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setTree(value: TreeCfg): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
