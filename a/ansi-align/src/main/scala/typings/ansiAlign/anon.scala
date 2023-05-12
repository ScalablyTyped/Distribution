package typings.ansiAlign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[typings.ansiAlign.mod.Align] = js.undefined
    
    var pad: js.UndefOr[String] = js.undefined
    
    var split: js.UndefOr[String] = js.undefined
  }
  object Align {
    
    inline def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: typings.ansiAlign.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  trait Pad extends StObject {
    
    var align: js.UndefOr[typings.ansiAlign.mod.Align] = js.undefined
    
    var pad: js.UndefOr[String] = js.undefined
  }
  object Pad {
    
    inline def apply(): Pad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pad]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: typings.ansiAlign.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    }
  }
}
