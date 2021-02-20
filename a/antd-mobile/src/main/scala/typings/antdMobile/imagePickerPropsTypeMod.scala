package typings.antdMobile

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerPropsTypeMod {
  
  @js.native
  trait ImageFile
    extends /* key */ StringDictionary[js.Any] {
    
    var url: String = js.native
  }
  object ImageFile {
    
    @scala.inline
    def apply(url: String): ImageFile = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFile]
    }
    
    @scala.inline
    implicit class ImageFileMutableBuilder[Self <: ImageFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImagePickerPropTypes extends StObject {
    
    var accept: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[js.Any] = js.native
    
    var disableDelete: js.UndefOr[Boolean] = js.native
    
    var files: js.UndefOr[js.Array[ImageFile]] = js.native
    
    var length: js.UndefOr[Double | String] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onAddImageClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* files */ js.Array[ImageFile], 
          /* operationType */ String, 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var onImageClick: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]], Unit]
      ] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ImagePickerPropTypes {
    
    @scala.inline
    def apply(): ImagePickerPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerPropTypes]
    }
    
    @scala.inline
    implicit class ImagePickerPropTypesMutableBuilder[Self <: ImagePickerPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setCapture(value: js.Any): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setDisableDelete(value: Boolean): Self = StObject.set(x, "disableDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDeleteUndefined: Self = StObject.set(x, "disableDelete", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[ImageFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: ImageFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnAddImageClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAddImageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddImageClickUndefined: Self = StObject.set(x, "onAddImageClick", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* files */ js.Array[ImageFile], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFail(value: /* msg */ String => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      @scala.inline
      def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]]) => Unit): Self = StObject.set(x, "onImageClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnImageClickUndefined: Self = StObject.set(x, "onImageClick", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
