package typings.antvG2

import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.Data
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.ScaleOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalePoolMod {
  
  @JSImport("@antv/g2/lib/chart/util/scale-pool", "ScalePool")
  @js.native
  open class ScalePool () extends StObject {
    
    /**
      * 缓存一个 scale
      * @param scale
      * @param scaleDef
      * @param key
      */
    /* private */ var cacheScale: Any = js.native
    
    /**
      * 清空
      */
    def clear(): Unit = js.native
    
    /**
      * 创建 scale
      * @param field
      * @param data
      * @param scaleDef
      * @param key
      */
    def createScale(field: String, data: Data, scaleDef: ScaleOption, key: String): Any = js.native
    
    /**
      * 在 view 销毁的时候，删除 scale 实例，防止内存泄露
      * @param key
      */
    def deleteScale(key: String): Unit = js.native
    
    /**
      * 通过 key 获取 scale
      * @param key
      */
    def getScale(key: String): Any = js.native
    
    /**
      * 通过 key 获取 scale
      * @param key
      */
    /* private */ var getScaleMeta: Any = js.native
    
    /**
      * get sync key
      * @param sm
      */
    /* private */ var getSyncKey: Any = js.native
    
    /**
      * 删除 sync scale 引用
      * @param key
      */
    /* private */ var removeFromSyncScales: Any = js.native
    
    /** 所有的 scales */
    /* private */ var scales: Any = js.native
    
    /**
      * 同步 scale
      */
    def sync(coordinate: Coordinate): Unit = js.native
    def sync(coordinate: Coordinate, theme: String): Unit = js.native
    def sync(coordinate: Coordinate, theme: LooseObject): Unit = js.native
    
    /** 需要同步的 scale 分组， key: scaleKeyArray */
    /* private */ var syncScales: Any = js.native
  }
}
