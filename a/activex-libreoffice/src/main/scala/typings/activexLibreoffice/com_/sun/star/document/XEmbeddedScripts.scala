package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.script.XStorageBasedLibraryContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is supported by OfficeDocuments which allow to embed scripts
  * @since OOo 2.4
  */
@js.native
trait XEmbeddedScripts extends js.Object {
  
  /**
    * determines whether executing macros from this document is allowed.
    *
    * Effectively, this attribute is an evaluation of the document's {@link MacroExecMode} against possibly applicable configuration settings, the document
    * location in relation to the trusted location, and the like.
    * @see MacroExecMode
    */
  var AllowMacroExecution: Boolean = js.native
  
  /** is the container of `StarBasic` macro libraries contained in the document */
  var BasicLibraries: XStorageBasedLibraryContainer = js.native
  
  /** is the container of dialogs libraries contained in the document */
  var DialogLibraries: XStorageBasedLibraryContainer = js.native
}
object XEmbeddedScripts {
  
  @scala.inline
  def apply(
    AllowMacroExecution: Boolean,
    BasicLibraries: XStorageBasedLibraryContainer,
    DialogLibraries: XStorageBasedLibraryContainer
  ): XEmbeddedScripts = {
    val __obj = js.Dynamic.literal(AllowMacroExecution = AllowMacroExecution.asInstanceOf[js.Any], BasicLibraries = BasicLibraries.asInstanceOf[js.Any], DialogLibraries = DialogLibraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[XEmbeddedScripts]
  }
  
  @scala.inline
  implicit class XEmbeddedScriptsOps[Self <: XEmbeddedScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMacroExecution(value: Boolean): Self = this.set("AllowMacroExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicLibraries(value: XStorageBasedLibraryContainer): Self = this.set("BasicLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogLibraries(value: XStorageBasedLibraryContainer): Self = this.set("DialogLibraries", value.asInstanceOf[js.Any])
  }
}
