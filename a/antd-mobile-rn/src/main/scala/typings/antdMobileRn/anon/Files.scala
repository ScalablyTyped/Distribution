package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[scala.Nothing]
  
  def onChange(): Unit
  
  def onFail(): Unit
  
  var selectable: Boolean
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Files {
  
  inline def apply(
    files: js.Array[scala.Nothing],
    onChange: () => Unit,
    onFail: () => Unit,
    selectable: Boolean,
    styles: StringDictionary[RegisteredStyle[Any]]
  ): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnFail(value: () => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction0(value))
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
