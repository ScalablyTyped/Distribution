package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerPropsTypeMod {
  
  trait ImagePickerPropTypes extends StObject {
    
    var files: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* files */ js.Array[js.Object], 
          /* operationType */ String, 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var onImageClick: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
      ] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[js.Object] = js.undefined
  }
  object ImagePickerPropTypes {
    
    inline def apply(): ImagePickerPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerPropTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImagePickerPropTypes] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setOnAddImageClick(value: () => Unit): Self = StObject.set(x, "onAddImageClick", js.Any.fromFunction0(value))
      
      inline def setOnAddImageClickUndefined: Self = StObject.set(x, "onAddImageClick", js.undefined)
      
      inline def setOnChange(
        value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFail(value: /* msg */ String => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction1(value))
      
      inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      inline def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit): Self = StObject.set(x, "onImageClick", js.Any.fromFunction2(value))
      
      inline def setOnImageClickUndefined: Self = StObject.set(x, "onImageClick", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
