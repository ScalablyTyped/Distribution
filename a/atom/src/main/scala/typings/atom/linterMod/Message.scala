package typings.atom.linterMod

import typings.atom.anon.File
import typings.atom.anon.Position
import typings.atom.atomStrings.error
import typings.atom.atomStrings.info
import typings.atom.atomStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    *  Markdown long description of the error. Accepts a callback so that you can
    *  do things like HTTP requests.
    */
  var description: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.native
  
  /** The text for the message. */
  var excerpt: String = js.native
  
  /** The name of the octicon to show in the gutter. */
  var icon: js.UndefOr[String] = js.native
  
  /** Optionally override the displayed linter name. Defaults to provider name. */
  var linterName: js.UndefOr[String] = js.native
  
  /** The location of the issue (aka where to highlight). */
  var location: File = js.native
  
  /** A reference to a different location in the editor. */
  var reference: js.UndefOr[Position] = js.native
  
  /** The severity level for the message. */
  var severity: error | warning | info = js.native
  
  /** Possible solutions (which the user can invoke at will). */
  var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.native
  
  /** An HTTP link to a resource explaining the issue. Default is a google search. */
  var url: js.UndefOr[String] = js.native
}
object Message {
  
  @scala.inline
  def apply(excerpt: String, location: File, severity: error | warning | info): Message = {
    val __obj = js.Dynamic.literal(excerpt = excerpt.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setExcerpt(value: String): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: File): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: error | warning | info): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionFunction0(value: () => js.Promise[String] | String): Self = this.set("description", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String | (js.Function0[js.Promise[String] | String])): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLinterName(value: String): Self = this.set("linterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinterName: Self = this.set("linterName", js.undefined)
    
    @scala.inline
    def setReference(value: Position): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setSolutionsVarargs(value: (ReplacementSolution | CallbackSolution)*): Self = this.set("solutions", js.Array(value :_*))
    
    @scala.inline
    def setSolutions(value: js.Array[ReplacementSolution | CallbackSolution]): Self = this.set("solutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutions: Self = this.set("solutions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
