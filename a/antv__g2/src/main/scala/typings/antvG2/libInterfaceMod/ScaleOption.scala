package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScaleConfig * / any */ trait ScaleOption extends StObject {
  
  /**
    * @title 唯一 ID
    * @description
    * 用于声明使用数据记录中的哪些字段来组成一条数据的唯一 id（如有多个字段，则使用 '-' 连接）。
    * 数据 id 用于标识 Element 图形元素，应用于 Geometry 中的图形元素 Element 更新。
    * 默认 G2 内部会有一套 ID 生成规则，如果不能满足用户需求，用户既可以使用该属性配置 id。
    * @example
    * 下面的例子中，声明了将 'x' 和 'y' 字段的数值来作为每条数据记录的 id，即下面数据两条数据的 id 分别为：'1-23' 和 '2-2'。
    * ```ts
    * const data = [
    *   { x: 1, y: 23, z: 'a' },
    *   { x: 2, y: 2, z: 'b' },
    * ];
    *
    * chart.scale({
    *   x: { key: true },
    *   y: { key: true },
    * });
    * ```
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否显示最后的 tick
    * @description 只对 `type: 'cat'` 以及 `type: 'time-cat'` 的 scale 生效，强制显示最后的日期 tick。
    */
  var showLast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 同步 scale
    *
    * @example
    * ```ts
    * chart.scale({
    *   x: { sync: true },
    *   y: { sync: true },
    *   x1: { sync: 'x1' },
    *   x2: { sync: 'x1' },
    * });
    * ```
    *
    * 通过以上配置，我们会分别对 x 和 y 两个字段，x1 和 x2 两个字段进行同步度量操作。
    */
  var sync: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * @title 声明度量类型。
    */
  var `type`: js.UndefOr[ScaleType] = js.undefined
}
object ScaleOption {
  
  inline def apply(): ScaleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleOption]
  }
  
  extension [Self <: ScaleOption](x: Self) {
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setShowLast(value: Boolean): Self = StObject.set(x, "showLast", value.asInstanceOf[js.Any])
    
    inline def setShowLastUndefined: Self = StObject.set(x, "showLast", js.undefined)
    
    inline def setSync(value: Boolean | String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setType(value: ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
