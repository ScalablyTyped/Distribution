package typings.appBuilderLib.platformSpecificBuildOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.Editor
import typings.appBuilderLib.appBuilderLibStrings.None
import typings.appBuilderLib.appBuilderLibStrings.Shell
import typings.appBuilderLib.appBuilderLibStrings.Viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocol extends js.Object {
  
  /**
    * The name. e.g. `IRC server URL`.
    */
  val name: String = js.native
  
  /**
    * *macOS-only* The app’s role with respect to the type.
    * @default Editor
    */
  val role: js.UndefOr[Editor | Viewer | Shell | None] = js.native
  
  /**
    * The schemes. e.g. `["irc", "ircs"]`.
    */
  val schemes: js.Array[String] = js.native
}
object Protocol {
  
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): Protocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Editor | Viewer | Shell | None): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
