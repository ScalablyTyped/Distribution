package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files extends StObject {
  
  var files: js.Array[scala.Nothing] = js.native
  
  def onChange(): Unit = js.native
  
  def onFail(): Unit = js.native
  
  var selectable: Boolean = js.native
  
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
}
object Files {
  
  @scala.inline
  def apply(
    files: js.Array[scala.Nothing],
    onChange: () => Unit,
    onFail: () => Unit,
    selectable: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFail(value: () => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
