package typings.antdMobile

import typings.antdMobile.createErrorBlockMod.ErrorBlockProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBlockMod {
  
  @JSImport("antd-mobile/es/components/error-block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/components/error-block", JSImport.Default)
  @js.native
  val default: FC[ErrorBlockProps] = js.native
  
  inline def createErrorBlock(imageRecord: ImageRecord): FC[ErrorBlockProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorBlock")(imageRecord.asInstanceOf[js.Any]).asInstanceOf[FC[ErrorBlockProps]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.default
    - typings.antdMobile.antdMobileStrings.disconnected
    - typings.antdMobile.antdMobileStrings.empty
    - typings.antdMobile.antdMobileStrings.busy
  */
  trait ErrorBlockStatus extends StObject
  object ErrorBlockStatus {
    
    inline def default: typings.antdMobile.antdMobileStrings.default = "default".asInstanceOf[typings.antdMobile.antdMobileStrings.default]
    
    inline def busy: typings.antdMobile.antdMobileStrings.busy = "busy".asInstanceOf[typings.antdMobile.antdMobileStrings.busy]
    
    inline def disconnected: typings.antdMobile.antdMobileStrings.disconnected = "disconnected".asInstanceOf[typings.antdMobile.antdMobileStrings.disconnected]
    
    inline def empty: typings.antdMobile.antdMobileStrings.empty = "empty".asInstanceOf[typings.antdMobile.antdMobileStrings.empty]
  }
  
  /* Inlined std.Partial<std.Record<antd-mobile.antd-mobile/es/components/error-block.ErrorBlockStatus, string | react.react.ReactNode>> */
  trait ImageRecord extends StObject {
    
    var default: js.UndefOr[String | ReactNode] = js.undefined
    
    var busy: js.UndefOr[String | ReactNode] = js.undefined
    
    var disconnected: js.UndefOr[String | ReactNode] = js.undefined
    
    var empty: js.UndefOr[String | ReactNode] = js.undefined
  }
  object ImageRecord {
    
    inline def apply(): ImageRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageRecord]
    }
    
    extension [Self <: ImageRecord](x: Self) {
      
      inline def setBusy(value: String | ReactNode): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setDefault(value: String | ReactNode): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDisconnected(value: String | ReactNode): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setEmpty(value: String | ReactNode): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    }
  }
}
