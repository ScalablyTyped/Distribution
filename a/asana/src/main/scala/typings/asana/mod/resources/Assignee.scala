package typings.asana.mod.resources

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignee extends Resource {
  
  var email: js.UndefOr[String] = js.native
  
  var photo: js.UndefOr[StringDictionary[String]] = js.native
  
  var workspaces: js.UndefOr[js.Array[Resource]] = js.native
}
