package typings.astTypes.buildersMod

import typings.astTypes.anon.Leading
import typings.astTypes.namedTypesMod.namedTypes.CommentLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentLineBuilder extends StObject {
  
  def apply(value: String): CommentLine = js.native
  def apply(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): CommentLine = js.native
  def apply(value: String, leading: Boolean): CommentLine = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): CommentLine = js.native
  
  def from(params: Leading): CommentLine = js.native
}
