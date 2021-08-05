package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  var accept: String
  
  var disableDelete: Boolean
  
  var files: js.Array[scala.Nothing]
  
  var length: Double
  
  var multiple: Boolean
  
  var onAddImageClick: js.Function0[Unit]
  
  var onChange: js.Function0[Unit]
  
  var onFail: js.Function0[Unit]
  
  var onImageClick: js.Function0[Unit]
  
  var prefixCls: String
  
  var selectable: Boolean
}
object Accept {
  
  inline def apply(
    accept: String,
    disableDelete: Boolean,
    files: js.Array[scala.Nothing],
    length: Double,
    multiple: Boolean,
    onAddImageClick: () => Unit,
    onChange: () => Unit,
    onFail: () => Unit,
    onImageClick: () => Unit,
    prefixCls: String,
    selectable: Boolean
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], disableDelete = disableDelete.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onAddImageClick = js.Any.fromFunction0(onAddImageClick), onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), onImageClick = js.Any.fromFunction0(onImageClick), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  extension [Self <: Accept](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setDisableDelete(value: Boolean): Self = StObject.set(x, "disableDelete", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setOnAddImageClick(value: () => Unit): Self = StObject.set(x, "onAddImageClick", js.Any.fromFunction0(value))
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnFail(value: () => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction0(value))
    
    inline def setOnImageClick(value: () => Unit): Self = StObject.set(x, "onImageClick", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
  }
}
