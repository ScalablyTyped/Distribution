package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsKind
import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.namedTypesMod.namedTypes.Variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VarianceBuilder extends StObject {
  
  def apply(kind: minus): Variance = js.native
  def apply(kind: plus): Variance = js.native
  
  def from(params: CommentsKind): Variance = js.native
}
