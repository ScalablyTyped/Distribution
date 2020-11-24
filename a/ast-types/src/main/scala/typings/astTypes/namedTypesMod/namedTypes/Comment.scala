package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends Printable {
  
  var leading: js.UndefOr[Boolean] = js.native
  
  var trailing: js.UndefOr[Boolean] = js.native
  
  var value: String = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.Comment")
@js.native
object Comment extends TopLevel[Type[Comment]]
