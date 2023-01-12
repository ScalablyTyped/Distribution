package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.antdMobileStrings.`scale-down`
import typings.antdMobile.antdMobileStrings.contain
import typings.antdMobile.antdMobileStrings.cover
import typings.antdMobile.antdMobileStrings.fill
import typings.antdMobile.antdMobileStrings.none
import typings.antdMobile.esComponentsImageUploaderImageUploaderMod.TaskStatus
import typings.react.mod.FC
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageUploaderPreviewItemMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/image-uploader/preview-item", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var deletable: Boolean
    
    var file: js.UndefOr[File] = js.undefined
    
    var imageFit: js.UndefOr[contain | cover | fill | none | `scale-down`] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDelete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var status: js.UndefOr[TaskStatus] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(deletable: Boolean): Props = {
      val __obj = js.Dynamic.literal(deletable = deletable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setImageFit(value: contain | cover | fill | none | `scale-down`): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      inline def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDelete(value: () => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction0(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsImageUploaderPreviewItemMod.foo` */
  override def _to: FC[Props] = default
}
