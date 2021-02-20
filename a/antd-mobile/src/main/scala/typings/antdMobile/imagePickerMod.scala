package typings.antdMobile

import typings.antdMobile.anon.Accept
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerMod {
  
  @JSImport("antd-mobile/lib/image-picker", JSImport.Default)
  @js.native
  class default () extends ImagePicker
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/image-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/image-picker", "default.defaultProps")
    @js.native
    def defaultProps: Accept = js.native
    @scala.inline
    def defaultProps_=(x: Accept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImagePicker
    extends Component[ImagePickerPropTypes, js.Any, js.Any] {
    
    def addImage(imgItem: js.Any): Unit = js.native
    
    var fileSelectorInput: HTMLInputElement | Null = js.native
    
    def getOrientation(file: js.Any, callback: js.Function1[/* _ */ Double, Unit]): Unit = js.native
    
    def getRotation(): Double = js.native
    def getRotation(orientation: Double): Double = js.native
    
    def onFileChange(): Unit = js.native
    
    def onImageClick(index: Double): Unit = js.native
    
    def parseFile(file: js.Any, index: Double): js.Promise[js.Object] = js.native
    
    def removeImage(index: Double): Unit = js.native
  }
  
  @js.native
  trait ImagePickerPropTypes
    extends typings.antdMobile.imagePickerPropsTypeMod.ImagePickerPropTypes {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
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
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
