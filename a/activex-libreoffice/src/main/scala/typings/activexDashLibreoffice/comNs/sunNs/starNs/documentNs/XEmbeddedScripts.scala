package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.XStorageBasedLibraryContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is supported by OfficeDocuments which allow to embed scripts
  * @since OOo 2.4
  */
trait XEmbeddedScripts extends js.Object {
  /**
    * determines whether executing macros from this document is allowed.
    *
    * Effectively, this attribute is an evaluation of the document's {@link MacroExecMode} against possibly applicable configuration settings, the document
    * location in relation to the trusted location, and the like.
    * @see MacroExecMode
    */
  var AllowMacroExecution: Boolean
  /** is the container of `StarBasic` macro libraries contained in the document */
  var BasicLibraries: XStorageBasedLibraryContainer
  /** is the container of dialogs libraries contained in the document */
  var DialogLibraries: XStorageBasedLibraryContainer
}

object XEmbeddedScripts {
  @scala.inline
  def apply(
    AllowMacroExecution: Boolean,
    BasicLibraries: XStorageBasedLibraryContainer,
    DialogLibraries: XStorageBasedLibraryContainer
  ): XEmbeddedScripts = {
    val __obj = js.Dynamic.literal(AllowMacroExecution = AllowMacroExecution, BasicLibraries = BasicLibraries, DialogLibraries = DialogLibraries)
  
    __obj.asInstanceOf[XEmbeddedScripts]
  }
}

