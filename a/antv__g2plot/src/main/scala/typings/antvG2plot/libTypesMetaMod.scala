package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMetaMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScaleConfig * / any */ trait Meta extends StObject {
    
    /**
      * @title 是否进行 scale 的同步
      * @description 设置为 false 则不同步； 设置为 true 则以 field 为 key 进行同步；设置为 string，则以这个 string 为 key 进行同步
      */
    val sync: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * @title mescale 的 type 类型ta
      * @description 对于连续的，一般是 linear，对于分类一般为 cat。当然也有 log, pow, time 等类型，或者通过 tickMethod 自定义自己的 scale
      */
    val `type`: js.UndefOr[String] = js.undefined
  }
  object Meta {
    
    inline def apply(): Meta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setSync(value: Boolean | String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
