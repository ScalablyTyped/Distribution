package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.uploadInterfaceMod.UploadProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggerMod extends Shortcut {
  
  @JSImport("antd/lib/upload/Dragger", JSImport.Default)
  @js.native
  val default: FC[DraggerProps] = js.native
  
  trait DraggerProps
    extends StObject
       with UploadProps[js.Any] {
    
    var height: js.UndefOr[Double] = js.undefined
  }
  object DraggerProps {
    
    @scala.inline
    def apply(): DraggerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggerProps]
    }
    
    @scala.inline
    implicit class DraggerPropsMutableBuilder[Self <: DraggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
  
  type _To = FC[DraggerProps]
  
  /* This means you don't have to write `default`, but can instead just say `draggerMod.foo` */
  override def _to: FC[DraggerProps] = default
}
