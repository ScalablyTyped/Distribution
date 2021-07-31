package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.free
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.off
import typings.aceBuilds.aceBuildsStrings.printmargin_
import typings.aceBuilds.aceBuildsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditSessionOptions extends StObject {
  
  var firstLineNumber: Double
  
  var foldStyle: markbegin | markbeginend | manual
  
  var indentedSoftWrap: Boolean
  
  var mode: String
  
  var navigateWithinSoftTabs: Boolean
  
  var newLineMode: NewLineMode
  
  var overwrite: Boolean
  
  var tabSize: Double
  
  var useSoftTabs: Boolean
  
  var useWorker: Boolean
  
  var wrap: off | free | printmargin_ | Boolean | Double
  
  var wrapMethod: code | text | auto
}
object EditSessionOptions {
  
  @scala.inline
  def apply(
    firstLineNumber: Double,
    foldStyle: markbegin | markbeginend | manual,
    indentedSoftWrap: Boolean,
    mode: String,
    navigateWithinSoftTabs: Boolean,
    newLineMode: NewLineMode,
    overwrite: Boolean,
    tabSize: Double,
    useSoftTabs: Boolean,
    useWorker: Boolean,
    wrap: off | free | printmargin_ | Boolean | Double,
    wrapMethod: code | text | auto
  ): EditSessionOptions = {
    val __obj = js.Dynamic.literal(firstLineNumber = firstLineNumber.asInstanceOf[js.Any], foldStyle = foldStyle.asInstanceOf[js.Any], indentedSoftWrap = indentedSoftWrap.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigateWithinSoftTabs = navigateWithinSoftTabs.asInstanceOf[js.Any], newLineMode = newLineMode.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], useSoftTabs = useSoftTabs.asInstanceOf[js.Any], useWorker = useWorker.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapMethod = wrapMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionOptions]
  }
  
  @scala.inline
  implicit class EditSessionOptionsMutableBuilder[Self <: EditSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldStyle(value: markbegin | markbeginend | manual): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentedSoftWrap(value: Boolean): Self = StObject.set(x, "indentedSoftWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateWithinSoftTabs(value: Boolean): Self = StObject.set(x, "navigateWithinSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineMode(value: NewLineMode): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: off | free | printmargin_ | Boolean | Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapMethod(value: code | text | auto): Self = StObject.set(x, "wrapMethod", value.asInstanceOf[js.Any])
  }
}
