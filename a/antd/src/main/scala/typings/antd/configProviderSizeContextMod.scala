package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configProviderSizeContextMod extends Shortcut {
  
  @JSImport("antd/lib/config-provider/SizeContext", JSImport.Default)
  @js.native
  val default: Context[SizeType] = js.native
  
  @JSImport("antd/lib/config-provider/SizeContext", "SizeContextProvider")
  @js.native
  val SizeContextProvider: FC[SizeContextProps] = js.native
  
  trait SizeContextProps extends StObject {
    
    var size: js.UndefOr[SizeType] = js.undefined
  }
  object SizeContextProps {
    
    inline def apply(): SizeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeContextProps]
    }
    
    extension [Self <: SizeContextProps](x: Self) {
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.middle
    - typings.antd.antdStrings.large
    - scala.Unit
  */
  type SizeType = js.UndefOr[_SizeType]
  
  trait _SizeType extends StObject
  
  type _To = Context[SizeType]
  
  /* This means you don't have to write `default`, but can instead just say `configProviderSizeContextMod.foo` */
  override def _to: Context[SizeType] = default
}
